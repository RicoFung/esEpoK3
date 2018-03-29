package com.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import chok.devwork.springboot.BaseDao;
import chok.devwork.springboot.BaseService;
import com.api.dao.TbK3ApiTest0aDao;
import com.api.entity.TbK3ApiTest0a;

@Service
public class TbK3ApiTest0aService extends BaseService<TbK3ApiTest0a,Long>
{
	@Autowired
	private TbK3ApiTest0aDao dao;

	@Override
	public BaseDao<TbK3ApiTest0a,Long> getEntityDao() 
	{
		return dao;
	}
}
