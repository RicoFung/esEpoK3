package com.api.entity.json.sal.order;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class FSaleOrderEntry
{
	@JSONField(ordinal=1)
	private String FEntryID;
	@JSONField(ordinal=2)
	private String FReturnType;
	@JSONField(ordinal=3)
	private FMapId FMapId;
	@JSONField(ordinal=4)
	private FMaterialId FMaterialId;
	@JSONField(ordinal=5)
	private FAuxPropId FAuxPropId;
	@JSONField(ordinal=6)
	private FUnitID FUnitID;
	@JSONField(ordinal=7)
	private String FCurrentInventory;
	@JSONField(ordinal=8)
	private String FInventoryQty;
	@JSONField(ordinal=9)
	private String FAwaitQty;
	@JSONField(ordinal=10)
	private String FAvailableQty;
	@JSONField(ordinal=11)
	private String FQty;
	@JSONField(ordinal=12)
	private String FOldQty;
	@JSONField(ordinal=13)
	private String FPrice;
	@JSONField(ordinal=14)
	private String FTaxPrice;
	@JSONField(ordinal=15)
	private String FIsFree;
	@JSONField(ordinal=16)
	private FTaxCombination FTaxCombination;
	@JSONField(ordinal=17)
	private String FEntryTaxRate;
	@JSONField(ordinal=18)
	private String FProduceDate;
	@JSONField(ordinal=19)
	private String FExpPeriod;
	@JSONField(ordinal=20)
	private String FExpUnit;
	@JSONField(ordinal=21)
	private String FExpiryDate;
	@JSONField(ordinal=22)
	private FLot FLot;
	@JSONField(ordinal=23)
	private String FDiscountRate;
	@JSONField(ordinal=24)
	private String FDeliveryDate;
	@JSONField(ordinal=25)
	private FStockOrgId FStockOrgId;
	@JSONField(ordinal=26)
	private FSettleOrgIds FSettleOrgIds;
	@JSONField(ordinal=27)
	private FSupplyOrgId FSupplyOrgId;
	@JSONField(ordinal=28)
	private String FOwnerTypeId;
	@JSONField(ordinal=29)
	private FOwnerId FOwnerId;
	@JSONField(ordinal=30)
	private String FEntryNote;
	@JSONField(ordinal=31)
	private String FReserveType;
	@JSONField(ordinal=32)
	private String FPriority;
	@JSONField(ordinal=33)
	private String FMtoNo;
	@JSONField(ordinal=34)
	private String FPromotionMatchType;
	@JSONField(ordinal=35)
	private String FNetOrderEntryId;
	@JSONField(ordinal=36)
	private String FPriceBaseQty;
	@JSONField(ordinal=37)
	private FSetPriceUnitID FSetPriceUnitID;
	@JSONField(ordinal=38)
	private FStockUnitID FStockUnitID;
	@JSONField(ordinal=39)
	private String FStockQty;
	@JSONField(ordinal=40)
	private String FStockBaseQty;
	@JSONField(ordinal=41)
	private String FServiceContext;
	@JSONField(ordinal=42)
	private String FOUTLMTUNIT;
	@JSONField(ordinal=43)
	private FOutLmtUnitID FOutLmtUnitID;
	@JSONField(ordinal=44)
	private List<FOrderEntryPlan> FOrderEntryPlan;
	@JSONField(ordinal=45)
	private List<FTaxDetailSubEntity> FTaxDetailSubEntity;

	public void setFEntryID(String FEntryID)
	{
		this.FEntryID = FEntryID;
	}

	public String getFEntryID()
	{
		return FEntryID;
	}

	public void setFReturnType(String FReturnType)
	{
		this.FReturnType = FReturnType;
	}

	public String getFReturnType()
	{
		return FReturnType;
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

	public void setFAuxPropId(FAuxPropId FAuxPropId)
	{
		this.FAuxPropId = FAuxPropId;
	}

	public FAuxPropId getFAuxPropId()
	{
		return FAuxPropId;
	}

	public void setFUnitID(FUnitID FUnitID)
	{
		this.FUnitID = FUnitID;
	}

	public FUnitID getFUnitID()
	{
		return FUnitID;
	}

	public void setFCurrentInventory(String FCurrentInventory)
	{
		this.FCurrentInventory = FCurrentInventory;
	}

	public String getFCurrentInventory()
	{
		return FCurrentInventory;
	}

	public void setFInventoryQty(String FInventoryQty)
	{
		this.FInventoryQty = FInventoryQty;
	}

	public String getFInventoryQty()
	{
		return FInventoryQty;
	}

	public void setFAwaitQty(String FAwaitQty)
	{
		this.FAwaitQty = FAwaitQty;
	}

	public String getFAwaitQty()
	{
		return FAwaitQty;
	}

	public void setFAvailableQty(String FAvailableQty)
	{
		this.FAvailableQty = FAvailableQty;
	}

	public String getFAvailableQty()
	{
		return FAvailableQty;
	}

	public void setFQty(String FQty)
	{
		this.FQty = FQty;
	}

	public String getFQty()
	{
		return FQty;
	}

	public void setFOldQty(String FOldQty)
	{
		this.FOldQty = FOldQty;
	}

	public String getFOldQty()
	{
		return FOldQty;
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

	public void setFProduceDate(String FProduceDate)
	{
		this.FProduceDate = FProduceDate;
	}

	public String getFProduceDate()
	{
		return FProduceDate;
	}

	public void setFExpPeriod(String FExpPeriod)
	{
		this.FExpPeriod = FExpPeriod;
	}

	public String getFExpPeriod()
	{
		return FExpPeriod;
	}

	public void setFExpUnit(String FExpUnit)
	{
		this.FExpUnit = FExpUnit;
	}

	public String getFExpUnit()
	{
		return FExpUnit;
	}

	public void setFExpiryDate(String FExpiryDate)
	{
		this.FExpiryDate = FExpiryDate;
	}

	public String getFExpiryDate()
	{
		return FExpiryDate;
	}

	public void setFLot(FLot FLot)
	{
		this.FLot = FLot;
	}

	public FLot getFLot()
	{
		return FLot;
	}

	public void setFDiscountRate(String FDiscountRate)
	{
		this.FDiscountRate = FDiscountRate;
	}

	public String getFDiscountRate()
	{
		return FDiscountRate;
	}

	public void setFDeliveryDate(String FDeliveryDate)
	{
		this.FDeliveryDate = FDeliveryDate;
	}

	public String getFDeliveryDate()
	{
		return FDeliveryDate;
	}

	public void setFStockOrgId(FStockOrgId FStockOrgId)
	{
		this.FStockOrgId = FStockOrgId;
	}

	public FStockOrgId getFStockOrgId()
	{
		return FStockOrgId;
	}

	public void setFSettleOrgIds(FSettleOrgIds FSettleOrgIds)
	{
		this.FSettleOrgIds = FSettleOrgIds;
	}

	public FSettleOrgIds getFSettleOrgIds()
	{
		return FSettleOrgIds;
	}

	public void setFSupplyOrgId(FSupplyOrgId FSupplyOrgId)
	{
		this.FSupplyOrgId = FSupplyOrgId;
	}

	public FSupplyOrgId getFSupplyOrgId()
	{
		return FSupplyOrgId;
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

	public void setFEntryNote(String FEntryNote)
	{
		this.FEntryNote = FEntryNote;
	}

	public String getFEntryNote()
	{
		return FEntryNote;
	}

	public void setFReserveType(String FReserveType)
	{
		this.FReserveType = FReserveType;
	}

	public String getFReserveType()
	{
		return FReserveType;
	}

	public void setFPriority(String FPriority)
	{
		this.FPriority = FPriority;
	}

	public String getFPriority()
	{
		return FPriority;
	}

	public void setFMtoNo(String FMtoNo)
	{
		this.FMtoNo = FMtoNo;
	}

	public String getFMtoNo()
	{
		return FMtoNo;
	}

	public void setFPromotionMatchType(String FPromotionMatchType)
	{
		this.FPromotionMatchType = FPromotionMatchType;
	}

	public String getFPromotionMatchType()
	{
		return FPromotionMatchType;
	}

	public void setFNetOrderEntryId(String FNetOrderEntryId)
	{
		this.FNetOrderEntryId = FNetOrderEntryId;
	}

	public String getFNetOrderEntryId()
	{
		return FNetOrderEntryId;
	}

	public void setFPriceBaseQty(String FPriceBaseQty)
	{
		this.FPriceBaseQty = FPriceBaseQty;
	}

	public String getFPriceBaseQty()
	{
		return FPriceBaseQty;
	}

	public void setFSetPriceUnitID(FSetPriceUnitID FSetPriceUnitID)
	{
		this.FSetPriceUnitID = FSetPriceUnitID;
	}

	public FSetPriceUnitID getFSetPriceUnitID()
	{
		return FSetPriceUnitID;
	}

	public void setFStockUnitID(FStockUnitID FStockUnitID)
	{
		this.FStockUnitID = FStockUnitID;
	}

	public FStockUnitID getFStockUnitID()
	{
		return FStockUnitID;
	}

	public void setFStockQty(String FStockQty)
	{
		this.FStockQty = FStockQty;
	}

	public String getFStockQty()
	{
		return FStockQty;
	}

	public void setFStockBaseQty(String FStockBaseQty)
	{
		this.FStockBaseQty = FStockBaseQty;
	}

	public String getFStockBaseQty()
	{
		return FStockBaseQty;
	}

	public void setFServiceContext(String FServiceContext)
	{
		this.FServiceContext = FServiceContext;
	}

	public String getFServiceContext()
	{
		return FServiceContext;
	}

	public void setFOUTLMTUNIT(String FOUTLMTUNIT)
	{
		this.FOUTLMTUNIT = FOUTLMTUNIT;
	}

	public String getFOUTLMTUNIT()
	{
		return FOUTLMTUNIT;
	}

	public void setFOutLmtUnitID(FOutLmtUnitID FOutLmtUnitID)
	{
		this.FOutLmtUnitID = FOutLmtUnitID;
	}

	public FOutLmtUnitID getFOutLmtUnitID()
	{
		return FOutLmtUnitID;
	}

	public void setFOrderEntryPlan(List<FOrderEntryPlan> FOrderEntryPlan)
	{
		this.FOrderEntryPlan = FOrderEntryPlan;
	}

	public List<FOrderEntryPlan> getFOrderEntryPlan()
	{
		return FOrderEntryPlan;
	}

	public void setFTaxDetailSubEntity(List<FTaxDetailSubEntity> FTaxDetailSubEntity)
	{
		this.FTaxDetailSubEntity = FTaxDetailSubEntity;
	}

	public List<FTaxDetailSubEntity> getFTaxDetailSubEntity()
	{
		return FTaxDetailSubEntity;
	}

}