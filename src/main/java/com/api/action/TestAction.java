package com.api.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.api.entity.TbK3ApiTest0a;
import com.api.service.TbK3ApiTest0aService;
import com.common.InvokeHelper;

import chok.devwork.BaseController;
import chok.util.TimeUtil;

@Scope("prototype")
@Controller
@RequestMapping("/test")
public class TestAction extends BaseController<Object>
{
	@Autowired
	private TbK3ApiTest0aService service;
	
	@RequestMapping("/callK3Api")
	public void callK3Api()
	{
		TbK3ApiTest0a po = service.get(1l);

		try
		{
			if (InvokeHelper.Login("5aa628adc9fabb", "Administrator", "888888", 2052)) // 正式帐套ID: 56de443c350f9f
			{// 登录成功
				String sFormId = "SAL_OUTSTOCK";
				// 批量保存
				String sContent = po.getTcJson().toString();
				if(log.isInfoEnabled()) log.info("begin time => "+TimeUtil.getCurrentTime());
				InvokeHelper.BatchSave(sFormId, sContent);
				if(log.isInfoEnabled()) log.info("end time => "+TimeUtil.getCurrentTime());
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}	
}