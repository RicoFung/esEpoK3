package com.api.entity.json.sal.order;

import com.alibaba.fastjson.annotation.JSONField;

public class FSaleOrderFinance
{
	@JSONField(ordinal=1)
	private FSettleCurrId FSettleCurrId;
	@JSONField(ordinal=2)
	private FRecConditionId FRecConditionId;
	@JSONField(ordinal=3)
	private String FIsPriceExcludeTax;
	@JSONField(ordinal=4)
	private FSettleModeId FSettleModeId;
	@JSONField(ordinal=5)
	private String FIsIncludedTax;
	@JSONField(ordinal=6)
	private FPriceListId FPriceListId;
	@JSONField(ordinal=7)
	private FDiscountListId FDiscountListId;
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

	public void setFRecConditionId(FRecConditionId FRecConditionId)
	{
		this.FRecConditionId = FRecConditionId;
	}

	public FRecConditionId getFRecConditionId()
	{
		return FRecConditionId;
	}

	public void setFIsPriceExcludeTax(String FIsPriceExcludeTax)
	{
		this.FIsPriceExcludeTax = FIsPriceExcludeTax;
	}

	public String getFIsPriceExcludeTax()
	{
		return FIsPriceExcludeTax;
	}

	public void setFSettleModeId(FSettleModeId FSettleModeId)
	{
		this.FSettleModeId = FSettleModeId;
	}

	public FSettleModeId getFSettleModeId()
	{
		return FSettleModeId;
	}

	public void setFIsIncludedTax(String FIsIncludedTax)
	{
		this.FIsIncludedTax = FIsIncludedTax;
	}

	public String getFIsIncludedTax()
	{
		return FIsIncludedTax;
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

	public void setFExchangeTypeId(FExchangeTypeId FExchangeTypeId)
	{
		this.FExchangeTypeId = FExchangeTypeId;
	}

	public FExchangeTypeId getFExchangeTypeId()
	{
		return FExchangeTypeId;
	}

	public String getFExchangeRate()
	{
		return FExchangeRate;
	}

	public void setFExchangeRate(String fExchangeRate)
	{
		FExchangeRate = fExchangeRate;
	}

}