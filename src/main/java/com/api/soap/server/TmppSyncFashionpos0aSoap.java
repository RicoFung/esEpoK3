package com.api.soap.server;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.api.entity.TmppSyncFashionpos0a;
import com.api.service.TmppSyncFashionpos0aService;
import com.common.Factory;

@WebService(endpointInterface="com.api.soap.server.ITmppSyncFashionpos0aSoap", serviceName="TmppSyncFashionpos0aSoap", targetNamespace="http://soap.sbapi/")
public class TmppSyncFashionpos0aSoap extends SpringBeanAutowiringSupport implements ITmppSyncFashionpos0aSoap
{
	static Logger log = LoggerFactory.getLogger("sbApi");

	private TmppSyncFashionpos0aService service = Factory.getTmppSyncFashionpos0aService();

	@Override
	public Map<String, String> add(TmppSyncFashionpos0a po)
	{
		Map<String, String> result = new HashMap<String, String>();
		try
		{
			service.add(po);
			result.put("success", ""+true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			result.put("success", ""+false);
			result.put("msg", e.getMessage());
		}
		return result;
	}

	@Override
	public Map<String, String> addBatch(List<TmppSyncFashionpos0a> poList)
	{
		Map<String, String> result = new HashMap<String, String>();
		try
		{
			service.addBatch(poList);
			result.put("success", ""+true);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			result.put("success", ""+false);
			result.put("msg", e.getMessage());
		}
		return result;
	}

	@Override
	public Map<String, String> del(Map<String, String> param)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> upd(TmppSyncFashionpos0a param)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, String>> query(String param1, String param2)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
