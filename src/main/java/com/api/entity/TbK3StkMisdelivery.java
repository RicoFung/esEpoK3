package com.api.entity;

/**
 *
 * @author rico
 * @version 1.0
 * @since 1.0
 * */
public class TbK3StkMisdelivery extends BaseTbK3Object implements java.io.Serializable
{
    // 单据内码       db_column: FID 
	private java.lang.String fid;
    // 库存组织内码       db_column: FSTOCKORGID 
	private java.lang.String fstockorgid;
    // 单据类型       db_column: FBILLTYPEID 
	private java.lang.String fbilltypeid;
    // 单据编号       db_column: FBILLNO 
	private java.lang.String fbillno;
    // 业务类型('0' 物料领用'1' 固定资产领用)       db_column: FBIZTYPE 
	private java.lang.String fbiztype;
    // 库存方向(General：普通Return：退货)       db_column: FSTOCKDIRECT 
	private java.lang.String fstockdirect;
    // 客户内码       db_column: FCUSTID 
	private java.lang.String fcustid;
    // 部门内码       db_column: FDEPTID 
	private java.lang.String fdeptid;
    // 本位币       db_column: FBASECURRID 
	private java.lang.String fbasecurrid;
    // 日期       db_column: FDATE 
	private java.lang.String fdate;
    // 备注       db_column: FNOTE 
	private java.lang.String fnote;
    // 领料       db_column: FPICKERID 
	private java.lang.String fpickerid;
    // 仓管员内码       db_column: FSTOCKERID 
	private java.lang.String fstockerid;
    // 库存组内码       db_column: FSTOCKERGROUPID 
	private java.lang.String fstockergroupid;
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
    // 状态('':空Z：暂存A：创建B：审核中C：已审核D：重新审核)       db_column: FDOCUMENTSTATUS 
	private java.lang.String fdocumentstatus;
    // 货主类型       db_column: FOWNERTYPEID 
	private java.lang.String fownertypeid;
    // 货主       db_column: FOWNERID 
	private java.lang.String fownerid;
    // 业务对象类型       db_column: FOBJECTTYPEID 
	private java.lang.String fobjecttypeid;
    // 领料组织       db_column: FPICKORGID 
	private java.lang.String fpickorgid;
    // 跨组织业务类型       db_column: FTRANSFERBIZTYPE 
	private java.lang.String ftransferbiztype;
    // 是否跨法人       db_column: FISINTERLEGALPERSON 
	private java.lang.String fisinterlegalperson;

	public void setFid(java.lang.String value) 
	{
		this.fid = value;
	}
	
	public java.lang.String getFid() 
	{
		return this.fid;
	}
	public void setFstockorgid(java.lang.String value) 
	{
		this.fstockorgid = value;
	}
	
	public java.lang.String getFstockorgid() 
	{
		return this.fstockorgid;
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
	public void setFbiztype(java.lang.String value) 
	{
		this.fbiztype = value;
	}
	
	public java.lang.String getFbiztype() 
	{
		return this.fbiztype;
	}
	public void setFstockdirect(java.lang.String value) 
	{
		this.fstockdirect = value;
	}
	
	public java.lang.String getFstockdirect() 
	{
		return this.fstockdirect;
	}
	public void setFcustid(java.lang.String value) 
	{
		this.fcustid = value;
	}
	
	public java.lang.String getFcustid() 
	{
		return this.fcustid;
	}
	public void setFdeptid(java.lang.String value) 
	{
		this.fdeptid = value;
	}
	
	public java.lang.String getFdeptid() 
	{
		return this.fdeptid;
	}
	public void setFbasecurrid(java.lang.String value) 
	{
		this.fbasecurrid = value;
	}
	
	public java.lang.String getFbasecurrid() 
	{
		return this.fbasecurrid;
	}
	public void setFdate(java.lang.String value) 
	{
		this.fdate = value;
	}
	
	public java.lang.String getFdate() 
	{
		return this.fdate;
	}
	public void setFnote(java.lang.String value) 
	{
		this.fnote = value;
	}
	
	public java.lang.String getFnote() 
	{
		return this.fnote;
	}
	public void setFpickerid(java.lang.String value) 
	{
		this.fpickerid = value;
	}
	
	public java.lang.String getFpickerid() 
	{
		return this.fpickerid;
	}
	public void setFstockerid(java.lang.String value) 
	{
		this.fstockerid = value;
	}
	
	public java.lang.String getFstockerid() 
	{
		return this.fstockerid;
	}
	public void setFstockergroupid(java.lang.String value) 
	{
		this.fstockergroupid = value;
	}
	
	public java.lang.String getFstockergroupid() 
	{
		return this.fstockergroupid;
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
	public void setFdocumentstatus(java.lang.String value) 
	{
		this.fdocumentstatus = value;
	}
	
	public java.lang.String getFdocumentstatus() 
	{
		return this.fdocumentstatus;
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
	public void setFobjecttypeid(java.lang.String value) 
	{
		this.fobjecttypeid = value;
	}
	
	public java.lang.String getFobjecttypeid() 
	{
		return this.fobjecttypeid;
	}
	public void setFpickorgid(java.lang.String value) 
	{
		this.fpickorgid = value;
	}
	
	public java.lang.String getFpickorgid() 
	{
		return this.fpickorgid;
	}
	public void setFtransferbiztype(java.lang.String value) 
	{
		this.ftransferbiztype = value;
	}
	
	public java.lang.String getFtransferbiztype() 
	{
		return this.ftransferbiztype;
	}
	public void setFisinterlegalperson(java.lang.String value) 
	{
		this.fisinterlegalperson = value;
	}
	
	public java.lang.String getFisinterlegalperson() 
	{
		return this.fisinterlegalperson;
	}
}

