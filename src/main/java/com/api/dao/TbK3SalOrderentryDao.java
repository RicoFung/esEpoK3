package com.api.dao;

import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import chok.devwork.springboot.BaseDao;
import com.api.entity.TbK3SalOrderentry;

@Repository
public class TbK3SalOrderentryDao extends BaseDao<TbK3SalOrderentry,Long>
{
	@Resource//(name = "firstSqlSessionTemplate")
	private SqlSession sqlSession;

	@Override
	protected SqlSession getSqlSession()
	{
		return sqlSession;
	}
	
	@Override
	public Class<TbK3SalOrderentry> getEntityClass()
	{
		return TbK3SalOrderentry.class;
	}
}
