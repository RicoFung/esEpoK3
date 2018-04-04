package com.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import chok.devwork.springboot.BaseDao;
import chok.devwork.springboot.BaseService;
import com.api.dao.TbK3SalOrderDao;
import com.api.entity.TbK3SalOrder;

@Service
public class TbK3SalOrderService extends BaseService<TbK3SalOrder,Long>
{
	@Autowired
	private TbK3SalOrderDao dao;

	@Override
	public BaseDao<TbK3SalOrder,Long> getEntityDao() 
	{
		return dao;
	}
}
