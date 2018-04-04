package com.api.dao;

import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import chok.devwork.springboot.BaseDao;
import com.api.entity.TbK3StkMiscellaneousentry;

@Repository
public class TbK3StkMiscellaneousentryDao extends BaseDao<TbK3StkMiscellaneousentry,Long>
{
	@Resource//(name = "firstSqlSessionTemplate")
	private SqlSession sqlSession;

	@Override
	protected SqlSession getSqlSession()
	{
		return sqlSession;
	}
	
	@Override
	public Class<TbK3StkMiscellaneousentry> getEntityClass()
	{
		return TbK3StkMiscellaneousentry.class;
	}
}
