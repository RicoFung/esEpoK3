package com.api.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.api.entity.TbK3StkMisdelivery;

import chok.devwork.springboot.BaseDao;

@Repository
public class TbK3StkMisdeliveryDao extends BaseDao<TbK3StkMisdelivery,Long>
{
	@Resource//(name = "firstSqlSessionTemplate")
	private SqlSession sqlSession;

	@Override
	protected SqlSession getSqlSession()
	{
		return sqlSession;
	}
	
	@Override
	public Class<TbK3StkMisdelivery> getEntityClass()
	{
		return TbK3StkMisdelivery.class;
	}
	
	@SuppressWarnings("unchecked")
	public List<TbK3StkMisdelivery> queryPendingPage(Map<String, String> param)
	{
		return (List<TbK3StkMisdelivery>) this.query("queryPendingPage", param);
	}
}
