package com.api.service.stk;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.api.entity.json.stk.miscellaneous.ApiBatchSave;
import com.api.entity.json.stk.miscellaneous.ApiSave;
import com.api.entity.json.stk.miscellaneous.FBillTypeID;
import com.api.entity.json.stk.miscellaneous.FDEPTID;
import com.api.entity.json.stk.miscellaneous.FEntity;
import com.api.entity.json.stk.miscellaneous.FMATERIALID;
import com.api.entity.json.stk.miscellaneous.FSTOCKID;
import com.api.entity.json.stk.miscellaneous.FSUPPLIERID;
import com.api.entity.json.stk.miscellaneous.FUnitID;
import com.api.entity.json.stk.miscellaneous.Model;
import com.common.InvokeHelper;

@Service
public class MiscellaneousService
{
	static Logger log = LoggerFactory.getLogger(MiscellaneousService.class);

	private static String FORM_ID = "STK_MISCELLANEOUS";
	private JSONObject oResult;
	private Boolean oResultIsSuccess;
	private Integer oResultId;
	private String oResultNumber;
	private String oResultErrors;
	
	/**
	 * 保存
	 * @throws Exception
	 */
	public void save() throws Exception
	{
		ApiSave root = new ApiSave();

		//------------------------------------------------------------------------------------------------------//
		// Model-FEntity
		//------------------------------------------------------------------------------------------------------//
		List<FEntity> fEntityList = new ArrayList<FEntity>();
		for(int j=0; j<5; j++)
		{
			FEntity fEntity = new FEntity();
			// 物料编码
			FMATERIALID fMaterialID = new FMATERIALID();
			fMaterialID.setFNumber("CH4441");
			fEntity.setFMATERIALID(fMaterialID);
			// 库存单位
			FUnitID fUnitID = new FUnitID();
			fUnitID.setFNumber("Pcs");
			fEntity.setFUnitID(fUnitID);
			// 实发数量
			fEntity.setFQty(j+1);
			// 仓库
			FSTOCKID fStockID = new FSTOCKID();
			fStockID.setFNumber("CK001");
			fEntity.setFSTOCKID(fStockID);
			// add to list
			fEntityList.add(fEntity);
		}
		
		//------------------------------------------------------------------------------------------------------//
		// Model
		//------------------------------------------------------------------------------------------------------//
		Model model = new Model();
		// 单据类型
		FBillTypeID fBillTypeID = new FBillTypeID();
		fBillTypeID.setFNumber("XSCKD01_SYS");
		model.setFBillTypeID(fBillTypeID);
		// 供应商与部门至少录入一个
		// 供应商
		FSUPPLIERID fSUPPLIERID = new FSUPPLIERID();
		fSUPPLIERID.setFNumber("VEN00001");
		model.setFSUPPLIERID(fSUPPLIERID);
		// 部门
		FDEPTID fDEPTID = new FDEPTID();
		fDEPTID.setFNumber("BM000001");
		model.setFDEPTID(fDEPTID);
		
		// set to FEntity
		model.setFEntity(fEntityList);

		//------------------------------------------------------------------------------------------------------//
		// Root Set
		//------------------------------------------------------------------------------------------------------//
		root.setModel(model);
		root.setCreator("test");

		//------------------------------------------------------------------------------------------------------//		
		// Api Call
		//------------------------------------------------------------------------------------------------------//
		String sContent = JSONArray.toJSONString(root, new com.alibaba.fastjson.serializer.PascalNameFilter());
		String sResult = InvokeHelper.Save(FORM_ID, sContent);

		//------------------------------------------------------------------------------------------------------//
		// Api Result
		//------------------------------------------------------------------------------------------------------//
		oResult = JSON.parseObject(sResult).getJSONObject("Result");
		oResultIsSuccess = oResult.getJSONObject("ResponseStatus").getBoolean("IsSuccess");
		if (oResultIsSuccess)
		{
			oResultId = oResult.getInteger("Id");
			oResultNumber = oResult.getString("Number");
			// update 中间库单据状态
		}
		else
		{
			oResultErrors = oResult.getJSONObject("ResponseStatus").getJSONArray("Errors").toString();
			// update 中间库单据状态和错误信息
		}
	}
	
	/**
	 * 批量保存
	 * @throws Exception
	 */
	public void batchSave() throws Exception
	{
		ApiBatchSave root = new ApiBatchSave();
		
		//------------------------------------------------------------------------------------------------------//
		// Model-集合
		//------------------------------------------------------------------------------------------------------//
		List<Model> modelList = new ArrayList<Model>();
		for(int i=0; i<10; i++)
		{
			//------------------------------------------------------------------------------------------------------//
			// Model-FEntity
			//------------------------------------------------------------------------------------------------------//
			List<FEntity> fEntityList = new ArrayList<FEntity>();
			for(int j=0; j<5; j++)
			{
				FEntity fEntity = new FEntity();
				// 物料编码
				FMATERIALID fMaterialID = new FMATERIALID();
				fMaterialID.setFNumber("CH4441");
				fEntity.setFMATERIALID(fMaterialID);
				// 库存单位
				FUnitID fUnitID = new FUnitID();
				fUnitID.setFNumber("Pcs");
				fEntity.setFUnitID(fUnitID);
				// 实发数量
				fEntity.setFQty(j+1);
				// 仓库
				FSTOCKID fStockID = new FSTOCKID();
				fStockID.setFNumber("CK001");
				fEntity.setFSTOCKID(fStockID);
				// add to list
				fEntityList.add(fEntity);
			}
			
			//------------------------------------------------------------------------------------------------------//
			// Model
			//------------------------------------------------------------------------------------------------------//
			Model model = new Model();
			// 单据类型
			FBillTypeID fBillTypeID = new FBillTypeID();
			fBillTypeID.setFNumber("XSCKD01_SYS");
			model.setFBillTypeID(fBillTypeID);
			// 供应商与部门至少录入一个
			// 供应商
			FSUPPLIERID fSUPPLIERID = new FSUPPLIERID();
			fSUPPLIERID.setFNumber("VEN00001");
			model.setFSUPPLIERID(fSUPPLIERID);
			// 部门
			FDEPTID fDEPTID = new FDEPTID();
			fDEPTID.setFNumber("BM000001");
			model.setFDEPTID(fDEPTID);
			
			// set to FEntity
			model.setFEntity(fEntityList);
			// add to List
			modelList.add(model);
			
		}
		
		//------------------------------------------------------------------------------------------------------//
		// Root Set
		//------------------------------------------------------------------------------------------------------//
		root.setModel(modelList);
		root.setCreator("test");
		
		//------------------------------------------------------------------------------------------------------//		
		// Api Call
		//------------------------------------------------------------------------------------------------------//
		String sContent = JSONArray.toJSONString(root, new com.alibaba.fastjson.serializer.PascalNameFilter());
		String sResult = InvokeHelper.BatchSave(FORM_ID, sContent);
		
		//------------------------------------------------------------------------------------------------------//
		// Api Result
		//------------------------------------------------------------------------------------------------------//
		oResult = JSON.parseObject(sResult).getJSONObject("Result");
		oResultIsSuccess = oResult.getJSONObject("ResponseStatus").getBoolean("IsSuccess");
		if (oResultIsSuccess)
		{
			oResultId = oResult.getInteger("Id");
			oResultNumber = oResult.getString("Number");
			// update 中间库单据状态
		}
		else
		{
			oResultErrors = oResult.getJSONObject("ResponseStatus").getJSONArray("Errors").toString();
			// update 中间库单据状态和错误信息
		}
	}
}
