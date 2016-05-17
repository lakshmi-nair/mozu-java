/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.shipping;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Properties of the shipment signature requirements for the specified site.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteShippingSignatureRequirement implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * If true, this site requires signatures on shipments for orders that exceed the minimum value threshold.
	 */
	protected Boolean isSignatureRequired;

	public Boolean getIsSignatureRequired() {
		return this.isSignatureRequired;
	}

	public void setIsSignatureRequired(Boolean isSignatureRequired) {
		this.isSignatureRequired = isSignatureRequired;
	}

	/**
	 * The minimum order amount that requires a signature on shipments. For example, if you want to require customer signatures on all orders over $5,000, the MinimumValueThreshold would be 5001.
	 */
	protected Double minimumValueThreshold;

	public Double getMinimumValueThreshold() {
		return this.minimumValueThreshold;
	}

	public void setMinimumValueThreshold(Double minimumValueThreshold) {
		this.minimumValueThreshold = minimumValueThreshold;
	}

}
