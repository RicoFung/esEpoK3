package com.api.entity.json.sal.order;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class ApiBatchSave
{
	@JSONField(ordinal=1)
	private String Creator;
	@JSONField(ordinal=2)
	private List<String> NeedUpDateFields;
	@JSONField(ordinal=3)
	private List<String> NeedReturnFields;
	@JSONField(ordinal=4)
	private String IsDeleteEntry;
	@JSONField(ordinal=5)
	private String SubSystemId;
	@JSONField(ordinal=6)
	private String IsVerifyBaseDataField;
	@JSONField(ordinal=7)
	private List<Model> Model;

	public void setCreator(String Creator)
	{
		this.Creator = Creator;
	}

	public String getCreator()
	{
		return Creator;
	}

	public void setNeedUpDateFields(List<String> NeedUpDateFields)
	{
		this.NeedUpDateFields = NeedUpDateFields;
	}

	public List<String> getNeedUpDateFields()
	{
		return NeedUpDateFields;
	}

	public void setNeedReturnFields(List<String> NeedReturnFields)
	{
		this.NeedReturnFields = NeedReturnFields;
	}

	public List<String> getNeedReturnFields()
	{
		return NeedReturnFields;
	}

	public void setIsDeleteEntry(String IsDeleteEntry)
	{
		this.IsDeleteEntry = IsDeleteEntry;
	}

	public String getIsDeleteEntry()
	{
		return IsDeleteEntry;
	}

	public void setSubSystemId(String SubSystemId)
	{
		this.SubSystemId = SubSystemId;
	}

	public String getSubSystemId()
	{
		return SubSystemId;
	}

	public void setIsVerifyBaseDataField(String IsVerifyBaseDataField)
	{
		this.IsVerifyBaseDataField = IsVerifyBaseDataField;
	}

	public String getIsVerifyBaseDataField()
	{
		return IsVerifyBaseDataField;
	}

	public List<Model> getModel()
	{
		return Model;
	}

	public void setModel(List<Model> model)
	{
		Model = model;
	}

}