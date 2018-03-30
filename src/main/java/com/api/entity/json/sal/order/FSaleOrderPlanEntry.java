package com.api.entity.json.sal.order;

import com.alibaba.fastjson.annotation.JSONField;

public class FSaleOrderPlanEntry
{
	@JSONField(ordinal=1)
	private String FDETAILID;
	@JSONField(ordinal=2)
	private FPESettleOrgId FPESettleOrgId;

	public void setFDETAILID(String FDETAILID)
	{
		this.FDETAILID = FDETAILID;
	}

	public String getFDETAILID()
	{
		return FDETAILID;
	}

	public void setFPESettleOrgId(FPESettleOrgId FPESettleOrgId)
	{
		this.FPESettleOrgId = FPESettleOrgId;
	}

	public FPESettleOrgId getFPESettleOrgId()
	{
		return FPESettleOrgId;
	}

}