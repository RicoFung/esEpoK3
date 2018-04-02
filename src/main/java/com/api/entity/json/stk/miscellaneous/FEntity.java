package com.api.entity.json.stk.miscellaneous;

import com.alibaba.fastjson.annotation.JSONField;

public class FEntity
{
	@JSONField(ordinal=1)
	private String FEntryID;
	@JSONField(ordinal=2)
	private FMATERIALID FMATERIALID;
	@JSONField(ordinal=3)
	private FUnitID FUnitID;
	@JSONField(ordinal=4)
	private FSTOCKSTATUSID FSTOCKSTATUSID;
	@JSONField(ordinal=5)
	private int FQty;
	@JSONField(ordinal=6)
	private FSTOCKID FSTOCKID;
	@JSONField(ordinal=7)
	private FLOT FLOT;
	@JSONField(ordinal=8)
	private String FEntryNote;
	@JSONField(ordinal=9)
	private FBOMID FBOMID;
	@JSONField(ordinal=10)
	private String FPRODUCEDATE;
	@JSONField(ordinal=11)
	private String FMTONO;
	@JSONField(ordinal=12)
	private FExtAuxUnitId FExtAuxUnitId;
	@JSONField(ordinal=13)
	private String FProjectNo;
	@JSONField(ordinal=14)
	private int FExtAuxUnitQty;
	@JSONField(ordinal=15)
	private String FOWNERTYPEID;
	@JSONField(ordinal=16)
	private FOWNERID FOWNERID;
	@JSONField(ordinal=17)
	private String FKEEPERTYPEID;
	@JSONField(ordinal=18)
	private FKEEPERID FKEEPERID;

	public void setFEntryID(String FEntryID)
	{
		this.FEntryID = FEntryID;
	}

	public String getFEntryID()
	{
		return FEntryID;
	}

	public void setFMATERIALID(FMATERIALID FMATERIALID)
	{
		this.FMATERIALID = FMATERIALID;
	}

	public FMATERIALID getFMATERIALID()
	{
		return FMATERIALID;
	}

	public void setFUnitID(FUnitID FUnitID)
	{
		this.FUnitID = FUnitID;
	}

	public FUnitID getFUnitID()
	{
		return FUnitID;
	}

	public void setFSTOCKSTATUSID(FSTOCKSTATUSID FSTOCKSTATUSID)
	{
		this.FSTOCKSTATUSID = FSTOCKSTATUSID;
	}

	public FSTOCKSTATUSID getFSTOCKSTATUSID()
	{
		return FSTOCKSTATUSID;
	}

	public void setFQty(int FQty)
	{
		this.FQty = FQty;
	}

	public int getFQty()
	{
		return FQty;
	}

	public void setFSTOCKID(FSTOCKID FSTOCKID)
	{
		this.FSTOCKID = FSTOCKID;
	}

	public FSTOCKID getFSTOCKID()
	{
		return FSTOCKID;
	}

	public void setFLOT(FLOT FLOT)
	{
		this.FLOT = FLOT;
	}

	public FLOT getFLOT()
	{
		return FLOT;
	}

	public void setFEntryNote(String FEntryNote)
	{
		this.FEntryNote = FEntryNote;
	}

	public String getFEntryNote()
	{
		return FEntryNote;
	}

	public void setFBOMID(FBOMID FBOMID)
	{
		this.FBOMID = FBOMID;
	}

	public FBOMID getFBOMID()
	{
		return FBOMID;
	}

	public void setFPRODUCEDATE(String FPRODUCEDATE)
	{
		this.FPRODUCEDATE = FPRODUCEDATE;
	}

	public String getFPRODUCEDATE()
	{
		return FPRODUCEDATE;
	}

	public void setFMTONO(String FMTONO)
	{
		this.FMTONO = FMTONO;
	}

	public String getFMTONO()
	{
		return FMTONO;
	}

	public void setFExtAuxUnitId(FExtAuxUnitId FExtAuxUnitId)
	{
		this.FExtAuxUnitId = FExtAuxUnitId;
	}

	public FExtAuxUnitId getFExtAuxUnitId()
	{
		return FExtAuxUnitId;
	}

	public void setFProjectNo(String FProjectNo)
	{
		this.FProjectNo = FProjectNo;
	}

	public String getFProjectNo()
	{
		return FProjectNo;
	}

	public void setFExtAuxUnitQty(int FExtAuxUnitQty)
	{
		this.FExtAuxUnitQty = FExtAuxUnitQty;
	}

	public int getFExtAuxUnitQty()
	{
		return FExtAuxUnitQty;
	}

	public void setFOWNERTYPEID(String FOWNERTYPEID)
	{
		this.FOWNERTYPEID = FOWNERTYPEID;
	}

	public String getFOWNERTYPEID()
	{
		return FOWNERTYPEID;
	}

	public void setFOWNERID(FOWNERID FOWNERID)
	{
		this.FOWNERID = FOWNERID;
	}

	public FOWNERID getFOWNERID()
	{
		return FOWNERID;
	}

	public void setFKEEPERTYPEID(String FKEEPERTYPEID)
	{
		this.FKEEPERTYPEID = FKEEPERTYPEID;
	}

	public String getFKEEPERTYPEID()
	{
		return FKEEPERTYPEID;
	}

	public void setFKEEPERID(FKEEPERID FKEEPERID)
	{
		this.FKEEPERID = FKEEPERID;
	}

	public FKEEPERID getFKEEPERID()
	{
		return FKEEPERID;
	}

}