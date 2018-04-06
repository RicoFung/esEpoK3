package com.api.entity.json.stk.miscellaneous;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.api.entity.json.BaseApiBatchSave;

public class ApiBatchSave extends BaseApiBatchSave
{
	@JSONField(ordinal=7)
	private List<Model> Model;

	public List<Model> getModel()
	{
		return Model;
	}

	public void setModel(List<Model> model)
	{
		Model = model;
	}

}