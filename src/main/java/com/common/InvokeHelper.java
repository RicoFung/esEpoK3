package com.common;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import chok.util.PropertiesUtil;

public class InvokeHelper
{
	static Logger log = LoggerFactory.getLogger(InvokeHelper.class);

	public static String POST_K3CloudURL = PropertiesUtil.getValue("config/", "k3.url");
	// Cookie 值
	private static String CookieVal = null;
	private static Map<String, String> map = new HashMap<String, String>();
	static
	{
		map.put("Save", "Kingdee.BOS.WebApi.ServicesStub.DynamicFormService.Save.common.kdsvc");
		
		map.put("BatchSave", "Kingdee.BOS.WebApi.ServicesStub.DynamicFormService.BatchSave.common.kdsvc");

		map.put("View", "Kingdee.BOS.WebApi.ServicesStub.DynamicFormService.View.common.kdsvc");

		map.put("Submit", "Kingdee.BOS.WebApi.ServicesStub.DynamicFormService.Submit.common.kdsvc");

		map.put("Audit", "Kingdee.BOS.WebApi.ServicesStub.DynamicFormService.Audit.common.kdsvc");

		map.put("UnAudit", "Kingdee.BOS.WebApi.ServicesStub.DynamicFormService.UnAudit.common.kdsvc");

		map.put("StatusConvert", "Kingdee.BOS.WebApi.ServicesStub.DynamicFormService.StatusConvert.common.kdsvc");

		map.put("ExecuteBillQuery", "Kingdee.BOS.WebApi.ServicesStub.DynamicFormService.ExecuteBillQuery.common.kdsvc");

	}
	// HttpURLConnection

	private static HttpURLConnection initUrlConn(String url, JSONArray paras) throws Exception
	{
		URL postUrl = new URL(POST_K3CloudURL.concat(url));
		HttpURLConnection connection = (HttpURLConnection) postUrl.openConnection();
		if (CookieVal != null)
		{
			connection.setRequestProperty("Cookie", CookieVal);
		}
		if (!connection.getDoOutput())
		{
			connection.setDoOutput(true);
		}
		connection.setRequestMethod("POST");
		connection.setUseCaches(false);
		connection.setInstanceFollowRedirects(true);
		connection.setRequestProperty("Content-Type", "application/json");
		DataOutputStream out = new DataOutputStream(connection.getOutputStream());
		UUID uuid = UUID.randomUUID();
		int hashCode = uuid.toString().hashCode();
		JSONObject jObj = new JSONObject();
		jObj.put("format", 1);
		jObj.put("useragent", "ApiClient");
		jObj.put("rid", hashCode);
		jObj.put("parameters", chinaToUnicode(paras.toString()));
		jObj.put("timestamp", new Date().toString());
		jObj.put("v", "1.0");
		out.writeBytes(jObj.toString());
		out.flush();
		out.close();
		return connection;
	}

	// Login
	public static boolean Login(String dbId, String user, String pwd, Integer lang) throws Exception
	{
		boolean bResult = false;
		String sUrl = "Kingdee.BOS.WebApi.ServicesStub.AuthService.ValidateUser.common.kdsvc";
		JSONArray jParas = new JSONArray();
		jParas.put(dbId);// 帐套Id
		jParas.put(user);// 用户名
		jParas.put(pwd);// 密码
		jParas.put(lang);// 语言
		HttpURLConnection connection = initUrlConn(sUrl, jParas);
		// 获取Cookie
		String key = null;
		for (int i = 1; (key = connection.getHeaderFieldKey(i)) != null; i++)
		{
			if (key.equalsIgnoreCase("Set-Cookie"))
			{
				String tempCookieVal = connection.getHeaderField(i);
				if (tempCookieVal.startsWith("kdservice-sessionid"))
				{
					CookieVal = tempCookieVal;
					break;
				}
			}
		}
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String line;
		if(log.isInfoEnabled()) log.info(" ============================= ");
		if(log.isInfoEnabled()) log.info(" Contents of post request ");
		if(log.isInfoEnabled()) log.info(" ============================= ");
		while ((line = reader.readLine()) != null)
		{
			String sResult = new String(line.getBytes(), "utf-8");
			if(log.isInfoEnabled()) log.info(sResult);
			bResult = line.contains("\"LoginResultType\":1");

		}
		if(log.isInfoEnabled()) log.info(" ============================= ");
		if(log.isInfoEnabled()) log.info(" Contents of post request ends ");
		if(log.isInfoEnabled()) log.info(" ============================= ");
		reader.close();
		connection.disconnect();
		return bResult;
	}
	
	// isLogin
	public static boolean isLogin() throws NumberFormatException, Exception
	{
		return InvokeHelper.Login(PropertiesUtil.getValue("config/", "k3.dbId"), 
								  PropertiesUtil.getValue("config/", "k3.user"), 
								  PropertiesUtil.getValue("config/", "k3.pwd"), 
								  Integer.valueOf(PropertiesUtil.getValue("config/", "k3.lang")));
	}

	// Save
	public static String Save(String formId, String content) throws Exception
	{
		// Invoke("Save", formId, content);
		String sUrl = map.get("Save").toString();
		String sResult = Synchronization(sUrl, formId, content);
		return sResult;
	}
	
	public static String BatchSave(String formId, String content) throws Exception
	{
		// Invoke("Save", formId, content);
		String sUrl = map.get("BatchSave").toString();
		String sResult = Synchronization(sUrl, formId, content);
		return sResult;
	}

	// View 查看（单条）
	public static String View(String formId, String content) throws Exception
	{
		// Invoke("View", formId, content);

		String sUrl = map.get("View").toString();
		String sResult = Synchronization(sUrl, formId, content);
		return sResult;
	}

	private static String Synchronization(String sUrl, String formId, String content) throws Exception
	{
		String sResult = "";
		JSONArray jParas = new JSONArray();
		jParas.put(formId);
		jParas.put(content);
		HttpURLConnection connectionInvoke = initUrlConn(sUrl, jParas);
		BufferedReader reader = new BufferedReader(new InputStreamReader(connectionInvoke.getInputStream()));
		String line;
		if(log.isInfoEnabled()) log.info(" ============================= ");
		if(log.isInfoEnabled()) log.info(" Contents of post request ");
		if(log.isInfoEnabled()) log.info(" ============================= ");
		if(log.isInfoEnabled()) log.info(formId);
		if(log.isInfoEnabled()) log.info(sUrl);
		if(log.isInfoEnabled()) log.info(">>> " + content);
		while ((line = reader.readLine()) != null)
		{
			sResult = new String(line.getBytes(), "utf-8");
			if(log.isInfoEnabled()) log.info("<<< " + sResult);
		}
		if(log.isInfoEnabled()) log.info(" ============================= ");
		if(log.isInfoEnabled()) log.info(" Contents of post request ends ");
		if(log.isInfoEnabled()) log.info(" ============================= ");
		reader.close();
		connectionInvoke.disconnect();

		return sResult;
		// TODO Auto-generated method stub

	}

	// Submit
	public static void Submit(String formId, String content) throws Exception
	{
		Invoke("Submit", formId, content);
	}

	// Audit
	public static void Audit(String formId, String content) throws Exception
	{
		Invoke("Audit", formId, content);
	}

	// UnAudit
	public static void UnAudit(String formId, String content) throws Exception
	{
		Invoke("UnAudit", formId, content);
	}

	// StatusConvert
	public static void StatusConvert(String formId, String content) throws Exception
	{
		Invoke("StatusConvert", formId, content);
	}

	private static void Invoke(String deal, String formId, String content) throws Exception
	{
		String sUrl = map.get(deal).toString();
		JSONArray jParas = new JSONArray();
		jParas.put(formId);
		jParas.put(content);
		HttpURLConnection connectionInvoke = initUrlConn(sUrl, jParas);
		BufferedReader reader = new BufferedReader(new InputStreamReader(connectionInvoke.getInputStream()));
		String line;
		if(log.isInfoEnabled()) log.info(" ============================= ");
		if(log.isInfoEnabled()) log.info(" Contents of post request ");
		if(log.isInfoEnabled()) log.info(" ============================= ");
		if(log.isInfoEnabled()) log.info(formId);
		if(log.isInfoEnabled()) log.info(sUrl);
		if(log.isInfoEnabled()) log.info(">>> " + content);
		while ((line = reader.readLine()) != null)
		{
			String sResult = new String(line.getBytes(), "utf-8");
			if(log.isInfoEnabled()) log.info("<<< " + sResult);
		}
		if(log.isInfoEnabled()) log.info(" ============================= ");
		if(log.isInfoEnabled()) log.info(" Contents of post request ends ");
		if(log.isInfoEnabled()) log.info(" ============================= ");
		reader.close();
		connectionInvoke.disconnect();
	}

	/**
	 * 
	 * 把中文转成Unicode码
	 * 
	 * @param str
	 * @return
	 */
	public static String chinaToUnicode(String str)
	{
		String result = "";
		for (int i = 0; i < str.length(); i++)
		{
			int chr1 = (char) str.charAt(i);
			if (chr1 >= 19968 && chr1 <= 171941)
			{// 汉字范围 \u4e00-\u9fa5 (中文)
				result += "\\u" + Integer.toHexString(chr1);
			}
			else
			{
				result += str.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) throws Exception
	{
		if(InvokeHelper.isLogin())
		{// 登录成功
			// 销售出库单
//			OutStockService outStockService = new OutStockService();
//			outStockService.batchSave();
			// 销售退库单
//			ReturnStockService returnStockService = new ReturnStockService();
//			returnStockService.batchSave();
//			returnStockService.save();
			// 销售订单 （预售单）
//			OrderService orderService = new OrderService();
//			orderService.batchSave();
//			orderService.save();
			// 其他入库单
//			MiscellaneousService miscellaneousService = new MiscellaneousService();
//			miscellaneousService.batchSave();
//			miscellaneousService.save();
			// 其他出库单
//			MisdeliveryService misdeliveryService = new MisdeliveryService();
//			misdeliveryService.batchSave();
//			misdeliveryService.save();

		}
	}
	
}
