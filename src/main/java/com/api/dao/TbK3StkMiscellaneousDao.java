package com.api.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.api.entity.TbK3StkMiscellaneous;

import chok.devwork.springboot.BaseDao;

@Repository
public class TbK3StkMiscellaneousDao extends BaseDao<TbK3StkMiscellaneous,Long>
{
	@Resource//(name = "firstSqlSessionTemplate")
	private SqlSession sqlSession;

	@Override
	protected SqlSession getSqlSession()
	{
		return sqlSession;
	}
	
	@Override
	public Class<TbK3StkMiscellaneous> getEntityClass()
	{
		return TbK3StkMiscellaneous.class;
	}
	
	@SuppressWarnings("unchecked")
	public List<TbK3StkMiscellaneous> queryPendingPage(Map<String, String> param)
	{
		return (List<TbK3StkMiscellaneous>) this.query("queryPendingPage", param);
	}
}
