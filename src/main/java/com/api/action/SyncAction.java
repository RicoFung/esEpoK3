package com.api.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.api.service.sal.OrderService;
import com.api.service.sal.OutStockService;
import com.api.service.sal.ReturnStockService;
import com.api.service.stk.MiscellaneousService;
import com.api.service.stk.MisdeliveryService;
import com.common.InvokeHelper;

import chok.devwork.BaseController;
import chok.util.PropertiesUtil;

@Scope("prototype")
@Controller
@RequestMapping("/sync")
public class SyncAction extends BaseController<Object>
{
	@Autowired
	private OutStockService outStockService; // 销售出库单
	@Autowired
	private ReturnStockService returnStockService; // 销售退货单
	@Autowired
	private OrderService orderService; // 销售订单（预售单）
	@Autowired
	private MiscellaneousService miscellaneousService; // 其他入库单
	@Autowired
	private MisdeliveryService misdeliveryService;// 其他出库单
	
	@RequestMapping("/batchSaveOutStock")
	public void batchSaveOutStock()
	{
		if(log.isInfoEnabled()) log.info("//------------------------------------------------------------------------------------------------------//");
		if(log.isInfoEnabled()) log.info("// Manually批量同步：销售出库单");
		if(log.isInfoEnabled()) log.info("//------------------------------------------------------------------------------------------------------//");
		try
		{
			if(InvokeHelper.isLogin())
			outStockService.batchSave();
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
			returnStockService.batchSave();
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
			orderService.batchSave();
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
			miscellaneousService.batchSave();
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
			misdeliveryService.batchSave();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}	
}