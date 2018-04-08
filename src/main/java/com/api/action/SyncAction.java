package com.api.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.api.service.TbK3SalOrderService;
import com.api.service.TbK3SalOutstockService;
import com.api.service.TbK3SalReturnstockService;
import com.api.service.TbK3StkMiscellaneousService;
import com.api.service.TbK3StkMisdeliveryService;
import com.common.InvokeHelper;

import chok.devwork.BaseController;

@Scope("prototype")
@Controller
@RequestMapping("/sync")
public class SyncAction extends BaseController<Object>
{
	@Autowired
	private TbK3SalOutstockService outStockService; // 销售出库单
	@Autowired
	private TbK3SalReturnstockService returnStockService; // 销售退货单
	@Autowired
	private TbK3SalOrderService orderService; // 销售订单（预售单）
	@Autowired
	private TbK3StkMiscellaneousService miscellaneousService; // 其他入库单
	@Autowired
	private TbK3StkMisdeliveryService misdeliveryService;// 其他出库单
	
	@RequestMapping("/batchSaveOutStock")
	public void batchSaveOutStock()
	{
		if(log.isInfoEnabled()) log.info("//------------------------------------------------------------------------------------------------------//");
		if(log.isInfoEnabled()) log.info("// Manually批量同步：销售出库单");
		if(log.isInfoEnabled()) log.info("//------------------------------------------------------------------------------------------------------//");
		try
		{
			if(InvokeHelper.isLogin())
			{
				Map<String, String> param = new HashMap<String, String>();
				param.put("offset", "0");
				param.put("limit", "2");
				param.put("sort", "tcDefineRowid");
				param.put("tcSyncStatus", "IS_NULL");
				outStockService.batchSave(param);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}	
	
	@RequestMapping("/batchSaveReturnStock")
	public void batchSaveReturnStock()
	{
		if(log.isInfoEnabled()) log.info("//------------------------------------------------------------------------------------------------------//");
		if(log.isInfoEnabled()) log.info("// Manually批量同步：销售退货单");
		if(log.isInfoEnabled()) log.info("//------------------------------------------------------------------------------------------------------//");
		try
		{
			if(InvokeHelper.isLogin())
			{
				Map<String, String> param = new HashMap<String, String>();
				param.put("offset", "0");
				param.put("limit", "2");
				param.put("sort", "tcDefineRowid");
				param.put("tcSyncStatus", "IS_NULL");
				returnStockService.batchSave(param);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}	
	
	@RequestMapping("/batchSaveOrder")
	public void batchSaveOrder()
	{
		if(log.isInfoEnabled()) log.info("//------------------------------------------------------------------------------------------------------//");
		if(log.isInfoEnabled()) log.info("// Manually批量同步：销售订单（预售单）");
		if(log.isInfoEnabled()) log.info("//------------------------------------------------------------------------------------------------------//");
		try
		{
			if(InvokeHelper.isLogin())
			{
				Map<String, String> param = new HashMap<String, String>();
				param.put("offset", "0");
				param.put("limit", "2");
				param.put("sort", "tcDefineRowid");
				param.put("tcSyncStatus", "IS_NULL");
				orderService.batchSave(param);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}	
	
	@RequestMapping("/batchSaveMiscellaneous")
	public void batchSaveMiscellaneous()
	{
		if(log.isInfoEnabled()) log.info("//------------------------------------------------------------------------------------------------------//");
		if(log.isInfoEnabled()) log.info("// Manually批量同步：其他入库单");
		if(log.isInfoEnabled()) log.info("//------------------------------------------------------------------------------------------------------//");
		try
		{
			if(InvokeHelper.isLogin())
			{
				Map<String, String> param = new HashMap<String, String>();
				param.put("offset", "0");
				param.put("limit", "2");
				param.put("sort", "tcDefineRowid");
				param.put("tcSyncStatus", "IS_NULL");
				miscellaneousService.batchSave(param);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}	
	
	@RequestMapping("/batchSaveMisdelivery")
	public void batchSaveMisdelivery()
	{
		if(log.isInfoEnabled()) log.info("//------------------------------------------------------------------------------------------------------//");
		if(log.isInfoEnabled()) log.info("// Manually批量同步：其他出库单");
		if(log.isInfoEnabled()) log.info("//------------------------------------------------------------------------------------------------------//");
		try
		{
			if(InvokeHelper.isLogin())
			{
				Map<String, String> param = new HashMap<String, String>();
				param.put("offset", "0");
				param.put("limit", "2");
				param.put("sort", "tcDefineRowid");
				param.put("tcSyncStatus", "IS_NULL");
				misdeliveryService.batchSave(param);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}	
}