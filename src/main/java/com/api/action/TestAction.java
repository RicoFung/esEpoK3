package com.api.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.api.service.TmppSyncFashionpos0aService;

import chok.devwork.BaseController;

@Scope("prototype")
@Controller
@RequestMapping("/test")
public class TestAction extends BaseController<Object>
{
	@Autowired
	private TmppSyncFashionpos0aService service;
	
	@RequestMapping("/query")
	public void query() 
	{
		try
		{
			int c = service.getCount(req.getParameterValueMap(false, true));
			print(""+c);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			print("0:" + e.getMessage());
		}
	}
	
}