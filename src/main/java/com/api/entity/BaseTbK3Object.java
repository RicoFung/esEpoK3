package com.api.entity;

public class BaseTbK3Object implements java.io.Serializable
{
    // 单据内码       db_column: FID 
	private java.lang.String fid;
    // 单据编号       db_column: FBILLNO 
	private java.lang.String fbillno;
    // 自定义主键       db_column: TC_DEFINE_ROWID 
	protected java.lang.Long tcDefineRowid;
    // 内审POS 单号       db_column: TC_ERP_CODE 
	protected java.lang.String tcErpCode;
    // 写入时间       db_column: TC_ERP_ADD_TIME 
	protected java.lang.String tcErpAddTime;
    // 同步状态（null待同步1同步成功0同步失败）       db_column: TC_SYNC_STATUS 
	protected java.lang.String tcSyncStatus;
    // 错误信息       db_column: TC_SYNC_MSG 
	protected java.lang.String tcSyncMsg = "";
    // 同步SAVE时间       db_column: TC_SYNC_SAVE_TIME 
	protected java.lang.String tcSyncSaveTime;
    // 同步SUBMIT时间       db_column: TC_SYNC_SUBMIT_TIME 
	protected java.lang.String tcSyncSubmitTime;
    // 同步AUDIT时间       db_column: TC_SYNC_AUDIT_TIME 
	protected java.lang.String tcSyncAuditTime;
	
	public java.lang.String getFid()
	{
		return fid;
	}
	public void setFid(java.lang.String fid)
	{
		this.fid = fid;
	}
	public java.lang.String getFbillno()
	{
		return fbillno;
	}
	public void setFbillno(java.lang.String fbillno)
	{
		this.fbillno = fbillno;
	}
	public java.lang.Long getTcDefineRowid()
	{
		return tcDefineRowid;
	}
	public void setTcDefineRowid(java.lang.Long tcDefineRowid)
	{
		this.tcDefineRowid = tcDefineRowid;
	}
	public java.lang.String getTcErpCode()
	{
		return tcErpCode;
	}
	public void setTcErpCode(java.lang.String tcErpCode)
	{
		this.tcErpCode = tcErpCode;
	}
	public java.lang.String getTcErpAddTime()
	{
		return tcErpAddTime;
	}
	public void setTcErpAddTime(java.lang.String tcErpAddTime)
	{
		this.tcErpAddTime = tcErpAddTime;
	}
	public java.lang.String getTcSyncStatus()
	{
		return tcSyncStatus;
	}
	public void setTcSyncStatus(java.lang.String tcSyncStatus)
	{
		this.tcSyncStatus = tcSyncStatus;
	}
	public java.lang.String getTcSyncMsg()
	{
		return tcSyncMsg;
	}
	public void setTcSyncMsg(java.lang.String tcSyncMsg)
	{
		this.tcSyncMsg = tcSyncMsg;
	}
	public java.lang.String getTcSyncSaveTime()
	{
		return tcSyncSaveTime;
	}
	public void setTcSyncSaveTime(java.lang.String tcSyncSaveTime)
	{
		this.tcSyncSaveTime = tcSyncSaveTime;
	}
	public java.lang.String getTcSyncSubmitTime()
	{
		return tcSyncSubmitTime;
	}
	public void setTcSyncSubmitTime(java.lang.String tcSyncSubmitTime)
	{
		this.tcSyncSubmitTime = tcSyncSubmitTime;
	}
	public java.lang.String getTcSyncAuditTime()
	{
		return tcSyncAuditTime;
	}
	public void setTcSyncAuditTime(java.lang.String tcSyncAuditTime)
	{
		this.tcSyncAuditTime = tcSyncAuditTime;
	}
}
