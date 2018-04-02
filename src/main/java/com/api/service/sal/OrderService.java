package com.api.service.sal;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.api.entity.json.sal.order.ApiBatchSave;
import com.api.entity.json.sal.order.ApiSave;
import com.api.entity.json.sal.order.FBillTypeID;
import com.api.entity.json.sal.order.FCustId;
import com.api.entity.json.sal.order.FMaterialId;
import com.api.entity.json.sal.order.FSaleOrderEntry;
import com.api.entity.json.sal.order.FSaleOrderFinance;
import com.api.entity.json.sal.order.FSaleOrgId;
import com.api.entity.json.sal.order.FSalerId;
import com.api.entity.json.sal.order.FSettleCurrId;
import com.api.entity.json.sal.order.FSettleOrgIds;
import com.api.entity.json.sal.order.FUnitID;
import com.api.entity.json.sal.order.Model;
import com.common.InvokeHelper;

import chok.util.TimeUtil;

@Service
public class OrderService
{
	static Logger log = LoggerFactory.getLogger(OutStockService.class);

	private static String FORM_ID = "SAL_SaleOrder";
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
		// Model-FSaleOrderFinance
		//------------------------------------------------------------------------------------------------------//
		FSaleOrderFinance fSaleOrderFinance = new FSaleOrderFinance();
		// 结算币别
		FSettleCurrId fSettleCurrId = new FSettleCurrId();
		fSettleCurrId.setFNumber("PRE001");
		fSaleOrderFinance.setFSettleCurrId(fSettleCurrId);
		// 汇率
		fSaleOrderFinance.setFExchangeRate("1");

		//------------------------------------------------------------------------------------------------------//
		// Model-FSaleOrderEntry 
		//------------------------------------------------------------------------------------------------------//
		List<FSaleOrderEntry> fSaleOrderEntryList = new ArrayList<FSaleOrderEntry>();
		for(int i=0; i<1; i++)
		{
			FSaleOrderEntry fSaleOrderEntry = new FSaleOrderEntry();
			// 物料编码
			FMaterialId fMaterialId = new FMaterialId();
			fMaterialId.setFNumber("CH4441");
			fSaleOrderEntry.setFMaterialId(fMaterialId);
			// 销售单位
			FUnitID fUnitID = new FUnitID();
			fUnitID.setFNumber("Pcs");
			fSaleOrderEntry.setFUnitID(fUnitID);
			// 销售数量
			fSaleOrderEntry.setFQty("5");
			// 要货日期
			fSaleOrderEntry.setFDeliveryDate(TimeUtil.getCurrentDate());
			// 结算组织
			FSettleOrgIds fSettleOrgIds = new FSettleOrgIds();
			fSettleOrgIds.setFNumber("100");
			fSaleOrderEntry.setFSettleOrgIds(fSettleOrgIds);
			// 超发控制单位类型
			fSaleOrderEntry.setFOUTLMTUNIT("SAL");
			// add to list
			fSaleOrderEntryList.add(fSaleOrderEntry);
		}

		//------------------------------------------------------------------------------------------------------//
		// Model 
		//------------------------------------------------------------------------------------------------------//
		Model model = new Model();
		// 单据类型
		FBillTypeID fBillTypeID = new FBillTypeID();
		fBillTypeID.setFNumber("XSDD01_SYS");
		model.setFBillTypeID(fBillTypeID);
		// 销售组织
		FSaleOrgId fSaleOrgId = new FSaleOrgId();
		fSaleOrgId.setFNumber("100");
		model.setFSaleOrgId(fSaleOrgId);
		// 客戶
		FCustId fCustId = new FCustId();
		fCustId.setFNumber("A001");
		model.setFCustId(fCustId);
		// 销售员
		FSalerId fSalerId = new FSalerId();
		fSalerId.setFNumber("001");
		model.setFSalerId(fSalerId); 
		// 订单财务信息
		model.setFSaleOrderFinance(fSaleOrderFinance);
		// 订单明细信息
		model.setFSaleOrderEntry(fSaleOrderEntryList);

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
			// Model-FSaleOrderFinance
			//------------------------------------------------------------------------------------------------------//
			FSaleOrderFinance fSaleOrderFinance = new FSaleOrderFinance();
			// 结算币别
			FSettleCurrId fSettleCurrId = new FSettleCurrId();
			fSettleCurrId.setFNumber("PRE001");
			fSaleOrderFinance.setFSettleCurrId(fSettleCurrId);
			// 汇率
			fSaleOrderFinance.setFExchangeRate("1");
			
			//------------------------------------------------------------------------------------------------------//
			// Model-FSaleOrderEntry 
			//------------------------------------------------------------------------------------------------------//
			List<FSaleOrderEntry> fSaleOrderEntryList = new ArrayList<FSaleOrderEntry>();
			for(int j=0; j<1; j++)
			{
				FSaleOrderEntry fSaleOrderEntry = new FSaleOrderEntry();
				// 物料编码
				FMaterialId fMaterialId = new FMaterialId();
				fMaterialId.setFNumber("CH4441");
				fSaleOrderEntry.setFMaterialId(fMaterialId);
				// 销售单位
				FUnitID fUnitID = new FUnitID();
				fUnitID.setFNumber("Pcs");
				fSaleOrderEntry.setFUnitID(fUnitID);
				// 销售数量
				fSaleOrderEntry.setFQty("5");
				// 要货日期
				fSaleOrderEntry.setFDeliveryDate(TimeUtil.getCurrentDate());
				// 结算组织
				FSettleOrgIds fSettleOrgIds = new FSettleOrgIds();
				fSettleOrgIds.setFNumber("100");
				fSaleOrderEntry.setFSettleOrgIds(fSettleOrgIds);
				// 超发控制单位类型
				fSaleOrderEntry.setFOUTLMTUNIT("SAL");
				// add to list
				fSaleOrderEntryList.add(fSaleOrderEntry);
			}
			
			//------------------------------------------------------------------------------------------------------//
			// Model 
			//------------------------------------------------------------------------------------------------------//
			Model model = new Model();
			// 单据类型
			FBillTypeID fBillTypeID = new FBillTypeID();
			fBillTypeID.setFNumber("XSDD01_SYS");
			model.setFBillTypeID(fBillTypeID);
			// 销售组织
			FSaleOrgId fSaleOrgId = new FSaleOrgId();
			fSaleOrgId.setFNumber("100");
			model.setFSaleOrgId(fSaleOrgId);
			// 客戶
			FCustId fCustId = new FCustId();
			fCustId.setFNumber("A001");
			model.setFCustId(fCustId);
			// 销售员
			FSalerId fSalerId = new FSalerId();
			fSalerId.setFNumber("001");
			model.setFSalerId(fSalerId); 
			// 订单财务信息
			model.setFSaleOrderFinance(fSaleOrderFinance);
			// 订单明细信息
			model.setFSaleOrderEntry(fSaleOrderEntryList);
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
