/**
  * Copyright 2018 bejson.com 
  */
package com.api.entity.singlesave;

import java.util.Date;
import java.util.List;

public class Model
{

	private String FID;
	private FBillTypeID FBillTypeID;
	private String FBillNo;
	private Date FDate;
	private FSaleOrgId FSaleOrgId;
	private FSaleDeptID FSaleDeptID;
	private FCustomerID FCustomerID;
	private FHeadLocationId FHeadLocationId;
	private FCorrespondOrgId FCorrespondOrgId;
	private FCarrierID FCarrierID;
	private String FCarriageNO;
	private FSalesGroupID FSalesGroupID;
	private FSalesManID FSalesManID;
	private FStockOrgId FStockOrgId;
	private FDeliveryDeptID FDeliveryDeptID;
	private FStockerGroupID FStockerGroupID;
	private FStockerID FStockerID;
	private String FNote;
	private FReceiverID FReceiverID;
	private String FReceiveAddress;
	private FSettleID FSettleID;
	private FReceiverContactID FReceiverContactID;
	private FPayerID FPayerID;
	private String FOwnerTypeIdHead;
	private FOwnerIdHead FOwnerIdHead;
	private String FScanBox;
	private String FCDateOffsetUnit;
	private String FCDateOffsetValue;
	private String FPlanRecAddress;
	private String FIsTotalServiceOrCost;
	private SubHeadEntity SubHeadEntity;
	private List<FEntity> FEntity;
	private List<FOutStockTrace> FOutStockTrace;

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

	public void setFSaleDeptID(FSaleDeptID FSaleDeptID)
	{
		this.FSaleDeptID = FSaleDeptID;
	}

	public FSaleDeptID getFSaleDeptID()
	{
		return FSaleDeptID;
	}

	public void setFCustomerID(FCustomerID FCustomerID)
	{
		this.FCustomerID = FCustomerID;
	}

	public FCustomerID getFCustomerID()
	{
		return FCustomerID;
	}

	public void setFHeadLocationId(FHeadLocationId FHeadLocationId)
	{
		this.FHeadLocationId = FHeadLocationId;
	}

	public FHeadLocationId getFHeadLocationId()
	{
		return FHeadLocationId;
	}

	public void setFCorrespondOrgId(FCorrespondOrgId FCorrespondOrgId)
	{
		this.FCorrespondOrgId = FCorrespondOrgId;
	}

	public FCorrespondOrgId getFCorrespondOrgId()
	{
		return FCorrespondOrgId;
	}

	public void setFCarrierID(FCarrierID FCarrierID)
	{
		this.FCarrierID = FCarrierID;
	}

	public FCarrierID getFCarrierID()
	{
		return FCarrierID;
	}

	public void setFCarriageNO(String FCarriageNO)
	{
		this.FCarriageNO = FCarriageNO;
	}

	public String getFCarriageNO()
	{
		return FCarriageNO;
	}

	public void setFSalesGroupID(FSalesGroupID FSalesGroupID)
	{
		this.FSalesGroupID = FSalesGroupID;
	}

	public FSalesGroupID getFSalesGroupID()
	{
		return FSalesGroupID;
	}

	public void setFSalesManID(FSalesManID FSalesManID)
	{
		this.FSalesManID = FSalesManID;
	}

	public FSalesManID getFSalesManID()
	{
		return FSalesManID;
	}

	public void setFStockOrgId(FStockOrgId FStockOrgId)
	{
		this.FStockOrgId = FStockOrgId;
	}

	public FStockOrgId getFStockOrgId()
	{
		return FStockOrgId;
	}

	public void setFDeliveryDeptID(FDeliveryDeptID FDeliveryDeptID)
	{
		this.FDeliveryDeptID = FDeliveryDeptID;
	}

	public FDeliveryDeptID getFDeliveryDeptID()
	{
		return FDeliveryDeptID;
	}

	public void setFStockerGroupID(FStockerGroupID FStockerGroupID)
	{
		this.FStockerGroupID = FStockerGroupID;
	}

	public FStockerGroupID getFStockerGroupID()
	{
		return FStockerGroupID;
	}

	public void setFStockerID(FStockerID FStockerID)
	{
		this.FStockerID = FStockerID;
	}

	public FStockerID getFStockerID()
	{
		return FStockerID;
	}

	public void setFNote(String FNote)
	{
		this.FNote = FNote;
	}

	public String getFNote()
	{
		return FNote;
	}

	public void setFReceiverID(FReceiverID FReceiverID)
	{
		this.FReceiverID = FReceiverID;
	}

	public FReceiverID getFReceiverID()
	{
		return FReceiverID;
	}

	public void setFReceiveAddress(String FReceiveAddress)
	{
		this.FReceiveAddress = FReceiveAddress;
	}

	public String getFReceiveAddress()
	{
		return FReceiveAddress;
	}

	public void setFSettleID(FSettleID FSettleID)
	{
		this.FSettleID = FSettleID;
	}

	public FSettleID getFSettleID()
	{
		return FSettleID;
	}

	public void setFReceiverContactID(FReceiverContactID FReceiverContactID)
	{
		this.FReceiverContactID = FReceiverContactID;
	}

	public FReceiverContactID getFReceiverContactID()
	{
		return FReceiverContactID;
	}

	public void setFPayerID(FPayerID FPayerID)
	{
		this.FPayerID = FPayerID;
	}

	public FPayerID getFPayerID()
	{
		return FPayerID;
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

	public void setFPlanRecAddress(String FPlanRecAddress)
	{
		this.FPlanRecAddress = FPlanRecAddress;
	}

	public String getFPlanRecAddress()
	{
		return FPlanRecAddress;
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

	public void setFOutStockTrace(List<FOutStockTrace> FOutStockTrace)
	{
		this.FOutStockTrace = FOutStockTrace;
	}

	public List<FOutStockTrace> getFOutStockTrace()
	{
		return FOutStockTrace;
	}

}