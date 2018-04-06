package com.api.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.api.entity.TbK3SalReturnstock;

import chok.devwork.springboot.BaseDao;

@Repository
public class TbK3SalReturnstockDao extends BaseDao<TbK3SalReturnstock,Long>
{
	@Resource//(name = "firstSqlSessionTemplate")
	private SqlSession sqlSession;

	@Override
	protected SqlSession getSqlSession()
	{
		return sqlSession;
	}
	
	@Override
	public Class<TbK3SalReturnstock> getEntityClass()
	{
		return TbK3SalReturnstock.class;
	}
	
	@SuppressWarnings("unchecked")
	public List<TbK3SalReturnstock> queryPendingPage(Map<String, String> param)
	{
		return (List<TbK3SalReturnstock>) this.query("queryPendingPage", param);
	}
}
