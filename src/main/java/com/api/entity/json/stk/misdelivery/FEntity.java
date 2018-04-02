package com.api.entity.json.stk.misdelivery;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class FEntity
{
	@JSONField(ordinal=1)
	private String FEntryID;
	@JSONField(ordinal=2)
	private FMaterialId FMaterialId;
	@JSONField(ordinal=3)
	private FAuxPropId FAuxPropId;
	@JSONField(ordinal=4)
	private FUnitID FUnitID;
	@JSONField(ordinal=5)
	private String FQty;
	@JSONField(ordinal=6)
	private FBaseUnitId FBaseUnitId;
	@JSONField(ordinal=7)
	private FStockId FStockId;
	@JSONField(ordinal=8)
	private FStockLocId FStockLocId;
	@JSONField(ordinal=9)
	private FLot FLot;
	@JSONField(ordinal=10)
	private FPRODUCTGROUPID FPRODUCTGROUPID;
	@JSONField(ordinal=11)
	private String FEntryNote;
	@JSONField(ordinal=12)
	private FBomId FBomId;
	@JSONField(ordinal=13)
	private String FProjectNo;
	@JSONField(ordinal=14)
	private Date FProduceDate;
	@JSONField(ordinal=15)
	private String FServiceContext;
	@JSONField(ordinal=16)
	private FStockStatusId FStockStatusId;
	@JSONField(ordinal=17)
	private String FMtoNo;
	@JSONField(ordinal=18)
	private FCostItem FCostItem;
	@JSONField(ordinal=19)
	private String FOwnerTypeId;
	@JSONField(ordinal=20)
	private String FKeeperTypeId;
	@JSONField(ordinal=21)
	private FOwnerId FOwnerId;
	@JSONField(ordinal=22)
	private String FDistribution;
	@JSONField(ordinal=23)
	private FKeeperId FKeeperId;
	@JSONField(ordinal=24)
	private FExtAuxUnitId FExtAuxUnitId;
	@JSONField(ordinal=25)
	private String FExtAuxUnitQty;
	@JSONField(ordinal=26)
	private List<FSerialSubEntity> FSerialSubEntity;

	public void setFEntryID(String FEntryID)
	{
		this.FEntryID = FEntryID;
	}

	public String getFEntryID()
	{
		return FEntryID;
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

	public void setFQty(String FQty)
	{
		this.FQty = FQty;
	}

	public String getFQty()
	{
		return FQty;
	}

	public void setFBaseUnitId(FBaseUnitId FBaseUnitId)
	{
		this.FBaseUnitId = FBaseUnitId;
	}

	public FBaseUnitId getFBaseUnitId()
	{
		return FBaseUnitId;
	}

	public void setFStockId(FStockId FStockId)
	{
		this.FStockId = FStockId;
	}

	public FStockId getFStockId()
	{
		return FStockId;
	}

	public void setFStockLocId(FStockLocId FStockLocId)
	{
		this.FStockLocId = FStockLocId;
	}

	public FStockLocId getFStockLocId()
	{
		return FStockLocId;
	}

	public void setFLot(FLot FLot)
	{
		this.FLot = FLot;
	}

	public FLot getFLot()
	{
		return FLot;
	}

	public void setFPRODUCTGROUPID(FPRODUCTGROUPID FPRODUCTGROUPID)
	{
		this.FPRODUCTGROUPID = FPRODUCTGROUPID;
	}

	public FPRODUCTGROUPID getFPRODUCTGROUPID()
	{
		return FPRODUCTGROUPID;
	}

	public void setFEntryNote(String FEntryNote)
	{
		this.FEntryNote = FEntryNote;
	}

	public String getFEntryNote()
	{
		return FEntryNote;
	}

	public void setFBomId(FBomId FBomId)
	{
		this.FBomId = FBomId;
	}

	public FBomId getFBomId()
	{
		return FBomId;
	}

	public void setFProjectNo(String FProjectNo)
	{
		this.FProjectNo = FProjectNo;
	}

	public String getFProjectNo()
	{
		return FProjectNo;
	}

	public void setFProduceDate(Date FProduceDate)
	{
		this.FProduceDate = FProduceDate;
	}

	public Date getFProduceDate()
	{
		return FProduceDate;
	}

	public void setFServiceContext(String FServiceContext)
	{
		this.FServiceContext = FServiceContext;
	}

	public String getFServiceContext()
	{
		return FServiceContext;
	}

	public void setFStockStatusId(FStockStatusId FStockStatusId)
	{
		this.FStockStatusId = FStockStatusId;
	}

	public FStockStatusId getFStockStatusId()
	{
		return FStockStatusId;
	}

	public void setFMtoNo(String FMtoNo)
	{
		this.FMtoNo = FMtoNo;
	}

	public String getFMtoNo()
	{
		return FMtoNo;
	}

	public void setFCostItem(FCostItem FCostItem)
	{
		this.FCostItem = FCostItem;
	}

	public FCostItem getFCostItem()
	{
		return FCostItem;
	}

	public void setFOwnerTypeId(String FOwnerTypeId)
	{
		this.FOwnerTypeId = FOwnerTypeId;
	}

	public String getFOwnerTypeId()
	{
		return FOwnerTypeId;
	}

	public void setFKeeperTypeId(String FKeeperTypeId)
	{
		this.FKeeperTypeId = FKeeperTypeId;
	}

	public String getFKeeperTypeId()
	{
		return FKeeperTypeId;
	}

	public void setFOwnerId(FOwnerId FOwnerId)
	{
		this.FOwnerId = FOwnerId;
	}

	public FOwnerId getFOwnerId()
	{
		return FOwnerId;
	}

	public void setFDistribution(String FDistribution)
	{
		this.FDistribution = FDistribution;
	}

	public String getFDistribution()
	{
		return FDistribution;
	}

	public void setFKeeperId(FKeeperId FKeeperId)
	{
		this.FKeeperId = FKeeperId;
	}

	public FKeeperId getFKeeperId()
	{
		return FKeeperId;
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

	public void setFSerialSubEntity(List<FSerialSubEntity> FSerialSubEntity)
	{
		this.FSerialSubEntity = FSerialSubEntity;
	}

	public List<FSerialSubEntity> getFSerialSubEntity()
	{
		return FSerialSubEntity;
	}

}