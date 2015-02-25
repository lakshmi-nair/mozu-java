/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.payments;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Properties of a credit card used to submit payment for an order.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentCard implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The masked credit card number part returned from the payment gateway.
	 */
	protected String cardNumberPartOrMask;

	public String getCardNumberPartOrMask() {
		return this.cardNumberPartOrMask;
	}

	public void setCardNumberPartOrMask(String cardNumberPartOrMask) {
		this.cardNumberPartOrMask = cardNumberPartOrMask;
	}

	/**
	 * The two-digit month a credit card expires for a payment method.
	 */
	protected short expireMonth;

	public short getExpireMonth() {
		return this.expireMonth;
	}

	public void setExpireMonth(short expireMonth) {
		this.expireMonth = expireMonth;
	}

	/**
	 * The four-digit year the credit card expires for a payment method.
	 */
	protected short expireYear;

	public short getExpireYear() {
		return this.expireYear;
	}

	public void setExpireYear(short expireYear) {
		this.expireYear = expireYear;
	}

	/**
	 * If true, the credit card information is saved to the customer account for future use.
	 */
	protected Boolean isCardInfoSaved;

	public Boolean getIsCardInfoSaved() {
		return this.isCardInfoSaved;
	}

	public void setIsCardInfoSaved(Boolean isCardInfoSaved) {
		this.isCardInfoSaved = isCardInfoSaved;
	}

	/**
	 * If true, the credit card is used for a recurring order payment.
	 */
	protected Boolean isUsedRecurring;

	public Boolean getIsUsedRecurring() {
		return this.isUsedRecurring;
	}

	public void setIsUsedRecurring(Boolean isUsedRecurring) {
		this.isUsedRecurring = isUsedRecurring;
	}

	/**
	 * The full name printed on a credit card. The name should match what is printed on the card exactly, used in validation during a payment.
	 */
	protected String nameOnCard;

	public String getNameOnCard() {
		return this.nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	/**
	 * The type of credit card, such as Visa or Amex.
	 */
	protected String paymentOrCardType;

	public String getPaymentOrCardType() {
		return this.paymentOrCardType;
	}

	public void setPaymentOrCardType(String paymentOrCardType) {
		this.paymentOrCardType = paymentOrCardType;
	}

	/**
	 * Unique identifier of the credit card from the payment service.
	 */
	protected String paymentServiceCardId;

	public String getPaymentServiceCardId() {
		return this.paymentServiceCardId;
	}

	public void setPaymentServiceCardId(String paymentServiceCardId) {
		this.paymentServiceCardId = paymentServiceCardId;
	}

}
