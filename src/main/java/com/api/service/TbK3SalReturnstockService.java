package com.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import chok.devwork.springboot.BaseDao;
import chok.devwork.springboot.BaseService;
import com.api.dao.TbK3SalReturnstockDao;
import com.api.entity.TbK3SalReturnstock;

@Service
public class TbK3SalReturnstockService extends BaseService<TbK3SalReturnstock,Long>
{
	@Autowired
	private TbK3SalReturnstockDao dao;

	@Override
	public BaseDao<TbK3SalReturnstock,Long> getEntityDao() 
	{
		return dao;
	}
}
