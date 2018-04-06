package com.api.entity;

public class BaseK3Objectentry implements java.io.Serializable
{
	// 自定义主键
	protected Long tcRowid;
    // 自定义外键       db_column: TC_DEFINE_ROWID 
	protected java.lang.Long tcDefineRowid;
	
	public Long getTcRowid()
	{
		return tcRowid;
	}
	public void setTcRowid(Long tcRowid)
	{
		this.tcRowid = tcRowid;
	}
	public java.lang.Long getTcDefineRowid()
	{
		return tcDefineRowid;
	}
	public void setTcDefineRowid(java.lang.Long tcDefineRowid)
	{
		this.tcDefineRowid = tcDefineRowid;
	}
}
