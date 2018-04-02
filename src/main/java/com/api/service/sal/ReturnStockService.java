package com.api.service.sal;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.api.entity.json.sal.returnstock.ApiBatchSave;
import com.api.entity.json.sal.returnstock.ApiSave;
import com.api.entity.json.sal.returnstock.FBillTypeID;
import com.api.entity.json.sal.returnstock.FEntity;
import com.api.entity.json.sal.returnstock.FMaterialId;
import com.api.entity.json.sal.returnstock.FOwnerId;
import com.api.entity.json.sal.returnstock.FRetcustId;
import com.api.entity.json.sal.returnstock.FSaleOrgId;
import com.api.entity.json.sal.returnstock.FSettleCurrId;
import com.api.entity.json.sal.returnstock.FSettleOrgId;
import com.api.entity.json.sal.returnstock.FStockId;
import com.api.entity.json.sal.returnstock.FStockOrgId;
import com.api.entity.json.sal.returnstock.FUnitID;
import com.api.entity.json.sal.returnstock.Model;
import com.api.entity.json.sal.returnstock.SubHeadEntity;
import com.common.InvokeHelper;

@Service
public class ReturnStockService
{
	static Logger log = LoggerFactory.getLogger(OutStockService.class);

	private static String FORM_ID = "SAL_RETURNSTOCK";
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
		// Model-SubHeadEntity
		//------------------------------------------------------------------------------------------------------//
		SubHeadEntity subHeadEntity = new SubHeadEntity();
		// 结算币别
		FSettleCurrId fSettleCurrID = new FSettleCurrId();
		fSettleCurrID.setFNumber("PRE001");
		subHeadEntity.setFSettleCurrId(fSettleCurrID);
		// 结算组织
		FSettleOrgId fSettleOrgID = new FSettleOrgId();
		fSettleOrgID.setFNumber("100");
		subHeadEntity.setFSettleOrgId(fSettleOrgID);
		// 汇率
		subHeadEntity.setFExchangeRate("1");
		
		//------------------------------------------------------------------------------------------------------//
		// Model-FEntity
		//------------------------------------------------------------------------------------------------------//
		List<FEntity> fEntityList = new ArrayList<FEntity>();
		for(int j=0; j<5; j++)
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
			fEntity.setFRealQty(j+1+"");
			// 货主
			FOwnerId fOwnerID = new FOwnerId();
			fOwnerID.setFNumber("100");
			fEntity.setFOwnerId(fOwnerID);
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
		fBillTypeID.setFNumber("XSTHD01_SYS");
		model.setFBillTypeID(fBillTypeID);
		// 销售组织
		FSaleOrgId fSaleOrgId = new FSaleOrgId();
		fSaleOrgId.setFNumber("100");
		model.setFSaleOrgId(fSaleOrgId);
		// 退货客户
		FRetcustId fRetcustId = new FRetcustId();
		fRetcustId.setFNumber("A001");
		model.setFRetcustId(fRetcustId);
		// 库存组织
		FStockOrgId fStockOrgId = new FStockOrgId();
		fStockOrgId.setFNumber("100");
		model.setFStockOrgId(fStockOrgId);
		// set to SubHeadEntity
		model.setSubHeadEntity(subHeadEntity);
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
			// Model-SubHeadEntity
			//------------------------------------------------------------------------------------------------------//
			SubHeadEntity subHeadEntity = new SubHeadEntity();
			// 结算币别
			FSettleCurrId fSettleCurrID = new FSettleCurrId();
			fSettleCurrID.setFNumber("PRE001");
			subHeadEntity.setFSettleCurrId(fSettleCurrID);
			// 结算组织
			FSettleOrgId fSettleOrgID = new FSettleOrgId();
			fSettleOrgID.setFNumber("100");
			subHeadEntity.setFSettleOrgId(fSettleOrgID);
			// 汇率
			subHeadEntity.setFExchangeRate("1");
			
			//------------------------------------------------------------------------------------------------------//
			// Model-FEntity
			//------------------------------------------------------------------------------------------------------//
			List<FEntity> fEntityList = new ArrayList<FEntity>();
			for(int j=0; j<5; j++)
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
				fEntity.setFRealQty(j+1+"");
				// 货主
				FOwnerId fOwnerID = new FOwnerId();
				fOwnerID.setFNumber("100");
				fEntity.setFOwnerId(fOwnerID);
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
			fBillTypeID.setFNumber("XSTHD01_SYS");
			model.setFBillTypeID(fBillTypeID);
			// 销售组织
			FSaleOrgId fSaleOrgId = new FSaleOrgId();
			fSaleOrgId.setFNumber("100");
			model.setFSaleOrgId(fSaleOrgId);
			// 退货客户
			FRetcustId fRetcustId = new FRetcustId();
			fRetcustId.setFNumber("A001");
			model.setFRetcustId(fRetcustId);
			// 库存组织
			FStockOrgId fStockOrgId = new FStockOrgId();
			fStockOrgId.setFNumber("100");
			model.setFStockOrgId(fStockOrgId);
			// set to SubHeadEntity
			model.setSubHeadEntity(subHeadEntity);
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
