package com.api.entity;

import java.util.List;

/**
 *
 * @author rico
 * @version 1.0
 * @since 1.0
 * */
public class TbK3SalOutstock implements java.io.Serializable
{
    // 单据内码       db_column: FID 
	private java.lang.String fid;
    // 单据类型       db_column: FBILLTYPEID 
	private java.lang.String fbilltypeid;
    // 单据编号       db_column: FBILLNO 
	private java.lang.String fbillno;
    // 日期       db_column: FDATE 
	private java.lang.String fdate;
    // 客户内码       db_column: FCUSTOMERID 
	private java.lang.String fcustomerid;
    // 发货组织       db_column: FSTOCKORGID 
	private java.lang.String fstockorgid;
    // 发货部门       db_column: FDELIVERYDEPTID 
	private java.lang.String fdeliverydeptid;
    // 库存组       db_column: FSTOCKERGROUPID 
	private java.lang.String fstockergroupid;
    // 发货员(仓管员)       db_column: FSTOCKERID 
	private java.lang.String fstockerid;
    // 收货方(地点)       db_column: FRECEIVERID 
	private java.lang.String freceiverid;
    // 结算方(地点)       db_column: FSETTLEID 
	private java.lang.String fsettleid;
    // 付款方(地点)       db_column: FPAYERID 
	private java.lang.String fpayerid;
    // 销售组织内码       db_column: FSALEORGID 
	private java.lang.String fsaleorgid;
    // 销售部门内码       db_column: FSALEDEPTID 
	private java.lang.String fsaledeptid;
    // 销售组内码       db_column: FSALESGROUPID 
	private java.lang.String fsalesgroupid;
    // 销售员内码       db_column: FSALESMANID 
	private java.lang.String fsalesmanid;
    // 送货单号       db_column: FDELIVERYBILL 
	private java.lang.String fdeliverybill;
    // 提货单号       db_column: FTAKEDELIVERYBILL 
	private java.lang.String ftakedeliverybill;
    // 承运商       db_column: FCARRIERID 
	private java.lang.String fcarrierid;
    // 运输单号       db_column: FCARRIAGENO 
	private java.lang.String fcarriageno;
    // 业务状态(A:新建 Z:暂存 B: 审核中 C: 已审核 D:重新审核)       db_column: FDOCUMENTSTATUS 
	private java.lang.String fdocumentstatus;
    // 备注       db_column: FNOTE 
	private java.lang.String fnote;
    // 制单人内码       db_column: FCREATORID 
	private java.lang.String fcreatorid;
    // 制单日期       db_column: FCREATEDATE 
	private java.lang.String fcreatedate;
    // 最近修改人内码       db_column: FMODIFIERID 
	private java.lang.String fmodifierid;
    // 最近修改日期       db_column: FMODIFYDATE 
	private java.lang.String fmodifydate;
    // 审核人内码       db_column: FAPPROVERID 
	private java.lang.String fapproverid;
    // 审核日期       db_column: FAPPROVEDATE 
	private java.lang.String fapprovedate;
    // 作废状态(A:未作废 B:已作废)       db_column: FCANCELSTATUS 
	private java.lang.String fcancelstatus;
    // 作废人       db_column: FCANCELLERID 
	private java.lang.String fcancellerid;
    // 作废日期       db_column: FCANCELDATE 
	private java.lang.String fcanceldate;
    // 货主类型       db_column: FOWNERTYPEID 
	private java.lang.String fownertypeid;
    // 货主       db_column: FOWNERID 
	private java.lang.String fownerid;
    // 交货地点内码(废弃)       db_column: FHEADLOCID 
	private java.lang.String fheadlocid;
    // 交货地址       db_column: FHEADLOCADDRESS 
	private java.lang.String fheadlocaddress;
    // 交货地点内码       db_column: FHEADLOCATIONID 
	private java.lang.String fheadlocationid;
    // 业务类型       db_column: FBUSINESSTYPE 
	private java.lang.String fbusinesstype;
    // 收货方地址       db_column: FRECEIVEADDRESS 
	private java.lang.String freceiveaddress;
    // 信用检查结果(枚举:0:未检查1:信用正常2:预警提示3:密码特批4:取消交易)       db_column: FCREDITCHECKRESULT 
	private java.lang.String fcreditcheckresult;
    // 业务对象类型       db_column: FOBJECTTYPEID 
	private java.lang.String fobjecttypeid;
    // 跨组织业务类型       db_column: FTRANSFERBIZTYPE 
	private java.lang.String ftransferbiztype;
    // 对应组织       db_column: FCORRESPONDORGID 
	private java.lang.String fcorrespondorgid;
    // 收货方联系人       db_column: FRECCONTACTID 
	private java.lang.String freccontactid;
    // 是否跨·法人       db_column: FISINTERLEGALPERSON 
	private java.lang.String fisinterlegalperson;
    // 交货明细执行地址(后台用)       db_column: FPLANRECADDRESS 
	private java.lang.String fplanrecaddress;
    // 整单服务或费用       db_column: FISTOTALSERVICEORCOST 
	private java.lang.String fistotalserviceorcost;
    // 自定义主键       db_column: TC_DEFINE_ROWID 
	private java.lang.Long tcDefineRowid;
    // 内审POS 单号       db_column: TC_ERP_CODE 
	private java.lang.String tcErpCode;
    // 写入时间       db_column: TC_ERP_ADD_TIME 
	private java.lang.String tcErpAddTime;
    // 同步状态（null待同步1同步成功0同步失败）       db_column: TC_SYNC_STATUS 
	private java.lang.String tcSyncStatus;
    // 错误信息       db_column: TC_SYNC_MSG 
	private java.lang.String tcSyncMsg = "";
    // 同步SAVE时间       db_column: TC_SYNC_SAVE_TIME 
	private java.lang.String tcSyncSaveTime;
    // 同步SUBMIT时间       db_column: TC_SYNC_SUBMIT_TIME 
	private java.lang.String tcSyncSubmitTime;
    // 同步AUDIT时间       db_column: TC_SYNC_AUDIT_TIME 
	private java.lang.String tcSyncAuditTime;
	// 明细
	private List<TbK3SalOutstockentry> tbK3SalOutstockentrys;

	public TbK3SalOutstock(){
	}

	public TbK3SalOutstock(
		java.lang.String fid,
		java.lang.String fbilltypeid,
		java.lang.String fbillno,
		java.lang.String fdate,
		java.lang.String fcustomerid,
		java.lang.String fstockorgid,
		java.lang.String fdeliverydeptid,
		java.lang.String fstockergroupid,
		java.lang.String fstockerid,
		java.lang.String freceiverid,
		java.lang.String fsettleid,
		java.lang.String fpayerid,
		java.lang.String fsaleorgid,
		java.lang.String fsaledeptid,
		java.lang.String fsalesgroupid,
		java.lang.String fsalesmanid,
		java.lang.String fdeliverybill,
		java.lang.String ftakedeliverybill,
		java.lang.String fcarrierid,
		java.lang.String fcarriageno,
		java.lang.String fdocumentstatus,
		java.lang.String fnote,
		java.lang.String fcreatorid,
		java.lang.String fcreatedate,
		java.lang.String fmodifierid,
		java.lang.String fmodifydate,
		java.lang.String fapproverid,
		java.lang.String fapprovedate,
		java.lang.String fcancelstatus,
		java.lang.String fcancellerid,
		java.lang.String fcanceldate,
		java.lang.String fownertypeid,
		java.lang.String fownerid,
		java.lang.String fheadlocid,
		java.lang.String fheadlocaddress,
		java.lang.String fheadlocationid,
		java.lang.String fbusinesstype,
		java.lang.String freceiveaddress,
		java.lang.String fcreditcheckresult,
		java.lang.String fobjecttypeid,
		java.lang.String ftransferbiztype,
		java.lang.String fcorrespondorgid,
		java.lang.String freccontactid,
		java.lang.String fisinterlegalperson,
		java.lang.String fplanrecaddress,
		java.lang.String fistotalserviceorcost,
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
		this.fcustomerid = fcustomerid;
		this.fstockorgid = fstockorgid;
		this.fdeliverydeptid = fdeliverydeptid;
		this.fstockergroupid = fstockergroupid;
		this.fstockerid = fstockerid;
		this.freceiverid = freceiverid;
		this.fsettleid = fsettleid;
		this.fpayerid = fpayerid;
		this.fsaleorgid = fsaleorgid;
		this.fsaledeptid = fsaledeptid;
		this.fsalesgroupid = fsalesgroupid;
		this.fsalesmanid = fsalesmanid;
		this.fdeliverybill = fdeliverybill;
		this.ftakedeliverybill = ftakedeliverybill;
		this.fcarrierid = fcarrierid;
		this.fcarriageno = fcarriageno;
		this.fdocumentstatus = fdocumentstatus;
		this.fnote = fnote;
		this.fcreatorid = fcreatorid;
		this.fcreatedate = fcreatedate;
		this.fmodifierid = fmodifierid;
		this.fmodifydate = fmodifydate;
		this.fapproverid = fapproverid;
		this.fapprovedate = fapprovedate;
		this.fcancelstatus = fcancelstatus;
		this.fcancellerid = fcancellerid;
		this.fcanceldate = fcanceldate;
		this.fownertypeid = fownertypeid;
		this.fownerid = fownerid;
		this.fheadlocid = fheadlocid;
		this.fheadlocaddress = fheadlocaddress;
		this.fheadlocationid = fheadlocationid;
		this.fbusinesstype = fbusinesstype;
		this.freceiveaddress = freceiveaddress;
		this.fcreditcheckresult = fcreditcheckresult;
		this.fobjecttypeid = fobjecttypeid;
		this.ftransferbiztype = ftransferbiztype;
		this.fcorrespondorgid = fcorrespondorgid;
		this.freccontactid = freccontactid;
		this.fisinterlegalperson = fisinterlegalperson;
		this.fplanrecaddress = fplanrecaddress;
		this.fistotalserviceorcost = fistotalserviceorcost;
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
	public void setFcustomerid(java.lang.String value) 
	{
		this.fcustomerid = value;
	}
	
	public java.lang.String getFcustomerid() 
	{
		return this.fcustomerid;
	}
	public void setFstockorgid(java.lang.String value) 
	{
		this.fstockorgid = value;
	}
	
	public java.lang.String getFstockorgid() 
	{
		return this.fstockorgid;
	}
	public void setFdeliverydeptid(java.lang.String value) 
	{
		this.fdeliverydeptid = value;
	}
	
	public java.lang.String getFdeliverydeptid() 
	{
		return this.fdeliverydeptid;
	}
	public void setFstockergroupid(java.lang.String value) 
	{
		this.fstockergroupid = value;
	}
	
	public java.lang.String getFstockergroupid() 
	{
		return this.fstockergroupid;
	}
	public void setFstockerid(java.lang.String value) 
	{
		this.fstockerid = value;
	}
	
	public java.lang.String getFstockerid() 
	{
		return this.fstockerid;
	}
	public void setFreceiverid(java.lang.String value) 
	{
		this.freceiverid = value;
	}
	
	public java.lang.String getFreceiverid() 
	{
		return this.freceiverid;
	}
	public void setFsettleid(java.lang.String value) 
	{
		this.fsettleid = value;
	}
	
	public java.lang.String getFsettleid() 
	{
		return this.fsettleid;
	}
	public void setFpayerid(java.lang.String value) 
	{
		this.fpayerid = value;
	}
	
	public java.lang.String getFpayerid() 
	{
		return this.fpayerid;
	}
	public void setFsaleorgid(java.lang.String value) 
	{
		this.fsaleorgid = value;
	}
	
	public java.lang.String getFsaleorgid() 
	{
		return this.fsaleorgid;
	}
	public void setFsaledeptid(java.lang.String value) 
	{
		this.fsaledeptid = value;
	}
	
	public java.lang.String getFsaledeptid() 
	{
		return this.fsaledeptid;
	}
	public void setFsalesgroupid(java.lang.String value) 
	{
		this.fsalesgroupid = value;
	}
	
	public java.lang.String getFsalesgroupid() 
	{
		return this.fsalesgroupid;
	}
	public void setFsalesmanid(java.lang.String value) 
	{
		this.fsalesmanid = value;
	}
	
	public java.lang.String getFsalesmanid() 
	{
		return this.fsalesmanid;
	}
	public void setFdeliverybill(java.lang.String value) 
	{
		this.fdeliverybill = value;
	}
	
	public java.lang.String getFdeliverybill() 
	{
		return this.fdeliverybill;
	}
	public void setFtakedeliverybill(java.lang.String value) 
	{
		this.ftakedeliverybill = value;
	}
	
	public java.lang.String getFtakedeliverybill() 
	{
		return this.ftakedeliverybill;
	}
	public void setFcarrierid(java.lang.String value) 
	{
		this.fcarrierid = value;
	}
	
	public java.lang.String getFcarrierid() 
	{
		return this.fcarrierid;
	}
	public void setFcarriageno(java.lang.String value) 
	{
		this.fcarriageno = value;
	}
	
	public java.lang.String getFcarriageno() 
	{
		return this.fcarriageno;
	}
	public void setFdocumentstatus(java.lang.String value) 
	{
		this.fdocumentstatus = value;
	}
	
	public java.lang.String getFdocumentstatus() 
	{
		return this.fdocumentstatus;
	}
	public void setFnote(java.lang.String value) 
	{
		this.fnote = value;
	}
	
	public java.lang.String getFnote() 
	{
		return this.fnote;
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
	public void setFownertypeid(java.lang.String value) 
	{
		this.fownertypeid = value;
	}
	
	public java.lang.String getFownertypeid() 
	{
		return this.fownertypeid;
	}
	public void setFownerid(java.lang.String value) 
	{
		this.fownerid = value;
	}
	
	public java.lang.String getFownerid() 
	{
		return this.fownerid;
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
	public void setFheadlocationid(java.lang.String value) 
	{
		this.fheadlocationid = value;
	}
	
	public java.lang.String getFheadlocationid() 
	{
		return this.fheadlocationid;
	}
	public void setFbusinesstype(java.lang.String value) 
	{
		this.fbusinesstype = value;
	}
	
	public java.lang.String getFbusinesstype() 
	{
		return this.fbusinesstype;
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
	public void setFtransferbiztype(java.lang.String value) 
	{
		this.ftransferbiztype = value;
	}
	
	public java.lang.String getFtransferbiztype() 
	{
		return this.ftransferbiztype;
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
	public void setFisinterlegalperson(java.lang.String value) 
	{
		this.fisinterlegalperson = value;
	}
	
	public java.lang.String getFisinterlegalperson() 
	{
		return this.fisinterlegalperson;
	}
	public void setFplanrecaddress(java.lang.String value) 
	{
		this.fplanrecaddress = value;
	}
	
	public java.lang.String getFplanrecaddress() 
	{
		return this.fplanrecaddress;
	}
	public void setFistotalserviceorcost(java.lang.String value) 
	{
		this.fistotalserviceorcost = value;
	}
	
	public java.lang.String getFistotalserviceorcost() 
	{
		return this.fistotalserviceorcost;
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
	
	public void setTbK3SalOutstockentrys(List<TbK3SalOutstockentry> tbK3SalOutstockentrys)
	{
		this.tbK3SalOutstockentrys = tbK3SalOutstockentrys;
	}

	public List<TbK3SalOutstockentry> getTbK3SalOutstockentrys()
	{
		return tbK3SalOutstockentrys;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("TbK3SalOutstock [fbilltypeid=");
		builder.append(fbilltypeid);
		builder.append(", fcustomerid=");
		builder.append(fcustomerid);
		builder.append(", fstockorgid=");
		builder.append(fstockorgid);
		builder.append(", fsaleorgid=");
		builder.append(fsaleorgid);
		builder.append(", tcDefineRowid=");
		builder.append(tcDefineRowid);
		builder.append(", tcErpCode=");
		builder.append(tcErpCode);
		builder.append(", tcErpAddTime=");
		builder.append(tcErpAddTime);
		builder.append(", tcSyncStatus=");
		builder.append(tcSyncStatus);
		builder.append(", tcSyncMsg=");
		builder.append(tcSyncMsg);
		builder.append(", tcSyncSaveTime=");
		builder.append(tcSyncSaveTime);
		builder.append(", tcSyncSubmitTime=");
		builder.append(tcSyncSubmitTime);
		builder.append(", tcSyncAuditTime=");
		builder.append(tcSyncAuditTime);
		builder.append("]");
		return builder.toString();
	}
	
}
