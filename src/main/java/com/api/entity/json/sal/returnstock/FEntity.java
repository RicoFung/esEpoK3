package com.api.entity.json.sal.returnstock;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class FEntity
{
	@JSONField(ordinal=1)
	private String FENTRYID;
	@JSONField(ordinal=2)
	private FMapId FMapId;
	@JSONField(ordinal=3)
	private FMaterialId FMaterialId;
	@JSONField(ordinal=4)
	private FAuxpropId FAuxpropId;
	@JSONField(ordinal=5)
	private FUnitID FUnitID;
	@JSONField(ordinal=6)
	private String FInventoryQty;
	@JSONField(ordinal=7)
	private String FRealQty;
	@JSONField(ordinal=8)
	private String FPrice;
	@JSONField(ordinal=9)
	private String FTaxPrice;
	@JSONField(ordinal=10)
	private String FIsFree;
	@JSONField(ordinal=11)
	private FTaxCombination FTaxCombination;
	@JSONField(ordinal=12)
	private String FEntryTaxRate;
	@JSONField(ordinal=13)
	private FBOMId FBOMId;
	@JSONField(ordinal=14)
	private FReturnType FReturnType;
	@JSONField(ordinal=15)
	private String FOwnerTypeId;
	@JSONField(ordinal=16)
	private FOwnerId FOwnerId;
	@JSONField(ordinal=17)
	private Date FProduceDate;
	@JSONField(ordinal=18)
	private Date FExpiryDate;
	@JSONField(ordinal=19)
	private FStockId FStockId;
	@JSONField(ordinal=20)
	private FStocklocId FStocklocId;
	@JSONField(ordinal=21)
	private FStockstatusId FStockstatusId;
	@JSONField(ordinal=22)
	private Date FDeliveryDate;
	@JSONField(ordinal=23)
	private String FMtoNo;
	@JSONField(ordinal=24)
	private String FNote;
	@JSONField(ordinal=25)
	private String FDiscountRate;
	@JSONField(ordinal=26)
	private String FAuxUnitQty;
	@JSONField(ordinal=27)
	private FExtAuxUnitId FExtAuxUnitId;
	@JSONField(ordinal=28)
	private String FExtAuxUnitQty;
	@JSONField(ordinal=29)
	private String FSalCostPrice;
	@JSONField(ordinal=30)
	private String FISCONSUMESUM;
	@JSONField(ordinal=31)
	private FLot FLot;
	@JSONField(ordinal=32)
	private FSalUnitID FSalUnitID;
	@JSONField(ordinal=33)
	private String FSalUnitQty;
	@JSONField(ordinal=34)
	private String FSalBaseQty;
	@JSONField(ordinal=35)
	private String FPriceBaseQty;
	@JSONField(ordinal=36)
	private String FProjectNo;
	@JSONField(ordinal=37)
	private String FQualifyType;
	@JSONField(ordinal=38)
	private FEOwnerSupplierId FEOwnerSupplierId;
	@JSONField(ordinal=39)
	private String FIsOverLegalOrg;
	@JSONField(ordinal=40)
	private FESettleCustomerId FESettleCustomerId;
	@JSONField(ordinal=41)
	private String FSOEntryId;
	@JSONField(ordinal=42)
	private FPriceListEntry FPriceListEntry;
	@JSONField(ordinal=43)
	private String FARNOTJOINQTY;
	@JSONField(ordinal=44)
	private String FIsReturnCheck;
	@JSONField(ordinal=45)
	private List<FTaxDetailSubEntity> FTaxDetailSubEntity;
	@JSONField(ordinal=46)
	private List<FSerialSubEntity> FSerialSubEntity;

	public void setFENTRYID(String FENTRYID)
	{
		this.FENTRYID = FENTRYID;
	}

	public String getFENTRYID()
	{
		return FENTRYID;
	}

	public void setFMapId(FMapId FMapId)
	{
		this.FMapId = FMapId;
	}

	public FMapId getFMapId()
	{
		return FMapId;
	}

	public void setFMaterialId(FMaterialId FMaterialId)
	{
		this.FMaterialId = FMaterialId;
	}

	public FMaterialId getFMaterialId()
	{
		return FMaterialId;
	}

	public void setFAuxpropId(FAuxpropId FAuxpropId)
	{
		this.FAuxpropId = FAuxpropId;
	}

	public FAuxpropId getFAuxpropId()
	{
		return FAuxpropId;
	}

	public void setFUnitID(FUnitID FUnitID)
	{
		this.FUnitID = FUnitID;
	}

	public FUnitID getFUnitID()
	{
		return FUnitID;
	}

	public void setFInventoryQty(String FInventoryQty)
	{
		this.FInventoryQty = FInventoryQty;
	}

	public String getFInventoryQty()
	{
		return FInventoryQty;
	}

	public void setFRealQty(String FRealQty)
	{
		this.FRealQty = FRealQty;
	}

	public String getFRealQty()
	{
		return FRealQty;
	}

	public void setFPrice(String FPrice)
	{
		this.FPrice = FPrice;
	}

	public String getFPrice()
	{
		return FPrice;
	}

	public void setFTaxPrice(String FTaxPrice)
	{
		this.FTaxPrice = FTaxPrice;
	}

	public String getFTaxPrice()
	{
		return FTaxPrice;
	}

	public void setFIsFree(String FIsFree)
	{
		this.FIsFree = FIsFree;
	}

	public String getFIsFree()
	{
		return FIsFree;
	}

	public void setFTaxCombination(FTaxCombination FTaxCombination)
	{
		this.FTaxCombination = FTaxCombination;
	}

	public FTaxCombination getFTaxCombination()
	{
		return FTaxCombination;
	}

	public void setFEntryTaxRate(String FEntryTaxRate)
	{
		this.FEntryTaxRate = FEntryTaxRate;
	}

	public String getFEntryTaxRate()
	{
		return FEntryTaxRate;
	}

	public void setFBOMId(FBOMId FBOMId)
	{
		this.FBOMId = FBOMId;
	}

	public FBOMId getFBOMId()
	{
		return FBOMId;
	}

	public void setFReturnType(FReturnType FReturnType)
	{
		this.FReturnType = FReturnType;
	}

	public FReturnType getFReturnType()
	{
		return FReturnType;
	}

	public void setFOwnerTypeId(String FOwnerTypeId)
	{
		this.FOwnerTypeId = FOwnerTypeId;
	}

	public String getFOwnerTypeId()
	{
		return FOwnerTypeId;
	}

	public void setFOwnerId(FOwnerId FOwnerId)
	{
		this.FOwnerId = FOwnerId;
	}

	public FOwnerId getFOwnerId()
	{
		return FOwnerId;
	}

	public void setFProduceDate(Date FProduceDate)
	{
		this.FProduceDate = FProduceDate;
	}

	public Date getFProduceDate()
	{
		return FProduceDate;
	}

	public void setFExpiryDate(Date FExpiryDate)
	{
		this.FExpiryDate = FExpiryDate;
	}

	public Date getFExpiryDate()
	{
		return FExpiryDate;
	}

	public void setFStockId(FStockId FStockId)
	{
		this.FStockId = FStockId;
	}

	public FStockId getFStockId()
	{
		return FStockId;
	}

	public void setFStocklocId(FStocklocId FStocklocId)
	{
		this.FStocklocId = FStocklocId;
	}

	public FStocklocId getFStocklocId()
	{
		return FStocklocId;
	}

	public void setFStockstatusId(FStockstatusId FStockstatusId)
	{
		this.FStockstatusId = FStockstatusId;
	}

	public FStockstatusId getFStockstatusId()
	{
		return FStockstatusId;
	}

	public void setFDeliveryDate(Date FDeliveryDate)
	{
		this.FDeliveryDate = FDeliveryDate;
	}

	public Date getFDeliveryDate()
	{
		return FDeliveryDate;
	}

	public void setFMtoNo(String FMtoNo)
	{
		this.FMtoNo = FMtoNo;
	}

	public String getFMtoNo()
	{
		return FMtoNo;
	}

	public void setFNote(String FNote)
	{
		this.FNote = FNote;
	}

	public String getFNote()
	{
		return FNote;
	}

	public void setFDiscountRate(String FDiscountRate)
	{
		this.FDiscountRate = FDiscountRate;
	}

	public String getFDiscountRate()
	{
		return FDiscountRate;
	}

	public void setFAuxUnitQty(String FAuxUnitQty)
	{
		this.FAuxUnitQty = FAuxUnitQty;
	}

	public String getFAuxUnitQty()
	{
		return FAuxUnitQty;
	}

	public void setFExtAuxUnitId(FExtAuxUnitId FExtAuxUnitId)
	{
		this.FExtAuxUnitId = FExtAuxUnitId;
	}

	public FExtAuxUnitId getFExtAuxUnitId()
	{
		return FExtAuxUnitId;
	}

	public void setFExtAuxUnitQty(String FExtAuxUnitQty)
	{
		this.FExtAuxUnitQty = FExtAuxUnitQty;
	}

	public String getFExtAuxUnitQty()
	{
		return FExtAuxUnitQty;
	}

	public void setFSalCostPrice(String FSalCostPrice)
	{
		this.FSalCostPrice = FSalCostPrice;
	}

	public String getFSalCostPrice()
	{
		return FSalCostPrice;
	}

	public void setFISCONSUMESUM(String FISCONSUMESUM)
	{
		this.FISCONSUMESUM = FISCONSUMESUM;
	}

	public String getFISCONSUMESUM()
	{
		return FISCONSUMESUM;
	}

	public void setFLot(FLot FLot)
	{
		this.FLot = FLot;
	}

	public FLot getFLot()
	{
		return FLot;
	}

	public void setFSalUnitID(FSalUnitID FSalUnitID)
	{
		this.FSalUnitID = FSalUnitID;
	}

	public FSalUnitID getFSalUnitID()
	{
		return FSalUnitID;
	}

	public void setFSalUnitQty(String FSalUnitQty)
	{
		this.FSalUnitQty = FSalUnitQty;
	}

	public String getFSalUnitQty()
	{
		return FSalUnitQty;
	}

	public void setFSalBaseQty(String FSalBaseQty)
	{
		this.FSalBaseQty = FSalBaseQty;
	}

	public String getFSalBaseQty()
	{
		return FSalBaseQty;
	}

	public void setFPriceBaseQty(String FPriceBaseQty)
	{
		this.FPriceBaseQty = FPriceBaseQty;
	}

	public String getFPriceBaseQty()
	{
		return FPriceBaseQty;
	}

	public void setFProjectNo(String FProjectNo)
	{
		this.FProjectNo = FProjectNo;
	}

	public String getFProjectNo()
	{
		return FProjectNo;
	}

	public void setFQualifyType(String FQualifyType)
	{
		this.FQualifyType = FQualifyType;
	}

	public String getFQualifyType()
	{
		return FQualifyType;
	}

	public void setFEOwnerSupplierId(FEOwnerSupplierId FEOwnerSupplierId)
	{
		this.FEOwnerSupplierId = FEOwnerSupplierId;
	}

	public FEOwnerSupplierId getFEOwnerSupplierId()
	{
		return FEOwnerSupplierId;
	}

	public void setFIsOverLegalOrg(String FIsOverLegalOrg)
	{
		this.FIsOverLegalOrg = FIsOverLegalOrg;
	}

	public String getFIsOverLegalOrg()
	{
		return FIsOverLegalOrg;
	}

	public void setFESettleCustomerId(FESettleCustomerId FESettleCustomerId)
	{
		this.FESettleCustomerId = FESettleCustomerId;
	}

	public FESettleCustomerId getFESettleCustomerId()
	{
		return FESettleCustomerId;
	}

	public void setFSOEntryId(String FSOEntryId)
	{
		this.FSOEntryId = FSOEntryId;
	}

	public String getFSOEntryId()
	{
		return FSOEntryId;
	}

	public void setFPriceListEntry(FPriceListEntry FPriceListEntry)
	{
		this.FPriceListEntry = FPriceListEntry;
	}

	public FPriceListEntry getFPriceListEntry()
	{
		return FPriceListEntry;
	}

	public void setFARNOTJOINQTY(String FARNOTJOINQTY)
	{
		this.FARNOTJOINQTY = FARNOTJOINQTY;
	}

	public String getFARNOTJOINQTY()
	{
		return FARNOTJOINQTY;
	}

	public void setFIsReturnCheck(String FIsReturnCheck)
	{
		this.FIsReturnCheck = FIsReturnCheck;
	}

	public String getFIsReturnCheck()
	{
		return FIsReturnCheck;
	}

	public void setFTaxDetailSubEntity(List<FTaxDetailSubEntity> FTaxDetailSubEntity)
	{
		this.FTaxDetailSubEntity = FTaxDetailSubEntity;
	}

	public List<FTaxDetailSubEntity> getFTaxDetailSubEntity()
	{
		return FTaxDetailSubEntity;
	}

	public void setFSerialSubEntity(List<FSerialSubEntity> FSerialSubEntity)
	{
		this.FSerialSubEntity = FSerialSubEntity;
	}

	public List<FSerialSubEntity> getFSerialSubEntity()
	{
		return FSerialSubEntity;
	}

}