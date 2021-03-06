/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.general.general.routing;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Mapping implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Boolean beforeRouting;

	public Boolean getBeforeRouting() {
		return this.beforeRouting;
	}

	public void setBeforeRouting(Boolean beforeRouting) {
		this.beforeRouting = beforeRouting;
	}

	protected  String docId;

	public String getDocId() {
		return this.docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	protected  String facetId;

	public String getFacetId() {
		return this.facetId;
	}

	public void setFacetId(String facetId) {
		this.facetId = facetId;
	}

	protected  String listFqn;

	public String getListFqn() {
		return this.listFqn;
	}

	public void setListFqn(String listFqn) {
		this.listFqn = listFqn;
	}

	public HashMap<String,Object> mappings;
	public HashMap<String,Object> getMappings() {
		return this.mappings;
	}
	public void setMappings(HashMap<String,Object> mappings) {
		this.mappings = mappings;
	}

	protected  String mapTo;

	public String getMapTo() {
		return this.mapTo;
	}

	public void setMapTo(String mapTo) {
		this.mapTo = mapTo;
	}

	protected  String pattern;

	public String getPattern() {
		return this.pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	protected  String replacement;

	public String getReplacement() {
		return this.replacement;
	}

	public void setReplacement(String replacement) {
		this.replacement = replacement;
	}

	protected  String type;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
