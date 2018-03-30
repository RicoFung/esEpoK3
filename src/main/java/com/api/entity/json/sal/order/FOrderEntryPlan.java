package com.api.entity.json.sal.order;

import com.alibaba.fastjson.annotation.JSONField;

public class FOrderEntryPlan
{
	@JSONField(ordinal=1)
	private String FDetailID;
	@JSONField(ordinal=2)
	private FDetailLocId FDetailLocId;
	@JSONField(ordinal=3)
	private String FDetailLocAddress;
	@JSONField(ordinal=4)
	private String FPlanDate;
	@JSONField(ordinal=5)
	private String FTransportLeadTime;
	@JSONField(ordinal=6)
	private String FPlanQty;

	public void setFDetailID(String FDetailID)
	{
		this.FDetailID = FDetailID;
	}

	public String getFDetailID()
	{
		return FDetailID;
	}

	public void setFDetailLocId(FDetailLocId FDetailLocId)
	{
		this.FDetailLocId = FDetailLocId;
	}

	public FDetailLocId getFDetailLocId()
	{
		return FDetailLocId;
	}

	public void setFDetailLocAddress(String FDetailLocAddress)
	{
		this.FDetailLocAddress = FDetailLocAddress;
	}

	public String getFDetailLocAddress()
	{
		return FDetailLocAddress;
	}

	public void setFPlanDate(String FPlanDate)
	{
		this.FPlanDate = FPlanDate;
	}

	public String getFPlanDate()
	{
		return FPlanDate;
	}

	public void setFTransportLeadTime(String FTransportLeadTime)
	{
		this.FTransportLeadTime = FTransportLeadTime;
	}

	public String getFTransportLeadTime()
	{
		return FTransportLeadTime;
	}

	public void setFPlanQty(String FPlanQty)
	{
		this.FPlanQty = FPlanQty;
	}

	public String getFPlanQty()
	{
		return FPlanQty;
	}

}