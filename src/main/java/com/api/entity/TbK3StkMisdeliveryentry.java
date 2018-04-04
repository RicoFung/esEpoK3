package com.api.entity;

/**
 *
 * @author rico
 * @version 1.0
 * @since 1.0
 * */
public class TbK3StkMisdeliveryentry implements java.io.Serializable
{
    // 分录内码       db_column: FENTRYID 
	private java.lang.String fentryid;
    // 单据内码       db_column: FID 
	private java.lang.String fid;
    // 行号       db_column: FSEQ 
	private java.lang.String fseq;
    // 物料内码       db_column: FMATERIALID 
	private java.lang.String fmaterialid;
    // 批号       db_column: FLOT 
	private java.lang.String flot;
    // 批号文本       db_column: FLOT_TEXT 
	private java.lang.String flotText;
    // 仓库内码       db_column: FSTOCKID 
	private java.lang.String fstockid;
    // 仓位       db_column: FSTOCKLOCID 
	private java.lang.String fstocklocid;
    // 单位内码       db_column: FUNITID 
	private java.lang.String funitid;
    // 实发数量       db_column: FQTY 
	private java.lang.String fqty;
    // 单价       db_column: FPRICE 
	private java.lang.String fprice;
    // 金额       db_column: FAMOUNT 
	private java.lang.String famount;
    // BOM编号       db_column: FBOMID 
	private java.lang.String fbomid;
    // 辅助属性       db_column: FAUXPROPID 
	private java.lang.String fauxpropid;
    // 生产日期       db_column: FPRODUCEDATE 
	private java.lang.String fproducedate;
    // 到期日       db_column: FEXPIRYDATE 
	private java.lang.String fexpirydate;
    // 计划跟踪号       db_column: FMTONO 
	private java.lang.String fmtono;
    // 项目编号       db_column: FPROJECTNO 
	private java.lang.String fprojectno;
    // 库存状态       db_column: FSTOCKSTATUSID 
	private java.lang.String fstockstatusid;
    // 基本单位内码       db_column: FBASEUNITID 
	private java.lang.String fbaseunitid;
    // 基本单位数量       db_column: FBASEQTY 
	private java.lang.String fbaseqty;
    // 库存辅助单位内码       db_column: FSECUNITID 
	private java.lang.String fsecunitid;
    // 库存辅助单位数量       db_column: FSECQTY 
	private java.lang.String fsecqty;
    // 辅单位内码       db_column: FEXTAUXUNITID 
	private java.lang.String fextauxunitid;
    // 辅单位数量       db_column: FEXTAUXUNITQTY 
	private java.lang.String fextauxunitqty;
    // 货主类型(ORG_Organizations:库存组织 、BD_Supplier:供应商、 BD_Customer:客户)       db_column: FOWNERTYPEID 
	private java.lang.String fownertypeid;
    // 货主       db_column: FOWNERID 
	private java.lang.String fownerid;
    // 保管者类型(ORG_Organizations:库存组织 、BD_Supplier:供应商、 BD_Customer:客户)       db_column: FKEEPERTYPEID 
	private java.lang.String fkeepertypeid;
    // 保管者       db_column: FKEEPERID 
	private java.lang.String fkeeperid;
    // 库存更新标志(0:未更新 1:已更新)       db_column: FSTOCKFLAG 
	private java.lang.String fstockflag;
    // 关联数量       db_column: FJOINQTY 
	private java.lang.String fjoinqty;
    // 关联数量(基本单位)       db_column: FBASEJOINQTY 
	private java.lang.String fbasejoinqty;
    // 备注       db_column: FNOTE 
	private java.lang.String fnote;
    // 序列号单位       db_column: FSNUNITID 
	private java.lang.String fsnunitid;
    // 序列号单位数量       db_column: FSNQTY 
	private java.lang.String fsnqty;
    // 关联数量（辅单位）       db_column: FSECJOINQTY 
	private java.lang.String fsecjoinqty;
    // 消耗汇总       db_column: FISCONSUMESUM 
	private java.lang.String fisconsumesum;
    // 成本项目       db_column: FCOSTITEM 
	private java.lang.String fcostitem;
    // 参加费用分配       db_column: FDISTRIBUTION 
	private java.lang.String fdistribution;
    // 产品组       db_column: FPRODUCTGROUPID 
	private java.lang.String fproductgroupid;
    // 自定义外键       db_column: TC_DEFINE_ROWID 
	private java.lang.Long tcDefineRowid;

	public TbK3StkMisdeliveryentry(){
	}

	public TbK3StkMisdeliveryentry(
		java.lang.String fentryid,
		java.lang.String fid,
		java.lang.String fseq,
		java.lang.String fmaterialid,
		java.lang.String flot,
		java.lang.String flotText,
		java.lang.String fstockid,
		java.lang.String fstocklocid,
		java.lang.String funitid,
		java.lang.String fqty,
		java.lang.String fprice,
		java.lang.String famount,
		java.lang.String fbomid,
		java.lang.String fauxpropid,
		java.lang.String fproducedate,
		java.lang.String fexpirydate,
		java.lang.String fmtono,
		java.lang.String fprojectno,
		java.lang.String fstockstatusid,
		java.lang.String fbaseunitid,
		java.lang.String fbaseqty,
		java.lang.String fsecunitid,
		java.lang.String fsecqty,
		java.lang.String fextauxunitid,
		java.lang.String fextauxunitqty,
		java.lang.String fownertypeid,
		java.lang.String fownerid,
		java.lang.String fkeepertypeid,
		java.lang.String fkeeperid,
		java.lang.String fstockflag,
		java.lang.String fjoinqty,
		java.lang.String fbasejoinqty,
		java.lang.String fnote,
		java.lang.String fsnunitid,
		java.lang.String fsnqty,
		java.lang.String fsecjoinqty,
		java.lang.String fisconsumesum,
		java.lang.String fcostitem,
		java.lang.String fdistribution,
		java.lang.String fproductgroupid,
		java.lang.Long tcDefineRowid
	)
	{
		this.fentryid = fentryid;
		this.fid = fid;
		this.fseq = fseq;
		this.fmaterialid = fmaterialid;
		this.flot = flot;
		this.flotText = flotText;
		this.fstockid = fstockid;
		this.fstocklocid = fstocklocid;
		this.funitid = funitid;
		this.fqty = fqty;
		this.fprice = fprice;
		this.famount = famount;
		this.fbomid = fbomid;
		this.fauxpropid = fauxpropid;
		this.fproducedate = fproducedate;
		this.fexpirydate = fexpirydate;
		this.fmtono = fmtono;
		this.fprojectno = fprojectno;
		this.fstockstatusid = fstockstatusid;
		this.fbaseunitid = fbaseunitid;
		this.fbaseqty = fbaseqty;
		this.fsecunitid = fsecunitid;
		this.fsecqty = fsecqty;
		this.fextauxunitid = fextauxunitid;
		this.fextauxunitqty = fextauxunitqty;
		this.fownertypeid = fownertypeid;
		this.fownerid = fownerid;
		this.fkeepertypeid = fkeepertypeid;
		this.fkeeperid = fkeeperid;
		this.fstockflag = fstockflag;
		this.fjoinqty = fjoinqty;
		this.fbasejoinqty = fbasejoinqty;
		this.fnote = fnote;
		this.fsnunitid = fsnunitid;
		this.fsnqty = fsnqty;
		this.fsecjoinqty = fsecjoinqty;
		this.fisconsumesum = fisconsumesum;
		this.fcostitem = fcostitem;
		this.fdistribution = fdistribution;
		this.fproductgroupid = fproductgroupid;
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
	public void setFprice(java.lang.String value) 
	{
		this.fprice = value;
	}
	
	public java.lang.String getFprice() 
	{
		return this.fprice;
	}
	public void setFamount(java.lang.String value) 
	{
		this.famount = value;
	}
	
	public java.lang.String getFamount() 
	{
		return this.famount;
	}
	public void setFbomid(java.lang.String value) 
	{
		this.fbomid = value;
	}
	
	public java.lang.String getFbomid() 
	{
		return this.fbomid;
	}
	public void setFauxpropid(java.lang.String value) 
	{
		this.fauxpropid = value;
	}
	
	public java.lang.String getFauxpropid() 
	{
		return this.fauxpropid;
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
	public void setFstockstatusid(java.lang.String value) 
	{
		this.fstockstatusid = value;
	}
	
	public java.lang.String getFstockstatusid() 
	{
		return this.fstockstatusid;
	}
	public void setFbaseunitid(java.lang.String value) 
	{
		this.fbaseunitid = value;
	}
	
	public java.lang.String getFbaseunitid() 
	{
		return this.fbaseunitid;
	}
	public void setFbaseqty(java.lang.String value) 
	{
		this.fbaseqty = value;
	}
	
	public java.lang.String getFbaseqty() 
	{
		return this.fbaseqty;
	}
	public void setFsecunitid(java.lang.String value) 
	{
		this.fsecunitid = value;
	}
	
	public java.lang.String getFsecunitid() 
	{
		return this.fsecunitid;
	}
	public void setFsecqty(java.lang.String value) 
	{
		this.fsecqty = value;
	}
	
	public java.lang.String getFsecqty() 
	{
		return this.fsecqty;
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
	public void setFstockflag(java.lang.String value) 
	{
		this.fstockflag = value;
	}
	
	public java.lang.String getFstockflag() 
	{
		return this.fstockflag;
	}
	public void setFjoinqty(java.lang.String value) 
	{
		this.fjoinqty = value;
	}
	
	public java.lang.String getFjoinqty() 
	{
		return this.fjoinqty;
	}
	public void setFbasejoinqty(java.lang.String value) 
	{
		this.fbasejoinqty = value;
	}
	
	public java.lang.String getFbasejoinqty() 
	{
		return this.fbasejoinqty;
	}
	public void setFnote(java.lang.String value) 
	{
		this.fnote = value;
	}
	
	public java.lang.String getFnote() 
	{
		return this.fnote;
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
	public void setFsecjoinqty(java.lang.String value) 
	{
		this.fsecjoinqty = value;
	}
	
	public java.lang.String getFsecjoinqty() 
	{
		return this.fsecjoinqty;
	}
	public void setFisconsumesum(java.lang.String value) 
	{
		this.fisconsumesum = value;
	}
	
	public java.lang.String getFisconsumesum() 
	{
		return this.fisconsumesum;
	}
	public void setFcostitem(java.lang.String value) 
	{
		this.fcostitem = value;
	}
	
	public java.lang.String getFcostitem() 
	{
		return this.fcostitem;
	}
	public void setFdistribution(java.lang.String value) 
	{
		this.fdistribution = value;
	}
	
	public java.lang.String getFdistribution() 
	{
		return this.fdistribution;
	}
	public void setFproductgroupid(java.lang.String value) 
	{
		this.fproductgroupid = value;
	}
	
	public java.lang.String getFproductgroupid() 
	{
		return this.fproductgroupid;
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

