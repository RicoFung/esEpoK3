package com.common;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.json.JSONArray;
import org.json.JSONObject;

import com.api.entity.singlesave.FBillTypeID;
import com.api.entity.singlesave.FCustomerID;
import com.api.entity.singlesave.FEntity;
import com.api.entity.singlesave.FOutStockTrace;
import com.api.entity.singlesave.FOwnerID;
import com.api.entity.singlesave.FSaleOrgId;
import com.api.entity.singlesave.FSettleCurrID;
import com.api.entity.singlesave.FSettleOrgID;
import com.api.entity.singlesave.FStockOrgId;
import com.api.entity.singlesave.FUnitID;
import com.api.entity.singlesave.K3ApiSave;
import com.api.entity.singlesave.Model;
import com.api.entity.singlesave.SubHeadEntity;

public class InvokeHelper
{
	// TODO Auto-generated method stub
	// K3 Cloud WebSite URL Example "http://192.168.19.113/K3Cloud/"

	public static String POST_K3CloudURL = "http://192.168.9.27/K3Cloud/";
	// Cookie 值
	private static String CookieVal = null;
	private static Map<String, String> map = new HashMap<String, String>();
	static
	{
		map.put("Save", "Kingdee.BOS.WebApi.ServicesStub.DynamicFormService.Save.common.kdsvc");

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

	public static boolean Login(String dbId, String user, String pwd, int lang) throws Exception
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
		System.out.println(" ============================= ");
		System.out.println(" Contents of post request ");
		System.out.println(" ============================= ");
		while ((line = reader.readLine()) != null)
		{
			String sResult = new String(line.getBytes(), "utf-8");
			System.out.println(sResult);
			bResult = line.contains("\"LoginResultType\":1");

		}
		System.out.println(" ============================= ");
		System.out.println(" Contents of post request ends ");
		System.out.println(" ============================= ");
		reader.close();
		connection.disconnect();
		return bResult;
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
		System.out.println(" ============================= ");
		System.out.println(" Contents of post request ");
		System.out.println(" ============================= ");
		while ((line = reader.readLine()) != null)
		{
			sResult = new String(line.getBytes(), "utf-8");
			System.out.println(sResult);
		}
		System.out.println(" ============================= ");
		System.out.println(" Contents of post request ends ");
		System.out.println(" ============================= ");
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
		System.out.println(" ============================= ");
		System.out.println(" Contents of post request ");
		System.out.println(" ============================= ");
		while ((line = reader.readLine()) != null)
		{
			String sResult = new String(line.getBytes(), "utf-8");
			System.out.println(sResult);
		}
		System.out.println(" ============================= ");
		System.out.println(" Contents of post request ends ");
		System.out.println(" ============================= ");
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

		if (InvokeHelper.Login("5aa628adc9fabb", "Administrator", "888888", 2052)) // 正式帐套ID: 56de443c350f9f
		{// 登录成功
			// String sFormId = "PUR_Requisition";//采购申请单查看
			// String sContent =
			// "{\"CreateOrgId\":\"0\",\"Number\":\"PR201701130012\",\"Id\":\"\"}";

//			String sFormId = "BD_Empinfo";// 员工查看
//			String sContent = "{\"CreateOrgId\":\"0\",\"Number\":\"001110\",\"Id\":\"\"}";
//			InvokeHelper.View(sFormId, sContent);
			
			String sFormId = "SAL_OUTSTOCK";// 保存
			String sContent = "";
			K3ApiSave root = new K3ApiSave();
			root.setCreator("test");
			for(int i=0; i<1; i++)
			{
				// 表頭
				Model model = new Model();
				FOutStockTrace fOutStockTrace = new FOutStockTrace();
				fOutStockTrace.setFCarryBillNo("FCarryBillNo_"+i);
				List<FOutStockTrace> fOutStockTraces = new ArrayList<FOutStockTrace>();
				fOutStockTraces.add(fOutStockTrace);
				
				FBillTypeID fBillTypeID = new FBillTypeID();
				fBillTypeID.setFNumber("fBillTypeID_"+i);
				FSaleOrgId fSaleOrgId = new FSaleOrgId();
				fSaleOrgId.setFNumber("fSaleOrgId_"+i);
				FStockOrgId fStockOrgId = new FStockOrgId();
				fStockOrgId.setFNumber("fStockOrgId_"+i);
				FCustomerID fCustomerID = new FCustomerID();
				fCustomerID.setFNumber("fCustomerID_"+i);
				
				FSettleOrgID fSettleOrgID = new FSettleOrgID();
				fSettleOrgID.setFNumber("fSettleOrgID_"+i);
				FSettleCurrID fSettleCurrID = new FSettleCurrID();
				fSettleCurrID.setFNumber("fSettleCurrID_"+i);
				SubHeadEntity subHeadEntity = new SubHeadEntity();
				subHeadEntity.setFSettleOrgID(fSettleOrgID);
				subHeadEntity.setFSettleCurrID(fSettleCurrID);
				
				model.setFOutStockTrace(fOutStockTraces);
				model.setFBillTypeID(fBillTypeID);
				model.setFSaleOrgId(fSaleOrgId);
				model.setFStockOrgId(fStockOrgId);
				model.setFCustomerID(fCustomerID);
				model.setSubHeadEntity(subHeadEntity);
				model.setFDate(new Date());
				// 表明細
				List<FEntity> fEntitys = new ArrayList<FEntity>();
				for(int j=0; j<10; j++)
				{
					FUnitID fUnitID = new FUnitID();
					fUnitID.setFNumber("fUnitID_"+j);
					FOwnerID fOwnerID = new FOwnerID();
					fOwnerID.setFNumber("fOwnerID_"+j);
					FEntity fEntity = new FEntity();
					fEntity.setFUnitID(fUnitID);
					fEntity.setFOwnerID(fOwnerID);
					fEntitys.add(fEntity);
				}
				//
				model.setFEntity(fEntitys);
				root.setModel(model);
			}
			sContent = com.alibaba.fastjson.JSONArray.toJSONString(root, new com.alibaba.fastjson.serializer.PascalNameFilter());
			System.out.println(sContent);
			InvokeHelper.Save(sFormId, sContent);

		}
	}
}
