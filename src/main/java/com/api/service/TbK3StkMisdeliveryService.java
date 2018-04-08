package com.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.dao.TbK3StkMisdeliveryDao;
import com.api.entity.TbK3StkMisdelivery;
import com.api.entity.TbK3StkMisdeliveryentry;
import com.api.entity.json.stk.misdelivery.ApiBatchSave;
import com.api.entity.json.stk.misdelivery.FBillTypeID;
import com.api.entity.json.stk.misdelivery.FCustId;
import com.api.entity.json.stk.misdelivery.FDeptId;
import com.api.entity.json.stk.misdelivery.FEntity;
import com.api.entity.json.stk.misdelivery.FMaterialId;
import com.api.entity.json.stk.misdelivery.FStockId;
import com.api.entity.json.stk.misdelivery.FUnitID;
import com.api.entity.json.stk.misdelivery.Model;

import chok.devwork.springboot.BaseDao;

@Service
public class TbK3StkMisdeliveryService extends BaseTbK3Service<TbK3StkMisdelivery,Long>
{
	static Logger log = LoggerFactory.getLogger(TbK3StkMisdeliveryService.class);
	
	private static String FORM_ID = "STK_MisDelivery";
	
	@Autowired
	private TbK3StkMisdeliveryDao dao;

	@Override
	public BaseDao<TbK3StkMisdelivery,Long> getEntityDao() 
	{
		return dao;
	}

	@Override
	public BaseDao<TbK3StkMisdelivery, Long> getTbK3EntityDao()
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
		List<TbK3StkMisdelivery> datas  = dao.queryPendingPage(param);
		//------------------------------------------------------------------------------------------------------//
		// JSON Model []
		//------------------------------------------------------------------------------------------------------//
		List<Model> jsonModels = new ArrayList<Model>();
		for (int i=0; i<datas.size(); i++)
		{
			TbK3StkMisdelivery data = datas.get(i);
			//------------------------------------------------------------------------------------------------------//
			// JSON Model-FEntity []
			//------------------------------------------------------------------------------------------------------//
			List<FEntity> jsonFEntitys = new ArrayList<FEntity>();
			List<TbK3StkMisdeliveryentry> entrys = data.getEntrys();
			for(int j=0; j<entrys.size(); j++)
			{
				TbK3StkMisdeliveryentry entry = entrys.get(j);
				FEntity jsonFEntity = new FEntity();
				// 物料编码
				FMaterialId fMaterialID = new FMaterialId();
				fMaterialID.setFNumber(entry.getFmaterialid());
				jsonFEntity.setFMaterialId(fMaterialID);
				// 库存单位
				FUnitID fUnitID = new FUnitID();
				fUnitID.setFNumber(entry.getFunitid());
				jsonFEntity.setFUnitID(fUnitID);
				// 实发数量
				jsonFEntity.setFQty(entry.getFqty());
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
			// 客戶与部门至少录入一个
			// 客戶
			FCustId fCustId = new FCustId();
			fCustId.setFNumber(data.getFcustid());
			jsonModel.setFCustId(fCustId);
			// 部门
			FDeptId fDEPTID = new FDeptId();
			fDEPTID.setFNumber(data.getFdeptid());
			jsonModel.setFDeptId(fDEPTID);
			
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
		root.setCreator("test");
		//------------------------------------------------------------------------------------------------------//		
		// Api Call
		//------------------------------------------------------------------------------------------------------//
		callApi(FORM_ID, root, datas);
	}
}
