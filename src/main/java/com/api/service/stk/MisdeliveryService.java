package com.api.service.stk;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.api.entity.json.stk.misdelivery.ApiBatchSave;
import com.api.entity.json.stk.misdelivery.ApiSave;
import com.api.entity.json.stk.misdelivery.FBillTypeID;
import com.api.entity.json.stk.misdelivery.FCustId;
import com.api.entity.json.stk.misdelivery.FDeptId;
import com.api.entity.json.stk.misdelivery.FEntity;
import com.api.entity.json.stk.misdelivery.FMaterialId;
import com.api.entity.json.stk.misdelivery.FStockId;
import com.api.entity.json.stk.misdelivery.FUnitID;
import com.api.entity.json.stk.misdelivery.Model;
import com.common.InvokeHelper;

@Service
public class MisdeliveryService
{
	static Logger log = LoggerFactory.getLogger(MisdeliveryService.class);

	private static String FORM_ID = "STK_MisDelivery";
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
		for(int j=0; j<2; j++)
		{
			FEntity fEntity = new FEntity();
			// 物料编码
			FMaterialId fMaterialID = new FMaterialId();
			fMaterialID.setFNumber("CH4441");
			fEntity.setFMaterialId(fMaterialID);
			// 库存单位
			FUnitID fUnitID = new FUnitID();
			fUnitID.setFNumber("Pcs");
			fEntity.setFUnitID(fUnitID);
			// 实发数量
			fEntity.setFQty(j+1+"");
			// 仓库
			FStockId fStockID = new FStockId();
			fStockID.setFNumber("CK001");
			fEntity.setFStockId(fStockID);
			// add to list
			fEntityList.add(fEntity);
		}
		
		//------------------------------------------------------------------------------------------------------//
		// Model
		//------------------------------------------------------------------------------------------------------//
		Model model = new Model();
		// 单据类型
		FBillTypeID fBillTypeID = new FBillTypeID();
		fBillTypeID.setFNumber("QTCKD01_SYS");
		model.setFBillTypeID(fBillTypeID);
		// 客戶与部门至少录入一个
		// 客戶
		FCustId fCustId = new FCustId();
		fCustId.setFNumber("A001");
		model.setFCustId(fCustId);
		// 部门
		FDeptId fDEPTID = new FDeptId();
		fDEPTID.setFNumber("BM000001");
		model.setFDeptId(fDEPTID);
		
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
			for(int j=0; j<2; j++)
			{
				FEntity fEntity = new FEntity();
				// 物料编码
				FMaterialId fMaterialID = new FMaterialId();
				fMaterialID.setFNumber("CH4441");
				fEntity.setFMaterialId(fMaterialID);
				// 库存单位
				FUnitID fUnitID = new FUnitID();
				fUnitID.setFNumber("Pcs");
				fEntity.setFUnitID(fUnitID);
				// 实发数量
				fEntity.setFQty(j+1+"");
				// 仓库
				FStockId fStockID = new FStockId();
				fStockID.setFNumber("CK001");
				fEntity.setFStockId(fStockID);
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
			// 客戶与部门至少录入一个
			// 客戶
			FCustId fCustId = new FCustId();
			fCustId.setFNumber("A001");
			model.setFCustId(fCustId);
			// 部门
			FDeptId fDEPTID = new FDeptId();
			fDEPTID.setFNumber("BM000001");
			model.setFDeptId(fDEPTID);
			
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
