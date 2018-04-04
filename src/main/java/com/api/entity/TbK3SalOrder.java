package com.api.entity;

/**
 *
 * @author rico
 * @version 1.0
 * @since 1.0
 * */
public class TbK3SalOrder implements java.io.Serializable
{
    // 单据内码       db_column: FID 
	private java.lang.String fid;
    // 单据类型       db_column: FBILLTYPEID 
	private java.lang.String fbilltypeid;
    // 单据编号       db_column: FBILLNO 
	private java.lang.String fbillno;
    // 销售日期       db_column: FDATE 
	private java.lang.String fdate;
    // 客户       db_column: FCUSTID 
	private java.lang.String fcustid;
    // 销售组织       db_column: FSALEORGID 
	private java.lang.String fsaleorgid;
    // 销售组       db_column: FSALEGROUPID 
	private java.lang.String fsalegroupid;
    // 销售部门       db_column: FSALEDEPTID 
	private java.lang.String fsaledeptid;
    // 销售员       db_column: FSALERID 
	private java.lang.String fsalerid;
    // 创建人内码       db_column: FCREATORID 
	private java.lang.String fcreatorid;
    // 创建日期       db_column: FCREATEDATE 
	private java.lang.String fcreatedate;
    // 最近修改人内码       db_column: FMODIFIERID 
	private java.lang.String fmodifierid;
    // 最新修改日期       db_column: FMODIFYDATE 
	private java.lang.String fmodifydate;
    // 单据状态(A:新建 Z:暂存 B: 审核中 C: 已审核 D:重新审核)       db_column: FDOCUMENTSTATUS 
	private java.lang.String fdocumentstatus;
    // 审核人内码       db_column: FAPPROVERID 
	private java.lang.String fapproverid;
    // 审核日期       db_column: FAPPROVEDATE 
	private java.lang.String fapprovedate;
    // 关闭状态(A:未关闭 B:已关闭)       db_column: FCLOSESTATUS 
	private java.lang.String fclosestatus;
    // 关闭人内码       db_column: FCLOSERID 
	private java.lang.String fcloserid;
    // 关闭日期       db_column: FCLOSEDATE 
	private java.lang.String fclosedate;
    // 作废状态(A:未作废 B:已作废)       db_column: FCANCELSTATUS 
	private java.lang.String fcancelstatus;
    // 作废人内码       db_column: FCANCELLERID 
	private java.lang.String fcancellerid;
    // 作废日期       db_column: FCANCELDATE 
	private java.lang.String fcanceldate;
    // 收货方       db_column: FRECEIVEID 
	private java.lang.String freceiveid;
    // 结算方       db_column: FSETTLEID 
	private java.lang.String fsettleid;
    // 收款方       db_column: FCHARGEID 
	private java.lang.String fchargeid;
    // 版本号       db_column: FVERSIONNO 
	private java.lang.String fversionno;
    // 变更原因       db_column: FCHANGEREASON 
	private java.lang.String fchangereason;
    // 变更日期       db_column: FCHANGEDATE 
	private java.lang.String fchangedate;
    // 变更人       db_column: FCHANGERID 
	private java.lang.String fchangerid;
    // 备注       db_column: FNOTE 
	private java.lang.String fnote;
    // 业务类型(NORMAL:标准销售STRAIGHT:直运销售CONSIGNMENT:寄售SERVICE:服务类销售COMMISSIONED:受托加工销售)       db_column: FBUSINESSTYPE 
	private java.lang.String fbusinesstype;
    // 交货地点内码       db_column: FHEADLOCID 
	private java.lang.String fheadlocid;
    // 交货地址       db_column: FHEADLOCADDRESS 
	private java.lang.String fheadlocaddress;
    // 交货方式(1:送货、2:提货、3:发货)       db_column: FHEADDELIVERYWAY 
	private java.lang.String fheaddeliveryway;
    // 国家       db_column: FCOUNTRY 
	private java.lang.String fcountry;
    // 收货方地址       db_column: FRECEIVEADDRESS 
	private java.lang.String freceiveaddress;
    // 信用检查结果(0:未检查1:信用正常2:预警提示3:密码特批4:取消交易)       db_column: FCREDITCHECKRESULT 
	private java.lang.String fcreditcheckresult;
    // 业务对象类型       db_column: FOBJECTTYPEID 
	private java.lang.String fobjecttypeid;
    // 最终版本(0:未检查1:信用正常2:预警提示3:密码特批4:取消交易)       db_column: FFINALVERSION 
	private java.lang.String ffinalversion;
    // 原始FID       db_column: FORIGINALFID 
	private java.lang.String foriginalfid;
    // 对应组织       db_column: FCORRESPONDORGID 
	private java.lang.String fcorrespondorgid;
    // 收货方联系人       db_column: FRECCONTACTID 
	private java.lang.String freccontactid;
    // 网上订单编号       db_column: FNETORDERBILLNO 
	private java.lang.String fnetorderbillno;
    // 网上订单ID       db_column: FNETORDERBILLID 
	private java.lang.String fnetorderbillid;
    // 商机内码       db_column: FOPPID 
	private java.lang.String foppid;
    // 销售阶段       db_column: FSALEPHASEID 
	private java.lang.String fsalephaseid;
    // 是否期初单据       db_column: FISINIT 
	private java.lang.String fisinit;
    // 来自移动       db_column: FISMOBILE 
	private java.lang.String fismobile;
    // 自定义主键       db_column: TC_DEFINE_ROWID 
	private java.lang.Long tcDefineRowid;
    // 内审POS 单号       db_column: TC_ERP_CODE 
	private java.lang.String tcErpCode;
    // 写入时间       db_column: TC_ERP_ADD_TIME 
	private java.lang.String tcErpAddTime;
    // 同步状态（null待同步1同步成功0同步失败）       db_column: TC_SYNC_STATUS 
	private java.lang.String tcSyncStatus;
    // 错误信息       db_column: TC_SYNC_MSG 
	private java.lang.String tcSyncMsg;
    // 同步SAVE时间       db_column: TC_SYNC_SAVE_TIME 
	private java.lang.String tcSyncSaveTime;
    // 同步SUBMIT时间       db_column: TC_SYNC_SUBMIT_TIME 
	private java.lang.String tcSyncSubmitTime;
    // 同步AUDIT时间       db_column: TC_SYNC_AUDIT_TIME 
	private java.lang.String tcSyncAuditTime;

	public TbK3SalOrder(){
	}

	public TbK3SalOrder(
		java.lang.String fid,
		java.lang.String fbilltypeid,
		java.lang.String fbillno,
		java.lang.String fdate,
		java.lang.String fcustid,
		java.lang.String fsaleorgid,
		java.lang.String fsalegroupid,
		java.lang.String fsaledeptid,
		java.lang.String fsalerid,
		java.lang.String fcreatorid,
		java.lang.String fcreatedate,
		java.lang.String fmodifierid,
		java.lang.String fmodifydate,
		java.lang.String fdocumentstatus,
		java.lang.String fapproverid,
		java.lang.String fapprovedate,
		java.lang.String fclosestatus,
		java.lang.String fcloserid,
		java.lang.String fclosedate,
		java.lang.String fcancelstatus,
		java.lang.String fcancellerid,
		java.lang.String fcanceldate,
		java.lang.String freceiveid,
		java.lang.String fsettleid,
		java.lang.String fchargeid,
		java.lang.String fversionno,
		java.lang.String fchangereason,
		java.lang.String fchangedate,
		java.lang.String fchangerid,
		java.lang.String fnote,
		java.lang.String fbusinesstype,
		java.lang.String fheadlocid,
		java.lang.String fheadlocaddress,
		java.lang.String fheaddeliveryway,
		java.lang.String fcountry,
		java.lang.String freceiveaddress,
		java.lang.String fcreditcheckresult,
		java.lang.String fobjecttypeid,
		java.lang.String ffinalversion,
		java.lang.String foriginalfid,
		java.lang.String fcorrespondorgid,
		java.lang.String freccontactid,
		java.lang.String fnetorderbillno,
		java.lang.String fnetorderbillid,
		java.lang.String foppid,
		java.lang.String fsalephaseid,
		java.lang.String fisinit,
		java.lang.String fismobile,
		java.lang.Long tcDefineRowid,
		java.lang.String tcErpCode,
		java.lang.String tcErpAddTime,
		java.lang.String tcSyncStatus,
		java.lang.String tcSyncMsg,
		java.lang.String tcSyncSaveTime,
		java.lang.String tcSyncSubmitTime,
		java.lang.String tcSyncAuditTime
	)
	{
		this.fid = fid;
		this.fbilltypeid = fbilltypeid;
		this.fbillno = fbillno;
		this.fdate = fdate;
		this.fcustid = fcustid;
		this.fsaleorgid = fsaleorgid;
		this.fsalegroupid = fsalegroupid;
		this.fsaledeptid = fsaledeptid;
		this.fsalerid = fsalerid;
		this.fcreatorid = fcreatorid;
		this.fcreatedate = fcreatedate;
		this.fmodifierid = fmodifierid;
		this.fmodifydate = fmodifydate;
		this.fdocumentstatus = fdocumentstatus;
		this.fapproverid = fapproverid;
		this.fapprovedate = fapprovedate;
		this.fclosestatus = fclosestatus;
		this.fcloserid = fcloserid;
		this.fclosedate = fclosedate;
		this.fcancelstatus = fcancelstatus;
		this.fcancellerid = fcancellerid;
		this.fcanceldate = fcanceldate;
		this.freceiveid = freceiveid;
		this.fsettleid = fsettleid;
		this.fchargeid = fchargeid;
		this.fversionno = fversionno;
		this.fchangereason = fchangereason;
		this.fchangedate = fchangedate;
		this.fchangerid = fchangerid;
		this.fnote = fnote;
		this.fbusinesstype = fbusinesstype;
		this.fheadlocid = fheadlocid;
		this.fheadlocaddress = fheadlocaddress;
		this.fheaddeliveryway = fheaddeliveryway;
		this.fcountry = fcountry;
		this.freceiveaddress = freceiveaddress;
		this.fcreditcheckresult = fcreditcheckresult;
		this.fobjecttypeid = fobjecttypeid;
		this.ffinalversion = ffinalversion;
		this.foriginalfid = foriginalfid;
		this.fcorrespondorgid = fcorrespondorgid;
		this.freccontactid = freccontactid;
		this.fnetorderbillno = fnetorderbillno;
		this.fnetorderbillid = fnetorderbillid;
		this.foppid = foppid;
		this.fsalephaseid = fsalephaseid;
		this.fisinit = fisinit;
		this.fismobile = fismobile;
		this.tcDefineRowid = tcDefineRowid;
		this.tcErpCode = tcErpCode;
		this.tcErpAddTime = tcErpAddTime;
		this.tcSyncStatus = tcSyncStatus;
		this.tcSyncMsg = tcSyncMsg;
		this.tcSyncSaveTime = tcSyncSaveTime;
		this.tcSyncSubmitTime = tcSyncSubmitTime;
		this.tcSyncAuditTime = tcSyncAuditTime;
	}

	public void setFid(java.lang.String value) 
	{
		this.fid = value;
	}
	
	public java.lang.String getFid() 
	{
		return this.fid;
	}
	public void setFbilltypeid(java.lang.String value) 
	{
		this.fbilltypeid = value;
	}
	
	public java.lang.String getFbilltypeid() 
	{
		return this.fbilltypeid;
	}
	public void setFbillno(java.lang.String value) 
	{
		this.fbillno = value;
	}
	
	public java.lang.String getFbillno() 
	{
		return this.fbillno;
	}
	public void setFdate(java.lang.String value) 
	{
		this.fdate = value;
	}
	
	public java.lang.String getFdate() 
	{
		return this.fdate;
	}
	public void setFcustid(java.lang.String value) 
	{
		this.fcustid = value;
	}
	
	public java.lang.String getFcustid() 
	{
		return this.fcustid;
	}
	public void setFsaleorgid(java.lang.String value) 
	{
		this.fsaleorgid = value;
	}
	
	public java.lang.String getFsaleorgid() 
	{
		return this.fsaleorgid;
	}
	public void setFsalegroupid(java.lang.String value) 
	{
		this.fsalegroupid = value;
	}
	
	public java.lang.String getFsalegroupid() 
	{
		return this.fsalegroupid;
	}
	public void setFsaledeptid(java.lang.String value) 
	{
		this.fsaledeptid = value;
	}
	
	public java.lang.String getFsaledeptid() 
	{
		return this.fsaledeptid;
	}
	public void setFsalerid(java.lang.String value) 
	{
		this.fsalerid = value;
	}
	
	public java.lang.String getFsalerid() 
	{
		return this.fsalerid;
	}
	public void setFcreatorid(java.lang.String value) 
	{
		this.fcreatorid = value;
	}
	
	public java.lang.String getFcreatorid() 
	{
		return this.fcreatorid;
	}
	public void setFcreatedate(java.lang.String value) 
	{
		this.fcreatedate = value;
	}
	
	public java.lang.String getFcreatedate() 
	{
		return this.fcreatedate;
	}
	public void setFmodifierid(java.lang.String value) 
	{
		this.fmodifierid = value;
	}
	
	public java.lang.String getFmodifierid() 
	{
		return this.fmodifierid;
	}
	public void setFmodifydate(java.lang.String value) 
	{
		this.fmodifydate = value;
	}
	
	public java.lang.String getFmodifydate() 
	{
		return this.fmodifydate;
	}
	public void setFdocumentstatus(java.lang.String value) 
	{
		this.fdocumentstatus = value;
	}
	
	public java.lang.String getFdocumentstatus() 
	{
		return this.fdocumentstatus;
	}
	public void setFapproverid(java.lang.String value) 
	{
		this.fapproverid = value;
	}
	
	public java.lang.String getFapproverid() 
	{
		return this.fapproverid;
	}
	public void setFapprovedate(java.lang.String value) 
	{
		this.fapprovedate = value;
	}
	
	public java.lang.String getFapprovedate() 
	{
		return this.fapprovedate;
	}
	public void setFclosestatus(java.lang.String value) 
	{
		this.fclosestatus = value;
	}
	
	public java.lang.String getFclosestatus() 
	{
		return this.fclosestatus;
	}
	public void setFcloserid(java.lang.String value) 
	{
		this.fcloserid = value;
	}
	
	public java.lang.String getFcloserid() 
	{
		return this.fcloserid;
	}
	public void setFclosedate(java.lang.String value) 
	{
		this.fclosedate = value;
	}
	
	public java.lang.String getFclosedate() 
	{
		return this.fclosedate;
	}
	public void setFcancelstatus(java.lang.String value) 
	{
		this.fcancelstatus = value;
	}
	
	public java.lang.String getFcancelstatus() 
	{
		return this.fcancelstatus;
	}
	public void setFcancellerid(java.lang.String value) 
	{
		this.fcancellerid = value;
	}
	
	public java.lang.String getFcancellerid() 
	{
		return this.fcancellerid;
	}
	public void setFcanceldate(java.lang.String value) 
	{
		this.fcanceldate = value;
	}
	
	public java.lang.String getFcanceldate() 
	{
		return this.fcanceldate;
	}
	public void setFreceiveid(java.lang.String value) 
	{
		this.freceiveid = value;
	}
	
	public java.lang.String getFreceiveid() 
	{
		return this.freceiveid;
	}
	public void setFsettleid(java.lang.String value) 
	{
		this.fsettleid = value;
	}
	
	public java.lang.String getFsettleid() 
	{
		return this.fsettleid;
	}
	public void setFchargeid(java.lang.String value) 
	{
		this.fchargeid = value;
	}
	
	public java.lang.String getFchargeid() 
	{
		return this.fchargeid;
	}
	public void setFversionno(java.lang.String value) 
	{
		this.fversionno = value;
	}
	
	public java.lang.String getFversionno() 
	{
		return this.fversionno;
	}
	public void setFchangereason(java.lang.String value) 
	{
		this.fchangereason = value;
	}
	
	public java.lang.String getFchangereason() 
	{
		return this.fchangereason;
	}
	public void setFchangedate(java.lang.String value) 
	{
		this.fchangedate = value;
	}
	
	public java.lang.String getFchangedate() 
	{
		return this.fchangedate;
	}
	public void setFchangerid(java.lang.String value) 
	{
		this.fchangerid = value;
	}
	
	public java.lang.String getFchangerid() 
	{
		return this.fchangerid;
	}
	public void setFnote(java.lang.String value) 
	{
		this.fnote = value;
	}
	
	public java.lang.String getFnote() 
	{
		return this.fnote;
	}
	public void setFbusinesstype(java.lang.String value) 
	{
		this.fbusinesstype = value;
	}
	
	public java.lang.String getFbusinesstype() 
	{
		return this.fbusinesstype;
	}
	public void setFheadlocid(java.lang.String value) 
	{
		this.fheadlocid = value;
	}
	
	public java.lang.String getFheadlocid() 
	{
		return this.fheadlocid;
	}
	public void setFheadlocaddress(java.lang.String value) 
	{
		this.fheadlocaddress = value;
	}
	
	public java.lang.String getFheadlocaddress() 
	{
		return this.fheadlocaddress;
	}
	public void setFheaddeliveryway(java.lang.String value) 
	{
		this.fheaddeliveryway = value;
	}
	
	public java.lang.String getFheaddeliveryway() 
	{
		return this.fheaddeliveryway;
	}
	public void setFcountry(java.lang.String value) 
	{
		this.fcountry = value;
	}
	
	public java.lang.String getFcountry() 
	{
		return this.fcountry;
	}
	public void setFreceiveaddress(java.lang.String value) 
	{
		this.freceiveaddress = value;
	}
	
	public java.lang.String getFreceiveaddress() 
	{
		return this.freceiveaddress;
	}
	public void setFcreditcheckresult(java.lang.String value) 
	{
		this.fcreditcheckresult = value;
	}
	
	public java.lang.String getFcreditcheckresult() 
	{
		return this.fcreditcheckresult;
	}
	public void setFobjecttypeid(java.lang.String value) 
	{
		this.fobjecttypeid = value;
	}
	
	public java.lang.String getFobjecttypeid() 
	{
		return this.fobjecttypeid;
	}
	public void setFfinalversion(java.lang.String value) 
	{
		this.ffinalversion = value;
	}
	
	public java.lang.String getFfinalversion() 
	{
		return this.ffinalversion;
	}
	public void setForiginalfid(java.lang.String value) 
	{
		this.foriginalfid = value;
	}
	
	public java.lang.String getForiginalfid() 
	{
		return this.foriginalfid;
	}
	public void setFcorrespondorgid(java.lang.String value) 
	{
		this.fcorrespondorgid = value;
	}
	
	public java.lang.String getFcorrespondorgid() 
	{
		return this.fcorrespondorgid;
	}
	public void setFreccontactid(java.lang.String value) 
	{
		this.freccontactid = value;
	}
	
	public java.lang.String getFreccontactid() 
	{
		return this.freccontactid;
	}
	public void setFnetorderbillno(java.lang.String value) 
	{
		this.fnetorderbillno = value;
	}
	
	public java.lang.String getFnetorderbillno() 
	{
		return this.fnetorderbillno;
	}
	public void setFnetorderbillid(java.lang.String value) 
	{
		this.fnetorderbillid = value;
	}
	
	public java.lang.String getFnetorderbillid() 
	{
		return this.fnetorderbillid;
	}
	public void setFoppid(java.lang.String value) 
	{
		this.foppid = value;
	}
	
	public java.lang.String getFoppid() 
	{
		return this.foppid;
	}
	public void setFsalephaseid(java.lang.String value) 
	{
		this.fsalephaseid = value;
	}
	
	public java.lang.String getFsalephaseid() 
	{
		return this.fsalephaseid;
	}
	public void setFisinit(java.lang.String value) 
	{
		this.fisinit = value;
	}
	
	public java.lang.String getFisinit() 
	{
		return this.fisinit;
	}
	public void setFismobile(java.lang.String value) 
	{
		this.fismobile = value;
	}
	
	public java.lang.String getFismobile() 
	{
		return this.fismobile;
	}
	public void setTcDefineRowid(java.lang.Long value) 
	{
		this.tcDefineRowid = value;
	}
	
	public java.lang.Long getTcDefineRowid() 
	{
		return this.tcDefineRowid;
	}
	public void setTcErpCode(java.lang.String value) 
	{
		this.tcErpCode = value;
	}
	
	public java.lang.String getTcErpCode() 
	{
		return this.tcErpCode;
	}
	public void setTcErpAddTime(java.lang.String value) 
	{
		this.tcErpAddTime = value;
	}
	
	public java.lang.String getTcErpAddTime() 
	{
		return this.tcErpAddTime;
	}
	public void setTcSyncStatus(java.lang.String value) 
	{
		this.tcSyncStatus = value;
	}
	
	public java.lang.String getTcSyncStatus() 
	{
		return this.tcSyncStatus;
	}
	public void setTcSyncMsg(java.lang.String value) 
	{
		this.tcSyncMsg = value;
	}
	
	public java.lang.String getTcSyncMsg() 
	{
		return this.tcSyncMsg;
	}
	public void setTcSyncSaveTime(java.lang.String value) 
	{
		this.tcSyncSaveTime = value;
	}
	
	public java.lang.String getTcSyncSaveTime() 
	{
		return this.tcSyncSaveTime;
	}
	public void setTcSyncSubmitTime(java.lang.String value) 
	{
		this.tcSyncSubmitTime = value;
	}
	
	public java.lang.String getTcSyncSubmitTime() 
	{
		return this.tcSyncSubmitTime;
	}
	public void setTcSyncAuditTime(java.lang.String value) 
	{
		this.tcSyncAuditTime = value;
	}
	
	public java.lang.String getTcSyncAuditTime() 
	{
		return this.tcSyncAuditTime;
	}
}

