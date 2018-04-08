package com.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.dao.TbK3StkMiscellaneousDao;
import com.api.entity.TbK3StkMiscellaneous;
import com.api.entity.TbK3StkMiscellaneousentry;
import com.api.entity.json.stk.miscellaneous.ApiBatchSave;
import com.api.entity.json.stk.miscellaneous.FBillTypeID;
import com.api.entity.json.stk.miscellaneous.FDEPTID;
import com.api.entity.json.stk.miscellaneous.FEntity;
import com.api.entity.json.stk.miscellaneous.FMATERIALID;
import com.api.entity.json.stk.miscellaneous.FSTOCKID;
import com.api.entity.json.stk.miscellaneous.FSUPPLIERID;
import com.api.entity.json.stk.miscellaneous.FUnitID;
import com.api.entity.json.stk.miscellaneous.Model;

import chok.devwork.springboot.BaseDao;

@Service
public class TbK3StkMiscellaneousService extends BaseTbK3Service<TbK3StkMiscellaneous,Long>
{
	static Logger log = LoggerFactory.getLogger(TbK3StkMiscellaneousService.class);
	
	private static String FORM_ID = "STK_MISCELLANEOUS";
	
	@Autowired
	private TbK3StkMiscellaneousDao dao;

	@Override
	public BaseDao<TbK3StkMiscellaneous,Long> getEntityDao() 
	{
		return dao;
	}

	@Override
	public BaseDao<TbK3StkMiscellaneous, Long> getTbK3EntityDao()
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
		List<TbK3StkMiscellaneous> datas  = dao.queryPendingPage(param);
		//------------------------------------------------------------------------------------------------------//
		// JSON Model []
		//------------------------------------------------------------------------------------------------------//
		List<Model> jsonModels = new ArrayList<Model>();
		for (int i=0; i<datas.size(); i++)
		{
			TbK3StkMiscellaneous data = datas.get(i);
			//------------------------------------------------------------------------------------------------------//
			// JSON Model-FEntity []
			//------------------------------------------------------------------------------------------------------//
			List<FEntity> jsonFEntitys = new ArrayList<FEntity>();
			List<TbK3StkMiscellaneousentry> entrys = data.getEntrys();
			for(int j=0; j<entrys.size(); j++)
			{
				TbK3StkMiscellaneousentry entry = entrys.get(j);
				FEntity jsonFEntity = new FEntity();
				// 物料编码
				FMATERIALID fMaterialID = new FMATERIALID();
				fMaterialID.setFNumber(entry.getFmaterialid());
				jsonFEntity.setFMATERIALID(fMaterialID);
				// 库存单位
				FUnitID fUnitID = new FUnitID();
				fUnitID.setFNumber(entry.getFunitid());
				jsonFEntity.setFUnitID(fUnitID);
				// 实发数量
				jsonFEntity.setFQty(Integer.valueOf(entry.getFqty()));
				// 仓库
				FSTOCKID fStockID = new FSTOCKID();
				fStockID.setFNumber(entry.getFstockid());
				jsonFEntity.setFSTOCKID(fStockID);
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
			// 供应商与部门至少录入一个
			// 供应商
			FSUPPLIERID fSUPPLIERID = new FSUPPLIERID();
			fSUPPLIERID.setFNumber(data.getFsupplierid());
			jsonModel.setFSUPPLIERID(fSUPPLIERID);
			// 部门
			FDEPTID fDEPTID = new FDEPTID();
			fDEPTID.setFNumber(data.getFdeptid());
			jsonModel.setFDEPTID(fDEPTID);
			
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
