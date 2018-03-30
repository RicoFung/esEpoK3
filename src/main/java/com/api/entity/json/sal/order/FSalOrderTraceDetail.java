package com.api.entity.json.sal.order;

import com.alibaba.fastjson.annotation.JSONField;

public class FSalOrderTraceDetail
{
	@JSONField(ordinal=1)
	private String FDetailID;
	@JSONField(ordinal=2)
	private String FTraceTime;
	@JSONField(ordinal=3)
	private String FTraceDetail;

	public void setFDetailID(String FDetailID)
	{
		this.FDetailID = FDetailID;
	}

	public String getFDetailID()
	{
		return FDetailID;
	}

	public void setFTraceTime(String FTraceTime)
	{
		this.FTraceTime = FTraceTime;
	}

	public String getFTraceTime()
	{
		return FTraceTime;
	}

	public void setFTraceDetail(String FTraceDetail)
	{
		this.FTraceDetail = FTraceDetail;
	}

	public String getFTraceDetail()
	{
		return FTraceDetail;
	}

}