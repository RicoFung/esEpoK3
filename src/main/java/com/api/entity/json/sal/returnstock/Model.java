package com.api.entity.json.sal.returnstock;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class Model
{
	@JSONField(ordinal=1)
	private String FID;
	@JSONField(ordinal=2)
	private FBillTypeID FBillTypeID;
	@JSONField(ordinal=3)
	private String FBillNo;
	@JSONField(ordinal=4)
	private Date FDate;
	@JSONField(ordinal=5)
	private FSaleOrgId FSaleOrgId;
	@JSONField(ordinal=6)
	private FSaledeptid FSaledeptid;
	@JSONField(ordinal=7)
	private FRetcustId FRetcustId;
	@JSONField(ordinal=8)
	private FReturnReason FReturnReason;
	@JSONField(ordinal=9)
	private FHeadLocId FHeadLocId;
	@JSONField(ordinal=10)
	private FCorrespondOrgId FCorrespondOrgId;
	@JSONField(ordinal=11)
	private FTransferBizType FTransferBizType;
	@JSONField(ordinal=12)
	private FSaleGroupId FSaleGroupId;
	@JSONField(ordinal=13)
	private FSalesManId FSalesManId;
	@JSONField(ordinal=14)
	private FStockOrgId FStockOrgId;
	@JSONField(ordinal=15)
	private FStockDeptId FStockDeptId;
	@JSONField(ordinal=16)
	private FStockerGroupId FStockerGroupId;
	@JSONField(ordinal=17)
	private FStockerId FStockerId;
	@JSONField(ordinal=18)
	private String FHeadNote;
	@JSONField(ordinal=19)
	private FReceiveCustId FReceiveCustId;
	@JSONField(ordinal=20)
	private String FReceiveAddress;
	@JSONField(ordinal=21)
	private FSettleCustId FSettleCustId;
	@JSONField(ordinal=22)
	private FReceiveCusContact FReceiveCusContact;
	@JSONField(ordinal=23)
	private FPayCustId FPayCustId;
	@JSONField(ordinal=24)
	private String FOwnerTypeIdHead;
	@JSONField(ordinal=25)
	private FOwnerIdHead FOwnerIdHead;
	@JSONField(ordinal=26)
	private String FScanBox;
	@JSONField(ordinal=27)
	private String FCDateOffsetUnit;
	@JSONField(ordinal=28)
	private String FCDateOffsetValue;
	@JSONField(ordinal=29)
	private String FIsTotalServiceOrCost;
	@JSONField(ordinal=30)
	private SubHeadEntity SubHeadEntity;
	@JSONField(ordinal=31)
	private List<FEntity> FEntity;

	public void setFID(String FID)
	{
		this.FID = FID;
	}

	public String getFID()
	{
		return FID;
	}

	public void setFBillTypeID(FBillTypeID FBillTypeID)
	{
		this.FBillTypeID = FBillTypeID;
	}

	public FBillTypeID getFBillTypeID()
	{
		return FBillTypeID;
	}

	public void setFBillNo(String FBillNo)
	{
		this.FBillNo = FBillNo;
	}

	public String getFBillNo()
	{
		return FBillNo;
	}

	public void setFDate(Date FDate)
	{
		this.FDate = FDate;
	}

	public Date getFDate()
	{
		return FDate;
	}

	public void setFSaleOrgId(FSaleOrgId FSaleOrgId)
	{
		this.FSaleOrgId = FSaleOrgId;
	}

	public FSaleOrgId getFSaleOrgId()
	{
		return FSaleOrgId;
	}

	public void setFSaledeptid(FSaledeptid FSaledeptid)
	{
		this.FSaledeptid = FSaledeptid;
	}

	public FSaledeptid getFSaledeptid()
	{
		return FSaledeptid;
	}

	public void setFRetcustId(FRetcustId FRetcustId)
	{
		this.FRetcustId = FRetcustId;
	}

	public FRetcustId getFRetcustId()
	{
		return FRetcustId;
	}

	public void setFReturnReason(FReturnReason FReturnReason)
	{
		this.FReturnReason = FReturnReason;
	}

	public FReturnReason getFReturnReason()
	{
		return FReturnReason;
	}

	public void setFHeadLocId(FHeadLocId FHeadLocId)
	{
		this.FHeadLocId = FHeadLocId;
	}

	public FHeadLocId getFHeadLocId()
	{
		return FHeadLocId;
	}

	public void setFCorrespondOrgId(FCorrespondOrgId FCorrespondOrgId)
	{
		this.FCorrespondOrgId = FCorrespondOrgId;
	}

	public FCorrespondOrgId getFCorrespondOrgId()
	{
		return FCorrespondOrgId;
	}

	public void setFTransferBizType(FTransferBizType FTransferBizType)
	{
		this.FTransferBizType = FTransferBizType;
	}

	public FTransferBizType getFTransferBizType()
	{
		return FTransferBizType;
	}

	public void setFSaleGroupId(FSaleGroupId FSaleGroupId)
	{
		this.FSaleGroupId = FSaleGroupId;
	}

	public FSaleGroupId getFSaleGroupId()
	{
		return FSaleGroupId;
	}

	public void setFSalesManId(FSalesManId FSalesManId)
	{
		this.FSalesManId = FSalesManId;
	}

	public FSalesManId getFSalesManId()
	{
		return FSalesManId;
	}

	public void setFStockOrgId(FStockOrgId FStockOrgId)
	{
		this.FStockOrgId = FStockOrgId;
	}

	public FStockOrgId getFStockOrgId()
	{
		return FStockOrgId;
	}

	public void setFStockDeptId(FStockDeptId FStockDeptId)
	{
		this.FStockDeptId = FStockDeptId;
	}

	public FStockDeptId getFStockDeptId()
	{
		return FStockDeptId;
	}

	public void setFStockerGroupId(FStockerGroupId FStockerGroupId)
	{
		this.FStockerGroupId = FStockerGroupId;
	}

	public FStockerGroupId getFStockerGroupId()
	{
		return FStockerGroupId;
	}

	public void setFStockerId(FStockerId FStockerId)
	{
		this.FStockerId = FStockerId;
	}

	public FStockerId getFStockerId()
	{
		return FStockerId;
	}

	public void setFHeadNote(String FHeadNote)
	{
		this.FHeadNote = FHeadNote;
	}

	public String getFHeadNote()
	{
		return FHeadNote;
	}

	public void setFReceiveCustId(FReceiveCustId FReceiveCustId)
	{
		this.FReceiveCustId = FReceiveCustId;
	}

	public FReceiveCustId getFReceiveCustId()
	{
		return FReceiveCustId;
	}

	public void setFReceiveAddress(String FReceiveAddress)
	{
		this.FReceiveAddress = FReceiveAddress;
	}

	public String getFReceiveAddress()
	{
		return FReceiveAddress;
	}

	public void setFSettleCustId(FSettleCustId FSettleCustId)
	{
		this.FSettleCustId = FSettleCustId;
	}

	public FSettleCustId getFSettleCustId()
	{
		return FSettleCustId;
	}

	public void setFReceiveCusContact(FReceiveCusContact FReceiveCusContact)
	{
		this.FReceiveCusContact = FReceiveCusContact;
	}

	public FReceiveCusContact getFReceiveCusContact()
	{
		return FReceiveCusContact;
	}

	public void setFPayCustId(FPayCustId FPayCustId)
	{
		this.FPayCustId = FPayCustId;
	}

	public FPayCustId getFPayCustId()
	{
		return FPayCustId;
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

	public void setFScanBox(String FScanBox)
	{
		this.FScanBox = FScanBox;
	}

	public String getFScanBox()
	{
		return FScanBox;
	}

	public void setFCDateOffsetUnit(String FCDateOffsetUnit)
	{
		this.FCDateOffsetUnit = FCDateOffsetUnit;
	}

	public String getFCDateOffsetUnit()
	{
		return FCDateOffsetUnit;
	}

	public void setFCDateOffsetValue(String FCDateOffsetValue)
	{
		this.FCDateOffsetValue = FCDateOffsetValue;
	}

	public String getFCDateOffsetValue()
	{
		return FCDateOffsetValue;
	}

	public void setFIsTotalServiceOrCost(String FIsTotalServiceOrCost)
	{
		this.FIsTotalServiceOrCost = FIsTotalServiceOrCost;
	}

	public String getFIsTotalServiceOrCost()
	{
		return FIsTotalServiceOrCost;
	}

	public void setSubHeadEntity(SubHeadEntity SubHeadEntity)
	{
		this.SubHeadEntity = SubHeadEntity;
	}

	public SubHeadEntity getSubHeadEntity()
	{
		return SubHeadEntity;
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