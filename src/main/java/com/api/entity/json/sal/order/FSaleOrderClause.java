package com.api.entity.json.sal.order;

import com.alibaba.fastjson.annotation.JSONField;

public class FSaleOrderClause
{
	@JSONField(ordinal=1)
	private String FEntryID;
	@JSONField(ordinal=2)
	private FClauseId FClauseId;
	@JSONField(ordinal=3)
	private String FClauseDesc;

	public void setFEntryID(String FEntryID)
	{
		this.FEntryID = FEntryID;
	}

	public String getFEntryID()
	{
		return FEntryID;
	}

	public void setFClauseId(FClauseId FClauseId)
	{
		this.FClauseId = FClauseId;
	}

	public FClauseId getFClauseId()
	{
		return FClauseId;
	}

	public void setFClauseDesc(String FClauseDesc)
	{
		this.FClauseDesc = FClauseDesc;
	}

	public String getFClauseDesc()
	{
		return FClauseDesc;
	}

}