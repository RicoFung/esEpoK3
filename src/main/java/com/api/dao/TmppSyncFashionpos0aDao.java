package com.api.dao;

import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.api.entity.TmppSyncFashionpos0a;

import chok.devwork.springboot.BaseDao;

@Repository
public class TmppSyncFashionpos0aDao extends BaseDao<TmppSyncFashionpos0a,Long>
{
	@Resource
	private SqlSession sqlSession;

	@Override
	protected SqlSession getSqlSession()
	{
		return sqlSession;
	}
	
	@Override
	public Class<TmppSyncFashionpos0a> getEntityClass()
	{
		return TmppSyncFashionpos0a.class;
	}
}
