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

@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeVocabularyValueDisplayInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String cmsId;

	public String getCmsId() {
		return this.cmsId;
	}

	public void setCmsId(String cmsId) {
		this.cmsId = cmsId;
	}

	protected String colorValue;

	public String getColorValue() {
		return this.colorValue;
	}

	public void setColorValue(String colorValue) {
		this.colorValue = colorValue;
	}

	protected String imageUrl;

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
