package com.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import chok.devwork.springboot.BaseDao;
import chok.devwork.springboot.BaseService;
import com.api.dao.TbK3StkMisdeliveryDao;
import com.api.entity.TbK3StkMisdelivery;

@Service
public class TbK3StkMisdeliveryService extends BaseService<TbK3StkMisdelivery,Long>
{
	@Autowired
	private TbK3StkMisdeliveryDao dao;

	@Override
	public BaseDao<TbK3StkMisdelivery,Long> getEntityDao() 
	{
		return dao;
	}
}
