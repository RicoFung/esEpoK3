package com.api.dao;

import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import chok.devwork.springboot.BaseDao;
import com.api.entity.TbK3ApiTest0a;

@Repository
public class TbK3ApiTest0aDao extends BaseDao<TbK3ApiTest0a,Long>
{
	@Resource
	private SqlSession sqlSession;

	@Override
	protected SqlSession getSqlSession()
	{
		return sqlSession;
	}
	
	@Override
	public Class<TbK3ApiTest0a> getEntityClass()
	{
		return TbK3ApiTest0a.class;
	}
}
