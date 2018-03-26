package com.api.entity.k3;

import java.util.List;

public class ApiAudit
{
	private String CreateOrgId;
	private List<String> Numbers;

	public void setCreateOrgId(String CreateOrgId)
	{
		this.CreateOrgId = CreateOrgId;
	}

	public String getCreateOrgId()
	{
		return CreateOrgId;
	}

	public void setNumbers(List<String> Numbers)
	{
		this.Numbers = Numbers;
	}

	public List<String> getNumbers()
	{
		return Numbers;
	}
}
