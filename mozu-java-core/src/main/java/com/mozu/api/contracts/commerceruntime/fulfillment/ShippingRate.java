/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.fulfillment;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Properties of an estimated shipping rate for a shipment.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShippingRate implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * 3-letter ISO 4217 standard global currency code. Currently, only "USD" (US Dollar) is supported.
	 */
	protected String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * Indicates if the facet is currently valid.
	 */
	protected Boolean isValid;

	public Boolean getIsValid() {
		return this.isValid;
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

	/**
	 * Array list of validation and status messages associated with shipping rates, orders, and product purchasable state.
	 */
	protected List<String> messages;
	public List<String> getMessages() {
		return this.messages;
	}
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	/**
	 * The amount the company and the shopper pay for shipping based on the current rate. Depending on any company discounts or fees, the price the company pays for shipping may differ from what the shopper pays.
	 */
	protected Double price;

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * The code associated with a carrier's shipping method service type, used during fulfillment of packages and shipments. Service type codes include a prefix that indicates the carrier. For example: FEDEX_INTERNATIONAL_STANDARD and UPS_GROUND.
	 */
	protected String shippingMethodCode;

	public String getShippingMethodCode() {
		return this.shippingMethodCode;
	}

	public void setShippingMethodCode(String shippingMethodCode) {
		this.shippingMethodCode = shippingMethodCode;
	}

	/**
	 * The carrier-supplied name for the shipping service type, such as "UPS Ground" or "2nd Day Air".
	 */
	protected String shippingMethodName;

	public String getShippingMethodName() {
		return this.shippingMethodName;
	}

	public void setShippingMethodName(String shippingMethodName) {
		this.shippingMethodName = shippingMethodName;
	}

	/**
	 * The shipping zone to which this rate applies.
	 */
	protected String shippingZoneCode;

	public String getShippingZoneCode() {
		return this.shippingZoneCode;
	}

	public void setShippingZoneCode(String shippingZoneCode) {
		this.shippingZoneCode = shippingZoneCode;
	}

}
