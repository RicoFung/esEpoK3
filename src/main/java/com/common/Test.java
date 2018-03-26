package com.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.api.entity.k3.ApiAudit;
import com.api.entity.k3.ApiBatchSave;
import com.api.entity.k3.ApiSave;
import com.api.entity.k3.FBillTypeID;
import com.api.entity.k3.FCustomerID;
import com.api.entity.k3.FEntity;
import com.api.entity.k3.FMaterialID;
import com.api.entity.k3.FOutStockTrace;
import com.api.entity.k3.FOwnerID;
import com.api.entity.k3.FSaleOrgId;
import com.api.entity.k3.FSettleCurrID;
import com.api.entity.k3.FSettleOrgID;
import com.api.entity.k3.FStockID;
import com.api.entity.k3.FStockOrgId;
import com.api.entity.k3.FUnitID;
import com.api.entity.k3.Model;
import com.api.entity.k3.SubHeadEntity;

import chok.util.TimeUtil;

public class Test
{

	// 测试 Save
	public static void save(String sFormId, String sContent) throws Exception
	{
		// 表明细头信息
		String sSubHeadEntity = ""
				+ "{"
				+ "\"FSettleCurrID\":{\"FNumber\":\"PRE001\"},"
				+ "\"FSettleOrgID\":{\"FNumber\":\"100\"},"
				+ "\"FSettleTypeID\":{\"FNumber\":\"\"},"
				+ "\"FReceiptConditionID\":{\"FNumber\":\"\"},"
				+ "\"FPriceListId\":{\"FNumber\":\"\"},"
				+ "\"FDiscountListId\":{\"FNumber\":\"\"},"
				+ "\"FIsIncludedTax\":true,"
				+ "\"FLocalCurrID\":{\"FNumber\":\"PRE001\"},"
				+ "\"FExchangeTypeID\":{\"FNumber\":\"HLTX01_SYS\"},"
				+ "\"FExchangeRate\":1.0,"
				+ "\"FIsPriceExcludeTax\":true"
				+ "}";
		// 表明细
		String sFEntity = "[";
		for(int i=0; i<10; i++)
		{
			sFEntity += ""
					+ "{"
					+ "\"FENTRYID\":null,"
					+ "\"FCustMatID\":{\"FNumber\":\"\"},"
					+ "\"FMaterialID\":{\"FNumber\":\"CH4441\"},"
					+ "\"FUnitID\":{\"FNumber\":\"Pcs\"},"
					+ "\"FInventoryQty\":0.0,"
					+ "\"FRealQty\":10.0,"
					+ "\"FPrice\":0.0,"
					+ "\"FTaxPrice\":0.0,"
					+ "\"FIsFree\":false,"
					+ "\"FBomID\":{\"FNumber\":\"\"},"
					+ "\"FProduceDate\":null,"
					+ "\"FOwnerTypeID\":\"BD_OwnerOrg\","
					+ "\"FOwnerID\":{\"FNumber\":\"100\"},"
					+ "\"FLot\":{\"FNumber\":\"\"},"
					+ "\"FExpiryDate\":null,"
					+ "\"FTaxCombination\":{\"FNumber\":\"\"},"
					+ "\"FEntryTaxRate\":17.00,"
					+ "\"FAuxUnitQty\":0.0,"
					+ "\"FExtAuxUnitId\":{\"FNumber\":\"\"},"
					+ "\"FExtAuxUnitQty\":0.0,"
					+ "\"FStockID\":{\"FNumber\":\"CK001\"},"
					+ "\"FStockStatusID\":{\"FNumber\":\"KCZT01_SYS\"},"
					+ "\"FQualifyType\":\"\","
					+ "\"FMtoNo\":null,"
					+ "\"FEntrynote\":null,"
					+ "\"FDiscountRate\":0.0,"
					+ "\"FActQty\":0.0,"
					+ "\"FSalUnitID\":{\"FNumber\":\"Pcs\"},"
					+ "\"FSALUNITQTY\":10.0,"
					+ "\"FSALBASEQTY\":10.0,"
					+ "\"FPRICEBASEQTY\":10.0,"
					+ "\"FProjectNo\":null,"
					+ "\"FOUTCONTROL\":false,"
					+ "\"FRepairQty\":0.0,"
					+ "\"FIsCreateProDoc\":\"\","
					+ "\"FEOwnerSupplierId\":{\"FNumber\":\"\"},"
					+ "\"FIsOverLegalOrg\":false,"
					+ "\"FESettleCustomerId\":{\"FNumber\":\"\"},"
					+ "\"FPriceListEntry\":{\"FNumber\":\"\"},"
					+ "\"FARNOTJOINQTY\":10.0,"
					+ "\"FQmEntryID\":0,"
					+ "\"FSOEntryId\":0,"
					+ "\"FConvertEntryID\":0,"
					+ "\"FDisPriceQty\":0.0,"
					+ "\"FBeforeDisPriceQty\":0.0"
					+ "},";
		}
		sFEntity = sFEntity.substring(0, sFEntity.length()-1);
		sFEntity += "]";
		// 表头
		String sModel = ""
				+ "{"
				+ "\"FID\":\"0\","
				+ "\"FBillTypeID\":{\"FNumber\":\"XSCKD01_SYS\"},"
				+ "\"FBillNo\":\"\","
				+ "\"FDate\":\""+ TimeUtil.getCurrentTime() +"\","
				+ "\"FSaleOrgId\":{\"FNumber\":\"100\"},"
				+ "\"FSaleDeptID\":{\"FNumber\":\"\"},"
				+ "\"FCustomerID\":{\"FNumber\":\"A001\"},"
				+ "\"FHeadLocationId\":{\"FNUMBER\":\"\"},"
				+ "\"FCorrespondOrgId\":{\"FNumber\":\"\"},"
				+ "\"FCarrierID\":{\"FNumber\":\"\"},"
				+ "\"FCarriageNO\":\"\","
				+ "\"FSalesGroupID\":{\"FNumber\":\"\"},"
				+ "\"FSalesManID\":{\"FNumber\":\"\"},"
				+ "\"FStockOrgId\":{\"FNumber\":\"100\"},"
				+ "\"FDeliveryDeptID\":{\"FNumber\":\"\"},"
				+ "\"FStockerGroupID\":{\"FNumber\":\"\"},"
				+ "\"FStockerID\":{\"FNumber\":\"\"},"
				+ "\"FNote\":\"\","
				+ "\"FReceiverID\":{\"FNumber\":\"A001\"},"
				+ "\"FReceiveAddress\":\"\","
				+ "\"FSettleID\":{\"FNumber\":\"A001\"},"
				+ "\"FReceiverContactID\":{\"FName\":\"\"},"
				+ "\"FPayerID\":{\"FNumber\":\"A001\"},"
				+ "\"FOwnerTypeIdHead\":\"BD_OwnerOrg\","
				+ "\"FOwnerIdHead\":{\"FNumber\":\"\"},"
				+ "\"FScanBox\":\"\","
				+ "\"FCDateOffsetUnit\":\"\","
				+ "\"FCDateOffsetValue\":0,"
				+ "\"FPlanRecAddress\":\"\","
				+ "\"FIsTotalServiceOrCost\":false,"
				+ "\"SubHeadEntity\":" + sSubHeadEntity + ","
				+ "\"FEntity\":" + sFEntity
				+ "}";
		//
		sContent = ""
				+ "{"
				+ "\"Creator\":\"\","
				+ "\"NeedUpDateFields\":[],"
				+ "\"NeedReturnFields\":[],"
				+ "\"IsDeleteEntry\":\"True\","
				+ "\"SubSystemId\":\"\","
				+ "\"IsVerifyBaseDataField\":\"false\","
				+ "\"Model\":" + sModel
				+ "}";
		System.out.println(sContent);
		InvokeHelper.Save(sFormId, sContent);
	}
//	public static void save(String sFormId, String sContent) throws Exception
//	{
//		ApiSave root = new ApiSave();
//		root.setCreator("test");
//		root.setIsDeleteEntry(null);
//		for(int i=0; i<1; i++)
//		{
//			// 表頭
//			Model model = new Model();
//			
//			FOutStockTrace fOutStockTrace = new FOutStockTrace();
//			fOutStockTrace.setFCarryBillNo("FCarryBillNo_"+i);
//			List<FOutStockTrace> fOutStockTraces = new ArrayList<FOutStockTrace>();
//			fOutStockTraces.add(fOutStockTrace);
//			model.setFOutStockTrace(fOutStockTraces);
//			// 单据类型
//			FBillTypeID fBillTypeID = new FBillTypeID();
//			fBillTypeID.setFNumber("XSCKD01_SYS");
//			model.setFBillTypeID(fBillTypeID);
//			// 销售组织
//			FSaleOrgId fSaleOrgId = new FSaleOrgId();
//			fSaleOrgId.setFNumber("100");
//			model.setFSaleOrgId(fSaleOrgId);
//			// 库存组织
//			FStockOrgId fStockOrgId = new FStockOrgId();
//			fStockOrgId.setFNumber("100");
//			model.setFStockOrgId(fStockOrgId);
//			// 客户
//			FCustomerID fCustomerID = new FCustomerID();
//			fCustomerID.setFNumber("A001");
//			model.setFCustomerID(fCustomerID);
//			
//			FSettleOrgID fSettleOrgID = new FSettleOrgID();
//			fSettleOrgID.setFNumber("100");
//			FSettleCurrID fSettleCurrID = new FSettleCurrID();
//			fSettleCurrID.setFNumber("PRE001");
//			SubHeadEntity subHeadEntity = new SubHeadEntity();
//			subHeadEntity.setFSettleOrgID(fSettleOrgID);
//			subHeadEntity.setFSettleCurrID(fSettleCurrID);
//			model.setSubHeadEntity(subHeadEntity);
//			
//			model.setFDate(new Date());
//			
//			// 表明細
//			List<FEntity> fEntityList = new ArrayList<FEntity>();
//			for(int j=0; j<10; j++)
//			{
//				FEntity fEntity = new FEntity();
//				// 物料编码
//				FMaterialID fMaterialID = new FMaterialID();
//				fMaterialID.setFNumber("CH4441");
//				fEntity.setFMaterialID(fMaterialID);
//				// 库存单位
//				FUnitID fUnitID = new FUnitID();
//				fUnitID.setFNumber("Pcs");
//				fEntity.setFUnitID(fUnitID);
//				// 货主
//				FOwnerID fOwnerID = new FOwnerID();
//				fOwnerID.setFNumber("100");
//				fEntity.setFOwnerID(fOwnerID);
//				// 实发数量
//				fEntity.setFRealQty(j+1+"");
//				// 仓库
//				FStockID fStockID = new FStockID();
//				fStockID.setFNumber("CK001");
//				fEntity.setFStockID(fStockID);
//				// add to list
//				fEntityList.add(fEntity);
//			}
//			model.setFEntity(fEntityList);
//			root.setModel(model);
//		}
//		sContent = com.alibaba.fastjson.JSONArray.toJSONString(root, new com.alibaba.fastjson.serializer.PascalNameFilter(), SerializerFeature.WriteMapNullValue,  SerializerFeature.WriteNullStringAsEmpty, SerializerFeature.WriteNullListAsEmpty, SerializerFeature.WriteNullNumberAsZero);
////		sContent = "{\"Creator\":\"test\",\"Model\":{\"FBillTypeID\":{\"FNumber\":\"XSCKD01_SYS\"},\"FCustomerID\":{\"FNumber\":\"TEST\"},\"FDate\":\"2018-03-26 14:06:09\",\"FEntity\":[{\"FMaterialID\":{\"FNumber\":\"CH4441\"},\"FOwnerID\":{\"FNumber\":\"100\"},\"FRealQty\":\"1\",\"FStockID\":{\"FNumber\":\"CK001\"},\"FUnitID\":{\"FNumber\":\"Pcs\"}},{\"FMaterialID\":{\"FNumber\":\"CH4441\"},\"FOwnerID\":{\"FNumber\":\"100\"},\"FRealQty\":\"2\",\"FStockID\":{\"FNumber\":\"CK001\"},\"FUnitID\":{\"FNumber\":\"Pcs\"}},{\"FMaterialID\":{\"FNumber\":\"CH4441\"},\"FOwnerID\":{\"FNumber\":\"100\"},\"FRealQty\":\"3\",\"FStockID\":{\"FNumber\":\"CK001\"},\"FUnitID\":{\"FNumber\":\"Pcs\"}},{\"FMaterialID\":{\"FNumber\":\"CH4441\"},\"FOwnerID\":{\"FNumber\":\"100\"},\"FRealQty\":\"4\",\"FStockID\":{\"FNumber\":\"CK001\"},\"FUnitID\":{\"FNumber\":\"Pcs\"}},{\"FMaterialID\":{\"FNumber\":\"CH4441\"},\"FOwnerID\":{\"FNumber\":\"100\"},\"FRealQty\":\"5\",\"FStockID\":{\"FNumber\":\"CK001\"},\"FUnitID\":{\"FNumber\":\"Pcs\"}},{\"FMaterialID\":{\"FNumber\":\"CH4441\"},\"FOwnerID\":{\"FNumber\":\"100\"},\"FRealQty\":\"6\",\"FStockID\":{\"FNumber\":\"CK001\"},\"FUnitID\":{\"FNumber\":\"Pcs\"}},{\"FMaterialID\":{\"FNumber\":\"CH4441\"},\"FOwnerID\":{\"FNumber\":\"100\"},\"FRealQty\":\"7\",\"FStockID\":{\"FNumber\":\"CK001\"},\"FUnitID\":{\"FNumber\":\"Pcs\"}},{\"FMaterialID\":{\"FNumber\":\"CH4441\"},\"FOwnerID\":{\"FNumber\":\"100\"},\"FRealQty\":\"8\",\"FStockID\":{\"FNumber\":\"CK001\"},\"FUnitID\":{\"FNumber\":\"Pcs\"}},{\"FMaterialID\":{\"FNumber\":\"CH4441\"},\"FOwnerID\":{\"FNumber\":\"100\"},\"FRealQty\":\"9\",\"FStockID\":{\"FNumber\":\"CK001\"},\"FUnitID\":{\"FNumber\":\"Pcs\"}},{\"FMaterialID\":{\"FNumber\":\"CH4441\"},\"FOwnerID\":{\"FNumber\":\"100\"},\"FRealQty\":\"10\",\"FStockID\":{\"FNumber\":\"CK001\"},\"FUnitID\":{\"FNumber\":\"Pcs\"}}],\"FOutStockTrace\":[{\"FCarryBillNo\":\"FCarryBillNo_0\"}],\"FSaleOrgId\":{\"FNumber\":\"100\"},\"FStockOrgId\":{\"FNumber\":\"100\"},\"SubHeadEntity\":{\"FSettleCurrID\":{\"FNumber\":\"PRE001\"},\"FSettleOrgID\":{\"FNumber\":\"100\"}}}}";
////		sContent = "{\"Creator\":\"\",\"NeedUpDateFields\":[],\"NeedReturnFields\":[],\"IsDeleteEntry\":\"True\",\"SubSystemId\":\"\",\"IsVerifyBaseDataField\":\"false\",\"Model\":{\"FID\":\"0\",\"FBillTypeID\":{\"FNumber\":\"XSCKD01_SYS\"},\"FBillNo\":\"\",\"FDate\":\"1900-01-01\",\"FSaleOrgId\":{\"FNumber\":\"100\"},\"FSaleDeptID\":{\"FNumber\":\"\"},\"FCustomerID\":{\"FNumber\":\"A001\"},\"FHeadLocationId\":{\"FNUMBER\":\"\"},\"FCorrespondOrgId\":{\"FNumber\":\"\"},\"FCarrierID\":{\"FNumber\":\"\"},\"FCarriageNO\":\"\",\"FSalesGroupID\":{\"FNumber\":\"\"},\"FSalesManID\":{\"FNumber\":\"\"},\"FStockOrgId\":{\"FNumber\":\"100\"},\"FDeliveryDeptID\":{\"FNumber\":\"\"},\"FStockerGroupID\":{\"FNumber\":\"\"},\"FStockerID\":{\"FNumber\":\"\"},\"FNote\":\"\",\"FReceiverID\":{\"FNumber\":\"\"},\"FReceiveAddress\":\"\",\"FSettleID\":{\"FNumber\":\"\"},\"FReceiverContactID\":{\"FName\":\"\"},\"FPayerID\":{\"FNumber\":\"\"},\"FOwnerTypeIdHead\":\"\",\"FOwnerIdHead\":{\"FNumber\":\"\"},\"FScanBox\":\"\",\"FCDateOffsetUnit\":\"\",\"FCDateOffsetValue\":\"0\",\"FPlanRecAddress\":\"\",\"FIsTotalServiceOrCost\":\"false\",\"SubHeadEntity\":{\"FSettleCurrID\":{\"FNumber\":\"PRE001\"},\"FSettleOrgID\":{\"FNumber\":\"100\"},\"FSettleTypeID\":{\"FNumber\":\"\"},\"FReceiptConditionID\":{\"FNumber\":\"\"},\"FPriceListId\":{\"FNumber\":\"\"},\"FDiscountListId\":{\"FNumber\":\"\"},\"FIsIncludedTax\":\"false\",\"FLocalCurrID\":{\"FNumber\":\"\"},\"FExchangeTypeID\":{\"FNumber\":\"\"},\"FExchangeRate\":\"0\",\"FIsPriceExcludeTax\":\"false\"},\"FEntity\":[{\"FENTRYID\":\"0\",\"FCustMatID\":{\"FNumber\":\"\"},\"FMaterialID\":{\"FNumber\":\"CH4441\"},\"FAuxPropId\":{},\"FUnitID\":{\"FNumber\":\"Pcs\"},\"FInventoryQty\":\"0\",\"FRealQty\":\"0\",\"FPrice\":\"0\",\"FTaxPrice\":\"0\",\"FIsFree\":\"false\",\"FBomID\":{\"FNumber\":\"\"},\"FProduceDate\":\"1900-01-01\",\"FOwnerTypeID\":\"\",\"FOwnerID\":{\"FNumber\":\"100\"},\"FLot\":{\"FNumber\":\"\"},\"FExpiryDate\":\"1900-01-01\",\"FTaxCombination\":{\"FNumber\":\"\"},\"FEntryTaxRate\":\"0\",\"FAuxUnitQty\":\"0\",\"FExtAuxUnitId\":{\"FNumber\":\"\"},\"FExtAuxUnitQty\":\"0\",\"FStockID\":{\"FNumber\":\"CK001\"},\"FStockLocID\":{},\"FStockStatusID\":{\"FNumber\":\"\"},\"FQualifyType\":\"\",\"FMtoNo\":\"\",\"FEntrynote\":\"\",\"FDiscountRate\":\"0\",\"FActQty\":\"0\",\"FSalUnitID\":{\"FNumber\":\"\"},\"FSALUNITQTY\":\"0\",\"FSALBASEQTY\":\"0\",\"FPRICEBASEQTY\":\"0\",\"FProjectNo\":\"\",\"FOUTCONTROL\":\"false\",\"FRepairQty\":\"0\",\"FIsCreateProDoc\":\"\",\"FEOwnerSupplierId\":{\"FNumber\":\"\"},\"FIsOverLegalOrg\":\"false\",\"FESettleCustomerId\":{\"FNumber\":\"\"},\"FPriceListEntry\":{\"FNumber\":\"\"},\"FARNOTJOINQTY\":\"0\",\"FQmEntryID\":\"0\",\"FSOEntryId\":\"0\",\"FConvertEntryID\":\"0\",\"FDisPriceQty\":\"0\",\"FBeforeDisPriceQty\":\"0\",\"FTaxDetailSubEntity\":[{\"FDetailID\":\"0\",\"FTaxRate\":\"0\"}],\"FSerialSubEntity\":[{\"FDetailID\":\"0\",\"FSerialNo\":\"\",\"FSerialNote\":\"\"}]}],\"FOutStockTrace\":[{\"FEntryID\":\"0\",\"FLogComId\":{\"FCode\":\"\"},\"FCarryBillNo\":\"\",\"FTraceStatus\":\"\",\"FOutStockTraceDetail\":[{\"FDetailID\":\"0\",\"FTraceTime\":\"\",\"FTraceDetail\":\"\"}]}]}}";
//		System.out.println(sContent);
//		InvokeHelper.Save(sFormId, sContent);
//	}
	
	// 测试 BatchSave
	public static void batchSave(String sFormId, String sContent) throws Exception
	{
		ApiBatchSave root = new ApiBatchSave();
		List<Model> models = new ArrayList<Model>();
		for(int i=0; i<10; i++)
		{
			// 表頭
			Model model = new Model();
			
			FOutStockTrace fOutStockTrace = new FOutStockTrace();
			fOutStockTrace.setFCarryBillNo("FCarryBillNo_"+i);
			List<FOutStockTrace> fOutStockTraces = new ArrayList<FOutStockTrace>();
			fOutStockTraces.add(fOutStockTrace);
			model.setFOutStockTrace(fOutStockTraces);
			
			FBillTypeID fBillTypeID = new FBillTypeID();
			fBillTypeID.setFNumber("fBillTypeID_"+i);
			model.setFBillTypeID(fBillTypeID);
			
			FSaleOrgId fSaleOrgId = new FSaleOrgId();
			fSaleOrgId.setFNumber("fSaleOrgId_"+i);
			model.setFSaleOrgId(fSaleOrgId);
			
			FStockOrgId fStockOrgId = new FStockOrgId();
			fStockOrgId.setFNumber("fStockOrgId_"+i);
			model.setFStockOrgId(fStockOrgId);
			
			FCustomerID fCustomerID = new FCustomerID();
			fCustomerID.setFNumber("fCustomerID_"+i);
			model.setFCustomerID(fCustomerID);
			
			FSettleOrgID fSettleOrgID = new FSettleOrgID();
			fSettleOrgID.setFNumber("fSettleOrgID_"+i);
			FSettleCurrID fSettleCurrID = new FSettleCurrID();
			fSettleCurrID.setFNumber("fSettleCurrID_"+i);
			SubHeadEntity subHeadEntity = new SubHeadEntity();
			subHeadEntity.setFSettleOrgID(fSettleOrgID);
			subHeadEntity.setFSettleCurrID(fSettleCurrID);
			model.setSubHeadEntity(subHeadEntity);
			
			model.setFDate(new Date());
			
			// 表明細
			List<FEntity> fEntitys = new ArrayList<FEntity>();
			for(int j=0; j<10; j++)
			{
				FUnitID fUnitID = new FUnitID();
				fUnitID.setFNumber("fUnitID_"+j);
				FOwnerID fOwnerID = new FOwnerID();
				fOwnerID.setFNumber("fOwnerID_"+j);
				FEntity fEntity = new FEntity();
				fEntity.setFUnitID(fUnitID);
				fEntity.setFOwnerID(fOwnerID);
				fEntitys.add(fEntity);
			}
			//
			model.setFEntity(fEntitys);
			models.add(model);
		}
		root.setModel(models);
		sContent = com.alibaba.fastjson.JSONArray.toJSONString(root, new com.alibaba.fastjson.serializer.PascalNameFilter(), SerializerFeature.WriteNullStringAsEmpty);
		System.out.println(sContent);
		InvokeHelper.BatchSave(sFormId, sContent);
	}
	
	public static void audit(String sFormId, String sContent)
	{
		ApiAudit apiAudit = new ApiAudit();
//		apiAudit.set
	}
}
