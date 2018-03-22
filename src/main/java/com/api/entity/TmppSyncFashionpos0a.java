package com.api.entity;

/**
 *
 * @author rico
 * @version 1.0
 * @since 1.0
 * */
public class TmppSyncFashionpos0a implements java.io.Serializable
{
    // tcRowid       db_column: TC_ROWID 
	private java.lang.Long tcRowid;
    // tcOne       db_column: TC_ONE 
	private java.lang.String tcOne;
    // tcTwo       db_column: TC_TWO 
	private java.lang.String tcTwo;
    // tcThird       db_column: TC_THIRD 
	private java.lang.String tcThird;
    // tcAddUser       db_column: TC_ADD_USER 
	private java.lang.String tcAddUser;
    // tcAddTime       db_column: TC_ADD_TIME 
	private java.lang.Long tcAddTime;
    // tcUpdateUser       db_column: TC_UPDATE_USER 
	private java.lang.String tcUpdateUser;
    // tcUpdateTime       db_column: TC_UPDATE_TIME 
	private java.lang.Long tcUpdateTime;

	public TmppSyncFashionpos0a(){
	}

	public TmppSyncFashionpos0a(
		java.lang.Long tcRowid,
		java.lang.String tcOne,
		java.lang.String tcTwo,
		java.lang.String tcThird,
		java.lang.String tcAddUser,
		java.lang.Long tcAddTime,
		java.lang.String tcUpdateUser,
		java.lang.Long tcUpdateTime
	)
	{
		this.tcRowid = tcRowid;
		this.tcOne = tcOne;
		this.tcTwo = tcTwo;
		this.tcThird = tcThird;
		this.tcAddUser = tcAddUser;
		this.tcAddTime = tcAddTime;
		this.tcUpdateUser = tcUpdateUser;
		this.tcUpdateTime = tcUpdateTime;
	}

	public void setTcRowid(java.lang.Long value) 
	{
		this.tcRowid = value;
	}
	
	public java.lang.Long getTcRowid() 
	{
		return this.tcRowid;
	}
	public void setTcOne(java.lang.String value) 
	{
		this.tcOne = value;
	}
	
	public java.lang.String getTcOne() 
	{
		return this.tcOne;
	}
	public void setTcTwo(java.lang.String value) 
	{
		this.tcTwo = value;
	}
	
	public java.lang.String getTcTwo() 
	{
		return this.tcTwo;
	}
	public void setTcThird(java.lang.String value) 
	{
		this.tcThird = value;
	}
	
	public java.lang.String getTcThird() 
	{
		return this.tcThird;
	}
	public void setTcAddUser(java.lang.String value) 
	{
		this.tcAddUser = value;
	}
	
	public java.lang.String getTcAddUser() 
	{
		return this.tcAddUser;
	}
	public void setTcAddTime(java.lang.Long value) 
	{
		this.tcAddTime = value;
	}
	
	public java.lang.Long getTcAddTime() 
	{
		return this.tcAddTime;
	}
	public void setTcUpdateUser(java.lang.String value) 
	{
		this.tcUpdateUser = value;
	}
	
	public java.lang.String getTcUpdateUser() 
	{
		return this.tcUpdateUser;
	}
	public void setTcUpdateTime(java.lang.Long value) 
	{
		this.tcUpdateTime = value;
	}
	
	public java.lang.Long getTcUpdateTime() 
	{
		return this.tcUpdateTime;
	}
}

