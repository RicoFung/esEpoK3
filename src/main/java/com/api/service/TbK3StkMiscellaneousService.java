package com.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import chok.devwork.springboot.BaseDao;
import chok.devwork.springboot.BaseService;
import com.api.dao.TbK3StkMiscellaneousDao;
import com.api.entity.TbK3StkMiscellaneous;

@Service
public class TbK3StkMiscellaneousService extends BaseService<TbK3StkMiscellaneous,Long>
{
	@Autowired
	private TbK3StkMiscellaneousDao dao;

	@Override
	public BaseDao<TbK3StkMiscellaneous,Long> getEntityDao() 
	{
		return dao;
	}
}
