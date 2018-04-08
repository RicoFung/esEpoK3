 package com.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

import chok.devwork.springboot.BaseDao;

@Service
public class TbK3SalOutstockService extends BaseTbK3Service<TbK3SalOutstock,Long>
{
	static Logger log = LoggerFactory.getLogger(TbK3SalOutstockService.class);
	
	private static String FORM_ID = "SAL_OUTSTOCK";
	
	@Autowired
	private TbK3SalOutstockDao dao;

	@Override
	public BaseDao<TbK3SalOutstock, Long> getEntityDao() 
	{
		return dao;
	}

	@Override
	public BaseDao<TbK3SalOutstock, Long> getTbK3EntityDao()
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
		List<TbK3SalOutstock> datas = dao.queryPendingPage(param);
		//------------------------------------------------------------------------------------------------------//
		// JSON Model []
		//------------------------------------------------------------------------------------------------------//
		List<Model> jsonModels = new ArrayList<Model>();
		for (int i=0; i<datas.size(); i++)
		{
			TbK3SalOutstock data = datas.get(i);
			//------------------------------------------------------------------------------------------------------//
			// JSON Model-SubHeadEntity
			//------------------------------------------------------------------------------------------------------//
			SubHeadEntity subHeadEntity = new SubHeadEntity();
			// 结算币别
			FSettleCurrID fSettleCurrID = new FSettleCurrID();
			fSettleCurrID.setFNumber(data.getFsettlecurrid());
			subHeadEntity.setFSettleCurrID(fSettleCurrID);
			// 结算组织
			FSettleOrgID fSettleOrgID = new FSettleOrgID();
			fSettleOrgID.setFNumber(data.getFsettleorgid());
			subHeadEntity.setFSettleOrgID(fSettleOrgID);
			//------------------------------------------------------------------------------------------------------//
			// JSON Model-FEntity []
			//------------------------------------------------------------------------------------------------------//
			List<FEntity> jsonFEntitys = new ArrayList<FEntity>();
			List<TbK3SalOutstockentry> entrys = data.getEntrys();
			for (int j=0; j< entrys.size(); j++)
			{
				FEntity jsonFEntity = new FEntity();
				TbK3SalOutstockentry entry = entrys.get(j);
				// 物料编码
				FMaterialID fMaterialID = new FMaterialID();
				fMaterialID.setFNumber(entry.getFmaterialid());
				jsonFEntity.setFMaterialID(fMaterialID);
				// 库存单位
				FUnitID fUnitID = new FUnitID();
				fUnitID.setFNumber(entry.getFunitid());
				jsonFEntity.setFUnitID(fUnitID);
				// 实发数量
				jsonFEntity.setFRealQty(Integer.valueOf(entry.getFrealqty()));
				// 货主
				FOwnerID fOwnerID = new FOwnerID();
				fOwnerID.setFNumber(entry.getFownerid());
				jsonFEntity.setFOwnerID(fOwnerID);
				// 仓库
				FStockID fStockID = new FStockID();
				fStockID.setFNumber(entry.getFstockid());
				jsonFEntity.setFStockID(fStockID);
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
			// 客户
			FCustomerID fCustomerID = new FCustomerID();
			fCustomerID.setFNumber(data.getFcustomerid());
			jsonModel.setFCustomerID(fCustomerID);
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
