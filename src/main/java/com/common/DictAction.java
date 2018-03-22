package com.common;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import chok.devwork.BaseController;

@Scope("prototype")
@Controller
@RequestMapping("/dict")
public class DictAction extends BaseController<Object>
{
	@RequestMapping("/queryTmppSyncFashionpos0a")
	public void queryTmppSyncFashionpos0a()
	{
		List<Object> list = Dict.queryTmppSyncFashionpos0a(req.getParameterValueMap(false, true));
		printJson(list);
	}

	@RequestMapping("/queryTmppSyncFashionpos0aPage")
	public void queryTmppSyncFashionpos0aPage()
	{
		Map<String, Object> m = req.getParameterValueMap(false, true);
		result.put("total", Factory.getTmppSyncFashionpos0aService().getCount(m));
		result.put("rows", Factory.getTmppSyncFashionpos0aService().query(req.getDynamicSortParameterValueMap(m)));
		printJson(result.getData());
	}

}
