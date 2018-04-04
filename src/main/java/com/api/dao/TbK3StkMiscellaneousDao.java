package com.api.dao;

import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import chok.devwork.springboot.BaseDao;
import com.api.entity.TbK3StkMiscellaneous;

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
}
