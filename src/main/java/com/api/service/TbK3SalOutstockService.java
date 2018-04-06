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
		callApi(FORM_ID, root, tbK3SalOutstocks);
	}
}
