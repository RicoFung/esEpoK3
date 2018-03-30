package com.api.entity.json.sal.order;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class FSalOrderTrace
{
	@JSONField(ordinal=1)
	private String FEntryID;
	@JSONField(ordinal=2)
	private FLogComId FLogComId;
	@JSONField(ordinal=3)
	private String FCarryBillNo;
	@JSONField(ordinal=4)
	private String FTraceStatus;
	@JSONField(ordinal=5)
	private List<FSalOrderTraceDetail> FSalOrderTraceDetail;

	public void setFEntryID(String FEntryID)
	{
		this.FEntryID = FEntryID;
	}

	public String getFEntryID()
	{
		return FEntryID;
	}

	public void setFLogComId(FLogComId FLogComId)
	{
		this.FLogComId = FLogComId;
	}

	public FLogComId getFLogComId()
	{
		return FLogComId;
	}

	public void setFCarryBillNo(String FCarryBillNo)
	{
		this.FCarryBillNo = FCarryBillNo;
	}

	public String getFCarryBillNo()
	{
		return FCarryBillNo;
	}

	public void setFTraceStatus(String FTraceStatus)
	{
		this.FTraceStatus = FTraceStatus;
	}

	public String getFTraceStatus()
	{
		return FTraceStatus;
	}

	public void setFSalOrderTraceDetail(List<FSalOrderTraceDetail> FSalOrderTraceDetail)
	{
		this.FSalOrderTraceDetail = FSalOrderTraceDetail;
	}

	public List<FSalOrderTraceDetail> getFSalOrderTraceDetail()
	{
		return FSalOrderTraceDetail;
	}

}