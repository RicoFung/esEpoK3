package com.api.entity.json.sal.order;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class FSaleOrderPlan
{
	@JSONField(ordinal=1)
	private String FEntryID;
	@JSONField(ordinal=2)
	private String FNeedRecAdvance;
	@JSONField(ordinal=3)
	private FReceiveType FReceiveType;
	@JSONField(ordinal=4)
	private String FRecAdvanceRate;
	@JSONField(ordinal=5)
	private String FRecAdvanceAmount;
	@JSONField(ordinal=6)
	private String FMustDate;
	@JSONField(ordinal=7)
	private String FRelBillNo;
	@JSONField(ordinal=8)
	private String FRecAmount;
	@JSONField(ordinal=9)
	private String FControlSend;
	@JSONField(ordinal=10)
	private String FReMark;
	@JSONField(ordinal=11)
	private FPlanMaterialId FPlanMaterialId;
	@JSONField(ordinal=12)
	private String FMaterialSeq;
	@JSONField(ordinal=13)
	private String FOrderEntryId;
	@JSONField(ordinal=14)
	private List<FSaleOrderPlanEntry> FSaleOrderPlanEntry;

	public void setFEntryID(String FEntryID)
	{
		this.FEntryID = FEntryID;
	}

	public String getFEntryID()
	{
		return FEntryID;
	}

	public void setFNeedRecAdvance(String FNeedRecAdvance)
	{
		this.FNeedRecAdvance = FNeedRecAdvance;
	}

	public String getFNeedRecAdvance()
	{
		return FNeedRecAdvance;
	}

	public void setFReceiveType(FReceiveType FReceiveType)
	{
		this.FReceiveType = FReceiveType;
	}

	public FReceiveType getFReceiveType()
	{
		return FReceiveType;
	}

	public void setFRecAdvanceRate(String FRecAdvanceRate)
	{
		this.FRecAdvanceRate = FRecAdvanceRate;
	}

	public String getFRecAdvanceRate()
	{
		return FRecAdvanceRate;
	}

	public void setFRecAdvanceAmount(String FRecAdvanceAmount)
	{
		this.FRecAdvanceAmount = FRecAdvanceAmount;
	}

	public String getFRecAdvanceAmount()
	{
		return FRecAdvanceAmount;
	}

	public void setFMustDate(String FMustDate)
	{
		this.FMustDate = FMustDate;
	}

	public String getFMustDate()
	{
		return FMustDate;
	}

	public void setFRelBillNo(String FRelBillNo)
	{
		this.FRelBillNo = FRelBillNo;
	}

	public String getFRelBillNo()
	{
		return FRelBillNo;
	}

	public void setFRecAmount(String FRecAmount)
	{
		this.FRecAmount = FRecAmount;
	}

	public String getFRecAmount()
	{
		return FRecAmount;
	}

	public void setFControlSend(String FControlSend)
	{
		this.FControlSend = FControlSend;
	}

	public String getFControlSend()
	{
		return FControlSend;
	}

	public void setFReMark(String FReMark)
	{
		this.FReMark = FReMark;
	}

	public String getFReMark()
	{
		return FReMark;
	}

	public void setFPlanMaterialId(FPlanMaterialId FPlanMaterialId)
	{
		this.FPlanMaterialId = FPlanMaterialId;
	}

	public FPlanMaterialId getFPlanMaterialId()
	{
		return FPlanMaterialId;
	}

	public void setFMaterialSeq(String FMaterialSeq)
	{
		this.FMaterialSeq = FMaterialSeq;
	}

	public String getFMaterialSeq()
	{
		return FMaterialSeq;
	}

	public void setFOrderEntryId(String FOrderEntryId)
	{
		this.FOrderEntryId = FOrderEntryId;
	}

	public String getFOrderEntryId()
	{
		return FOrderEntryId;
	}

	public void setFSaleOrderPlanEntry(List<FSaleOrderPlanEntry> FSaleOrderPlanEntry)
	{
		this.FSaleOrderPlanEntry = FSaleOrderPlanEntry;
	}

	public List<FSaleOrderPlanEntry> getFSaleOrderPlanEntry()
	{
		return FSaleOrderPlanEntry;
	}

}