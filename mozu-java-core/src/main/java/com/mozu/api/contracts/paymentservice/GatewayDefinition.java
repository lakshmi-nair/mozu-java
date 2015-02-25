/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.paymentservice;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.paymentservice.GatewayCredentialFieldDefinition;
import com.mozu.api.contracts.paymentservice.PreAuthorizeDefinition;
import com.mozu.api.contracts.paymentservice.SupportedCard;

/**
 *	Properties of the payment gateway.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GatewayDefinition implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The 2-letter geographic code representing the country for the physical or mailing address. Currently limited to the US.
	 */
	protected String countryCode;

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The implementing type name of the integration with the payment gateway.
	 */
	protected String integrationImplTypeName;

	public String getIntegrationImplTypeName() {
		return this.integrationImplTypeName;
	}

	public void setIntegrationImplTypeName(String integrationImplTypeName) {
		this.integrationImplTypeName = integrationImplTypeName;
	}

	/**
	 * The display name of the source product property. For a product field it will be the display name of the field. For a product attribute it will be the Attribute Name.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * URL of the production payment service.
	 */
	protected String prodServiceURL;

	public String getProdServiceURL() {
		return this.prodServiceURL;
	}

	public void setProdServiceURL(String prodServiceURL) {
		this.prodServiceURL = prodServiceURL;
	}

	/**
	 * URL of the test payment service environment.
	 */
	protected String testServiceURL;

	public String getTestServiceURL() {
		return this.testServiceURL;
	}

	public void setTestServiceURL(String testServiceURL) {
		this.testServiceURL = testServiceURL;
	}

	/**
	 * Credential fields for the payment gateway. For security purposes, Mozu does not return these credential fields.
	 */
	protected List<GatewayCredentialFieldDefinition> credentialDefinitions;
	public List<GatewayCredentialFieldDefinition> getCredentialDefinitions() {
		return this.credentialDefinitions;
	}
	public void setCredentialDefinitions(List<GatewayCredentialFieldDefinition> credentialDefinitions) {
		this.credentialDefinitions = credentialDefinitions;
	}

	/**
	 * Definition of the preauthorization gateway.
	 */
	protected PreAuthorizeDefinition preAuthorizeDefinition;

	public PreAuthorizeDefinition getPreAuthorizeDefinition() {
		return this.preAuthorizeDefinition;
	}

	public void setPreAuthorizeDefinition(PreAuthorizeDefinition preAuthorizeDefinition) {
		this.preAuthorizeDefinition = preAuthorizeDefinition;
	}

	/**
	 * The types of credit cards supported by the payment gateway.
	 */
	protected List<SupportedCard> supportedCards;
	public List<SupportedCard> getSupportedCards() {
		return this.supportedCards;
	}
	public void setSupportedCards(List<SupportedCard> supportedCards) {
		this.supportedCards = supportedCards;
	}

}
