/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productadmin.AttributeVocabularyValueDisplayInfo;
import com.mozu.api.contracts.productadmin.AttributeVocabularyValue;

/**
 *	The actual vocabulary value of the attribute that exists as a part of the product type.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeVocabularyValueInProductType implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Sequence of the attribute value within the product type.
	 */
	protected Integer order;

	public Integer getOrder() {
		return this.order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	/**
	 * The vocabulary value of an attribute defined for a product type.
	 */
	protected Object value;

	public Object getValue() {
		return this.value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	protected AttributeVocabularyValueDisplayInfo displayInfo;

	public AttributeVocabularyValueDisplayInfo getDisplayInfo() {
		return this.displayInfo;
	}

	public void setDisplayInfo(AttributeVocabularyValueDisplayInfo displayInfo) {
		this.displayInfo = displayInfo;
	}

	/**
	 * Navigates vocabulary value details for an attribute defined for a product type.
	 */
	protected AttributeVocabularyValue vocabularyValueDetail;

	public AttributeVocabularyValue getVocabularyValueDetail() {
		return this.vocabularyValueDetail;
	}

	public void setVocabularyValueDetail(AttributeVocabularyValue vocabularyValueDetail) {
		this.vocabularyValueDetail = vocabularyValueDetail;
	}

}
