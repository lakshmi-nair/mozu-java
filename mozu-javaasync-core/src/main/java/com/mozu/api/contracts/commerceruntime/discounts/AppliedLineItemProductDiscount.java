/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.discounts;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.commerceruntime.discounts.Discount;

/**
 *	Discount applied to the order, which is a negative number, which is to be subtracted from the original price to get the final price for a particular line item. If multiple discounts for the order exist, this is the value most advantageous to the shopper.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppliedLineItemProductDiscount implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Indicates if a discount is not used for the product or product line item in an order. If true, the system ignores this discount when pricing the order.
	 */
	protected Boolean excluded;

	public Boolean getExcluded() {
		return this.excluded;
	}

	public void setExcluded(Boolean excluded) {
		this.excluded = excluded;
	}

	/**
	 * The value of the discount applied to the cart or order, represented as a negative currency amount to apply to the original price.
	 */
	protected Double impact;

	public Double getImpact() {
		return this.impact;
	}

	public void setImpact(Double impact) {
		this.impact = impact;
	}

	/**
	 * The impact of a discount for each discount quantity. 
	 */
	protected Double impactPerUnit;

	public Double getImpactPerUnit() {
		return this.impactPerUnit;
	}

	public void setImpactPerUnit(Double impactPerUnit) {
		this.impactPerUnit = impactPerUnit;
	}

	/**
	 * Quantity of products priced. This is always one unless calculating pricing on the order or cart.
	 */
	protected Integer productQuantity;

	public Integer getProductQuantity() {
		return this.productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	/**
	 * Determines if the discount applies to the sale price of the order.
	 */
	protected Boolean appliesToSalePrice;

	public Boolean getAppliesToSalePrice() {
		return this.appliesToSalePrice;
	}

	public void setAppliesToSalePrice(Boolean appliesToSalePrice) {
		this.appliesToSalePrice = appliesToSalePrice;
	}

	/**
	 * Alphanumeric code associated with the coupon or promotion that results in a discounted price.
	 */
	protected String couponCode;

	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	/**
	 * The number of the line items that are used for this particular discount.
	 */
	protected Integer discountQuantity;

	public Integer getDiscountQuantity() {
		return this.discountQuantity;
	}

	public void setDiscountQuantity(Integer discountQuantity) {
		this.discountQuantity = discountQuantity;
	}

	/**
	 * Name of the discount added and applied to a shopping cart and order for a shopper's purchase. 
	 */
	protected Discount discount;

	public Discount getDiscount() {
		return this.discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

}
