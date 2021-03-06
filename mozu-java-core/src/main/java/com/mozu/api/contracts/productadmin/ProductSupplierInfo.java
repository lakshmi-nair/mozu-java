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
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.productadmin.ProductCost;

/**
 *	Supplier-defined properties assigned for the product.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductSupplierInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The distributor part number associated with this product, defined by the product distributor.
	 */
	protected  String distPartNumber;

	public String getDistPartNumber() {
		return this.distPartNumber;
	}

	public void setDistPartNumber(String distPartNumber) {
		this.distPartNumber = distPartNumber;
	}

	/**
	 * The manufacturer's part number for the product.
	 */
	protected  String mfgPartNumber;

	public String getMfgPartNumber() {
		return this.mfgPartNumber;
	}

	public void setMfgPartNumber(String mfgPartNumber) {
		this.mfgPartNumber = mfgPartNumber;
	}

	/**
	 * The amount the client pays the supplier to stock this product in its catalogs.
	 */
	protected  ProductCost cost;

	public ProductCost getCost() {
		return this.cost;
	}

	public void setCost(ProductCost cost) {
		this.cost = cost;
	}


}
