/**
  * Copyright 2018 bejson.com 
  */
package com.api.entity.json.sal.outstock;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class FEntity
{
	@JSONField(ordinal=1)
	private String FENTRYID;
	@JSONField(ordinal=2)
	private FCustMatID FCustMatID;
	@JSONField(ordinal=3)
	private FMaterialID FMaterialID;
	@JSONField(ordinal=4)
	private FAuxPropId FAuxPropId;
	@JSONField(ordinal=5)
	private FUnitID FUnitID;
	@JSONField(ordinal=6)
	private Integer FInventoryQty;
	@JSONField(ordinal=7)
	private Integer FRealQty;
	@JSONField(ordinal=8)
	private Integer FPrice;
	@JSONField(ordinal=9)
	private Integer FTaxPrice;
	@JSONField(ordinal=10)
	private Boolean FIsFree;
	@JSONField(ordinal=11)
	private FBomID FBomID;
	@JSONField(ordinal=12)
	private Date FProduceDate;
	@JSONField(ordinal=13)
	private String FOwnerTypeID;
	@JSONField(ordinal=14)
	private FOwnerID FOwnerID;
	@JSONField(ordinal=15)
	private FLot FLot;
	@JSONField(ordinal=16)
	private Date FExpiryDate;
	@JSONField(ordinal=17)
	private FTaxCombination FTaxCombination;
	@JSONField(ordinal=18)
	private Integer FEntryTaxRate;
	@JSONField(ordinal=19)
	private Integer FAuxUnitQty;
	@JSONField(ordinal=20)
	private FExtAuxUnitId FExtAuxUnitId;
	@JSONField(ordinal=21)
	private Integer FExtAuxUnitQty;
	@JSONField(ordinal=22)
	private FStockID FStockID;
	@JSONField(ordinal=23)
	private FStockLocID FStockLocID;
	@JSONField(ordinal=24)
	private FStockStatusID FStockStatusID;
	@JSONField(ordinal=25)
	private String FQualifyType;
	@JSONField(ordinal=26)
	private String FMtoNo;
	@JSONField(ordinal=27)
	private String FEntrynote;
	@JSONField(ordinal=28)
	private Integer FDiscountRate;
	@JSONField(ordinal=29)
	private Integer FActQty;
	@JSONField(ordinal=30)
	private FSalUnitID FSalUnitID;
	@JSONField(ordinal=31)
	private Integer FSALUNITQTY;
	@JSONField(ordinal=1)
	private Integer FSALBASEQTY;
	@JSONField(ordinal=32)
	private Integer FPRICEBASEQTY;
	@JSONField(ordinal=33)
	private String FProjectNo;
	@JSONField(ordinal=34)
	private Boolean FOUTCONTROL;
	@JSONField(ordinal=35)
	private Integer FRepairQty;
	@JSONField(ordinal=36)
	private String FIsCreateProDoc;
	@JSONField(ordinal=37)
	private FEOwnerSupplierId FEOwnerSupplierId;
	@JSONField(ordinal=38)
	private Boolean FIsOverLegalOrg;
	@JSONField(ordinal=39)
	private FESettleCustomerId FESettleCustomerId;
	@JSONField(ordinal=40)
	private FPriceListEntry FPriceListEntry;
	@JSONField(ordinal=41)
	private Integer FARNOTJOINQTY;
	@JSONField(ordinal=42)
	private Integer FQmEntryID;
	@JSONField(ordinal=43)
	private Integer FSOEntryId;
	@JSONField(ordinal=44)
	private Integer FConvertEntryID;
	@JSONField(ordinal=45)
	private Integer FDisPriceQty;
	@JSONField(ordinal=46)
	private Integer FBeforeDisPriceQty;
	@JSONField(ordinal=47)
	private List<FTaxDetailSubEntity> FTaxDetailSubEntity;
	@JSONField(ordinal=48)
	private List<FSerialSubEntity> FSerialSubEntity;

	public String getFENTRYID()
	{
		return FENTRYID;
	}

	public void setFENTRYID(String fENTRYID)
	{
		FENTRYID = fENTRYID;
	}

	public FCustMatID getFCustMatID()
	{
		return FCustMatID;
	}

	public void setFCustMatID(FCustMatID fCustMatID)
	{
		FCustMatID = fCustMatID;
	}

	public FMaterialID getFMaterialID()
	{
		return FMaterialID;
	}

	public void setFMaterialID(FMaterialID fMaterialID)
	{
		FMaterialID = fMaterialID;
	}

	public FAuxPropId getFAuxPropId()
	{
		return FAuxPropId;
	}

	public void setFAuxPropId(FAuxPropId fAuxPropId)
	{
		FAuxPropId = fAuxPropId;
	}

	public FUnitID getFUnitID()
	{
		return FUnitID;
	}

	public void setFUnitID(FUnitID fUnitID)
	{
		FUnitID = fUnitID;
	}

	public Integer getFInventoryQty()
	{
		return FInventoryQty;
	}

	public void setFInventoryQty(Integer fInventoryQty)
	{
		FInventoryQty = fInventoryQty;
	}

	public Integer getFRealQty()
	{
		return FRealQty;
	}

	public void setFRealQty(Integer fRealQty)
	{
		FRealQty = fRealQty;
	}

	public Integer getFPrice()
	{
		return FPrice;
	}

	public void setFPrice(Integer fPrice)
	{
		FPrice = fPrice;
	}

	public Integer getFTaxPrice()
	{
		return FTaxPrice;
	}

	public void setFTaxPrice(Integer fTaxPrice)
	{
		FTaxPrice = fTaxPrice;
	}

	public Boolean getFIsFree()
	{
		return FIsFree;
	}

	public void setFIsFree(Boolean fIsFree)
	{
		FIsFree = fIsFree;
	}

	public FBomID getFBomID()
	{
		return FBomID;
	}

	public void setFBomID(FBomID fBomID)
	{
		FBomID = fBomID;
	}

	public Date getFProduceDate()
	{
		return FProduceDate;
	}

	public void setFProduceDate(Date fProduceDate)
	{
		FProduceDate = fProduceDate;
	}

	public String getFOwnerTypeID()
	{
		return FOwnerTypeID;
	}

	public void setFOwnerTypeID(String fOwnerTypeID)
	{
		FOwnerTypeID = fOwnerTypeID;
	}

	public FOwnerID getFOwnerID()
	{
		return FOwnerID;
	}

	public void setFOwnerID(FOwnerID fOwnerID)
	{
		FOwnerID = fOwnerID;
	}

	public FLot getFLot()
	{
		return FLot;
	}

	public void setFLot(FLot fLot)
	{
		FLot = fLot;
	}

	public Date getFExpiryDate()
	{
		return FExpiryDate;
	}

	public void setFExpiryDate(Date fExpiryDate)
	{
		FExpiryDate = fExpiryDate;
	}

	public FTaxCombination getFTaxCombination()
	{
		return FTaxCombination;
	}

	public void setFTaxCombination(FTaxCombination fTaxCombination)
	{
		FTaxCombination = fTaxCombination;
	}

	public Integer getFEntryTaxRate()
	{
		return FEntryTaxRate;
	}

	public void setFEntryTaxRate(Integer fEntryTaxRate)
	{
		FEntryTaxRate = fEntryTaxRate;
	}

	public Integer getFAuxUnitQty()
	{
		return FAuxUnitQty;
	}

	public void setFAuxUnitQty(Integer fAuxUnitQty)
	{
		FAuxUnitQty = fAuxUnitQty;
	}

	public FExtAuxUnitId getFExtAuxUnitId()
	{
		return FExtAuxUnitId;
	}

	public void setFExtAuxUnitId(FExtAuxUnitId fExtAuxUnitId)
	{
		FExtAuxUnitId = fExtAuxUnitId;
	}

	public Integer getFExtAuxUnitQty()
	{
		return FExtAuxUnitQty;
	}

	public void setFExtAuxUnitQty(Integer fExtAuxUnitQty)
	{
		FExtAuxUnitQty = fExtAuxUnitQty;
	}

	public FStockID getFStockID()
	{
		return FStockID;
	}

	public void setFStockID(FStockID fStockID)
	{
		FStockID = fStockID;
	}

	public FStockLocID getFStockLocID()
	{
		return FStockLocID;
	}

	public void setFStockLocID(FStockLocID fStockLocID)
	{
		FStockLocID = fStockLocID;
	}

	public FStockStatusID getFStockStatusID()
	{
		return FStockStatusID;
	}

	public void setFStockStatusID(FStockStatusID fStockStatusID)
	{
		FStockStatusID = fStockStatusID;
	}

	public String getFQualifyType()
	{
		return FQualifyType;
	}

	public void setFQualifyType(String fQualifyType)
	{
		FQualifyType = fQualifyType;
	}

	public String getFMtoNo()
	{
		return FMtoNo;
	}

	public void setFMtoNo(String fMtoNo)
	{
		FMtoNo = fMtoNo;
	}

	public String getFEntrynote()
	{
		return FEntrynote;
	}

	public void setFEntrynote(String fEntrynote)
	{
		FEntrynote = fEntrynote;
	}

	public Integer getFDiscountRate()
	{
		return FDiscountRate;
	}

	public void setFDiscountRate(Integer fDiscountRate)
	{
		FDiscountRate = fDiscountRate;
	}

	public Integer getFActQty()
	{
		return FActQty;
	}

	public void setFActQty(Integer fActQty)
	{
		FActQty = fActQty;
	}

	public FSalUnitID getFSalUnitID()
	{
		return FSalUnitID;
	}

	public void setFSalUnitID(FSalUnitID fSalUnitID)
	{
		FSalUnitID = fSalUnitID;
	}

	public Integer getFSALUNITQTY()
	{
		return FSALUNITQTY;
	}

	public void setFSALUNITQTY(Integer fSALUNITQTY)
	{
		FSALUNITQTY = fSALUNITQTY;
	}

	public Integer getFSALBASEQTY()
	{
		return FSALBASEQTY;
	}

	public void setFSALBASEQTY(Integer fSALBASEQTY)
	{
		FSALBASEQTY = fSALBASEQTY;
	}

	public Integer getFPRICEBASEQTY()
	{
		return FPRICEBASEQTY;
	}

	public void setFPRICEBASEQTY(Integer fPRICEBASEQTY)
	{
		FPRICEBASEQTY = fPRICEBASEQTY;
	}

	public String getFProjectNo()
	{
		return FProjectNo;
	}

	public void setFProjectNo(String fProjectNo)
	{
		FProjectNo = fProjectNo;
	}

	public Boolean getFOUTCONTROL()
	{
		return FOUTCONTROL;
	}

	public void setFOUTCONTROL(Boolean fOUTCONTROL)
	{
		FOUTCONTROL = fOUTCONTROL;
	}

	public Integer getFRepairQty()
	{
		return FRepairQty;
	}

	public void setFRepairQty(Integer fRepairQty)
	{
		FRepairQty = fRepairQty;
	}

	public String getFIsCreateProDoc()
	{
		return FIsCreateProDoc;
	}

	public void setFIsCreateProDoc(String fIsCreateProDoc)
	{
		FIsCreateProDoc = fIsCreateProDoc;
	}

	public FEOwnerSupplierId getFEOwnerSupplierId()
	{
		return FEOwnerSupplierId;
	}

	public void setFEOwnerSupplierId(FEOwnerSupplierId fEOwnerSupplierId)
	{
		FEOwnerSupplierId = fEOwnerSupplierId;
	}

	public Boolean getFIsOverLegalOrg()
	{
		return FIsOverLegalOrg;
	}

	public void setFIsOverLegalOrg(Boolean fIsOverLegalOrg)
	{
		FIsOverLegalOrg = fIsOverLegalOrg;
	}

	public FESettleCustomerId getFESettleCustomerId()
	{
		return FESettleCustomerId;
	}

	public void setFESettleCustomerId(FESettleCustomerId fESettleCustomerId)
	{
		FESettleCustomerId = fESettleCustomerId;
	}

	public FPriceListEntry getFPriceListEntry()
	{
		return FPriceListEntry;
	}

	public void setFPriceListEntry(FPriceListEntry fPriceListEntry)
	{
		FPriceListEntry = fPriceListEntry;
	}

	public Integer getFARNOTJOINQTY()
	{
		return FARNOTJOINQTY;
	}

	public void setFARNOTJOINQTY(Integer fARNOTJOINQTY)
	{
		FARNOTJOINQTY = fARNOTJOINQTY;
	}

	public Integer getFQmEntryID()
	{
		return FQmEntryID;
	}

	public void setFQmEntryID(Integer fQmEntryID)
	{
		FQmEntryID = fQmEntryID;
	}

	public Integer getFSOEntryId()
	{
		return FSOEntryId;
	}

	public void setFSOEntryId(Integer fSOEntryId)
	{
		FSOEntryId = fSOEntryId;
	}

	public Integer getFConvertEntryID()
	{
		return FConvertEntryID;
	}

	public void setFConvertEntryID(Integer fConvertEntryID)
	{
		FConvertEntryID = fConvertEntryID;
	}

	public Integer getFDisPriceQty()
	{
		return FDisPriceQty;
	}

	public void setFDisPriceQty(Integer fDisPriceQty)
	{
		FDisPriceQty = fDisPriceQty;
	}

	public Integer getFBeforeDisPriceQty()
	{
		return FBeforeDisPriceQty;
	}

	public void setFBeforeDisPriceQty(Integer fBeforeDisPriceQty)
	{
		FBeforeDisPriceQty = fBeforeDisPriceQty;
	}

	public List<FTaxDetailSubEntity> getFTaxDetailSubEntity()
	{
		return FTaxDetailSubEntity;
	}

	public void setFTaxDetailSubEntity(List<FTaxDetailSubEntity> fTaxDetailSubEntity)
	{
		FTaxDetailSubEntity = fTaxDetailSubEntity;
	}

	public List<FSerialSubEntity> getFSerialSubEntity()
	{
		return FSerialSubEntity;
	}

	public void setFSerialSubEntity(List<FSerialSubEntity> fSerialSubEntity)
	{
		FSerialSubEntity = fSerialSubEntity;
	}

}