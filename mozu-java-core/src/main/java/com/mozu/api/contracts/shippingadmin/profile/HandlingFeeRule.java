/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.shippingadmin.profile;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.shippingadmin.ServiceType;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HandlingFeeRule implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String appliesTo;

	public String getAppliesTo() {
		return this.appliesTo;
	}

	public void setAppliesTo(String appliesTo) {
		this.appliesTo = appliesTo;
	}

	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected List<String> productTargetRuleCodes;
	public List<String> getProductTargetRuleCodes() {
		return this.productTargetRuleCodes;
	}
	public void setProductTargetRuleCodes(List<String> productTargetRuleCodes) {
		this.productTargetRuleCodes = productTargetRuleCodes;
	}

	protected Integer sequence;

	public Integer getSequence() {
		return this.sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	protected List<String> shippingTargetRuleCodes;
	public List<String> getShippingTargetRuleCodes() {
		return this.shippingTargetRuleCodes;
	}
	public void setShippingTargetRuleCodes(List<String> shippingTargetRuleCodes) {
		this.shippingTargetRuleCodes = shippingTargetRuleCodes;
	}

	protected Double value;

	public Double getValue() {
		return this.value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	protected String valueType;

	public String getValueType() {
		return this.valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	protected List<ServiceType> serviceTypes;
	public List<ServiceType> getServiceTypes() {
		return this.serviceTypes;
	}
	public void setServiceTypes(List<ServiceType> serviceTypes) {
		this.serviceTypes = serviceTypes;
	}

}
