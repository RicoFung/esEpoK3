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
		List<TbK3SalOrder> tbK3SalOrders = dao.queryPendingPage(param);
		//------------------------------------------------------------------------------------------------------//
		// Model-集合
		//------------------------------------------------------------------------------------------------------//
		List<Model> modelList = new ArrayList<Model>();
		for (int i=0; i<tbK3SalOrders.size(); i++)
		{
			TbK3SalOrder tbK3SalOrder = tbK3SalOrders.get(i);
			//------------------------------------------------------------------------------------------------------//
			// Model-FSaleOrderFinance
			//------------------------------------------------------------------------------------------------------//
			FSaleOrderFinance fSaleOrderFinance = new FSaleOrderFinance();
			// 结算币别
			FSettleCurrId fSettleCurrId = new FSettleCurrId();
			fSettleCurrId.setFNumber("PRE001");
			fSaleOrderFinance.setFSettleCurrId(fSettleCurrId);
			// 汇率
			fSaleOrderFinance.setFExchangeRate("1");
			//------------------------------------------------------------------------------------------------------//
			// Model-FEntity
			//------------------------------------------------------------------------------------------------------//
			List<FSaleOrderEntry> fSaleOrderEntryList = new ArrayList<FSaleOrderEntry>();
			List<TbK3SalOrderentry> tbK3SalOrderentrys = tbK3SalOrder.getTbK3SalOrderentrys();
			for (int j=0; j< tbK3SalOrderentrys.size(); j++)
			{
				TbK3SalOrderentry tbK3SalOrderentry = tbK3SalOrderentrys.get(j);
				FSaleOrderEntry fSaleOrderEntry = new FSaleOrderEntry();
				// 物料编码
				FMaterialId fMaterialId = new FMaterialId();
				fMaterialId.setFNumber(tbK3SalOrderentry.getFmaterialid());
				fSaleOrderEntry.setFMaterialId(fMaterialId);
				// 销售单位
				FUnitID fUnitID = new FUnitID();
				fUnitID.setFNumber(tbK3SalOrderentry.getFunitid());
				fSaleOrderEntry.setFUnitID(fUnitID);
				// 销售数量
				fSaleOrderEntry.setFQty(tbK3SalOrderentry.getFqty());
				// 要货日期
				fSaleOrderEntry.setFDeliveryDate(tbK3SalOrderentry.getFdeliverydate());
				// 结算组织
				FSettleOrgIds fSettleOrgIds = new FSettleOrgIds();
				fSettleOrgIds.setFNumber(tbK3SalOrderentry.getFsettleorgids());
				fSaleOrderEntry.setFSettleOrgIds(fSettleOrgIds);
				// 超发控制单位类型
				fSaleOrderEntry.setFOUTLMTUNIT(tbK3SalOrderentry.getFoutlmtunit());
				// add to list
				fSaleOrderEntryList.add(fSaleOrderEntry);
			}
			//------------------------------------------------------------------------------------------------------//
			// Model
			//------------------------------------------------------------------------------------------------------//
			Model model = new Model();
			// 单据类型
			FBillTypeID fBillTypeID = new FBillTypeID();
			fBillTypeID.setFNumber(tbK3SalOrder.getFbilltypeid());
			model.setFBillTypeID(fBillTypeID);
			// 销售组织
			FSaleOrgId fSaleOrgId = new FSaleOrgId();
			fSaleOrgId.setFNumber(tbK3SalOrder.getFsaleorgid());
			model.setFSaleOrgId(fSaleOrgId);
			// 客戶
			FCustId fCustId = new FCustId();
			fCustId.setFNumber(tbK3SalOrder.getFcustid());
			model.setFCustId(fCustId);
			// 销售员
			FSalerId fSalerId = new FSalerId();
			fSalerId.setFNumber(tbK3SalOrder.getFsalerid());
			model.setFSalerId(fSalerId); 
			// 订单财务信息
			model.setFSaleOrderFinance(fSaleOrderFinance);
			// 订单明细信息
			model.setFSaleOrderEntry(fSaleOrderEntryList);
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
		callApi(FORM_ID, root, tbK3SalOrders);
	}
}
