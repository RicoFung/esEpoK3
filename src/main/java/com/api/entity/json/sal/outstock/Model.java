package com.api.entity.json.sal.outstock;

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
	private String FDate;
	@JSONField(ordinal=5)
	private FSaleOrgId FSaleOrgId;
	@JSONField(ordinal=6)
	private FSaleDeptID FSaleDeptID;
	@JSONField(ordinal=7)
	private FCustomerID FCustomerID;
	@JSONField(ordinal=8)
	private FHeadLocationId FHeadLocationId;
	@JSONField(ordinal=9)
	private FCorrespondOrgId FCorrespondOrgId;
	@JSONField(ordinal=10)
	private FCarrierID FCarrierID;
	@JSONField(ordinal=11)
	private String FCarriageNO;
	@JSONField(ordinal=12)
	private FSalesGroupID FSalesGroupID;
	@JSONField(ordinal=13)
	private FSalesManID FSalesManID;
	@JSONField(ordinal=14)
	private FStockOrgId FStockOrgId;
	@JSONField(ordinal=15)
	private FDeliveryDeptID FDeliveryDeptID;
	@JSONField(ordinal=16)
	private FStockerGroupID FStockerGroupID;
	@JSONField(ordinal=17)
	private FStockerID FStockerID;
	@JSONField(ordinal=18)
	private String FNote;
	@JSONField(ordinal=19)
	private FReceiverID FReceiverID;
	@JSONField(ordinal=20)
	private String FReceiveAddress;
	@JSONField(ordinal=21)
	private FSettleID FSettleID;
	@JSONField(ordinal=22)
	private FReceiverContactID FReceiverContactID;
	@JSONField(ordinal=23)
	private FPayerID FPayerID;
	@JSONField(ordinal=24)
	private String FOwnerTypeIdHead;
	@JSONField(ordinal=25)
	private FOwnerIdHead FOwnerIdHead;
	@JSONField(ordinal=26)
	private String FScanBox;
	@JSONField(ordinal=27)
	private String FCDateOffsetUnit;
	@JSONField(ordinal=28)
	private Integer FCDateOffsetValue;
	@JSONField(ordinal=29)
	private String FPlanRecAddress;
	@JSONField(ordinal=30)
	private Boolean FIsTotalServiceOrCost;
	@JSONField(ordinal=31)
	private SubHeadEntity SubHeadEntity;
	@JSONField(ordinal=32)
	private List<FEntity> FEntity;
	@JSONField(ordinal=33)
	private List<FOutStockTrace> FOutStockTrace;
	@JSONField(ordinal=34)
	private String FDocumentStatus;

	public String getFID()
	{
		return FID;
	}

	public void setFID(String fID)
	{
		FID = fID;
	}

	public FBillTypeID getFBillTypeID()
	{
		return FBillTypeID;
	}

	public void setFBillTypeID(FBillTypeID fBillTypeID)
	{
		FBillTypeID = fBillTypeID;
	}

	public String getFBillNo()
	{
		return FBillNo;
	}

	public void setFBillNo(String fBillNo)
	{
		FBillNo = fBillNo;
	}

	public String getFDate()
	{
		return FDate;
	}

	public void setFDate(String fDate)
	{
		FDate = fDate;
	}

	public FSaleOrgId getFSaleOrgId()
	{
		return FSaleOrgId;
	}

	public void setFSaleOrgId(FSaleOrgId fSaleOrgId)
	{
		FSaleOrgId = fSaleOrgId;
	}

	public FSaleDeptID getFSaleDeptID()
	{
		return FSaleDeptID;
	}

	public void setFSaleDeptID(FSaleDeptID fSaleDeptID)
	{
		FSaleDeptID = fSaleDeptID;
	}

	public FCustomerID getFCustomerID()
	{
		return FCustomerID;
	}

	public void setFCustomerID(FCustomerID fCustomerID)
	{
		FCustomerID = fCustomerID;
	}

	public FHeadLocationId getFHeadLocationId()
	{
		return FHeadLocationId;
	}

	public void setFHeadLocationId(FHeadLocationId fHeadLocationId)
	{
		FHeadLocationId = fHeadLocationId;
	}

	public FCorrespondOrgId getFCorrespondOrgId()
	{
		return FCorrespondOrgId;
	}

	public void setFCorrespondOrgId(FCorrespondOrgId fCorrespondOrgId)
	{
		FCorrespondOrgId = fCorrespondOrgId;
	}

	public FCarrierID getFCarrierID()
	{
		return FCarrierID;
	}

	public void setFCarrierID(FCarrierID fCarrierID)
	{
		FCarrierID = fCarrierID;
	}

	public String getFCarriageNO()
	{
		return FCarriageNO;
	}

	public void setFCarriageNO(String fCarriageNO)
	{
		FCarriageNO = fCarriageNO;
	}

	public FSalesGroupID getFSalesGroupID()
	{
		return FSalesGroupID;
	}

	public void setFSalesGroupID(FSalesGroupID fSalesGroupID)
	{
		FSalesGroupID = fSalesGroupID;
	}

	public FSalesManID getFSalesManID()
	{
		return FSalesManID;
	}

	public void setFSalesManID(FSalesManID fSalesManID)
	{
		FSalesManID = fSalesManID;
	}

	public FStockOrgId getFStockOrgId()
	{
		return FStockOrgId;
	}

	public void setFStockOrgId(FStockOrgId fStockOrgId)
	{
		FStockOrgId = fStockOrgId;
	}

	public FDeliveryDeptID getFDeliveryDeptID()
	{
		return FDeliveryDeptID;
	}

	public void setFDeliveryDeptID(FDeliveryDeptID fDeliveryDeptID)
	{
		FDeliveryDeptID = fDeliveryDeptID;
	}

	public FStockerGroupID getFStockerGroupID()
	{
		return FStockerGroupID;
	}

	public void setFStockerGroupID(FStockerGroupID fStockerGroupID)
	{
		FStockerGroupID = fStockerGroupID;
	}

	public FStockerID getFStockerID()
	{
		return FStockerID;
	}

	public void setFStockerID(FStockerID fStockerID)
	{
		FStockerID = fStockerID;
	}

	public String getFNote()
	{
		return FNote;
	}

	public void setFNote(String fNote)
	{
		FNote = fNote;
	}

	public FReceiverID getFReceiverID()
	{
		return FReceiverID;
	}

	public void setFReceiverID(FReceiverID fReceiverID)
	{
		FReceiverID = fReceiverID;
	}

	public String getFReceiveAddress()
	{
		return FReceiveAddress;
	}

	public void setFReceiveAddress(String fReceiveAddress)
	{
		FReceiveAddress = fReceiveAddress;
	}

	public FSettleID getFSettleID()
	{
		return FSettleID;
	}

	public void setFSettleID(FSettleID fSettleID)
	{
		FSettleID = fSettleID;
	}

	public FReceiverContactID getFReceiverContactID()
	{
		return FReceiverContactID;
	}

	public void setFReceiverContactID(FReceiverContactID fReceiverContactID)
	{
		FReceiverContactID = fReceiverContactID;
	}

	public FPayerID getFPayerID()
	{
		return FPayerID;
	}

	public void setFPayerID(FPayerID fPayerID)
	{
		FPayerID = fPayerID;
	}

	public String getFOwnerTypeIdHead()
	{
		return FOwnerTypeIdHead;
	}

	public void setFOwnerTypeIdHead(String fOwnerTypeIdHead)
	{
		FOwnerTypeIdHead = fOwnerTypeIdHead;
	}

	public FOwnerIdHead getFOwnerIdHead()
	{
		return FOwnerIdHead;
	}

	public void setFOwnerIdHead(FOwnerIdHead fOwnerIdHead)
	{
		FOwnerIdHead = fOwnerIdHead;
	}

	public String getFScanBox()
	{
		return FScanBox;
	}

	public void setFScanBox(String fScanBox)
	{
		FScanBox = fScanBox;
	}

	public String getFCDateOffsetUnit()
	{
		return FCDateOffsetUnit;
	}

	public void setFCDateOffsetUnit(String fCDateOffsetUnit)
	{
		FCDateOffsetUnit = fCDateOffsetUnit;
	}

	public Integer getFCDateOffsetValue()
	{
		return FCDateOffsetValue;
	}

	public void setFCDateOffsetValue(Integer fCDateOffsetValue)
	{
		FCDateOffsetValue = fCDateOffsetValue;
	}

	public String getFPlanRecAddress()
	{
		return FPlanRecAddress;
	}

	public void setFPlanRecAddress(String fPlanRecAddress)
	{
		FPlanRecAddress = fPlanRecAddress;
	}

	public Boolean getFIsTotalServiceOrCost()
	{
		return FIsTotalServiceOrCost;
	}

	public void setFIsTotalServiceOrCost(Boolean fIsTotalServiceOrCost)
	{
		FIsTotalServiceOrCost = fIsTotalServiceOrCost;
	}

	public SubHeadEntity getSubHeadEntity()
	{
		return SubHeadEntity;
	}

	public void setSubHeadEntity(SubHeadEntity subHeadEntity)
	{
		SubHeadEntity = subHeadEntity;
	}

	public List<FEntity> getFEntity()
	{
		return FEntity;
	}

	public void setFEntity(List<FEntity> fEntity)
	{
		FEntity = fEntity;
	}

	public List<FOutStockTrace> getFOutStockTrace()
	{
		return FOutStockTrace;
	}

	public void setFOutStockTrace(List<FOutStockTrace> fOutStockTrace)
	{
		FOutStockTrace = fOutStockTrace;
	}

	public String getFDocumentStatus()
	{
		return FDocumentStatus;
	}

	public void setFDocumentStatus(String fDocumentStatus)
	{
		FDocumentStatus = fDocumentStatus;
	}
	
}