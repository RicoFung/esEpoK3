package com.api.entity.json.sal.returnstock;

import com.alibaba.fastjson.annotation.JSONField;

public class SubHeadEntity
{
	@JSONField(ordinal=1)
	private FSettleCurrId FSettleCurrId;
	@JSONField(ordinal=2)
	private FSettleOrgId FSettleOrgId;
	@JSONField(ordinal=3)
	private FSettleTypeId FSettleTypeId;
	@JSONField(ordinal=4)
	private FChageCondition FChageCondition;
	@JSONField(ordinal=5)
	private FPriceListId FPriceListId;
	@JSONField(ordinal=6)
	private FDiscountListId FDiscountListId;
	@JSONField(ordinal=7)
	private FLocalCurrId FLocalCurrId;
	@JSONField(ordinal=8)
	private FExchangeTypeId FExchangeTypeId;
	@JSONField(ordinal=9)
	private String FExchangeRate;

	public void setFSettleCurrId(FSettleCurrId FSettleCurrId)
	{
		this.FSettleCurrId = FSettleCurrId;
	}

	public FSettleCurrId getFSettleCurrId()
	{
		return FSettleCurrId;
	}

	public void setFSettleOrgId(FSettleOrgId FSettleOrgId)
	{
		this.FSettleOrgId = FSettleOrgId;
	}

	public FSettleOrgId getFSettleOrgId()
	{
		return FSettleOrgId;
	}

	public void setFSettleTypeId(FSettleTypeId FSettleTypeId)
	{
		this.FSettleTypeId = FSettleTypeId;
	}

	public FSettleTypeId getFSettleTypeId()
	{
		return FSettleTypeId;
	}

	public void setFChageCondition(FChageCondition FChageCondition)
	{
		this.FChageCondition = FChageCondition;
	}

	public FChageCondition getFChageCondition()
	{
		return FChageCondition;
	}

	public void setFPriceListId(FPriceListId FPriceListId)
	{
		this.FPriceListId = FPriceListId;
	}

	public FPriceListId getFPriceListId()
	{
		return FPriceListId;
	}

	public void setFDiscountListId(FDiscountListId FDiscountListId)
	{
		this.FDiscountListId = FDiscountListId;
	}

	public FDiscountListId getFDiscountListId()
	{
		return FDiscountListId;
	}

	public void setFLocalCurrId(FLocalCurrId FLocalCurrId)
	{
		this.FLocalCurrId = FLocalCurrId;
	}

	public FLocalCurrId getFLocalCurrId()
	{
		return FLocalCurrId;
	}

	public void setFExchangeTypeId(FExchangeTypeId FExchangeTypeId)
	{
		this.FExchangeTypeId = FExchangeTypeId;
	}

	public FExchangeTypeId getFExchangeTypeId()
	{
		return FExchangeTypeId;
	}

	public void setFExchangeRate(String FExchangeRate)
	{
		this.FExchangeRate = FExchangeRate;
	}

	public String getFExchangeRate()
	{
		return FExchangeRate;
	}

}