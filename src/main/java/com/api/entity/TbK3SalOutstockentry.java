package com.api.entity;

/**
 *
 * @author rico
 * @version 1.0
 * @since 1.0
 * */
public class TbK3SalOutstockentry extends BaseK3Objectentry implements java.io.Serializable
{
	// 分录内码       db_column: FENTRYID 
	private java.lang.String fentryid;
    // 单据内码       db_column: FID 
	private java.lang.String fid;
    // 对应名称       db_column: FCUSTMATNAME 
	private java.lang.String fcustmatname;
    // 对应编码       db_column: FCUSTMATID 
	private java.lang.String fcustmatid;
    // 行号       db_column: FSEQ 
	private java.lang.String fseq;
    // 物料内码       db_column: FMATERIALID 
	private java.lang.String fmaterialid;
    // 单位内码       db_column: FUNITID 
	private java.lang.String funitid;
    // 辅助属性       db_column: FAUXPROPID 
	private java.lang.String fauxpropid;
    // 应发数量       db_column: FMUSTQTY 
	private java.lang.String fmustqty;
    // 实发数量       db_column: FREALQTY 
	private java.lang.String frealqty;
    // 仓库内码       db_column: FSTOCKID 
	private java.lang.String fstockid;
    // 仓位       db_column: FSTOCKLOCID 
	private java.lang.String fstocklocid;
    // 库存状态       db_column: FSTOCKSTATUSID 
	private java.lang.String fstockstatusid;
    // 批号       db_column: FLOT 
	private java.lang.String flot;
    // 批号文本       db_column: FLOT_TEXT 
	private java.lang.String flotText;
    // 毛重       db_column: FGROSSWEIGHT 
	private java.lang.String fgrossweight;
    // 净重       db_column: FNETWEIGHT 
	private java.lang.String fnetweight;
    // 基本单位内码       db_column: FBASEUNITID 
	private java.lang.String fbaseunitid;
    // 库存基本数量       db_column: FBASEUNITQTY 
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
    // 生产日期       db_column: FPRODUCEDATE 
	private java.lang.String fproducedate;
    // 到期日       db_column: FEXPIRYDATE 
	private java.lang.String fexpirydate;
    // 基本单位应发数量       db_column: FBASEMUSTQTY 
	private java.lang.String fbasemustqty;
    // 到货确认('Y'是)       db_column: FARRIVALSTATUS 
	private java.lang.String farrivalstatus;
    // 到货日期       db_column: FARRIVALDATE 
	private java.lang.String farrivaldate;
    // 到货确认人       db_column: FARRIVALCONFIRMOR 
	private java.lang.String farrivalconfirmor;
    // 补货数量       db_column: FREPAIRQTY 
	private java.lang.String frepairqty;
    // 拒收数量       db_column: FREFUSEQTY 
	private java.lang.String frefuseqty;
    // 申请退货数量（订货平台使用）       db_column: FWANTRETQTY 
	private java.lang.String fwantretqty;
    // 实收数量       db_column: FACTQTY 
	private java.lang.String factqty;
    // 是否补货('1'是)       db_column: FISREPAIR 
	private java.lang.String fisrepair;
    // 检验确认('Y'是)       db_column: FVALIDATESTATUS 
	private java.lang.String fvalidatestatus;
    // 检验日期       db_column: FVALIDATEDATE 
	private java.lang.String fvalidatedate;
    // 检验确认人       db_column: FVALIDATECONFIRMOR 
	private java.lang.String fvalidateconfirmor;
    // 业务流程       db_column: FBFLOWID 
	private java.lang.String fbflowid;
    // 计划跟踪号       db_column: FMTONO 
	private java.lang.String fmtono;
    // 项目编号       db_column: FPROJECTNO 
	private java.lang.String fprojectno;
    // 收货备注       db_column: FRECNOTE 
	private java.lang.String frecnote;
    // 退货备注       db_column: FRETURNNOTE 
	private java.lang.String freturnnote;
    // 序列号单位       db_column: FSNUNITID 
	private java.lang.String fsnunitid;
    // 序列号单位数量       db_column: FSNQTY 
	private java.lang.String fsnqty;
    // 控制出库比例       db_column: FOUTCONTROL 
	private java.lang.String foutcontrol;

	public Long getTcRowid()
	{
		return tcRowid;
	}

	public void setTcRowid(Long tcRowid)
	{
		this.tcRowid = tcRowid;
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
	public void setFcustmatname(java.lang.String value) 
	{
		this.fcustmatname = value;
	}
	
	public java.lang.String getFcustmatname() 
	{
		return this.fcustmatname;
	}
	public void setFcustmatid(java.lang.String value) 
	{
		this.fcustmatid = value;
	}
	
	public java.lang.String getFcustmatid() 
	{
		return this.fcustmatid;
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
	public void setFgrossweight(java.lang.String value) 
	{
		this.fgrossweight = value;
	}
	
	public java.lang.String getFgrossweight() 
	{
		return this.fgrossweight;
	}
	public void setFnetweight(java.lang.String value) 
	{
		this.fnetweight = value;
	}
	
	public java.lang.String getFnetweight() 
	{
		return this.fnetweight;
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
	public void setFbasemustqty(java.lang.String value) 
	{
		this.fbasemustqty = value;
	}
	
	public java.lang.String getFbasemustqty() 
	{
		return this.fbasemustqty;
	}
	public void setFarrivalstatus(java.lang.String value) 
	{
		this.farrivalstatus = value;
	}
	
	public java.lang.String getFarrivalstatus() 
	{
		return this.farrivalstatus;
	}
	public void setFarrivaldate(java.lang.String value) 
	{
		this.farrivaldate = value;
	}
	
	public java.lang.String getFarrivaldate() 
	{
		return this.farrivaldate;
	}
	public void setFarrivalconfirmor(java.lang.String value) 
	{
		this.farrivalconfirmor = value;
	}
	
	public java.lang.String getFarrivalconfirmor() 
	{
		return this.farrivalconfirmor;
	}
	public void setFrepairqty(java.lang.String value) 
	{
		this.frepairqty = value;
	}
	
	public java.lang.String getFrepairqty() 
	{
		return this.frepairqty;
	}
	public void setFrefuseqty(java.lang.String value) 
	{
		this.frefuseqty = value;
	}
	
	public java.lang.String getFrefuseqty() 
	{
		return this.frefuseqty;
	}
	public void setFwantretqty(java.lang.String value) 
	{
		this.fwantretqty = value;
	}
	
	public java.lang.String getFwantretqty() 
	{
		return this.fwantretqty;
	}
	public void setFactqty(java.lang.String value) 
	{
		this.factqty = value;
	}
	
	public java.lang.String getFactqty() 
	{
		return this.factqty;
	}
	public void setFisrepair(java.lang.String value) 
	{
		this.fisrepair = value;
	}
	
	public java.lang.String getFisrepair() 
	{
		return this.fisrepair;
	}
	public void setFvalidatestatus(java.lang.String value) 
	{
		this.fvalidatestatus = value;
	}
	
	public java.lang.String getFvalidatestatus() 
	{
		return this.fvalidatestatus;
	}
	public void setFvalidatedate(java.lang.String value) 
	{
		this.fvalidatedate = value;
	}
	
	public java.lang.String getFvalidatedate() 
	{
		return this.fvalidatedate;
	}
	public void setFvalidateconfirmor(java.lang.String value) 
	{
		this.fvalidateconfirmor = value;
	}
	
	public java.lang.String getFvalidateconfirmor() 
	{
		return this.fvalidateconfirmor;
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
	public void setFrecnote(java.lang.String value) 
	{
		this.frecnote = value;
	}
	
	public java.lang.String getFrecnote() 
	{
		return this.frecnote;
	}
	public void setFreturnnote(java.lang.String value) 
	{
		this.freturnnote = value;
	}
	
	public java.lang.String getFreturnnote() 
	{
		return this.freturnnote;
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
	public void setFoutcontrol(java.lang.String value) 
	{
		this.foutcontrol = value;
	}
	
	public java.lang.String getFoutcontrol() 
	{
		return this.foutcontrol;
	}
	
    @Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("TbK3SalOutstockentry [fmaterialid=");
		builder.append(fmaterialid);
		builder.append(", funitid=");
		builder.append(funitid);
		builder.append(", frealqty=");
		builder.append(frealqty);
		builder.append(", fstockid=");
		builder.append(fstockid);
		builder.append(", fownerid=");
		builder.append(fownerid);
		builder.append(", tcDefineRowid=");
		builder.append(tcDefineRowid);
		builder.append("]");
		return builder.toString();
	}
}

