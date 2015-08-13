/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.core.extensible;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.extensible.AttributeValueLocalizedContent;

/**
 *	Properties of a vocabulary value defined for an extensible attribute.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeVocabularyValue implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Indicates if the object is hidden or breaks inheritance, primarily used by facets, products, and attribute vocabulary values. For example, if true, the attribute vocabulary value does not appear in the list when defining a value for an attribute.
	 */
	protected Boolean isHidden;

	public Boolean getIsHidden() {
		return this.isHidden;
	}

	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}

	/**
	 * The numeric order of objects, used by a vocabulary value defined for an extensible attribute, images, and categories.
	 */
	protected Integer sequence;

	public Integer getSequence() {
		return this.sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	/**
	 * The value of a property, used by numerous objects within Mozu including facets, attributes, products, localized content, metadata, capabilities (Mozu and third-party), location inventory adjustment, and more. The value may be a string, integer, or double. Validation may be run against the entered and saved values depending on the object type.
	 */
	protected String value;

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Localizable content (such as a name and/or description) for an attribute. The content may be localized when displayed according to the locale code specified by the master catalog. Content can include descriptive text for product extensible attributes, catalog-level descriptions (displayed if isContentOverriden is true), product bundles, and customer account notes.
	 */
	protected AttributeValueLocalizedContent content;

	public AttributeValueLocalizedContent getContent() {
		return this.content;
	}

	public void setContent(AttributeValueLocalizedContent content) {
		this.content = content;
	}

}