/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.content;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Properties for the document installation package and data. This information details the installation of document content and files within the site. 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentInstallation implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Fully qualified name of the document type. 
	 */
	protected String documentTypeFQN;

	public String getDocumentTypeFQN() {
		return this.documentTypeFQN;
	}

	public void setDocumentTypeFQN(String documentTypeFQN) {
		this.documentTypeFQN = documentTypeFQN;
	}

	/**
	 * Localized properties for the document installation package and data. This information details the installation of document content and files within the site and is localized based on the `localeCode`.
	 */
	protected String locale;

	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
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
	 * Collection of property attributes defined for the object. Properties are associated to all objects within Mozu, including documents, products, and product types.
	 */
	protected com.fasterxml.jackson.databind.JsonNode properties;

	public com.fasterxml.jackson.databind.JsonNode getProperties() {
		return this.properties;
	}

	public void setProperties(com.fasterxml.jackson.databind.JsonNode properties) {
		this.properties = properties;
	}

}
