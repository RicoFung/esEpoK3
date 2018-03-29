package com.common;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

public class Test
{
	static Logger log = LoggerFactory.getLogger("Test");
	
	public static void save(String sFormId, String sContent) throws Exception
	{
		ApiSave root = new ApiSave();
		// 根节点
		root.setCreator("test");
		// 表头
		//-------------------- Model Begin --------------------//
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
		
		//-------------------- Model-SubHeadEntity Begin --------------------//
		SubHeadEntity subHeadEntity = new SubHeadEntity();
		// 结算币别
		FSettleCurrID fSettleCurrID = new FSettleCurrID();
		fSettleCurrID.setFNumber("PRE001");
		subHeadEntity.setFSettleCurrID(fSettleCurrID);
		// 结算组织
		FSettleOrgID fSettleOrgID = new FSettleOrgID();
		fSettleOrgID.setFNumber("100");
		subHeadEntity.setFSettleOrgID(fSettleOrgID);
		// set to SubHeadEntity
		model.setSubHeadEntity(subHeadEntity);
		//-------------------- Model-SubHeadEntity End --------------------//
		
		// 表明細
		//-------------------- Model-FEntity Begin --------------------//
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
		// set to FEntity
		model.setFEntity(fEntityList);
		//-------------------- Model-FEntity End --------------------//
		// set to Model
		root.setModel(model);
		//-------------------- Model End --------------------//
		
		sContent = com.alibaba.fastjson.JSONArray.toJSONString(root, new com.alibaba.fastjson.serializer.PascalNameFilter());
		System.out.println(sContent);
		InvokeHelper.Save(sFormId, sContent);
	}
	
	
//	// 测试 Save
//	public static void save(String sFormId, String sContent) throws Exception
//	{
//		// 表明细头信息
//		String sSubHeadEntity = ""
//				+ "{"
//				+ "\"FSettleCurrID\":{\"FNumber\":\"PRE001\"},"
//				+ "\"FSettleOrgID\":{\"FNumber\":\"100\"},"
//				+ "\"FSettleTypeID\":{\"FNumber\":\"\"},"
//				+ "\"FReceiptConditionID\":{\"FNumber\":\"\"},"
//				+ "\"FPriceListId\":{\"FNumber\":\"\"},"
//				+ "\"FDiscountListId\":{\"FNumber\":\"\"},"
//				+ "\"FIsIncludedTax\":true,"
//				+ "\"FLocalCurrID\":{\"FNumber\":\"PRE001\"},"
//				+ "\"FExchangeTypeID\":{\"FNumber\":\"HLTX01_SYS\"},"
//				+ "\"FExchangeRate\":1.0,"
//				+ "\"FIsPriceExcludeTax\":true"
//				+ "}";
//		// 表明细
//		String sFEntity = "[";
//		for(int i=0; i<10; i++)
//		{
//			sFEntity += ""
//					+ "{"
//					+ "\"FENTRYID\":null,"
//					+ "\"FCustMatID\":{\"FNumber\":\"\"},"
//					+ "\"FMaterialID\":{\"FNumber\":\"CH4441\"},"
//					+ "\"FUnitID\":{\"FNumber\":\"Pcs\"},"
//					+ "\"FInventoryQty\":0.0,"
//					+ "\"FRealQty\":10.0,"
//					+ "\"FPrice\":0.0,"
//					+ "\"FTaxPrice\":0.0,"
//					+ "\"FIsFree\":false,"
//					+ "\"FBomID\":{\"FNumber\":\"\"},"
//					+ "\"FProduceDate\":null,"
//					+ "\"FOwnerTypeID\":\"BD_OwnerOrg\","
//					+ "\"FOwnerID\":{\"FNumber\":\"100\"},"
//					+ "\"FLot\":{\"FNumber\":\"\"},"
//					+ "\"FExpiryDate\":null,"
//					+ "\"FTaxCombination\":{\"FNumber\":\"\"},"
//					+ "\"FEntryTaxRate\":17.00,"
//					+ "\"FAuxUnitQty\":0.0,"
//					+ "\"FExtAuxUnitId\":{\"FNumber\":\"\"},"
//					+ "\"FExtAuxUnitQty\":0.0,"
//					+ "\"FStockID\":{\"FNumber\":\"CK001\"},"
//					+ "\"FStockStatusID\":{\"FNumber\":\"KCZT01_SYS\"},"
//					+ "\"FQualifyType\":\"\","
//					+ "\"FMtoNo\":null,"
//					+ "\"FEntrynote\":null,"
//					+ "\"FDiscountRate\":0.0,"
//					+ "\"FActQty\":0.0,"
//					+ "\"FSalUnitID\":{\"FNumber\":\"Pcs\"},"
//					+ "\"FSALUNITQTY\":10.0,"
//					+ "\"FSALBASEQTY\":10.0,"
//					+ "\"FPRICEBASEQTY\":10.0,"
//					+ "\"FProjectNo\":null,"
//					+ "\"FOUTCONTROL\":false,"
//					+ "\"FRepairQty\":0.0,"
//					+ "\"FIsCreateProDoc\":\"\","
//					+ "\"FEOwnerSupplierId\":{\"FNumber\":\"\"},"
//					+ "\"FIsOverLegalOrg\":false,"
//					+ "\"FESettleCustomerId\":{\"FNumber\":\"\"},"
//					+ "\"FPriceListEntry\":{\"FNumber\":\"\"},"
//					+ "\"FARNOTJOINQTY\":10.0,"
//					+ "\"FQmEntryID\":0,"
//					+ "\"FSOEntryId\":0,"
//					+ "\"FConvertEntryID\":0,"
//					+ "\"FDisPriceQty\":0.0,"
//					+ "\"FBeforeDisPriceQty\":0.0"
//					+ "},";
//		}
//		sFEntity = sFEntity.substring(0, sFEntity.length()-1);
//		sFEntity += "]";
//		// 表头
//		String sModel = ""
//				+ "{"
//				+ "\"FID\":\"0\","
//				+ "\"FBillTypeID\":{\"FNumber\":\"XSCKD01_SYS\"},"
//				+ "\"FBillNo\":\"\","
//				+ "\"FDate\":\""+ TimeUtil.getCurrentTime() +"\","
//				+ "\"FSaleOrgId\":{\"FNumber\":\"100\"},"
//				+ "\"FSaleDeptID\":{\"FNumber\":\"\"},"
//				+ "\"FCustomerID\":{\"FNumber\":\"A001\"},"
//				+ "\"FHeadLocationId\":{\"FNUMBER\":\"\"},"
//				+ "\"FCorrespondOrgId\":{\"FNumber\":\"\"},"
//				+ "\"FCarrierID\":{\"FNumber\":\"\"},"
//				+ "\"FCarriageNO\":\"\","
//				+ "\"FSalesGroupID\":{\"FNumber\":\"\"},"
//				+ "\"FSalesManID\":{\"FNumber\":\"\"},"
//				+ "\"FStockOrgId\":{\"FNumber\":\"100\"},"
//				+ "\"FDeliveryDeptID\":{\"FNumber\":\"\"},"
//				+ "\"FStockerGroupID\":{\"FNumber\":\"\"},"
//				+ "\"FStockerID\":{\"FNumber\":\"\"},"
//				+ "\"FNote\":\"\","
//				+ "\"FReceiverID\":{\"FNumber\":\"A001\"},"
//				+ "\"FReceiveAddress\":\"\","
//				+ "\"FSettleID\":{\"FNumber\":\"A001\"},"
//				+ "\"FReceiverContactID\":{\"FName\":\"\"},"
//				+ "\"FPayerID\":{\"FNumber\":\"A001\"},"
//				+ "\"FOwnerTypeIdHead\":\"BD_OwnerOrg\","
//				+ "\"FOwnerIdHead\":{\"FNumber\":\"\"},"
//				+ "\"FScanBox\":\"\","
//				+ "\"FCDateOffsetUnit\":\"\","
//				+ "\"FCDateOffsetValue\":0,"
//				+ "\"FPlanRecAddress\":\"\","
//				+ "\"FIsTotalServiceOrCost\":false,"
//				+ "\"SubHeadEntity\":" + sSubHeadEntity + ","
//				+ "\"FEntity\":" + sFEntity
//				+ "}";
//		//
//		sContent = ""
//				+ "{"
//				+ "\"Creator\":\"\","
//				+ "\"NeedUpDateFields\":[],"
//				+ "\"NeedReturnFields\":[],"
//				+ "\"IsDeleteEntry\":\"True\","
//				+ "\"SubSystemId\":\"\","
//				+ "\"IsVerifyBaseDataField\":\"false\","
//				+ "\"Model\":" + sModel
//				+ "}";
//		System.out.println(sContent);
//		InvokeHelper.Save(sFormId, sContent);
//	}
	
	// 测试 BatchSave
//	public static void batchSave(String sFormId) throws Exception
//	{
////		System.out.println("begin time => "+TimeUtil.getCurrentTime());
//		if(log.isInfoEnabled()) log.info("begin time => "+TimeUtil.getCurrentTime());
//		// Model数组
//		StringBuilder sModel = new StringBuilder().append("[");
//		for (int i=0; i<1000; i++)
//		{
//			// SubHeadEntity
//			StringBuilder sSubHeadEntity = new StringBuilder()
//			.append("{")
//			.append("\"FSettleCurrID\":{\"FNumber\":\"PRE001\"},")
//			.append("\"FSettleOrgID\":{\"FNumber\":\"100\"},")
//			.append("\"FSettleTypeID\":{\"FNumber\":\"\"},")
//			.append("\"FReceiptConditionID\":{\"FNumber\":\"\"},")
//			.append("\"FPriceListId\":{\"FNumber\":\"\"},")
//			.append("\"FDiscountListId\":{\"FNumber\":\"\"},")
//			.append("\"FIsIncludedTax\":true,")
//			.append("\"FLocalCurrID\":{\"FNumber\":\"PRE001\"},")
//			.append("\"FExchangeTypeID\":{\"FNumber\":\"HLTX01_SYS\"},")
//			.append("\"FExchangeRate\":1.0,")
//			.append("\"FIsPriceExcludeTax\":true")
//			.append("}");
//			// FEntity数组
//			StringBuilder sFEntity = new StringBuilder().append("[");
//			for(int j=0; j<3; j++)
//			{
//				sFEntity.append("{")
//						.append("\"FENTRYID\":null,")
//						.append("\"FCustMatID\":{\"FNumber\":\"\"},")
//						.append("\"FMaterialID\":{\"FNumber\":\"CH4441\"},")
//						.append("\"FUnitID\":{\"FNumber\":\"Pcs\"},")
//						.append("\"FInventoryQty\":0.0,")
//						.append("\"FRealQty\":10.0,")
//						.append("\"FPrice\":0.0,")
//						.append("\"FTaxPrice\":0.0,")
//						.append("\"FIsFree\":false,")
//						.append("\"FBomID\":{\"FNumber\":\"\"},")
//						.append("\"FProduceDate\":null,")
//						.append("\"FOwnerTypeID\":\"BD_OwnerOrg\",")
//						.append("\"FOwnerID\":{\"FNumber\":\"100\"},")
//						.append("\"FLot\":{\"FNumber\":\"\"},")
//						.append("\"FExpiryDate\":null,")
//						.append("\"FTaxCombination\":{\"FNumber\":\"\"},")
//						.append("\"FEntryTaxRate\":17.00,")
//						.append("\"FAuxUnitQty\":0.0,")
//						.append("\"FExtAuxUnitId\":{\"FNumber\":\"\"},")
//						.append("\"FExtAuxUnitQty\":0.0,")
//						.append("\"FStockID\":{\"FNumber\":\"CK001\"},")
//						.append("\"FStockStatusID\":{\"FNumber\":\"KCZT01_SYS\"},")
//						.append("\"FQualifyType\":\"\",")
//						.append("\"FMtoNo\":null,")
//						.append("\"FEntrynote\":null,")
//						.append("\"FDiscountRate\":0.0,")
//						.append("\"FActQty\":0.0,")
//						.append("\"FSalUnitID\":{\"FNumber\":\"Pcs\"},")
//						.append("\"FSALUNITQTY\":10.0,")
//						.append("\"FSALBASEQTY\":10.0,")
//						.append("\"FPRICEBASEQTY\":10.0,")
//						.append("\"FProjectNo\":null,")
//						.append("\"FOUTCONTROL\":false,")
//						.append("\"FRepairQty\":0.0,")
//						.append("\"FIsCreateProDoc\":\"\",")
//						.append("\"FEOwnerSupplierId\":{\"FNumber\":\"\"},")
//						.append("\"FIsOverLegalOrg\":false,")
//						.append("\"FESettleCustomerId\":{\"FNumber\":\"\"},")
//						.append("\"FPriceListEntry\":{\"FNumber\":\"\"},")
//						.append("\"FARNOTJOINQTY\":10.0,")
//						.append("\"FQmEntryID\":0,")
//						.append("\"FSOEntryId\":0,")
//						.append("\"FConvertEntryID\":0,")
//						.append("\"FDisPriceQty\":0.0,")
//						.append("\"FBeforeDisPriceQty\":0.0")
//						.append("}")
//						.append(",");
//			}
//			sFEntity.deleteCharAt(sFEntity.length()-1);
//			sFEntity.append("]");
//			// Model
//			sModel.append("{")
//				  .append("\"FID\":\"0\",")
//				  .append("\"FBillTypeID\":{\"FNumber\":\"XSCKD01_SYS\"},")
//				  .append("\"FBillNo\":\"\",")
//				  .append("\"FDate\":\"" + TimeUtil.getCurrentTime() +"\",")
//				  .append("\"FSaleOrgId\":{\"FNumber\":\"100\"},")
//				  .append("\"FSaleDeptID\":{\"FNumber\":\"\"},")
//				  .append("\"FCustomerID\":{\"FNumber\":\"A001\"},")
//				  .append("\"FHeadLocationId\":{\"FNUMBER\":\"\"},")
//				  .append("\"FCorrespondOrgId\":{\"FNumber\":\"\"},")
//				  .append("\"FCarrierID\":{\"FNumber\":\"\"},")
//				  .append("\"FCarriageNO\":\"\",")
//				  .append("\"FSalesGroupID\":{\"FNumber\":\"\"},")
//				  .append("\"FSalesManID\":{\"FNumber\":\"\"},")
//				  .append("\"FStockOrgId\":{\"FNumber\":\"100\"},")
//				  .append("\"FDeliveryDeptID\":{\"FNumber\":\"\"},")
//				  .append("\"FStockerGroupID\":{\"FNumber\":\"\"},")
//				  .append("\"FStockerID\":{\"FNumber\":\"\"},")
//				  .append("\"FNote\":\"\",")
//				  .append("\"FReceiverID\":{\"FNumber\":\"A001\"},")
//				  .append("\"FReceiveAddress\":\"\",")
//				  .append("\"FSettleID\":{\"FNumber\":\"A001\"},")
//				  .append("\"FReceiverContactID\":{\"FName\":\"\"},")
//				  .append("\"FPayerID\":{\"FNumber\":\"A001\"},")
//				  .append("\"FOwnerTypeIdHead\":\"BD_OwnerOrg\",")
//				  .append("\"FOwnerIdHead\":{\"FNumber\":\"\"},")
//				  .append("\"FScanBox\":\"\",")
//				  .append("\"FCDateOffsetUnit\":\"\",")
//				  .append("\"FCDateOffsetValue\":0,")
//				  .append("\"FPlanRecAddress\":\"\",")
//				  .append("\"FIsTotalServiceOrCost\":false,")
//				  .append("\"SubHeadEntity\":" + sSubHeadEntity + ",")
//				  .append("\"FEntity\":" + sFEntity)
//				  .append("}")
//				  .append(",");
//		}
//		sModel.deleteCharAt(sModel.length()-1);
//		sModel.append("]");
//		// 最终JSON
//		StringBuilder sContent = new StringBuilder();
//		sContent.append("{")
//				.append("\"NumberSearch\":\"True\",")
//				.append("\"ValidateFlag\":\"True\",")
//				.append("\"IsDeleteEntry\":\"True\",")
//				.append("\"NeedUpDateFields\":[],")
//				.append("\"NeedReturnFields\":[],")
//				.append("\"SubSystemId\":\"\",")
//				.append("\"Model\":").append(sModel).append(",")
//				.append("\"BatchCount\":\"1000\"")
//				.append("}");
//		System.out.println(sContent);
////		InvokeHelper.BatchSave(sFormId, sContent.toString());
////		System.out.println("ent time => "+TimeUtil.getCurrentTime());
//		if(log.isInfoEnabled()) log.info("end time => "+TimeUtil.getCurrentTime());
//	}
	
}
