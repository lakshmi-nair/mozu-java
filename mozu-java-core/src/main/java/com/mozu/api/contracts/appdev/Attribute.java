/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.appdev;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Attribute implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String vocabularyValues;

	public String getVocabularyValues() {
		return this.vocabularyValues;
	}

	public void setVocabularyValues(String vocabularyValues) {
		this.vocabularyValues = vocabularyValues;
	}

	protected String adminName;

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	protected Integer applicationAttributeId;

	public Integer getApplicationAttributeId() {
		return this.applicationAttributeId;
	}

	public void setApplicationAttributeId(Integer applicationAttributeId) {
		this.applicationAttributeId = applicationAttributeId;
	}

	protected Integer attributeId;

	public Integer getAttributeId() {
		return this.attributeId;
	}

	public void setAttributeId(Integer attributeId) {
		this.attributeId = attributeId;
	}

	protected String code;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	protected String fqn;

	public String getFqn() {
		return this.fqn;
	}

	public void setFqn(String fqn) {
		this.fqn = fqn;
	}

	protected String inputType;

	public String getInputType() {
		return this.inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected Integer sequence;

	public Integer getSequence() {
		return this.sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	protected String type;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	protected String vocabularyJson;

	public String getVocabularyJson() {
		return this.vocabularyJson;
	}

	public void setVocabularyJson(String vocabularyJson) {
		this.vocabularyJson = vocabularyJson;
	}

}
