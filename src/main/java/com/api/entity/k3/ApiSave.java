/**
  * Copyright 2018 bejson.com 
  */
package com.api.entity.k3;

import java.util.List;

public class ApiSave
{

	private String Creator;
	private List<String> NeedUpDateFields;
	private List<String> NeedReturnFields;
	private String IsDeleteEntry;
	private String SubSystemId;
	private String IsVerifyBaseDataField;
	private Model Model;

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

	public void setModel(Model Model)
	{
		this.Model = Model;
	}

	public Model getModel()
	{
		return Model;
	}

}