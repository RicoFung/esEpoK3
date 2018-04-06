package com.api.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.api.entity.BaseTbK3Object;
import com.api.entity.json.BaseApiBatchSave;
import com.common.InvokeHelper;

import chok.devwork.springboot.BaseDao;
import chok.devwork.springboot.BaseService;
import chok.util.TimeUtil;

public abstract class BaseTbK3Service<T, PK> extends BaseService<T, PK>
{
	public abstract BaseDao<T, PK> getTbK3EntityDao();
	private JSONObject oResult;
	private Boolean oResultIsSuccess;
	private JSONArray oResultSuccessEntitys;
	private JSONArray oResultErrors;
	
	/**
	 * 调用Api
	 * @param root
	 * @param tbK3Objs
	 * @throws Exception
	 */
	protected void callApi(String formId, BaseApiBatchSave root, List<T> list) throws Exception
	{
		//------------------------------------------------------------------------------------------------------//		
		// Api Call
		//------------------------------------------------------------------------------------------------------//
		String sContent = JSONArray.toJSONString(root, new com.alibaba.fastjson.serializer.PascalNameFilter());
		String sResult = InvokeHelper.BatchSave(formId, sContent);
		//------------------------------------------------------------------------------------------------------//
		// Api Result
		//------------------------------------------------------------------------------------------------------//
		oResult = JSON.parseObject(sResult).getJSONObject("Result");
		oResultIsSuccess = oResult.getJSONObject("ResponseStatus").getBoolean("IsSuccess");
		if (oResultIsSuccess)
		{
			// update 中间库单据状态
			oResultSuccessEntitys = oResult.getJSONObject("ResponseStatus").getJSONArray("SuccessEntitys");
			for (int i=0; i<oResultSuccessEntitys.size(); i++)
			{
				String oResultId = oResultSuccessEntitys.getJSONObject(i).getString("Id");
				String oResultNumber = oResultSuccessEntitys.getJSONObject(i).getString("Number");
				BaseTbK3Object tbK3Obj = (BaseTbK3Object) list.get(i);
				tbK3Obj.setFid(oResultId);
				tbK3Obj.setFbillno(oResultNumber);
				tbK3Obj.setTcSyncStatus("SAVE_1");
				tbK3Obj.setTcSyncSaveTime(TimeUtil.getCurrentTime());
				getTbK3EntityDao().upd((T) tbK3Obj);
			}
		}
		else
		{
			// JSON格式：
			// "Errors":[{"FieldName":"FCustomerID","Message":"字段“客户”是必填项","DIndex":0},{"FieldName":"FCustomerID","Message":"字段“客户”是必填项","DIndex":1},{"FieldName":"FStockID","Message":"单据体实体【明细信息】第【1】行分录，【仓库】字段必录","DIndex":0},{"FieldName":"FStockID","Message":"单据体实体【明细信息】第【2】行分录，【仓库】字段必录","DIndex":0},{"FieldName":"FStockID","Message":"单据体实体【明细信息】第【3】行分录，【仓库】字段必录","DIndex":0},{"FieldName":"FStockID","Message":"单据体实体【明细信息】第【1】行分录，【仓库】字段必录","DIndex":1},{"FieldName":"FStockID","Message":"单据体实体【明细信息】第【2】行分录，【仓库】字段必录","DIndex":1},{"FieldName":"FStockID","Message":"单据体实体【明细信息】第【3】行分录，【仓库】字段必录","DIndex":1}]
			oResultErrors = oResult.getJSONObject("ResponseStatus").getJSONArray("Errors");
			// update 中间库单据状态和错误信息
			// 收集错误数据
			Map<Integer, BaseTbK3Object> errorObjs = new HashMap<Integer, BaseTbK3Object>();
			for (int i=0; i<oResultErrors.size(); i++)
			{
				Integer oResultDIndex = oResultErrors.getJSONObject(i).getInteger("DIndex");
				String oResultMessage = oResultErrors.getJSONObject(i).getString("Message");
				
				BaseTbK3Object tbK3Obj = (BaseTbK3Object) list.get(oResultDIndex);
				tbK3Obj.setTcSyncMsg(tbK3Obj.getTcSyncMsg()+"###"+oResultMessage);
				tbK3Obj.setTcSyncStatus("SAVE_0");
				
				if (errorObjs.containsKey(oResultDIndex))
					errorObjs.replace(oResultDIndex, tbK3Obj);
				else
					errorObjs.put(oResultDIndex, tbK3Obj);
			}
			// 遍历更新同步状态
			errorObjs.forEach((k,v)->{getTbK3EntityDao().upd((T) v);});
		}
	}
}
