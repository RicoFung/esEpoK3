package com.api.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.api.entity.TbK3SalOrder;

import chok.devwork.springboot.BaseDao;

@Repository
public class TbK3SalOrderDao extends BaseDao<TbK3SalOrder,Long>
{
	@Resource//(name = "firstSqlSessionTemplate")
	private SqlSession sqlSession;

	@Override
	protected SqlSession getSqlSession()
	{
		return sqlSession;
	}
	
	@Override
	public Class<TbK3SalOrder> getEntityClass()
	{
		return TbK3SalOrder.class;
	}
}
