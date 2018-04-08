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
		// 获取待同步数据
		//------------------------------------------------------------------------------------------------------//
		List<TbK3SalReturnstock> datas = dao.queryPendingPage(param);
		//------------------------------------------------------------------------------------------------------//
		// JSON Model []
		//------------------------------------------------------------------------------------------------------//
		List<Model> jsonModels = new ArrayList<Model>();
		for (int i=0; i<datas.size(); i++)
		{
			TbK3SalReturnstock data = datas.get(i);
			//------------------------------------------------------------------------------------------------------//
			// JSON Model-SubHeadEntity
			//------------------------------------------------------------------------------------------------------//
			SubHeadEntity subHeadEntity = new SubHeadEntity();
			// 结算币别
			FSettleCurrId fSettleCurrID = new FSettleCurrId();
			fSettleCurrID.setFNumber(data.getFsettlecurrid());
			subHeadEntity.setFSettleCurrId(fSettleCurrID);
			// 结算组织
			FSettleOrgId fSettleOrgID = new FSettleOrgId();
			fSettleOrgID.setFNumber(data.getFsettleorgid());
			subHeadEntity.setFSettleOrgId(fSettleOrgID);
			// 汇率
			subHeadEntity.setFExchangeRate(data.getFexchangerate());
			//------------------------------------------------------------------------------------------------------//
			// JSON Model-FEntity []
			//------------------------------------------------------------------------------------------------------//
			List<FEntity> jsonFEntitys = new ArrayList<FEntity>();
			List<TbK3SalReturnstockentry> entrys = data.getEntrys();
			for (int j=0; j<entrys.size(); j++)
			{
				FEntity jsonFEntity = new FEntity();
				TbK3SalReturnstockentry entry = entrys.get(j);
				// 物料编码
				FMaterialId fMaterialID = new FMaterialId();
				fMaterialID.setFNumber(entry.getFmaterialid());
				jsonFEntity.setFMaterialId(fMaterialID);
				// 库存单位
				FUnitID fUnitID = new FUnitID();
				fUnitID.setFNumber(entry.getFunitid());
				jsonFEntity.setFUnitID(fUnitID);
				// 实发数量
				jsonFEntity.setFRealQty(entry.getFrealqty());
				// 货主
				FOwnerId fOwnerID = new FOwnerId();
				fOwnerID.setFNumber(entry.getFownerid());
				jsonFEntity.setFOwnerId(fOwnerID);
				// 仓库
				FStockId fStockID = new FStockId();
				fStockID.setFNumber(entry.getFstockid());
				jsonFEntity.setFStockId(fStockID);
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
			// 退货客户
			FRetcustId fRetcustId = new FRetcustId();
			fRetcustId.setFNumber(data.getFretcustid());
			jsonModel.setFRetcustId(fRetcustId);
			// 库存组织
			FStockOrgId fStockOrgId = new FStockOrgId();
			fStockOrgId.setFNumber(data.getFstockorgid());
			jsonModel.setFStockOrgId(fStockOrgId);
			// set to SubHeadEntity
			jsonModel.setSubHeadEntity(subHeadEntity);
			// set to FEntity
			jsonModel.setFEntity(jsonFEntitys);
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
