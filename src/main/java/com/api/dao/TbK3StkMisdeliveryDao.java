package com.api.dao;

import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import chok.devwork.springboot.BaseDao;
import com.api.entity.TbK3StkMisdelivery;

@Repository
public class TbK3StkMisdeliveryDao extends BaseDao<TbK3StkMisdelivery,Long>
{
	@Resource//(name = "firstSqlSessionTemplate")
	private SqlSession sqlSession;

	@Override
	protected SqlSession getSqlSession()
	{
		return sqlSession;
	}
	
	@Override
	public Class<TbK3StkMisdelivery> getEntityClass()
	{
		return TbK3StkMisdelivery.class;
	}
}
