package com.api.entity;

import java.util.List;

/**
 *
 * @author rico
 * @version 1.0
 * @since 1.0
 */
public class TbK3StkMiscellaneous extends BaseTbK3Object implements java.io.Serializable
{
	// 单据类型 db_column: FBILLTYPEID
	private java.lang.String fbilltypeid;
	// 库存组织内码 db_column: FSTOCKORGID
	private java.lang.String fstockorgid;
	// 库存方向('':空General：普通Return：退货) db_column: FSTOCKDIRECT
	private java.lang.String fstockdirect;
	// 供应商 db_column: FSUPPLIERID
	private java.lang.String fsupplierid;
	// 验收人内码 db_column: FACCEPTANCE
	private java.lang.String facceptance;
	// 部门内码 db_column: FDEPTID
	private java.lang.String fdeptid;
	// 币别 db_column: FCURRENCYID
	private java.lang.String fcurrencyid;
	// 本位币 db_column: FBASECURRID
	private java.lang.String fbasecurrid;
	// 汇率类型 db_column: FEXCHANGETYPEID
	private java.lang.String fexchangetypeid;
	// 汇率 db_column: FEXCHANGERATE
	private java.lang.String fexchangerate;
	// 日期 db_column: FDATE
	private java.lang.String fdate;
	// 备注 db_column: FNOTE
	private java.lang.String fnote;
	// 仓管员内码 db_column: FSTOCKERID
	private java.lang.String fstockerid;
	// 库存组内码 db_column: FSTOCKERGROUPID
	private java.lang.String fstockergroupid;
	// 状态(A:新建 Z:暂存 B: 审核中 C: 已审核 D:重新审核) db_column: FDOCUMENTSTATUS
	private java.lang.String fdocumentstatus;
	// 创建人内码 db_column: FCREATORID
	private java.lang.String fcreatorid;
	// 创建日期 db_column: FCREATEDATE
	private java.lang.String fcreatedate;
	// 修改人内码 db_column: FMODIFIERID
	private java.lang.String fmodifierid;
	// 修改日期 db_column: FMODIFYDATE
	private java.lang.String fmodifydate;
	// 审核人内码 db_column: FAPPROVERID
	private java.lang.String fapproverid;
	// 审核日期 db_column: FAPPROVEDATE
	private java.lang.String fapprovedate;
	// 作废状态(A:未作废 B:已作废) db_column: FCANCELSTATUS
	private java.lang.String fcancelstatus;
	// 作废人 db_column: FCANCELLERID
	private java.lang.String fcancellerid;
	// 作废日期 db_column: FCANCELDATE
	private java.lang.String fcanceldate;
	// 货主类型 db_column: FOWNERTYPEID
	private java.lang.String fownertypeid;
	// 货主 db_column: FOWNERID
	private java.lang.String fownerid;
	// 业务对象类型 db_column: FOBJECTTYPEID
	private java.lang.String fobjecttypeid;
	// 跨组织业务类型 db_column: FTRANSFERBIZTYPE
	private java.lang.String ftransferbiztype;
	// 明細
	private List<TbK3StkMiscellaneousentry> entrys;

	public void setFbilltypeid(java.lang.String value)
	{
		this.fbilltypeid = value;
	}

	public java.lang.String getFbilltypeid()
	{
		return this.fbilltypeid;
	}

	public void setFstockorgid(java.lang.String value)
	{
		this.fstockorgid = value;
	}

	public java.lang.String getFstockorgid()
	{
		return this.fstockorgid;
	}

	public void setFstockdirect(java.lang.String value)
	{
		this.fstockdirect = value;
	}

	public java.lang.String getFstockdirect()
	{
		return this.fstockdirect;
	}

	public void setFsupplierid(java.lang.String value)
	{
		this.fsupplierid = value;
	}

	public java.lang.String getFsupplierid()
	{
		return this.fsupplierid;
	}

	public void setFacceptance(java.lang.String value)
	{
		this.facceptance = value;
	}

	public java.lang.String getFacceptance()
	{
		return this.facceptance;
	}

	public void setFdeptid(java.lang.String value)
	{
		this.fdeptid = value;
	}

	public java.lang.String getFdeptid()
	{
		return this.fdeptid;
	}

	public void setFcurrencyid(java.lang.String value)
	{
		this.fcurrencyid = value;
	}

	public java.lang.String getFcurrencyid()
	{
		return this.fcurrencyid;
	}

	public void setFbasecurrid(java.lang.String value)
	{
		this.fbasecurrid = value;
	}

	public java.lang.String getFbasecurrid()
	{
		return this.fbasecurrid;
	}

	public void setFexchangetypeid(java.lang.String value)
	{
		this.fexchangetypeid = value;
	}

	public java.lang.String getFexchangetypeid()
	{
		return this.fexchangetypeid;
	}

	public void setFexchangerate(java.lang.String value)
	{
		this.fexchangerate = value;
	}

	public java.lang.String getFexchangerate()
	{
		return this.fexchangerate;
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

	public void setFdocumentstatus(java.lang.String value)
	{
		this.fdocumentstatus = value;
	}

	public java.lang.String getFdocumentstatus()
	{
		return this.fdocumentstatus;
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

	public List<TbK3StkMiscellaneousentry> getEntrys()
	{
		return entrys;
	}

	public void setEntrys(List<TbK3StkMiscellaneousentry> entrys)
	{
		this.entrys = entrys;
	}

}
