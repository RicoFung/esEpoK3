package com.api.entity;

import java.util.List;

/**
 *
 * @author rico
 * @version 1.0
 * @since 1.0
 * */
public class TbK3SalReturnstock extends BaseTbK3Object implements java.io.Serializable
{
    // 单据类型       db_column: FBILLTYPEID 
	private java.lang.String fbilltypeid;
    // 日期       db_column: FDATE 
	private java.lang.String fdate;
    // 退货客户内码       db_column: FRETCUSTID 
	private java.lang.String fretcustid;
    // 收货客户内码       db_column: FRECEIVECUSTID 
	private java.lang.String freceivecustid;
    // 结算客户内码       db_column: FSETTLECUSTID 
	private java.lang.String fsettlecustid;
    // 付款客户内码       db_column: FPAYCUSTID 
	private java.lang.String fpaycustid;
    // 送货单号       db_column: FDELIVERYNO 
	private java.lang.String fdeliveryno;
    // 提货单号       db_column: FTAKEDELIVERYNO 
	private java.lang.String ftakedeliveryno;
    // 库存组织内码       db_column: FSTOCKORGID 
	private java.lang.String fstockorgid;
    // 库存组内码       db_column: FSTOCKERGROUPID 
	private java.lang.String fstockergroupid;
    // 仓库部门内码       db_column: FSTOCKDEPTID 
	private java.lang.String fstockdeptid;
    // 仓管员内码       db_column: FSTOCKERID 
	private java.lang.String fstockerid;
    // 退货原因       db_column: FRETURNREASON 
	private java.lang.String freturnreason;
    // 销售组织内码       db_column: FSALEORGID 
	private java.lang.String fsaleorgid;
    // 销售部门内码       db_column: FSALEDEPTID 
	private java.lang.String fsaledeptid;
    // 销售组内码       db_column: FSALEGROUPID 
	private java.lang.String fsalegroupid;
    // 销售员内码       db_column: FSALESMANID 
	private java.lang.String fsalesmanid;
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
    // 业务类型       db_column: FBUSINESSTYPE 
	private java.lang.String fbusinesstype;
    // 交货地点       db_column: FHEADLOCID 
	private java.lang.String fheadlocid;
    // 交货地址       db_column: FHEADLOCADDRESS 
	private java.lang.String fheadlocaddress;
    // 收货方地址       db_column: FRECEIVEADDRESS 
	private java.lang.String freceiveaddress;
    // 信用检查结果(0:未检查1:信用正常2:预警提示3:密码特批4:取消交易)       db_column: FCREDITCHECKRESULT 
	private java.lang.String fcreditcheckresult;
    // 业务对象类型       db_column: FOBJECTTYPEID 
	private java.lang.String fobjecttypeid;
    // 跨组织业务类型       db_column: FTRANSFERBIZTYPE 
	private java.lang.String ftransferbiztype;
    // 对应组织       db_column: FCORRESPONDORGID 
	private java.lang.String fcorrespondorgid;
    // 收货方联系人       db_column: FRECCONTACTID 
	private java.lang.String freccontactid;
    // 是否跨法人       db_column: FISINTERLEGALPERSON 
	private java.lang.String fisinterlegalperson;
	// 明细
	private List<TbK3SalReturnstockentry> tbK3SalReturnstockentrys;

	public void setFbilltypeid(java.lang.String value) 
	{
		this.fbilltypeid = value;
	}
	
	public java.lang.String getFbilltypeid() 
	{
		return this.fbilltypeid;
	}
	public void setFdate(java.lang.String value) 
	{
		this.fdate = value;
	}
	
	public java.lang.String getFdate() 
	{
		return this.fdate;
	}
	
	public void setFretcustid(java.lang.String value) 
	{
		this.fretcustid = value;
	}
	
	public java.lang.String getFretcustid() 
	{
		return this.fretcustid;
	}
	
	public void setFreceivecustid(java.lang.String value) 
	{
		this.freceivecustid = value;
	}
	
	public java.lang.String getFreceivecustid() 
	{
		return this.freceivecustid;
	}
	public void setFsettlecustid(java.lang.String value) 
	{
		this.fsettlecustid = value;
	}
	
	public java.lang.String getFsettlecustid() 
	{
		return this.fsettlecustid;
	}
	public void setFpaycustid(java.lang.String value) 
	{
		this.fpaycustid = value;
	}
	
	public java.lang.String getFpaycustid() 
	{
		return this.fpaycustid;
	}
	public void setFdeliveryno(java.lang.String value) 
	{
		this.fdeliveryno = value;
	}
	
	public java.lang.String getFdeliveryno() 
	{
		return this.fdeliveryno;
	}
	public void setFtakedeliveryno(java.lang.String value) 
	{
		this.ftakedeliveryno = value;
	}
	
	public java.lang.String getFtakedeliveryno() 
	{
		return this.ftakedeliveryno;
	}
	public void setFstockorgid(java.lang.String value) 
	{
		this.fstockorgid = value;
	}
	
	public java.lang.String getFstockorgid() 
	{
		return this.fstockorgid;
	}
	public void setFstockergroupid(java.lang.String value) 
	{
		this.fstockergroupid = value;
	}
	
	public java.lang.String getFstockergroupid() 
	{
		return this.fstockergroupid;
	}
	public void setFstockdeptid(java.lang.String value) 
	{
		this.fstockdeptid = value;
	}
	
	public java.lang.String getFstockdeptid() 
	{
		return this.fstockdeptid;
	}
	public void setFstockerid(java.lang.String value) 
	{
		this.fstockerid = value;
	}
	
	public java.lang.String getFstockerid() 
	{
		return this.fstockerid;
	}
	public void setFreturnreason(java.lang.String value) 
	{
		this.freturnreason = value;
	}
	
	public java.lang.String getFreturnreason() 
	{
		return this.freturnreason;
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
	public void setFsalegroupid(java.lang.String value) 
	{
		this.fsalegroupid = value;
	}
	
	public java.lang.String getFsalegroupid() 
	{
		return this.fsalegroupid;
	}
	public void setFsalesmanid(java.lang.String value) 
	{
		this.fsalesmanid = value;
	}
	
	public java.lang.String getFsalesmanid() 
	{
		return this.fsalesmanid;
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

	public List<TbK3SalReturnstockentry> getTbK3SalReturnstockentrys()
	{
		return tbK3SalReturnstockentrys;
	}

	public void setTbK3SalReturnstockentrys(List<TbK3SalReturnstockentry> tbK3SalReturnstockentrys)
	{
		this.tbK3SalReturnstockentrys = tbK3SalReturnstockentrys;
	}

}

