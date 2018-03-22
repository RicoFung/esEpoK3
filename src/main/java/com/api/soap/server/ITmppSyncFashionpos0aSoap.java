package com.api.soap.server;

import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.api.entity.TmppSyncFashionpos0a;

@WebService
public interface ITmppSyncFashionpos0aSoap
{
	/**
	 * 增
	 * @param param Map<String, String>
	 * @return Map<String, String>
	 */
	@WebMethod
	@XmlJavaTypeAdapter(MapAdapter.class)
	public @WebResult(name="result")Map<String, String> add(@WebParam(name="po")TmppSyncFashionpos0a po);
	
	/**
	 * 增批量
	 * @param param List<Map<String, String>>
	 * @return Map<String, String>
	 */
	@WebMethod
	@XmlJavaTypeAdapter(MapAdapter.class)
	public @WebResult(name="result")Map<String, String> addBatch(@WebParam(name="poList")List<TmppSyncFashionpos0a> poList);
	
	/**
	 * 删
	 * @param param Map<String, String>
	 * @return Map<String, String>
	 */
	@WebMethod
	@XmlJavaTypeAdapter(MapAdapter.class)
	public @WebResult(name="result")Map<String, String> del(@WebParam(name="param")Map<String, String> param);
	
	/**
	 * 改
	 * @param param Map<String, String>
	 * @return Map<String, String>
	 */ 
	@WebMethod
	@XmlJavaTypeAdapter(MapAdapter.class)
	public @WebResult(name="result")Map<String, String> upd(@WebParam(name="param")TmppSyncFashionpos0a param);
	
	/**
	 * 查
	 * @param param Map<String, String>
	 * @return List<Map<String, String>>
	 */
	@WebMethod
	@XmlJavaTypeAdapter(MapAdapter.class) 
	public @WebResult(name="result")List<Map<String, String>> query(@WebParam(name="param1")String param1, @WebParam(name="param2")String param2);
//	@WebMethod
//	@XmlJavaTypeAdapter(MapAdapter.class) 
//	public @WebResult(name="result")List<Map<String, String>> query(@XmlJavaTypeAdapter(MapAdapter.class)@WebParam(name="param")Map<String, String> param);
}
