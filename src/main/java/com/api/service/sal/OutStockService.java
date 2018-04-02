package com.api.service.sal;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.api.entity.json.sal.outstock.ApiSave;
import com.api.entity.json.sal.outstock.FBillTypeID;
import com.api.entity.json.sal.outstock.FCustomerID;
import com.api.entity.json.sal.outstock.FEntity;
import com.api.entity.json.sal.outstock.FMaterialID;
import com.api.entity.json.sal.outstock.FOwnerID;
import com.api.entity.json.sal.outstock.FSaleOrgId;
import com.api.entity.json.sal.outstock.FSettleCurrID;
import com.api.entity.json.sal.outstock.FSettleOrgID;
import com.api.entity.json.sal.outstock.FStockID;
import com.api.entity.json.sal.outstock.FStockOrgId;
import com.api.entity.json.sal.outstock.FUnitID;
import com.api.entity.json.sal.outstock.Model;
import com.api.entity.json.sal.outstock.SubHeadEntity;
import com.common.InvokeHelper;

@Service
public class OutStockService
{
	static Logger log = LoggerFactory.getLogger(OutStockService.class);
	
	private JSONObject oResult;
	private Boolean oResultIsSuccess;
	private Integer oResultId;
	private String oResultNumber;
	private String oResultErrors;
	
	public void save() throws Exception
	{
		ApiSave root = new ApiSave();

		//------------------------------------------------------------------------------------------------------//
		// Model-SubHeadEntity
		//------------------------------------------------------------------------------------------------------//
		SubHeadEntity subHeadEntity = new SubHeadEntity();
		// 结算币别
		FSettleCurrID fSettleCurrID = new FSettleCurrID();
		fSettleCurrID.setFNumber("PRE001");
		subHeadEntity.setFSettleCurrID(fSettleCurrID);
		// 结算组织
		FSettleOrgID fSettleOrgID = new FSettleOrgID();
		fSettleOrgID.setFNumber("100");
		subHeadEntity.setFSettleOrgID(fSettleOrgID);
		
		//------------------------------------------------------------------------------------------------------//
		// Model-FEntity
		//------------------------------------------------------------------------------------------------------//
		List<FEntity> fEntityList = new ArrayList<FEntity>();
		for(int j=0; j<5; j++)
		{
			FEntity fEntity = new FEntity();
			// 物料编码
			FMaterialID fMaterialID = new FMaterialID();
			fMaterialID.setFNumber("CH4441");
			fEntity.setFMaterialID(fMaterialID);
			// 库存单位
			FUnitID fUnitID = new FUnitID();
			fUnitID.setFNumber("Pcs");
			fEntity.setFUnitID(fUnitID);
			// 实发数量
			fEntity.setFRealQty(j+1);
			// 货主
			FOwnerID fOwnerID = new FOwnerID();
			fOwnerID.setFNumber("100");
			fEntity.setFOwnerID(fOwnerID);
			// 仓库
			FStockID fStockID = new FStockID();
			fStockID.setFNumber("CK001");
			fEntity.setFStockID(fStockID);
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
		// 销售组织
		FSaleOrgId fSaleOrgId = new FSaleOrgId();
		fSaleOrgId.setFNumber("100");
		model.setFSaleOrgId(fSaleOrgId);
		// 客户
		FCustomerID fCustomerID = new FCustomerID();
		fCustomerID.setFNumber("A001");
		model.setFCustomerID(fCustomerID);
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
		String sResult = InvokeHelper.Save("SAL_OUTSTOCK", sContent);

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
