package com.api.entity.k3;

import java.util.ArrayList;
import java.util.List;

public class ApiBatchSave
{
	private String NumberSearch ;//= "";
	private String ValidateFlag ;//= "";
	private String IsDeleteEntry ;//= "";
	private List<String> NeedUpDateFields ;//= new ArrayList<String>();
	private List<String> NeedReturnFields ;//= new ArrayList<String>();
	private String SubSystemId ;//= "";
	private List<Model> Model ;//= new ArrayList<Model>();
	private String BatchCount ;//= "";

	public void setNumberSearch(String NumberSearch)
	{
		this.NumberSearch = NumberSearch;
	}

	public String getNumberSearch()
	{
		return NumberSearch;
	}

	public void setValidateFlag(String ValidateFlag)
	{
		this.ValidateFlag = ValidateFlag;
	}

	public String getValidateFlag()
	{
		return ValidateFlag;
	}

	public void setIsDeleteEntry(String IsDeleteEntry)
	{
		this.IsDeleteEntry = IsDeleteEntry;
	}

	public String getIsDeleteEntry()
	{
		return IsDeleteEntry;
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

	public void setSubSystemId(String SubSystemId)
	{
		this.SubSystemId = SubSystemId;
	}

	public String getSubSystemId()
	{
		return SubSystemId;
	}

	public void setModel(List<Model> Model)
	{
		this.Model = Model;
	}

	public List<Model> getModel()
	{
		return Model;
	}

	public void setBatchCount(String BatchCount)
	{
		this.BatchCount = BatchCount;
	}

	public String getBatchCount()
	{
		return BatchCount;
	}

}