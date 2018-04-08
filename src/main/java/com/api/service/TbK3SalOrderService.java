package com.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.dao.TbK3SalOrderDao;
import com.api.entity.TbK3SalOrder;
import com.api.entity.TbK3SalOrderentry;
import com.api.entity.json.sal.order.ApiBatchSave;
import com.api.entity.json.sal.order.FBillTypeID;
import com.api.entity.json.sal.order.FCustId;
import com.api.entity.json.sal.order.FMaterialId;
import com.api.entity.json.sal.order.FSaleOrderEntry;
import com.api.entity.json.sal.order.FSaleOrderFinance;
import com.api.entity.json.sal.order.FSaleOrgId;
import com.api.entity.json.sal.order.FSalerId;
import com.api.entity.json.sal.order.FSettleCurrId;
import com.api.entity.json.sal.order.FSettleOrgIds;
import com.api.entity.json.sal.order.FUnitID;
import com.api.entity.json.sal.order.Model;

import chok.devwork.springboot.BaseDao;

@Service
public class TbK3SalOrderService extends BaseTbK3Service<TbK3SalOrder,Long>
{
	static Logger log = LoggerFactory.getLogger(TbK3SalOrderService.class);
	
	private static String FORM_ID = "SAL_SaleOrder";
	
	@Autowired
	private TbK3SalOrderDao dao;

	@Override
	public BaseDao<TbK3SalOrder,Long> getEntityDao() 
	{
		return dao;
	}

	@Override
	public BaseDao<TbK3SalOrder, Long> getTbK3EntityDao()
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
		// 获取待同步数据
		//------------------------------------------------------------------------------------------------------//
		List<TbK3SalOrder> datas = dao.queryPendingPage(param);
		//------------------------------------------------------------------------------------------------------//
		// JSON Model []
		//------------------------------------------------------------------------------------------------------//
		List<Model> jsonModels = new ArrayList<Model>();
		for (int i=0; i<datas.size(); i++)
		{
			TbK3SalOrder data = datas.get(i);
			//------------------------------------------------------------------------------------------------------//
			// Model-FSaleOrderFinance
			//------------------------------------------------------------------------------------------------------//
			FSaleOrderFinance fSaleOrderFinance = new FSaleOrderFinance();
			// 结算币别
			FSettleCurrId fSettleCurrId = new FSettleCurrId();
			fSettleCurrId.setFNumber(data.getFsettlecurrid());
			fSaleOrderFinance.setFSettleCurrId(fSettleCurrId);
			// 汇率
			fSaleOrderFinance.setFExchangeRate(data.getFexchangerate());
			//------------------------------------------------------------------------------------------------------//
			// JSON Model-FEntity []
			//------------------------------------------------------------------------------------------------------//
			List<FSaleOrderEntry> jsonFEntitys = new ArrayList<FSaleOrderEntry>();
			List<TbK3SalOrderentry> entrys = data.getEntrys();
			for (int j=0; j< entrys.size(); j++)
			{
				FSaleOrderEntry jsonFEntity = new FSaleOrderEntry();
				TbK3SalOrderentry entry = entrys.get(j);
				// 物料编码
				FMaterialId fMaterialId = new FMaterialId();
				fMaterialId.setFNumber(entry.getFmaterialid());
				jsonFEntity.setFMaterialId(fMaterialId);
				// 销售单位
				FUnitID fUnitID = new FUnitID();
				fUnitID.setFNumber(entry.getFunitid());
				jsonFEntity.setFUnitID(fUnitID);
				// 销售数量
				jsonFEntity.setFQty(entry.getFqty());
				// 要货日期
				jsonFEntity.setFDeliveryDate(entry.getFdeliverydate());
				// 结算组织
				FSettleOrgIds fSettleOrgIds = new FSettleOrgIds();
				fSettleOrgIds.setFNumber(entry.getFsettleorgids());
				jsonFEntity.setFSettleOrgIds(fSettleOrgIds);
				// 超发控制单位类型
				jsonFEntity.setFOUTLMTUNIT(entry.getFoutlmtunit());
				// add to list
				jsonFEntitys.add(jsonFEntity);
			}
			//------------------------------------------------------------------------------------------------------//
			// JSON Model
			//------------------------------------------------------------------------------------------------------//
			Model jsonModel = new Model();
			// 单据类型
			FBillTypeID fBillTypeID = new FBillTypeID();
			fBillTypeID.setFNumber(data.getFbilltypeid());
			jsonModel.setFBillTypeID(fBillTypeID);
			// 销售组织
			FSaleOrgId fSaleOrgId = new FSaleOrgId();
			fSaleOrgId.setFNumber(data.getFsaleorgid());
			jsonModel.setFSaleOrgId(fSaleOrgId);
			// 客戶
			FCustId fCustId = new FCustId();
			fCustId.setFNumber(data.getFcustid());
			jsonModel.setFCustId(fCustId);
			// 销售员
			FSalerId fSalerId = new FSalerId();
			fSalerId.setFNumber(data.getFsalerid());
			jsonModel.setFSalerId(fSalerId); 
			// 订单财务信息
			jsonModel.setFSaleOrderFinance(fSaleOrderFinance);
			// set to FEntity
			jsonModel.setFSaleOrderEntry(jsonFEntitys);
			// add to List
			jsonModels.add(jsonModel);
		}
		//------------------------------------------------------------------------------------------------------//
		// Root Set
		//------------------------------------------------------------------------------------------------------//
		ApiBatchSave root = new ApiBatchSave();
		root.setModel(jsonModels);
		//------------------------------------------------------------------------------------------------------//		
		// Api Call
		//------------------------------------------------------------------------------------------------------//
		callApi(FORM_ID, root, datas);
	}
}
