package com.api.scheduler;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.api.service.TbK3SalOrderService;
import com.api.service.TbK3SalOutstockService;
import com.api.service.TbK3SalReturnstockService;
import com.api.service.TbK3StkMiscellaneousService;
import com.api.service.TbK3StkMisdeliveryService;
import com.common.InvokeHelper;

@Component
public class SyncScheduler
{
	static Logger log = LoggerFactory.getLogger(SyncScheduler.class);
	
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
	
	// 第一次延迟1秒执行，当执行完后2分钟再执行
  @Scheduled(initialDelay = 1000, fixedDelay = 60000*2)
//	@Scheduled(cron = "0 15,30,45 * * * ?") // 每小时15/30/45分执行
//	@Scheduled(cron = "0 0/10 * * * ?") // 每10分钟执行
	/**
	 * 销售出库单同步
	 */
	public void batchSaveOutStock()
	{
		if(log.isInfoEnabled()) log.info("//------------------------------------------------------------------------------------------------------//");
		if(log.isInfoEnabled()) log.info("// Auto批量同步：销售出库单");
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
	
	// 第一次延迟1秒执行，当执行完后2分钟再执行
  @Scheduled(initialDelay = 1000, fixedDelay = 60000*2)
//	@Scheduled(cron = "0 15,30,45 * * * ?") // 每小时15/30/45分执行
//	@Scheduled(cron = "0 0/10 * * * ?") // 每10分钟执行
	/**
	 * 销售退货单同步
	 */
	public void batchSaveReturnStock()
	{
		if(log.isInfoEnabled()) log.info("//------------------------------------------------------------------------------------------------------//");
		if(log.isInfoEnabled()) log.info("// Auto批量同步：销售退货单");
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

	// 第一次延迟1秒执行，当执行完后2分钟再执行
  @Scheduled(initialDelay = 1000, fixedDelay = 60000*2)
//	@Scheduled(cron = "0 15,30,45 * * * ?") // 每小时15/30/45分执行
//	@Scheduled(cron = "0 0/10 * * * ?") // 每10分钟执行
	/**
	 * 销售订单（预售单）同步
	 */
	public void batchSaveOrder()
	{
		if(log.isInfoEnabled()) log.info("//------------------------------------------------------------------------------------------------------//");
		if(log.isInfoEnabled()) log.info("// Auto批量同步：销售订单（预售单）");
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
	
	// 第一次延迟1秒执行，当执行完后2分钟再执行
  @Scheduled(initialDelay = 1000, fixedDelay = 60000*2)
//	@Scheduled(cron = "0 15,30,45 * * * ?") // 每小时15/30/45分执行
//	@Scheduled(cron = "0 0/10 * * * ?") // 每10分钟执行
	/**
	 * 其他入库单同步
	 */
	public void batchSaveMiscellaneous()
	{
		if(log.isInfoEnabled()) log.info("//------------------------------------------------------------------------------------------------------//");
		if(log.isInfoEnabled()) log.info("// Auto批量同步：其他入库单");
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
	
	// 第一次延迟1秒执行，当执行完后2分钟再执行
  @Scheduled(initialDelay = 1000, fixedDelay = 60000*2)
//	@Scheduled(cron = "0 15,30,45 * * * ?") // 每小时15/30/45分执行
//	@Scheduled(cron = "0 0/10 * * * ?") // 每10分钟执行
	/**
	 * 其他出库单同步
	 */
	public void batchSaveMisdelivery()
	{
		if(log.isInfoEnabled()) log.info("//------------------------------------------------------------------------------------------------------//");
		if(log.isInfoEnabled()) log.info("// Auto批量同步：其他出库单");
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

/**非cron参数**/
//	zone：默认使用服务器默认时区。可以设置为java.util.TimeZone中的zoneId
//	fixedDelay：从上一个任务完成开始到下一个任务开始的间隔，单位毫秒
//	fixedDelayString：同上，时间值是String类型
//	fixedRate：从上一个任务开始到下一个任务开始的间隔，单位毫秒
//	fixedRateString：同上，时间值是String类型
//	initialDelay：任务首次执行延迟的时间，单位毫秒
//	initialDelayString：同上，时间值是String类型

/**cron表达式的使用方法**/
//	
//	Cron表达式是一个字符串，字符串以5或6个空格隔开，分为6或7个域，每一个域代表一个含义，Cron有如下两种语法格式：
//	
//	Seconds Minutes Hours DayofMonth Month DayofWeek Year
//	Seconds Minutes Hours DayofMonth Month DayofWeek
//	每一个域可出现的字符如下：
//	
//	Seconds: 可出现", - * /"四个字符，有效范围为0-59的整数
//	Minutes: 可出现", - * /"四个字符，有效范围为0-59的整数
//	Hours: 可出现", - * /"四个字符，有效范围为0-23的整数
//	DayofMonth: 可出现", - * / ? L W C"八个字符，有效范围为0-31的整数
//	Month: 可出现", - * /"四个字符，有效范围为1-12的整数或JAN-DEC
//	DayofWeek: 可出现", - * / ? L C #"四个字符，有效范围为1-7的整数或SUN-SAT两个范围。1表示星期天，2表示星期一， 依次类推
//	Year: 可出现", - * /"四个字符，有效范围为1970-2099年
//	每一个域都使用数字，但还可以出现如下特殊字符，它们的含义是：
//	
//	*：表示匹配该域的任意值，假如在Minutes域使用*, 即表示每分钟都会触发事件。
//	?：只能用在DayofMonth和DayofWeek两个域。它也匹配域的任意值，但实际不会。因为DayofMonth和 DayofWeek会相互影响。例如想在每月的20日触发调度，不管20日到底是星期几，则只能使用如下写法： 13 13 15 20 ?, 其中最后一位只能用？，而不能使用，如果使用*表示不管星期几都会触发，实际上并不是这样。
//	-：表示范围，例如在Minutes域使用5-20，表示从5分到20分钟每分钟触发一次。
//	/：表示起始时间开始触发，然后每隔固定时间触发一次，例如在Minutes域使用5/20,则意味着5分钟触发一次，而25，45等分别触发一次。
//	,：表示列出枚举值值。例如：在Minutes域使用5,20，则意味着在5和20分每分钟触发一次。
//	L：表示最后，只能出现在DayofWeek和DayofMonth域，如果在DayofWeek域使用5L,意味着在最后的一个星期四触发。
//	W：表示有效工作日(周一到周五),只能出现在DayofMonth域，系统将在离指定日期的最近的有效工作日触发事件。例如：在 DayofMonth使用5W，如果5日是星期六，则将在最近的工作日：星期五，即4日触发。如果5日是星期天，则在6日(周一)触发；如果5日在星期一 到星期五中的一天，则就在5日触发。另外一点，W的最近寻找不会跨过月份。
//	LW：这两个字符可以连用，表示在某个月最后一个工作日，即最后一个星期五。
//	#：用于确定每个月第几个星期几，只能出现在DayofMonth域。例如在4#2，表示某月的第二个星期三。