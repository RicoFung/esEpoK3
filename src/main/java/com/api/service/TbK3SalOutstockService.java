 package com.api.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.api.dao.TbK3SalOutstockDao;
import com.api.entity.TbK3SalOutstock;
import com.api.entity.TbK3SalOutstockentry;
import com.api.entity.json.sal.outstock.ApiBatchSave;
import com.api.entity.json.sal.outstock.FBillTypeID;
import com.api.entity.json.sal.outstock.FCustomerID;
import com.api.entity.json.sal.outstock.FEntity;
import com.api.entity.json.sal.outstock.FMaterialID;
import com.api.entity.json.sal.outstock.FOwnerID;
import com.api.entity.json.sal.outstock.FSaleOrgId;
import com.api.entity.json.sal.outstock.FSettleCurrID;
import com.api.entity.json.sal.outstock.FSettleOrgID;
import com.api.entity.json.sal.outstock.FStockID;
import com.api.entity.json.sal.outstock.FStockOrgId;
import com.api.entity.json.sal.outstock.FUnitID;
import com.api.entity.json.sal.outstock.Model;
import com.api.entity.json.sal.outstock.SubHeadEntity;
import com.common.InvokeHelper;

import chok.devwork.springboot.BaseDao;
import chok.devwork.springboot.BaseService;
import chok.util.TimeUtil;

@Service
public class TbK3SalOutstockService extends BaseService<TbK3SalOutstock,Long>
{
	static Logger log = LoggerFactory.getLogger(TbK3SalOutstockService.class);
	
	private static String FORM_ID = "SAL_OUTSTOCK";
	private JSONObject oResult;
	private Boolean oResultIsSuccess;
	private JSONArray oResultSuccessEntitys;
	private JSONArray oResultErrors;
	
	@Autowired
	private TbK3SalOutstockDao dao;

	@Override
	public BaseDao<TbK3SalOutstock,Long> getEntityDao() 
	{
		return dao;
	}
	
	/**
	 * 批量保存
	 * @throws Exception
	 */
	public void batchSave(Map<String, String> param) throws Exception
	{
		//------------------------------------------------------------------------------------------------------//
		// 获取待同步数据，10条/次，排序 tc_erp_add_time
		//------------------------------------------------------------------------------------------------------//
		List<TbK3SalOutstock> tbK3SalOutstocks = dao.queryPendingPage(param);
		//------------------------------------------------------------------------------------------------------//
		// Model-集合
		//------------------------------------------------------------------------------------------------------//
		List<Model> modelList = new ArrayList<Model>();
		for (int i=0; i<tbK3SalOutstocks.size(); i++)
		{
			TbK3SalOutstock tbK3SalOutstock = tbK3SalOutstocks.get(i);
			//------------------------------------------------------------------------------------------------------//
			// Model-SubHeadEntity
			//------------------------------------------------------------------------------------------------------//
			SubHeadEntity subHeadEntity = new SubHeadEntity();
			// 结算币别
			FSettleCurrID fSettleCurrID = new FSettleCurrID();
			fSettleCurrID.setFNumber("PRE001");
			subHeadEntity.setFSettleCurrID(fSettleCurrID);
			// 结算组织
			FSettleOrgID fSettleOrgID = new FSettleOrgID();
			fSettleOrgID.setFNumber("100");
			subHeadEntity.setFSettleOrgID(fSettleOrgID);
			//------------------------------------------------------------------------------------------------------//
			// Model-FEntity
			//------------------------------------------------------------------------------------------------------//
			List<FEntity> fEntityList = new ArrayList<FEntity>();
			List<TbK3SalOutstockentry> tbK3SalOutstockentrys = tbK3SalOutstock.getTbK3SalOutstockentrys();
			for (int j=0; j< tbK3SalOutstockentrys.size(); j++)
			{
				TbK3SalOutstockentry tbK3SalOutstockentry = tbK3SalOutstockentrys.get(j);
				FEntity fEntity = new FEntity();
				// 物料编码
				FMaterialID fMaterialID = new FMaterialID();
				fMaterialID.setFNumber(tbK3SalOutstockentry.getFmaterialid());
				fEntity.setFMaterialID(fMaterialID);
				// 库存单位
				FUnitID fUnitID = new FUnitID();
				fUnitID.setFNumber(tbK3SalOutstockentry.getFunitid());
				fEntity.setFUnitID(fUnitID);
				// 实发数量
				fEntity.setFRealQty(Integer.valueOf(tbK3SalOutstockentry.getFrealqty()));
				// 货主
				FOwnerID fOwnerID = new FOwnerID();
				fOwnerID.setFNumber(tbK3SalOutstockentry.getFownerid());
				fEntity.setFOwnerID(fOwnerID);
				// 仓库
				FStockID fStockID = new FStockID();
				fStockID.setFNumber(tbK3SalOutstockentry.getFstockid());
				fEntity.setFStockID(fStockID);
				// add to list
				fEntityList.add(fEntity);
			}
			//------------------------------------------------------------------------------------------------------//
			// Model
			//------------------------------------------------------------------------------------------------------//
			Model model = new Model();
			// 单据类型
			FBillTypeID fBillTypeID = new FBillTypeID();
			fBillTypeID.setFNumber(tbK3SalOutstock.getFbilltypeid());
			model.setFBillTypeID(fBillTypeID);
			// 销售组织
			FSaleOrgId fSaleOrgId = new FSaleOrgId();
			fSaleOrgId.setFNumber(tbK3SalOutstock.getFsaleorgid());
			model.setFSaleOrgId(fSaleOrgId);
			// 客户
			FCustomerID fCustomerID = new FCustomerID();
			fCustomerID.setFNumber(tbK3SalOutstock.getFcustomerid());
			model.setFCustomerID(fCustomerID);
			// 库存组织
			FStockOrgId fStockOrgId = new FStockOrgId();
			fStockOrgId.setFNumber(tbK3SalOutstock.getFstockorgid());
			model.setFStockOrgId(fStockOrgId);
			// set to SubHeadEntity
			model.setSubHeadEntity(subHeadEntity);
			// set to FEntity
			model.setFEntity(fEntityList);
			// add to List
			modelList.add(model);
		}
		//------------------------------------------------------------------------------------------------------//
		// Root Set
		//------------------------------------------------------------------------------------------------------//
		ApiBatchSave root = new ApiBatchSave();
		root.setModel(modelList);
		root.setCreator("test");
		//------------------------------------------------------------------------------------------------------//		
		// Api Call
		//------------------------------------------------------------------------------------------------------//
		callApi(root, tbK3SalOutstocks);
	}
	
	/**
	 * 调用Api
	 * @param root
	 * @param tbK3SalOutstocks
	 * @throws Exception
	 */
	private void callApi(ApiBatchSave root, List<TbK3SalOutstock> tbK3SalOutstocks) throws Exception
	{
		//------------------------------------------------------------------------------------------------------//		
		// Api Call
		//------------------------------------------------------------------------------------------------------//
		String sContent = JSONArray.toJSONString(root, new com.alibaba.fastjson.serializer.PascalNameFilter());
		String sResult = InvokeHelper.BatchSave(FORM_ID, sContent);
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
				TbK3SalOutstock tbK3SalOutstock = tbK3SalOutstocks.get(i);
				tbK3SalOutstock.setFid(oResultId);
				tbK3SalOutstock.setFbillno(oResultNumber);
				tbK3SalOutstock.setTcSyncStatus("SAVE_1");
				tbK3SalOutstock.setTcSyncSaveTime(TimeUtil.getCurrentTime());
				dao.upd(tbK3SalOutstock);
			}
		}
		else
		{
			// JSON格式：
			// "Errors":[{"FieldName":"FCustomerID","Message":"字段“客户”是必填项","DIndex":0},{"FieldName":"FCustomerID","Message":"字段“客户”是必填项","DIndex":1},{"FieldName":"FStockID","Message":"单据体实体【明细信息】第【1】行分录，【仓库】字段必录","DIndex":0},{"FieldName":"FStockID","Message":"单据体实体【明细信息】第【2】行分录，【仓库】字段必录","DIndex":0},{"FieldName":"FStockID","Message":"单据体实体【明细信息】第【3】行分录，【仓库】字段必录","DIndex":0},{"FieldName":"FStockID","Message":"单据体实体【明细信息】第【1】行分录，【仓库】字段必录","DIndex":1},{"FieldName":"FStockID","Message":"单据体实体【明细信息】第【2】行分录，【仓库】字段必录","DIndex":1},{"FieldName":"FStockID","Message":"单据体实体【明细信息】第【3】行分录，【仓库】字段必录","DIndex":1}]
			oResultErrors = oResult.getJSONObject("ResponseStatus").getJSONArray("Errors");
			// update 中间库单据状态和错误信息
			// 收集错误数据
			Map<Integer, TbK3SalOutstock> errorObjs = new HashMap<Integer, TbK3SalOutstock>();
			for (int i=0; i<oResultErrors.size(); i++)
			{
				Integer oResultDIndex = oResultErrors.getJSONObject(i).getInteger("DIndex");
				String oResultMessage = oResultErrors.getJSONObject(i).getString("Message");
				
				TbK3SalOutstock tbK3SalOutstock = tbK3SalOutstocks.get(oResultDIndex);
				tbK3SalOutstock.setTcSyncMsg(tbK3SalOutstock.getTcSyncMsg()+"###"+oResultMessage);
				tbK3SalOutstock.setTcSyncStatus("SAVE_0");
				
				if (errorObjs.containsKey(oResultDIndex))
					errorObjs.replace(oResultDIndex, tbK3SalOutstock);
				else
					errorObjs.put(oResultDIndex, tbK3SalOutstock);
			}
			// 遍历更新同步状态
			errorObjs.forEach((k,v)->{dao.upd(v);});
		}
	}
}
