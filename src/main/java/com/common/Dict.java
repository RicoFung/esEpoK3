package com.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

import chok.devwork.BaseModel;
import chok.devwork.springboot.BaseService;

public class Dict 
{
	/**
	 * 获取TmppSyncFashionpos0a集合
	 * @param params
	 * @return List<Object>
	 */
	public static List<Object> queryTmppSyncFashionpos0a(Map<String, Object> params)
	{
		return queryTmppSyncFashionpos0a(params, null);
	}
	public static List<Object> queryTmppSyncFashionpos0a(Map<String, Object> params, String type)
	{
		if("json".equals(type))
			return getJsons(params, Factory.getTmppSyncFashionpos0aService());
		else
			return getList(params, Factory.getTmppSyncFashionpos0aService());
	}
	
	/**
	 * 获取集合(通用)
	 * @param params
	 * @param service
	 * @return List<Object>
	 */
	private static List<Object> getList(Map<String, Object> params, BaseService service)
	{
		List<Object> list = new ArrayList<Object>();
		List<BaseModel> resultData = service.query(params);
		for(BaseModel o : resultData)
		{
			list.add(o.getM());
		}
		return list;
	}
	/**
	 * 获取JSON集合(通用)
	 * @param params
	 * @param service
	 * @return List<Object>
	 */
	private static List<Object> getJsons(Map<String, Object> params, BaseService service)
	{
		List<Object> list = new ArrayList<Object>();
		List<BaseModel> resultData = service.query(params);
		for(BaseModel o : resultData)
		{
			list.add(JSON.toJSON(o.getM()));
		}
		return list;
	}
}
