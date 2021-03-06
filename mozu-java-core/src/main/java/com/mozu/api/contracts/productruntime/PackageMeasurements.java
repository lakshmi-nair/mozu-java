/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.Measurement;

/**
 *	Dimensions of the packaged product.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PackageMeasurements implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Height of a package or bundle package in imperial units of feet and inches.
	 */
	protected  Measurement packageHeight;

	public Measurement getPackageHeight() {
		return this.packageHeight;
	}

	public void setPackageHeight(Measurement packageHeight) {
		this.packageHeight = packageHeight;
	}

	/**
	 * Length of a package or bundle package in imperial units of feet and inches.
	 */
	protected  Measurement packageLength;

	public Measurement getPackageLength() {
		return this.packageLength;
	}

	public void setPackageLength(Measurement packageLength) {
		this.packageLength = packageLength;
	}

	/**
	 * Weight of a package or bundle package in imperial units of pounds and ounces.
	 */
	protected  Measurement packageWeight;

	public Measurement getPackageWeight() {
		return this.packageWeight;
	}

	public void setPackageWeight(Measurement packageWeight) {
		this.packageWeight = packageWeight;
	}

	/**
	 * Width of a package or bundle package in imperial units of feet and inches.
	 */
	protected  Measurement packageWidth;

	public Measurement getPackageWidth() {
		return this.packageWidth;
	}

	public void setPackageWidth(Measurement packageWidth) {
		this.packageWidth = packageWidth;
	}


}
