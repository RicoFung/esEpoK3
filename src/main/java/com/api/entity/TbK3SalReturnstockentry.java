package com.api.entity;

/**
 *
 * @author rico
 * @version 1.0
 * @since 1.0
 * */
public class TbK3SalReturnstockentry implements java.io.Serializable
{
    // 分录内码       db_column: FENTRYID 
	private java.lang.String fentryid;
    // 单据内码       db_column: FID 
	private java.lang.String fid;
    // 行号       db_column: FSEQ 
	private java.lang.String fseq;
    // 物料内码       db_column: FMATERIALID 
	private java.lang.String fmaterialid;
    // 单位内码       db_column: FUNITID 
	private java.lang.String funitid;
    // 辅助属性       db_column: FAUXPROPID 
	private java.lang.String fauxpropid;
    // 应退数量       db_column: FMUSTQTY 
	private java.lang.String fmustqty;
    // 实退数量       db_column: FREALQTY 
	private java.lang.String frealqty;
    // 仓库内码       db_column: FSTOCKID 
	private java.lang.String fstockid;
    // 仓位       db_column: FSTOCKLOCID 
	private java.lang.String fstocklocid;
    // 库存状态       db_column: FSTOCKSTATUSID 
	private java.lang.String fstockstatusid;
    // 交货日期       db_column: FDELIVERYDATE 
	private java.lang.String fdeliverydate;
    // 生产日期       db_column: FPRODUCEDATE 
	private java.lang.String fproducedate;
    // 保质期单位       db_column: FEXPUNIT 
	private java.lang.String fexpunit;
    // 保质期       db_column: FEXPPERIOD 
	private java.lang.String fexpperiod;
    // 到期日       db_column: FEXPIRYDATE 
	private java.lang.String fexpirydate;
    // 批号       db_column: FLOT 
	private java.lang.String flot;
    // 批号文本       db_column: FLOT_TEXT 
	private java.lang.String flotText;
    // 供应商批号       db_column: FSUPPLIERLOT 
	private java.lang.String fsupplierlot;
    // 基本单位内码       db_column: FBASEUNITID 
	private java.lang.String fbaseunitid;
    // 基本单位数量       db_column: FBASEUNITQTY 
	private java.lang.String fbaseunitqty;
    // 库存辅助单位内码       db_column: FAUXUNITID 
	private java.lang.String fauxunitid;
    // 库存辅助单位数量       db_column: FAUXUNITQTY 
	private java.lang.String fauxunitqty;
    // 辅单位内码       db_column: FEXTAUXUNITID 
	private java.lang.String fextauxunitid;
    // 辅单位数量       db_column: FEXTAUXUNITQTY 
	private java.lang.String fextauxunitqty;
    // BOM编号       db_column: FBOMID 
	private java.lang.String fbomid;
    // 备注       db_column: FNOTE 
	private java.lang.String fnote;
    // 订单单号       db_column: FORDERNO 
	private java.lang.String forderno;
    // 订单行号       db_column: FORDERSEQ 
	private java.lang.String forderseq;
    // 库存更新标志(0:未更新 1:已更新)       db_column: FSTOCKFLAG 
	private java.lang.String fstockflag;
    // 货主类型(ORG_Organizations:库存组织 、BD_Supplier:供应商、 BD_Customer:客户)       db_column: FOWNERTYPEID 
	private java.lang.String fownertypeid;
    // 货主       db_column: FOWNERID 
	private java.lang.String fownerid;
    // 保管者类型(ORG_Organizations:库存组织 、BD_Supplier:供应商、 BD_Customer:客户)       db_column: FKEEPERTYPEID 
	private java.lang.String fkeepertypeid;
    // 保管者       db_column: FKEEPERID 
	private java.lang.String fkeeperid;
    // 源单类型       db_column: FSRCBILLTYPE 
	private java.lang.String fsrcbilltype;
    // 源单单号       db_column: FSRCBILLNO 
	private java.lang.String fsrcbillno;
    // 源单行号       db_column: FSRCBILLSEQ 
	private java.lang.String fsrcbillseq;
    // 退货类型(RETURN:退货SUPPLEMENT:退货补货)       db_column: FRETURNTYPE 
	private java.lang.String freturntype;
    // 对应编码       db_column: FMAPID 
	private java.lang.String fmapid;
    // 业务流程       db_column: FBFLOWID 
	private java.lang.String fbflowid;
    // 计划跟踪号       db_column: FMTONO 
	private java.lang.String fmtono;
    // 项目编号       db_column: FPROJECTNO 
	private java.lang.String fprojectno;
    // 序列号单位       db_column: FSNUNITID 
	private java.lang.String fsnunitid;
    // 序列号单位数量       db_column: FSNQTY 
	private java.lang.String fsnqty;
    // 订货平台拒收标识(0:直接退货1:拒收退货)       db_column: FREFUSEFLAG 
	private java.lang.String frefuseflag;
    // 消耗汇总       db_column: FISCONSUMESUM 
	private java.lang.String fisconsumesum;
    // 质量类型(合格退货(hgth),报废退货(bfth),不合格退货(bhgth))       db_column: FQUALIFYTYPE 
	private java.lang.String fqualifytype;
    // 销售订单EntryId       db_column: FSOENTRYID 
	private java.lang.String fsoentryid;
    // 自定义外键       db_column: TC_DEFINE_ROWID 
	private java.lang.Long tcDefineRowid;

	public TbK3SalReturnstockentry(){
	}

	public TbK3SalReturnstockentry(
		java.lang.String fentryid,
		java.lang.String fid,
		java.lang.String fseq,
		java.lang.String fmaterialid,
		java.lang.String funitid,
		java.lang.String fauxpropid,
		java.lang.String fmustqty,
		java.lang.String frealqty,
		java.lang.String fstockid,
		java.lang.String fstocklocid,
		java.lang.String fstockstatusid,
		java.lang.String fdeliverydate,
		java.lang.String fproducedate,
		java.lang.String fexpunit,
		java.lang.String fexpperiod,
		java.lang.String fexpirydate,
		java.lang.String flot,
		java.lang.String flotText,
		java.lang.String fsupplierlot,
		java.lang.String fbaseunitid,
		java.lang.String fbaseunitqty,
		java.lang.String fauxunitid,
		java.lang.String fauxunitqty,
		java.lang.String fextauxunitid,
		java.lang.String fextauxunitqty,
		java.lang.String fbomid,
		java.lang.String fnote,
		java.lang.String forderno,
		java.lang.String forderseq,
		java.lang.String fstockflag,
		java.lang.String fownertypeid,
		java.lang.String fownerid,
		java.lang.String fkeepertypeid,
		java.lang.String fkeeperid,
		java.lang.String fsrcbilltype,
		java.lang.String fsrcbillno,
		java.lang.String fsrcbillseq,
		java.lang.String freturntype,
		java.lang.String fmapid,
		java.lang.String fbflowid,
		java.lang.String fmtono,
		java.lang.String fprojectno,
		java.lang.String fsnunitid,
		java.lang.String fsnqty,
		java.lang.String frefuseflag,
		java.lang.String fisconsumesum,
		java.lang.String fqualifytype,
		java.lang.String fsoentryid,
		java.lang.Long tcDefineRowid
	)
	{
		this.fentryid = fentryid;
		this.fid = fid;
		this.fseq = fseq;
		this.fmaterialid = fmaterialid;
		this.funitid = funitid;
		this.fauxpropid = fauxpropid;
		this.fmustqty = fmustqty;
		this.frealqty = frealqty;
		this.fstockid = fstockid;
		this.fstocklocid = fstocklocid;
		this.fstockstatusid = fstockstatusid;
		this.fdeliverydate = fdeliverydate;
		this.fproducedate = fproducedate;
		this.fexpunit = fexpunit;
		this.fexpperiod = fexpperiod;
		this.fexpirydate = fexpirydate;
		this.flot = flot;
		this.flotText = flotText;
		this.fsupplierlot = fsupplierlot;
		this.fbaseunitid = fbaseunitid;
		this.fbaseunitqty = fbaseunitqty;
		this.fauxunitid = fauxunitid;
		this.fauxunitqty = fauxunitqty;
		this.fextauxunitid = fextauxunitid;
		this.fextauxunitqty = fextauxunitqty;
		this.fbomid = fbomid;
		this.fnote = fnote;
		this.forderno = forderno;
		this.forderseq = forderseq;
		this.fstockflag = fstockflag;
		this.fownertypeid = fownertypeid;
		this.fownerid = fownerid;
		this.fkeepertypeid = fkeepertypeid;
		this.fkeeperid = fkeeperid;
		this.fsrcbilltype = fsrcbilltype;
		this.fsrcbillno = fsrcbillno;
		this.fsrcbillseq = fsrcbillseq;
		this.freturntype = freturntype;
		this.fmapid = fmapid;
		this.fbflowid = fbflowid;
		this.fmtono = fmtono;
		this.fprojectno = fprojectno;
		this.fsnunitid = fsnunitid;
		this.fsnqty = fsnqty;
		this.frefuseflag = frefuseflag;
		this.fisconsumesum = fisconsumesum;
		this.fqualifytype = fqualifytype;
		this.fsoentryid = fsoentryid;
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
	public void setFmaterialid(java.lang.String value) 
	{
		this.fmaterialid = value;
	}
	
	public java.lang.String getFmaterialid() 
	{
		return this.fmaterialid;
	}
	public void setFunitid(java.lang.String value) 
	{
		this.funitid = value;
	}
	
	public java.lang.String getFunitid() 
	{
		return this.funitid;
	}
	public void setFauxpropid(java.lang.String value) 
	{
		this.fauxpropid = value;
	}
	
	public java.lang.String getFauxpropid() 
	{
		return this.fauxpropid;
	}
	public void setFmustqty(java.lang.String value) 
	{
		this.fmustqty = value;
	}
	
	public java.lang.String getFmustqty() 
	{
		return this.fmustqty;
	}
	public void setFrealqty(java.lang.String value) 
	{
		this.frealqty = value;
	}
	
	public java.lang.String getFrealqty() 
	{
		return this.frealqty;
	}
	public void setFstockid(java.lang.String value) 
	{
		this.fstockid = value;
	}
	
	public java.lang.String getFstockid() 
	{
		return this.fstockid;
	}
	public void setFstocklocid(java.lang.String value) 
	{
		this.fstocklocid = value;
	}
	
	public java.lang.String getFstocklocid() 
	{
		return this.fstocklocid;
	}
	public void setFstockstatusid(java.lang.String value) 
	{
		this.fstockstatusid = value;
	}
	
	public java.lang.String getFstockstatusid() 
	{
		return this.fstockstatusid;
	}
	public void setFdeliverydate(java.lang.String value) 
	{
		this.fdeliverydate = value;
	}
	
	public java.lang.String getFdeliverydate() 
	{
		return this.fdeliverydate;
	}
	public void setFproducedate(java.lang.String value) 
	{
		this.fproducedate = value;
	}
	
	public java.lang.String getFproducedate() 
	{
		return this.fproducedate;
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
	public void setFexpirydate(java.lang.String value) 
	{
		this.fexpirydate = value;
	}
	
	public java.lang.String getFexpirydate() 
	{
		return this.fexpirydate;
	}
	public void setFlot(java.lang.String value) 
	{
		this.flot = value;
	}
	
	public java.lang.String getFlot() 
	{
		return this.flot;
	}
	public void setFlotText(java.lang.String value) 
	{
		this.flotText = value;
	}
	
	public java.lang.String getFlotText() 
	{
		return this.flotText;
	}
	public void setFsupplierlot(java.lang.String value) 
	{
		this.fsupplierlot = value;
	}
	
	public java.lang.String getFsupplierlot() 
	{
		return this.fsupplierlot;
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
	public void setFauxunitid(java.lang.String value) 
	{
		this.fauxunitid = value;
	}
	
	public java.lang.String getFauxunitid() 
	{
		return this.fauxunitid;
	}
	public void setFauxunitqty(java.lang.String value) 
	{
		this.fauxunitqty = value;
	}
	
	public java.lang.String getFauxunitqty() 
	{
		return this.fauxunitqty;
	}
	public void setFextauxunitid(java.lang.String value) 
	{
		this.fextauxunitid = value;
	}
	
	public java.lang.String getFextauxunitid() 
	{
		return this.fextauxunitid;
	}
	public void setFextauxunitqty(java.lang.String value) 
	{
		this.fextauxunitqty = value;
	}
	
	public java.lang.String getFextauxunitqty() 
	{
		return this.fextauxunitqty;
	}
	public void setFbomid(java.lang.String value) 
	{
		this.fbomid = value;
	}
	
	public java.lang.String getFbomid() 
	{
		return this.fbomid;
	}
	public void setFnote(java.lang.String value) 
	{
		this.fnote = value;
	}
	
	public java.lang.String getFnote() 
	{
		return this.fnote;
	}
	public void setForderno(java.lang.String value) 
	{
		this.forderno = value;
	}
	
	public java.lang.String getForderno() 
	{
		return this.forderno;
	}
	public void setForderseq(java.lang.String value) 
	{
		this.forderseq = value;
	}
	
	public java.lang.String getForderseq() 
	{
		return this.forderseq;
	}
	public void setFstockflag(java.lang.String value) 
	{
		this.fstockflag = value;
	}
	
	public java.lang.String getFstockflag() 
	{
		return this.fstockflag;
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
	public void setFkeepertypeid(java.lang.String value) 
	{
		this.fkeepertypeid = value;
	}
	
	public java.lang.String getFkeepertypeid() 
	{
		return this.fkeepertypeid;
	}
	public void setFkeeperid(java.lang.String value) 
	{
		this.fkeeperid = value;
	}
	
	public java.lang.String getFkeeperid() 
	{
		return this.fkeeperid;
	}
	public void setFsrcbilltype(java.lang.String value) 
	{
		this.fsrcbilltype = value;
	}
	
	public java.lang.String getFsrcbilltype() 
	{
		return this.fsrcbilltype;
	}
	public void setFsrcbillno(java.lang.String value) 
	{
		this.fsrcbillno = value;
	}
	
	public java.lang.String getFsrcbillno() 
	{
		return this.fsrcbillno;
	}
	public void setFsrcbillseq(java.lang.String value) 
	{
		this.fsrcbillseq = value;
	}
	
	public java.lang.String getFsrcbillseq() 
	{
		return this.fsrcbillseq;
	}
	public void setFreturntype(java.lang.String value) 
	{
		this.freturntype = value;
	}
	
	public java.lang.String getFreturntype() 
	{
		return this.freturntype;
	}
	public void setFmapid(java.lang.String value) 
	{
		this.fmapid = value;
	}
	
	public java.lang.String getFmapid() 
	{
		return this.fmapid;
	}
	public void setFbflowid(java.lang.String value) 
	{
		this.fbflowid = value;
	}
	
	public java.lang.String getFbflowid() 
	{
		return this.fbflowid;
	}
	public void setFmtono(java.lang.String value) 
	{
		this.fmtono = value;
	}
	
	public java.lang.String getFmtono() 
	{
		return this.fmtono;
	}
	public void setFprojectno(java.lang.String value) 
	{
		this.fprojectno = value;
	}
	
	public java.lang.String getFprojectno() 
	{
		return this.fprojectno;
	}
	public void setFsnunitid(java.lang.String value) 
	{
		this.fsnunitid = value;
	}
	
	public java.lang.String getFsnunitid() 
	{
		return this.fsnunitid;
	}
	public void setFsnqty(java.lang.String value) 
	{
		this.fsnqty = value;
	}
	
	public java.lang.String getFsnqty() 
	{
		return this.fsnqty;
	}
	public void setFrefuseflag(java.lang.String value) 
	{
		this.frefuseflag = value;
	}
	
	public java.lang.String getFrefuseflag() 
	{
		return this.frefuseflag;
	}
	public void setFisconsumesum(java.lang.String value) 
	{
		this.fisconsumesum = value;
	}
	
	public java.lang.String getFisconsumesum() 
	{
		return this.fisconsumesum;
	}
	public void setFqualifytype(java.lang.String value) 
	{
		this.fqualifytype = value;
	}
	
	public java.lang.String getFqualifytype() 
	{
		return this.fqualifytype;
	}
	public void setFsoentryid(java.lang.String value) 
	{
		this.fsoentryid = value;
	}
	
	public java.lang.String getFsoentryid() 
	{
		return this.fsoentryid;
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

