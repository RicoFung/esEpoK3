package com.api.entity;

/**
 *
 * @author rico
 * @version 1.0
 * @since 1.0
 * */
public class TbK3SalOrderentry implements java.io.Serializable
{
    // 分录内码       db_column: FENTRYID 
	private java.lang.String fentryid;
    // 单据内码       db_column: FID 
	private java.lang.String fid;
    // 序号       db_column: FSEQ 
	private java.lang.String fseq;
    // 对应编码       db_column: FMAPID 
	private java.lang.String fmapid;
    // 对应名称       db_column: FMAPNAME 
	private java.lang.String fmapname;
    // 物料       db_column: FMATERIALID 
	private java.lang.String fmaterialid;
    // 物料辅助属性纬度内码       db_column: FAUXPROPID 
	private java.lang.String fauxpropid;
    // BOM编号       db_column: FBOMID 
	private java.lang.String fbomid;
    // 单位内码       db_column: FUNITID 
	private java.lang.String funitid;
    // 数量       db_column: FQTY 
	private java.lang.String fqty;
    // 基本单位内码       db_column: FBASEUNITID 
	private java.lang.String fbaseunitid;
    // 基本单位数量       db_column: FBASEUNITQTY 
	private java.lang.String fbaseunitqty;
    // 备注       db_column: FNOTE 
	private java.lang.String fnote;
    // 业务冻结(A:正常 B:业务冻结)       db_column: FMRPFREEZESTATUS 
	private java.lang.String fmrpfreezestatus;
    // 冻结日期       db_column: FFREEZEDATE 
	private java.lang.String ffreezedate;
    // 冻结人       db_column: FFREEZERID 
	private java.lang.String ffreezerid;
    // 业务终止(A:正常 B:业务终止)       db_column: FMRPTERMINATESTATUS 
	private java.lang.String fmrpterminatestatus;
    // 终止人       db_column: FTERMINATERID 
	private java.lang.String fterminaterid;
    // 终止状态(A：正常 B：业务终止)       db_column: FTERMINATESTATUS 
	private java.lang.String fterminatestatus;
    // 终止日期       db_column: FTERMINATEDATE 
	private java.lang.String fterminatedate;
    // 业务关闭(A:正常 B:业务关闭)       db_column: FMRPCLOSESTATUS 
	private java.lang.String fmrpclosestatus;
    // 批号       db_column: FLOT 
	private java.lang.String flot;
    // 变更标志(A:变更中 B:已变更)       db_column: FCHANGEFLAG 
	private java.lang.String fchangeflag;
    // 库存组织       db_column: FSTOCKORGID 
	private java.lang.String fstockorgid;
    // 仓库       db_column: FSTOCKID 
	private java.lang.String fstockid;
    // 锁库/预留数量       db_column: FLOCKQTY 
	private java.lang.String flockqty;
    // 锁库标志       db_column: FLOCKFLAG 
	private java.lang.String flockflag;
    // 货主类型       db_column: FOWNERTYPEID 
	private java.lang.String fownertypeid;
    // 货主       db_column: FOWNERID 
	private java.lang.String fownerid;
    // 批号文本       db_column: FLOT_TEXT 
	private java.lang.String flotText;
    // 生产日期       db_column: FPRODUCEDATE 
	private java.lang.String fproducedate;
    // 到期日       db_column: FEXPIRYDATE 
	private java.lang.String fexpirydate;
    // 保质期单位       db_column: FEXPUNIT 
	private java.lang.String fexpunit;
    // 保质期       db_column: FEXPPERIOD 
	private java.lang.String fexpperiod;
    // 退补类型(退回:RETURN补货:SEND)       db_column: FRETURNTYPE 
	private java.lang.String freturntype;
    // 业务流程       db_column: FBFLOWID 
	private java.lang.String fbflowid;
    // 需求优先级       db_column: FPRIORITY 
	private java.lang.String fpriority;
    // 计划跟踪号       db_column: FMTONO 
	private java.lang.String fmtono;
    // 预留类型       db_column: FRESERVETYPE 
	private java.lang.String freservetype;
    // 计划发货日期(=交货计划里最小的计划发货日期)       db_column: FPLANDELIVERYDATE 
	private java.lang.String fplandeliverydate;
    // 发货状态（移动销售用）       db_column: FDELIVERYSTATUS 
	private java.lang.String fdeliverystatus;
    // 原数量       db_column: FOLDQTY 
	private java.lang.String foldqty;
    // 促销匹配类型(0: 非赠品促销匹配1: 赠品促销匹配2: 换赠品促销匹配)       db_column: FPROMOTIONMATCHTYPE 
	private java.lang.String fpromotionmatchtype;
    // 供应组织       db_column: FSUPPLYORGID 
	private java.lang.String fsupplyorgid;
    // 网上订单分录ID       db_column: FNETORDERENTRYID 
	private java.lang.String fnetorderentryid;
    // 库存单位       db_column: FSTOCKUNITID 
	private java.lang.String fstockunitid;
    // 库存数量       db_column: FSTOCKQTY 
	private java.lang.String fstockqty;
    // 库存基本数量       db_column: FSTOCKBASEQTY 
	private java.lang.String fstockbaseqty;
    // 待锁定/待预留       db_column: FLEFTQTY 
	private java.lang.String fleftqty;
    // 要货日期       db_column: FDELIVERYDATE 
	private java.lang.String fdeliverydate;
    // 结算组织       db_column: FSETTLEORGIDS 
	private java.lang.String fsettleorgids;
    // 超发控制单位类型       db_column: FOUTLMTUNIT 
	private java.lang.String foutlmtunit;
    // 自定义外键       db_column: TC_DEFINE_ROWID 
	private java.lang.Long tcDefineRowid;

	public TbK3SalOrderentry(){
	}

	public TbK3SalOrderentry(
		java.lang.String fentryid,
		java.lang.String fid,
		java.lang.String fseq,
		java.lang.String fmapid,
		java.lang.String fmapname,
		java.lang.String fmaterialid,
		java.lang.String fauxpropid,
		java.lang.String fbomid,
		java.lang.String funitid,
		java.lang.String fqty,
		java.lang.String fbaseunitid,
		java.lang.String fbaseunitqty,
		java.lang.String fnote,
		java.lang.String fmrpfreezestatus,
		java.lang.String ffreezedate,
		java.lang.String ffreezerid,
		java.lang.String fmrpterminatestatus,
		java.lang.String fterminaterid,
		java.lang.String fterminatestatus,
		java.lang.String fterminatedate,
		java.lang.String fmrpclosestatus,
		java.lang.String flot,
		java.lang.String fchangeflag,
		java.lang.String fstockorgid,
		java.lang.String fstockid,
		java.lang.String flockqty,
		java.lang.String flockflag,
		java.lang.String fownertypeid,
		java.lang.String fownerid,
		java.lang.String flotText,
		java.lang.String fproducedate,
		java.lang.String fexpirydate,
		java.lang.String fexpunit,
		java.lang.String fexpperiod,
		java.lang.String freturntype,
		java.lang.String fbflowid,
		java.lang.String fpriority,
		java.lang.String fmtono,
		java.lang.String freservetype,
		java.lang.String fplandeliverydate,
		java.lang.String fdeliverystatus,
		java.lang.String foldqty,
		java.lang.String fpromotionmatchtype,
		java.lang.String fsupplyorgid,
		java.lang.String fnetorderentryid,
		java.lang.String fstockunitid,
		java.lang.String fstockqty,
		java.lang.String fstockbaseqty,
		java.lang.String fleftqty,
		java.lang.String fdeliverydate,
		java.lang.String fsettleorgids,
		java.lang.String foutlmtunit,
		java.lang.Long tcDefineRowid
	)
	{
		this.fentryid = fentryid;
		this.fid = fid;
		this.fseq = fseq;
		this.fmapid = fmapid;
		this.fmapname = fmapname;
		this.fmaterialid = fmaterialid;
		this.fauxpropid = fauxpropid;
		this.fbomid = fbomid;
		this.funitid = funitid;
		this.fqty = fqty;
		this.fbaseunitid = fbaseunitid;
		this.fbaseunitqty = fbaseunitqty;
		this.fnote = fnote;
		this.fmrpfreezestatus = fmrpfreezestatus;
		this.ffreezedate = ffreezedate;
		this.ffreezerid = ffreezerid;
		this.fmrpterminatestatus = fmrpterminatestatus;
		this.fterminaterid = fterminaterid;
		this.fterminatestatus = fterminatestatus;
		this.fterminatedate = fterminatedate;
		this.fmrpclosestatus = fmrpclosestatus;
		this.flot = flot;
		this.fchangeflag = fchangeflag;
		this.fstockorgid = fstockorgid;
		this.fstockid = fstockid;
		this.flockqty = flockqty;
		this.flockflag = flockflag;
		this.fownertypeid = fownertypeid;
		this.fownerid = fownerid;
		this.flotText = flotText;
		this.fproducedate = fproducedate;
		this.fexpirydate = fexpirydate;
		this.fexpunit = fexpunit;
		this.fexpperiod = fexpperiod;
		this.freturntype = freturntype;
		this.fbflowid = fbflowid;
		this.fpriority = fpriority;
		this.fmtono = fmtono;
		this.freservetype = freservetype;
		this.fplandeliverydate = fplandeliverydate;
		this.fdeliverystatus = fdeliverystatus;
		this.foldqty = foldqty;
		this.fpromotionmatchtype = fpromotionmatchtype;
		this.fsupplyorgid = fsupplyorgid;
		this.fnetorderentryid = fnetorderentryid;
		this.fstockunitid = fstockunitid;
		this.fstockqty = fstockqty;
		this.fstockbaseqty = fstockbaseqty;
		this.fleftqty = fleftqty;
		this.fdeliverydate = fdeliverydate;
		this.fsettleorgids = fsettleorgids;
		this.foutlmtunit = foutlmtunit;
		this.tcDefineRowid = tcDefineRowid;
	}

	public void setFentryid(java.lang.String value) 
	{
		this.fentryid = value;
	}
	
	public java.lang.String getFentryid() 
	{
		return this.fentryid;
	}
	public void setFid(java.lang.String value) 
	{
		this.fid = value;
	}
	
	public java.lang.String getFid() 
	{
		return this.fid;
	}
	public void setFseq(java.lang.String value) 
	{
		this.fseq = value;
	}
	
	public java.lang.String getFseq() 
	{
		return this.fseq;
	}
	public void setFmapid(java.lang.String value) 
	{
		this.fmapid = value;
	}
	
	public java.lang.String getFmapid() 
	{
		return this.fmapid;
	}
	public void setFmapname(java.lang.String value) 
	{
		this.fmapname = value;
	}
	
	public java.lang.String getFmapname() 
	{
		return this.fmapname;
	}
	public void setFmaterialid(java.lang.String value) 
	{
		this.fmaterialid = value;
	}
	
	public java.lang.String getFmaterialid() 
	{
		return this.fmaterialid;
	}
	public void setFauxpropid(java.lang.String value) 
	{
		this.fauxpropid = value;
	}
	
	public java.lang.String getFauxpropid() 
	{
		return this.fauxpropid;
	}
	public void setFbomid(java.lang.String value) 
	{
		this.fbomid = value;
	}
	
	public java.lang.String getFbomid() 
	{
		return this.fbomid;
	}
	public void setFunitid(java.lang.String value) 
	{
		this.funitid = value;
	}
	
	public java.lang.String getFunitid() 
	{
		return this.funitid;
	}
	public void setFqty(java.lang.String value) 
	{
		this.fqty = value;
	}
	
	public java.lang.String getFqty() 
	{
		return this.fqty;
	}
	public void setFbaseunitid(java.lang.String value) 
	{
		this.fbaseunitid = value;
	}
	
	public java.lang.String getFbaseunitid() 
	{
		return this.fbaseunitid;
	}
	public void setFbaseunitqty(java.lang.String value) 
	{
		this.fbaseunitqty = value;
	}
	
	public java.lang.String getFbaseunitqty() 
	{
		return this.fbaseunitqty;
	}
	public void setFnote(java.lang.String value) 
	{
		this.fnote = value;
	}
	
	public java.lang.String getFnote() 
	{
		return this.fnote;
	}
	public void setFmrpfreezestatus(java.lang.String value) 
	{
		this.fmrpfreezestatus = value;
	}
	
	public java.lang.String getFmrpfreezestatus() 
	{
		return this.fmrpfreezestatus;
	}
	public void setFfreezedate(java.lang.String value) 
	{
		this.ffreezedate = value;
	}
	
	public java.lang.String getFfreezedate() 
	{
		return this.ffreezedate;
	}
	public void setFfreezerid(java.lang.String value) 
	{
		this.ffreezerid = value;
	}
	
	public java.lang.String getFfreezerid() 
	{
		return this.ffreezerid;
	}
	public void setFmrpterminatestatus(java.lang.String value) 
	{
		this.fmrpterminatestatus = value;
	}
	
	public java.lang.String getFmrpterminatestatus() 
	{
		return this.fmrpterminatestatus;
	}
	public void setFterminaterid(java.lang.String value) 
	{
		this.fterminaterid = value;
	}
	
	public java.lang.String getFterminaterid() 
	{
		return this.fterminaterid;
	}
	public void setFterminatestatus(java.lang.String value) 
	{
		this.fterminatestatus = value;
	}
	
	public java.lang.String getFterminatestatus() 
	{
		return this.fterminatestatus;
	}
	public void setFterminatedate(java.lang.String value) 
	{
		this.fterminatedate = value;
	}
	
	public java.lang.String getFterminatedate() 
	{
		return this.fterminatedate;
	}
	public void setFmrpclosestatus(java.lang.String value) 
	{
		this.fmrpclosestatus = value;
	}
	
	public java.lang.String getFmrpclosestatus() 
	{
		return this.fmrpclosestatus;
	}
	public void setFlot(java.lang.String value) 
	{
		this.flot = value;
	}
	
	public java.lang.String getFlot() 
	{
		return this.flot;
	}
	public void setFchangeflag(java.lang.String value) 
	{
		this.fchangeflag = value;
	}
	
	public java.lang.String getFchangeflag() 
	{
		return this.fchangeflag;
	}
	public void setFstockorgid(java.lang.String value) 
	{
		this.fstockorgid = value;
	}
	
	public java.lang.String getFstockorgid() 
	{
		return this.fstockorgid;
	}
	public void setFstockid(java.lang.String value) 
	{
		this.fstockid = value;
	}
	
	public java.lang.String getFstockid() 
	{
		return this.fstockid;
	}
	public void setFlockqty(java.lang.String value) 
	{
		this.flockqty = value;
	}
	
	public java.lang.String getFlockqty() 
	{
		return this.flockqty;
	}
	public void setFlockflag(java.lang.String value) 
	{
		this.flockflag = value;
	}
	
	public java.lang.String getFlockflag() 
	{
		return this.flockflag;
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
	public void setFlotText(java.lang.String value) 
	{
		this.flotText = value;
	}
	
	public java.lang.String getFlotText() 
	{
		return this.flotText;
	}
	public void setFproducedate(java.lang.String value) 
	{
		this.fproducedate = value;
	}
	
	public java.lang.String getFproducedate() 
	{
		return this.fproducedate;
	}
	public void setFexpirydate(java.lang.String value) 
	{
		this.fexpirydate = value;
	}
	
	public java.lang.String getFexpirydate() 
	{
		return this.fexpirydate;
	}
	public void setFexpunit(java.lang.String value) 
	{
		this.fexpunit = value;
	}
	
	public java.lang.String getFexpunit() 
	{
		return this.fexpunit;
	}
	public void setFexpperiod(java.lang.String value) 
	{
		this.fexpperiod = value;
	}
	
	public java.lang.String getFexpperiod() 
	{
		return this.fexpperiod;
	}
	public void setFreturntype(java.lang.String value) 
	{
		this.freturntype = value;
	}
	
	public java.lang.String getFreturntype() 
	{
		return this.freturntype;
	}
	public void setFbflowid(java.lang.String value) 
	{
		this.fbflowid = value;
	}
	
	public java.lang.String getFbflowid() 
	{
		return this.fbflowid;
	}
	public void setFpriority(java.lang.String value) 
	{
		this.fpriority = value;
	}
	
	public java.lang.String getFpriority() 
	{
		return this.fpriority;
	}
	public void setFmtono(java.lang.String value) 
	{
		this.fmtono = value;
	}
	
	public java.lang.String getFmtono() 
	{
		return this.fmtono;
	}
	public void setFreservetype(java.lang.String value) 
	{
		this.freservetype = value;
	}
	
	public java.lang.String getFreservetype() 
	{
		return this.freservetype;
	}
	public void setFplandeliverydate(java.lang.String value) 
	{
		this.fplandeliverydate = value;
	}
	
	public java.lang.String getFplandeliverydate() 
	{
		return this.fplandeliverydate;
	}
	public void setFdeliverystatus(java.lang.String value) 
	{
		this.fdeliverystatus = value;
	}
	
	public java.lang.String getFdeliverystatus() 
	{
		return this.fdeliverystatus;
	}
	public void setFoldqty(java.lang.String value) 
	{
		this.foldqty = value;
	}
	
	public java.lang.String getFoldqty() 
	{
		return this.foldqty;
	}
	public void setFpromotionmatchtype(java.lang.String value) 
	{
		this.fpromotionmatchtype = value;
	}
	
	public java.lang.String getFpromotionmatchtype() 
	{
		return this.fpromotionmatchtype;
	}
	public void setFsupplyorgid(java.lang.String value) 
	{
		this.fsupplyorgid = value;
	}
	
	public java.lang.String getFsupplyorgid() 
	{
		return this.fsupplyorgid;
	}
	public void setFnetorderentryid(java.lang.String value) 
	{
		this.fnetorderentryid = value;
	}
	
	public java.lang.String getFnetorderentryid() 
	{
		return this.fnetorderentryid;
	}
	public void setFstockunitid(java.lang.String value) 
	{
		this.fstockunitid = value;
	}
	
	public java.lang.String getFstockunitid() 
	{
		return this.fstockunitid;
	}
	public void setFstockqty(java.lang.String value) 
	{
		this.fstockqty = value;
	}
	
	public java.lang.String getFstockqty() 
	{
		return this.fstockqty;
	}
	public void setFstockbaseqty(java.lang.String value) 
	{
		this.fstockbaseqty = value;
	}
	
	public java.lang.String getFstockbaseqty() 
	{
		return this.fstockbaseqty;
	}
	public void setFleftqty(java.lang.String value) 
	{
		this.fleftqty = value;
	}
	
	public java.lang.String getFleftqty() 
	{
		return this.fleftqty;
	}
	public void setFdeliverydate(java.lang.String value) 
	{
		this.fdeliverydate = value;
	}
	
	public java.lang.String getFdeliverydate() 
	{
		return this.fdeliverydate;
	}
	public void setFsettleorgids(java.lang.String value) 
	{
		this.fsettleorgids = value;
	}
	
	public java.lang.String getFsettleorgids() 
	{
		return this.fsettleorgids;
	}
	public void setFoutlmtunit(java.lang.String value) 
	{
		this.foutlmtunit = value;
	}
	
	public java.lang.String getFoutlmtunit() 
	{
		return this.foutlmtunit;
	}
	public void setTcDefineRowid(java.lang.Long value) 
	{
		this.tcDefineRowid = value;
	}
	
	public java.lang.Long getTcDefineRowid() 
	{
		return this.tcDefineRowid;
	}
}

