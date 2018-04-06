package com.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.dao.TbK3SalReturnstockDao;
import com.api.entity.TbK3SalReturnstock;
import com.api.entity.TbK3SalReturnstockentry;
import com.api.entity.json.sal.returnstock.ApiBatchSave;
import com.api.entity.json.sal.returnstock.FBillTypeID;
import com.api.entity.json.sal.returnstock.FEntity;
import com.api.entity.json.sal.returnstock.FMaterialId;
import com.api.entity.json.sal.returnstock.FOwnerId;
import com.api.entity.json.sal.returnstock.FRetcustId;
import com.api.entity.json.sal.returnstock.FSaleOrgId;
import com.api.entity.json.sal.returnstock.FSettleCurrId;
import com.api.entity.json.sal.returnstock.FSettleOrgId;
import com.api.entity.json.sal.returnstock.FStockId;
import com.api.entity.json.sal.returnstock.FStockOrgId;
import com.api.entity.json.sal.returnstock.FUnitID;
import com.api.entity.json.sal.returnstock.Model;
import com.api.entity.json.sal.returnstock.SubHeadEntity;

import chok.devwork.springboot.BaseDao;

@Service
public class TbK3SalReturnstockService extends BaseTbK3Service<TbK3SalReturnstock,Long>
{
	static Logger log = LoggerFactory.getLogger(TbK3SalReturnstockService.class);
	
	private static String FORM_ID = "SAL_RETURNSTOCK";
	
	@Autowired
	private TbK3SalReturnstockDao dao;

	@Override
	public BaseDao<TbK3SalReturnstock,Long> getEntityDao() 
	{
		return dao;
	}

	@Override
	public BaseDao<TbK3SalReturnstock, Long> getTbK3EntityDao()
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
		List<TbK3SalReturnstock> tbK3SalReturnstocks = dao.queryPendingPage(param);
		//------------------------------------------------------------------------------------------------------//
		// Model-集合
		//------------------------------------------------------------------------------------------------------//
		List<Model> modelList = new ArrayList<Model>();
		for (int i=0; i<tbK3SalReturnstocks.size(); i++)
		{
			TbK3SalReturnstock tbK3SalReturnstock = tbK3SalReturnstocks.get(i);
			//------------------------------------------------------------------------------------------------------//
			// Model-SubHeadEntity
			//------------------------------------------------------------------------------------------------------//
			SubHeadEntity subHeadEntity = new SubHeadEntity();
			// 结算币别
			FSettleCurrId fSettleCurrID = new FSettleCurrId();
			fSettleCurrID.setFNumber("PRE001");
			subHeadEntity.setFSettleCurrId(fSettleCurrID);
			// 结算组织
			FSettleOrgId fSettleOrgID = new FSettleOrgId();
			fSettleOrgID.setFNumber("100");
			subHeadEntity.setFSettleOrgId(fSettleOrgID);
			// 汇率
			subHeadEntity.setFExchangeRate("1");
			//------------------------------------------------------------------------------------------------------//
			// Model-FEntity
			//------------------------------------------------------------------------------------------------------//
			List<FEntity> fEntityList = new ArrayList<FEntity>();
			List<TbK3SalReturnstockentry> tbK3SalReturnstockentrys = tbK3SalReturnstock.getTbK3SalReturnstockentrys();
			for (int j=0; j< tbK3SalReturnstockentrys.size(); j++)
			{
				TbK3SalReturnstockentry tbK3SalReturnstockentry = tbK3SalReturnstockentrys.get(j);
				FEntity fEntity = new FEntity();

				// 物料编码
				FMaterialId fMaterialID = new FMaterialId();
				fMaterialID.setFNumber(tbK3SalReturnstockentry.getFmaterialid());
				fEntity.setFMaterialId(fMaterialID);
				// 库存单位
				FUnitID fUnitID = new FUnitID();
				fUnitID.setFNumber(tbK3SalReturnstockentry.getFunitid());
				fEntity.setFUnitID(fUnitID);
				// 实发数量
				fEntity.setFRealQty(tbK3SalReturnstockentry.getFrealqty());
				// 货主
				FOwnerId fOwnerID = new FOwnerId();
				fOwnerID.setFNumber(tbK3SalReturnstockentry.getFownerid());
				fEntity.setFOwnerId(fOwnerID);
				// 仓库
				FStockId fStockID = new FStockId();
				fStockID.setFNumber(tbK3SalReturnstockentry.getFstockid());
				fEntity.setFStockId(fStockID);
				// add to list
				fEntityList.add(fEntity);
			}
			//------------------------------------------------------------------------------------------------------//
			// Model
			//------------------------------------------------------------------------------------------------------//
			Model model = new Model();
			// 单据类型
			FBillTypeID fBillTypeID = new FBillTypeID();
			fBillTypeID.setFNumber(tbK3SalReturnstock.getFbilltypeid());
			model.setFBillTypeID(fBillTypeID);
			// 销售组织
			FSaleOrgId fSaleOrgId = new FSaleOrgId();
			fSaleOrgId.setFNumber(tbK3SalReturnstock.getFsaleorgid());
			model.setFSaleOrgId(fSaleOrgId);
			// 退货客户
			FRetcustId fRetcustId = new FRetcustId();
			fRetcustId.setFNumber("A001");
			model.setFRetcustId(fRetcustId);
			// 库存组织
			FStockOrgId fStockOrgId = new FStockOrgId();
			fStockOrgId.setFNumber(tbK3SalReturnstock.getFstockorgid());
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
		callApi(FORM_ID, root, tbK3SalReturnstocks);
	}
}
