package com.api.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.api.entity.TbK3SalOutstock;

import chok.devwork.springboot.BaseDao;

@Repository
public class TbK3SalOutstockDao extends BaseDao<TbK3SalOutstock,Long>
{
	@Resource//(name = "firstSqlSessionTemplate")
	private SqlSession sqlSession;

	@Override
	protected SqlSession getSqlSession()
	{
		return sqlSession;
	}
	
	@Override
	public Class<TbK3SalOutstock> getEntityClass()
	{
		return TbK3SalOutstock.class;
	}
	
	@SuppressWarnings("unchecked")
	public List<TbK3SalOutstock> queryPendingPage(Map<String, String> param)
	{
		return (List<TbK3SalOutstock>) this.query("queryPendingPage", param);
	}
}
