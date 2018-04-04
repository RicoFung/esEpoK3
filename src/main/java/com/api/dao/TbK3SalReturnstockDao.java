package com.api.dao;

import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import chok.devwork.springboot.BaseDao;
import com.api.entity.TbK3SalReturnstock;

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
}
