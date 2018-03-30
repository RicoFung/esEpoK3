package com.api.entity.json.sal.order;

import com.alibaba.fastjson.annotation.JSONField;

public class FTaxDetailSubEntity
{
	@JSONField(ordinal=1)
	private String FDetailID;
	@JSONField(ordinal=2)
	private String FTaxRate;
	@JSONField(ordinal=3)
	private String FSellerWithholding;
	@JSONField(ordinal=4)
	private String FBuyerWithholding;

	public void setFDetailID(String FDetailID)
	{
		this.FDetailID = FDetailID;
	}

	public String getFDetailID()
	{
		return FDetailID;
	}

	public void setFTaxRate(String FTaxRate)
	{
		this.FTaxRate = FTaxRate;
	}

	public String getFTaxRate()
	{
		return FTaxRate;
	}

	public void setFSellerWithholding(String FSellerWithholding)
	{
		this.FSellerWithholding = FSellerWithholding;
	}

	public String getFSellerWithholding()
	{
		return FSellerWithholding;
	}

	public void setFBuyerWithholding(String FBuyerWithholding)
	{
		this.FBuyerWithholding = FBuyerWithholding;
	}

	public String getFBuyerWithholding()
	{
		return FBuyerWithholding;
	}

}