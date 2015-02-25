/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.reference;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	The state code, name, and tags, if applicable. 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class State implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The two character state code. 
	 */
	protected String code;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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
	 * Distinguishing information about a state, such as IsArmedForces or IsUSTerritory
	 */
	protected String tags;

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

}
