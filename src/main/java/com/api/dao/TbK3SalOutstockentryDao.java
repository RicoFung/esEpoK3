package com.api.dao;

import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import chok.devwork.springboot.BaseDao;
import com.api.entity.TbK3SalOutstockentry;

@Repository
public class TbK3SalOutstockentryDao extends BaseDao<TbK3SalOutstockentry,Long>
{
	@Resource//(name = "firstSqlSessionTemplate")
	private SqlSession sqlSession;

	@Override
	protected SqlSession getSqlSession()
	{
		return sqlSession;
	}
	
	@Override
	public Class<TbK3SalOutstockentry> getEntityClass()
	{
		return TbK3SalOutstockentry.class;
	}
}
