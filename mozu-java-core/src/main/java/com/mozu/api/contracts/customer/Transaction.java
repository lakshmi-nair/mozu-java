/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.customer;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Properties of a transaction performed by a customer account. The system creates a transaction each time the customer submits an order, returns an item, picks up items for an order, or manages items on a wish list.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * If applicable, the amount of the transaction.
	 */
	protected  Double amount;

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * The localized currency code for the monetary amount. 
	 */
	protected  String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * The date and time recording for a customer action including a transaction and storefront visit.
	 */
	protected  DateTime date;

	public DateTime getDate() {
		return this.date;
	}

	public void setDate(DateTime date) {
		this.date = date;
	}

	/**
	 * The type of payment interaction. The payment can be Capture or CheckReceived. The value also includes customer payment interactions such as Website, Call, Store, or Unknown.
	 */
	protected  String interactionType;

	public String getInteractionType() {
		return this.interactionType;
	}

	public void setInteractionType(String interactionType) {
		this.interactionType = interactionType;
	}

	/**
	 * The unique identifier of the transaction.
	 */
	protected  String transactionId;

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * The type of transaction, pertaining to the transaction a customer performed or the type of customer credit. For customer credit, you will set the data to Debit to decrease or Credit to update. For the type of transaction, the type includes Order, Return, OrderPickup, or Wishlist.
	 */
	protected  String transactionType;

	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	/**
	 * Unique identifier of the customer visit in which the cart was created or last modified.
	 */
	protected  String visitId;

	public String getVisitId() {
		return this.visitId;
	}

	public void setVisitId(String visitId) {
		this.visitId = visitId;
	}


}
