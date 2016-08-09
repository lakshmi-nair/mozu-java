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
 *	Mozu.Customer.Contracts.CustomerAuditEntry ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerAuditEntry implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Applicattion associated with this entry
	 */
	protected  String application;

	public String getApplication() {
		return this.application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	/**
	 * Unique identifer of the customer account. This ID is used to associate numerous types of data and object with the customer account, including orders, returns, wish lists, and in-store credit.
	 */
	protected  Integer customerAccountId;

	public Integer getCustomerAccountId() {
		return this.customerAccountId;
	}

	public void setCustomerAccountId(Integer customerAccountId) {
		this.customerAccountId = customerAccountId;
	}

	/**
	 * Id of this entry
	 */
	protected  Integer customerAuditEntryId;

	public Integer getCustomerAuditEntryId() {
		return this.customerAuditEntryId;
	}

	public void setCustomerAuditEntryId(Integer customerAuditEntryId) {
		this.customerAuditEntryId = customerAuditEntryId;
	}

	/**
	 * The localized description in text for the object, displayed per the locale code. For example, descriptions are used for product descriptions, attributes, and pre-authorization transaction types.
	 */
	protected  String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Date of the Entry
	 */
	protected  DateTime entryDate;

	public DateTime getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(DateTime entryDate) {
		this.entryDate = entryDate;
	}

	/**
	 * User ID associated with this Entry
	 */
	protected  String entryUser;

	public String getEntryUser() {
		return this.entryUser;
	}

	public void setEntryUser(String entryUser) {
		this.entryUser = entryUser;
	}

	/**
	 * Path of the field value being changed (e.g. /Customer/Contacts/1/FirstName)
	 */
	protected  String fieldPath;

	public String getFieldPath() {
		return this.fieldPath;
	}

	public void setFieldPath(String fieldPath) {
		this.fieldPath = fieldPath;
	}

	/**
	 * New Value after this event
	 */
	protected  String newValue;

	public String getNewValue() {
		return this.newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	/**
	 * Original value before this event
	 */
	protected  String oldValue;

	public String getOldValue() {
		return this.oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	/**
	 * Site associated wit this entry
	 */
	protected  String site;

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
	}


}