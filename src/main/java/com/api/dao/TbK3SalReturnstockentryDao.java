package com.api.dao;

import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import chok.devwork.springboot.BaseDao;
import com.api.entity.TbK3SalReturnstockentry;

@Repository
public class TbK3SalReturnstockentryDao extends BaseDao<TbK3SalReturnstockentry,Long>
{
	@Resource//(name = "firstSqlSessionTemplate")
	private SqlSession sqlSession;

	@Override
	protected SqlSession getSqlSession()
	{
		return sqlSession;
	}
	
	@Override
	public Class<TbK3SalReturnstockentry> getEntityClass()
	{
		return TbK3SalReturnstockentry.class;
	}
}
