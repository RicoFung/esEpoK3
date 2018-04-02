package com.api.entity.json.stk.miscellaneous;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class Model
{
	@JSONField(ordinal=1)
	private String FID;
	@JSONField(ordinal=2)
	private String FBillNo;
	@JSONField(ordinal=3)
	private FBillTypeID FBillTypeID;
	@JSONField(ordinal=4)
	private FStockOrgId FStockOrgId;
	@JSONField(ordinal=5)
	private String FStockDirect;
	@JSONField(ordinal=6)
	private String FDate;
	@JSONField(ordinal=7)
	private FSUPPLIERID FSUPPLIERID;
	@JSONField(ordinal=8)
	private FDEPTID FDEPTID;
	@JSONField(ordinal=9)
	private FSTOCKERID FSTOCKERID;
	@JSONField(ordinal=10)
	private FSTOCKERGROUPID FSTOCKERGROUPID;
	@JSONField(ordinal=11)
	private String FOwnerTypeIdHead;
	@JSONField(ordinal=12)
	private FOwnerIdHead FOwnerIdHead;
	@JSONField(ordinal=13)
	private String FNOTE;
	@JSONField(ordinal=14)
	private FBaseCurrId FBaseCurrId;
	@JSONField(ordinal=15)
	private String FScanBox;
	@JSONField(ordinal=16)
	private List<FEntity> FEntity;

	public void setFID(String FID)
	{
		this.FID = FID;
	}

	public String getFID()
	{
		return FID;
	}

	public void setFBillNo(String FBillNo)
	{
		this.FBillNo = FBillNo;
	}

	public String getFBillNo()
	{
		return FBillNo;
	}

	public void setFBillTypeID(FBillTypeID FBillTypeID)
	{
		this.FBillTypeID = FBillTypeID;
	}

	public FBillTypeID getFBillTypeID()
	{
		return FBillTypeID;
	}

	public void setFStockOrgId(FStockOrgId FStockOrgId)
	{
		this.FStockOrgId = FStockOrgId;
	}

	public FStockOrgId getFStockOrgId()
	{
		return FStockOrgId;
	}

	public void setFStockDirect(String FStockDirect)
	{
		this.FStockDirect = FStockDirect;
	}

	public String getFStockDirect()
	{
		return FStockDirect;
	}

	public void setFDate(String FDate)
	{
		this.FDate = FDate;
	}

	public String getFDate()
	{
		return FDate;
	}

	public void setFSUPPLIERID(FSUPPLIERID FSUPPLIERID)
	{
		this.FSUPPLIERID = FSUPPLIERID;
	}

	public FSUPPLIERID getFSUPPLIERID()
	{
		return FSUPPLIERID;
	}

	public void setFDEPTID(FDEPTID FDEPTID)
	{
		this.FDEPTID = FDEPTID;
	}

	public FDEPTID getFDEPTID()
	{
		return FDEPTID;
	}

	public void setFSTOCKERID(FSTOCKERID FSTOCKERID)
	{
		this.FSTOCKERID = FSTOCKERID;
	}

	public FSTOCKERID getFSTOCKERID()
	{
		return FSTOCKERID;
	}

	public void setFSTOCKERGROUPID(FSTOCKERGROUPID FSTOCKERGROUPID)
	{
		this.FSTOCKERGROUPID = FSTOCKERGROUPID;
	}

	public FSTOCKERGROUPID getFSTOCKERGROUPID()
	{
		return FSTOCKERGROUPID;
	}

	public void setFOwnerTypeIdHead(String FOwnerTypeIdHead)
	{
		this.FOwnerTypeIdHead = FOwnerTypeIdHead;
	}

	public String getFOwnerTypeIdHead()
	{
		return FOwnerTypeIdHead;
	}

	public void setFOwnerIdHead(FOwnerIdHead FOwnerIdHead)
	{
		this.FOwnerIdHead = FOwnerIdHead;
	}

	public FOwnerIdHead getFOwnerIdHead()
	{
		return FOwnerIdHead;
	}

	public void setFNOTE(String FNOTE)
	{
		this.FNOTE = FNOTE;
	}

	public String getFNOTE()
	{
		return FNOTE;
	}

	public void setFBaseCurrId(FBaseCurrId FBaseCurrId)
	{
		this.FBaseCurrId = FBaseCurrId;
	}

	public FBaseCurrId getFBaseCurrId()
	{
		return FBaseCurrId;
	}

	public void setFScanBox(String FScanBox)
	{
		this.FScanBox = FScanBox;
	}

	public String getFScanBox()
	{
		return FScanBox;
	}

	public void setFEntity(List<FEntity> FEntity)
	{
		this.FEntity = FEntity;
	}

	public List<FEntity> getFEntity()
	{
		return FEntity;
	}

}