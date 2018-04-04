package com.api.dao;

import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import chok.devwork.springboot.BaseDao;
import com.api.entity.TbK3StkMisdeliveryentry;

@Repository
public class TbK3StkMisdeliveryentryDao extends BaseDao<TbK3StkMisdeliveryentry,Long>
{
	@Resource//(name = "firstSqlSessionTemplate")
	private SqlSession sqlSession;

	@Override
	protected SqlSession getSqlSession()
	{
		return sqlSession;
	}
	
	@Override
	public Class<TbK3StkMisdeliveryentry> getEntityClass()
	{
		return TbK3StkMisdeliveryentry.class;
	}
}
