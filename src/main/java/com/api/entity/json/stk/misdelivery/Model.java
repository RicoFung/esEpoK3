package com.api.entity.json.stk.misdelivery;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class Model
{
	@JSONField(ordinal=1)
	private String FID;
	@JSONField(ordinal=2)
	private String FBillNo;
	@JSONField(ordinal=3)
	private FBillTypeID FBillTypeID;
	@JSONField(ordinal=4)
	private FStockOrgId FStockOrgId;
	@JSONField(ordinal=5)
	private FPickOrgId FPickOrgId;
	@JSONField(ordinal=6)
	private String FStockDirect;
	@JSONField(ordinal=7)
	private String FDate;
	@JSONField(ordinal=8)
	private FCustId FCustId;
	@JSONField(ordinal=9)
	private FDeptId FDeptId;
	@JSONField(ordinal=10)
	private FPickerId FPickerId;
	@JSONField(ordinal=11)
	private FStockerId FStockerId;
	@JSONField(ordinal=12)
	private FStockerGroupId FStockerGroupId;
	@JSONField(ordinal=13)
	private String FBizType;
	@JSONField(ordinal=14)
	private String FOwnerTypeIdHead;
	@JSONField(ordinal=15)
	private FOwnerIdHead FOwnerIdHead;
	@JSONField(ordinal=16)
	private String FNote;
	@JSONField(ordinal=17)
	private FBaseCurrId FBaseCurrId;
	@JSONField(ordinal=18)
	private String FScanBox;
	@JSONField(ordinal=19)
	private List<FEntity> FEntity;

	public void setFID(String FID)
	{
		this.FID = FID;
	}

	public String getFID()
	{
		return FID;
	}

	public void setFBillNo(String FBillNo)
	{
		this.FBillNo = FBillNo;
	}

	public String getFBillNo()
	{
		return FBillNo;
	}

	public void setFBillTypeID(FBillTypeID FBillTypeID)
	{
		this.FBillTypeID = FBillTypeID;
	}

	public FBillTypeID getFBillTypeID()
	{
		return FBillTypeID;
	}

	public void setFStockOrgId(FStockOrgId FStockOrgId)
	{
		this.FStockOrgId = FStockOrgId;
	}

	public FStockOrgId getFStockOrgId()
	{
		return FStockOrgId;
	}

	public void setFPickOrgId(FPickOrgId FPickOrgId)
	{
		this.FPickOrgId = FPickOrgId;
	}

	public FPickOrgId getFPickOrgId()
	{
		return FPickOrgId;
	}

	public void setFStockDirect(String FStockDirect)
	{
		this.FStockDirect = FStockDirect;
	}

	public String getFStockDirect()
	{
		return FStockDirect;
	}

	public void setFDate(String FDate)
	{
		this.FDate = FDate;
	}

	public String getFDate()
	{
		return FDate;
	}

	public void setFCustId(FCustId FCustId)
	{
		this.FCustId = FCustId;
	}

	public FCustId getFCustId()
	{
		return FCustId;
	}

	public void setFDeptId(FDeptId FDeptId)
	{
		this.FDeptId = FDeptId;
	}

	public FDeptId getFDeptId()
	{
		return FDeptId;
	}

	public void setFPickerId(FPickerId FPickerId)
	{
		this.FPickerId = FPickerId;
	}

	public FPickerId getFPickerId()
	{
		return FPickerId;
	}

	public void setFStockerId(FStockerId FStockerId)
	{
		this.FStockerId = FStockerId;
	}

	public FStockerId getFStockerId()
	{
		return FStockerId;
	}

	public void setFStockerGroupId(FStockerGroupId FStockerGroupId)
	{
		this.FStockerGroupId = FStockerGroupId;
	}

	public FStockerGroupId getFStockerGroupId()
	{
		return FStockerGroupId;
	}

	public void setFBizType(String FBizType)
	{
		this.FBizType = FBizType;
	}

	public String getFBizType()
	{
		return FBizType;
	}

	public void setFOwnerTypeIdHead(String FOwnerTypeIdHead)
	{
		this.FOwnerTypeIdHead = FOwnerTypeIdHead;
	}

	public String getFOwnerTypeIdHead()
	{
		return FOwnerTypeIdHead;
	}

	public void setFOwnerIdHead(FOwnerIdHead FOwnerIdHead)
	{
		this.FOwnerIdHead = FOwnerIdHead;
	}

	public FOwnerIdHead getFOwnerIdHead()
	{
		return FOwnerIdHead;
	}

	public void setFNote(String FNote)
	{
		this.FNote = FNote;
	}

	public String getFNote()
	{
		return FNote;
	}

	public void setFBaseCurrId(FBaseCurrId FBaseCurrId)
	{
		this.FBaseCurrId = FBaseCurrId;
	}

	public FBaseCurrId getFBaseCurrId()
	{
		return FBaseCurrId;
	}

	public void setFScanBox(String FScanBox)
	{
		this.FScanBox = FScanBox;
	}

	public String getFScanBox()
	{
		return FScanBox;
	}

	public void setFEntity(List<FEntity> FEntity)
	{
		this.FEntity = FEntity;
	}

	public List<FEntity> getFEntity()
	{
		return FEntity;
	}

}