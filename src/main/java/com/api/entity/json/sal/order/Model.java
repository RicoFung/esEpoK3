package com.api.entity.json.sal.order;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class Model
{
	@JSONField(ordinal=1)
	private String FID;
	@JSONField(ordinal=2)
	private FBillTypeID FBillTypeID;
	@JSONField(ordinal=3)
	private String FBillNo;
	@JSONField(ordinal=4)
	private String FDate;
	@JSONField(ordinal=5)
	private FSaleOrgId FSaleOrgId;
	@JSONField(ordinal=6)
	private FCustId FCustId;
	@JSONField(ordinal=7)
	private FHeadDeliveryWay FHeadDeliveryWay;
	@JSONField(ordinal=8)
	private FReceiveId FReceiveId;
	@JSONField(ordinal=9)
	private FHEADLOCID FHEADLOCID;
	@JSONField(ordinal=10)
	private FCorrespondOrgId FCorrespondOrgId;
	@JSONField(ordinal=11)
	private FSaleDeptId FSaleDeptId;
	@JSONField(ordinal=12)
	private FSaleGroupId FSaleGroupId;
	@JSONField(ordinal=13)
	private FSalerId FSalerId;
	@JSONField(ordinal=14)
	private String FReceiveAddress;
	@JSONField(ordinal=15)
	private FSettleId FSettleId;
	@JSONField(ordinal=16)
	private FReceiveContact FReceiveContact;
	@JSONField(ordinal=17)
	private FChargeId FChargeId;
	@JSONField(ordinal=18)
	private String FNetOrderBillNo;
	@JSONField(ordinal=19)
	private String FNetOrderBillId;
	@JSONField(ordinal=20)
	private String FOppID;
	@JSONField(ordinal=21)
	private FSalePhaseID FSalePhaseID;
	@JSONField(ordinal=22)
	private String FISINIT;
	@JSONField(ordinal=23)
	private String FNote;
	@JSONField(ordinal=24)
	private String FIsMobile;
	@JSONField(ordinal=25)
	private FSaleOrderFinance FSaleOrderFinance;
	@JSONField(ordinal=26)
	private List<FSaleOrderClause> FSaleOrderClause;
	@JSONField(ordinal=27)
	private List<FSaleOrderEntry> FSaleOrderEntry;
	@JSONField(ordinal=28)
	private List<FSaleOrderPlan> FSaleOrderPlan;
	@JSONField(ordinal=29)
	private List<FSalOrderTrace> FSalOrderTrace;

	public void setFID(String FID)
	{
		this.FID = FID;
	}

	public String getFID()
	{
		return FID;
	}

	public void setFBillTypeID(FBillTypeID FBillTypeID)
	{
		this.FBillTypeID = FBillTypeID;
	}

	public FBillTypeID getFBillTypeID()
	{
		return FBillTypeID;
	}

	public void setFBillNo(String FBillNo)
	{
		this.FBillNo = FBillNo;
	}

	public String getFBillNo()
	{
		return FBillNo;
	}

	public void setFDate(String FDate)
	{
		this.FDate = FDate;
	}

	public String getFDate()
	{
		return FDate;
	}

	public void setFSaleOrgId(FSaleOrgId FSaleOrgId)
	{
		this.FSaleOrgId = FSaleOrgId;
	}

	public FSaleOrgId getFSaleOrgId()
	{
		return FSaleOrgId;
	}

	public void setFCustId(FCustId FCustId)
	{
		this.FCustId = FCustId;
	}

	public FCustId getFCustId()
	{
		return FCustId;
	}

	public void setFHeadDeliveryWay(FHeadDeliveryWay FHeadDeliveryWay)
	{
		this.FHeadDeliveryWay = FHeadDeliveryWay;
	}

	public FHeadDeliveryWay getFHeadDeliveryWay()
	{
		return FHeadDeliveryWay;
	}

	public void setFReceiveId(FReceiveId FReceiveId)
	{
		this.FReceiveId = FReceiveId;
	}

	public FReceiveId getFReceiveId()
	{
		return FReceiveId;
	}

	public void setFHEADLOCID(FHEADLOCID FHEADLOCID)
	{
		this.FHEADLOCID = FHEADLOCID;
	}

	public FHEADLOCID getFHEADLOCID()
	{
		return FHEADLOCID;
	}

	public void setFCorrespondOrgId(FCorrespondOrgId FCorrespondOrgId)
	{
		this.FCorrespondOrgId = FCorrespondOrgId;
	}

	public FCorrespondOrgId getFCorrespondOrgId()
	{
		return FCorrespondOrgId;
	}

	public void setFSaleDeptId(FSaleDeptId FSaleDeptId)
	{
		this.FSaleDeptId = FSaleDeptId;
	}

	public FSaleDeptId getFSaleDeptId()
	{
		return FSaleDeptId;
	}

	public void setFSaleGroupId(FSaleGroupId FSaleGroupId)
	{
		this.FSaleGroupId = FSaleGroupId;
	}

	public FSaleGroupId getFSaleGroupId()
	{
		return FSaleGroupId;
	}

	public void setFSalerId(FSalerId FSalerId)
	{
		this.FSalerId = FSalerId;
	}

	public FSalerId getFSalerId()
	{
		return FSalerId;
	}

	public void setFReceiveAddress(String FReceiveAddress)
	{
		this.FReceiveAddress = FReceiveAddress;
	}

	public String getFReceiveAddress()
	{
		return FReceiveAddress;
	}

	public void setFSettleId(FSettleId FSettleId)
	{
		this.FSettleId = FSettleId;
	}

	public FSettleId getFSettleId()
	{
		return FSettleId;
	}

	public void setFReceiveContact(FReceiveContact FReceiveContact)
	{
		this.FReceiveContact = FReceiveContact;
	}

	public FReceiveContact getFReceiveContact()
	{
		return FReceiveContact;
	}

	public void setFChargeId(FChargeId FChargeId)
	{
		this.FChargeId = FChargeId;
	}

	public FChargeId getFChargeId()
	{
		return FChargeId;
	}

	public void setFNetOrderBillNo(String FNetOrderBillNo)
	{
		this.FNetOrderBillNo = FNetOrderBillNo;
	}

	public String getFNetOrderBillNo()
	{
		return FNetOrderBillNo;
	}

	public void setFNetOrderBillId(String FNetOrderBillId)
	{
		this.FNetOrderBillId = FNetOrderBillId;
	}

	public String getFNetOrderBillId()
	{
		return FNetOrderBillId;
	}

	public void setFOppID(String FOppID)
	{
		this.FOppID = FOppID;
	}

	public String getFOppID()
	{
		return FOppID;
	}

	public void setFSalePhaseID(FSalePhaseID FSalePhaseID)
	{
		this.FSalePhaseID = FSalePhaseID;
	}

	public FSalePhaseID getFSalePhaseID()
	{
		return FSalePhaseID;
	}

	public void setFISINIT(String FISINIT)
	{
		this.FISINIT = FISINIT;
	}

	public String getFISINIT()
	{
		return FISINIT;
	}

	public void setFNote(String FNote)
	{
		this.FNote = FNote;
	}

	public String getFNote()
	{
		return FNote;
	}

	public void setFIsMobile(String FIsMobile)
	{
		this.FIsMobile = FIsMobile;
	}

	public String getFIsMobile()
	{
		return FIsMobile;
	}

	public void setFSaleOrderFinance(FSaleOrderFinance FSaleOrderFinance)
	{
		this.FSaleOrderFinance = FSaleOrderFinance;
	}

	public FSaleOrderFinance getFSaleOrderFinance()
	{
		return FSaleOrderFinance;
	}

	public void setFSaleOrderClause(List<FSaleOrderClause> FSaleOrderClause)
	{
		this.FSaleOrderClause = FSaleOrderClause;
	}

	public List<FSaleOrderClause> getFSaleOrderClause()
	{
		return FSaleOrderClause;
	}

	public void setFSaleOrderEntry(List<FSaleOrderEntry> FSaleOrderEntry)
	{
		this.FSaleOrderEntry = FSaleOrderEntry;
	}

	public List<FSaleOrderEntry> getFSaleOrderEntry()
	{
		return FSaleOrderEntry;
	}

	public void setFSaleOrderPlan(List<FSaleOrderPlan> FSaleOrderPlan)
	{
		this.FSaleOrderPlan = FSaleOrderPlan;
	}

	public List<FSaleOrderPlan> getFSaleOrderPlan()
	{
		return FSaleOrderPlan;
	}

	public void setFSalOrderTrace(List<FSalOrderTrace> FSalOrderTrace)
	{
		this.FSalOrderTrace = FSalOrderTrace;
	}

	public List<FSalOrderTrace> getFSalOrderTrace()
	{
		return FSalOrderTrace;
	}

}