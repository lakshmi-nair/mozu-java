/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.storefront.ProductResource;

/** <summary>
 * Manage shoppers' product selection process during a visit to the storefront. Update product options as shoppers pick and choose their product choices. A shopper cannot add a product to a cart until all of its required options have been selected.
 * </summary>
 */
public class ProductFactory
{

	public static com.mozu.api.contracts.productruntime.ProductCollection getProducts(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, int expectedCode, int successCode) throws Exception
	{
		return getProducts(apiContext, dataViewMode,  null,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productruntime.ProductCollection getProducts(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String filter, Integer startIndex, Integer pageSize, String sortBy, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.ProductCollection returnObj = new com.mozu.api.contracts.productruntime.ProductCollection();
		ProductResource resource = new ProductResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProducts( filter,  startIndex,  pageSize,  sortBy,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static com.mozu.api.contracts.productruntime.LocationInventoryCollection getProductInventory(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, int expectedCode, int successCode) throws Exception
	{
		return getProductInventory(apiContext, dataViewMode,  productCode,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productruntime.LocationInventoryCollection getProductInventory(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String locationCodes, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.LocationInventoryCollection returnObj = new com.mozu.api.contracts.productruntime.LocationInventoryCollection();
		ProductResource resource = new ProductResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProductInventory( productCode,  locationCodes,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static com.mozu.api.contracts.productruntime.Product getProduct(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, int expectedCode, int successCode) throws Exception
	{
		return getProduct(apiContext, dataViewMode,  productCode,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productruntime.Product getProduct(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String variationProductCode, Boolean allowInactive, Boolean skipInventoryCheck, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.Product returnObj = new com.mozu.api.contracts.productruntime.Product();
		ProductResource resource = new ProductResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProduct( productCode,  variationProductCode,  allowInactive,  skipInventoryCheck,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static com.mozu.api.contracts.productruntime.ConfiguredProduct configuredProduct(ApiContext apiContext, com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode, int expectedCode, int successCode) throws Exception
	{
		return configuredProduct(apiContext,  productOptionSelections,  productCode,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productruntime.ConfiguredProduct configuredProduct(ApiContext apiContext, com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode, Boolean includeOptionDetails, Boolean skipInventoryCheck, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.ConfiguredProduct returnObj = new com.mozu.api.contracts.productruntime.ConfiguredProduct();
		ProductResource resource = new ProductResource(apiContext);
		try
		{
			returnObj = resource.configuredProduct( productOptionSelections,  productCode,  includeOptionDetails,  skipInventoryCheck,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static com.mozu.api.contracts.productruntime.ProductValidationSummary validateProduct(ApiContext apiContext, com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode, int expectedCode, int successCode) throws Exception
	{
		return validateProduct(apiContext,  productOptionSelections,  productCode,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productruntime.ProductValidationSummary validateProduct(ApiContext apiContext, com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode, Boolean skipInventoryCheck, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.ProductValidationSummary returnObj = new com.mozu.api.contracts.productruntime.ProductValidationSummary();
		ProductResource resource = new ProductResource(apiContext);
		try
		{
			returnObj = resource.validateProduct( productOptionSelections,  productCode,  skipInventoryCheck,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static com.mozu.api.contracts.productruntime.DiscountValidationSummary validateDiscounts(ApiContext apiContext, com.mozu.api.contracts.productruntime.DiscountSelections discountSelections, String productCode, int expectedCode, int successCode) throws Exception
	{
		return validateDiscounts(apiContext,  discountSelections,  productCode,  null,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productruntime.DiscountValidationSummary validateDiscounts(ApiContext apiContext, com.mozu.api.contracts.productruntime.DiscountSelections discountSelections, String productCode, String variationProductCode, Integer customerAccountId, Boolean allowInactive, Boolean skipInventoryCheck, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.DiscountValidationSummary returnObj = new com.mozu.api.contracts.productruntime.DiscountValidationSummary();
		ProductResource resource = new ProductResource(apiContext);
		try
		{
			returnObj = resource.validateDiscounts( discountSelections,  productCode,  variationProductCode,  customerAccountId,  allowInactive,  skipInventoryCheck,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static com.mozu.api.contracts.productruntime.LocationInventoryCollection getProductInventories(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productruntime.LocationInventoryQuery query, int expectedCode, int successCode) throws Exception
	{
		return getProductInventories(apiContext, dataViewMode,  query,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productruntime.LocationInventoryCollection getProductInventories(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productruntime.LocationInventoryQuery query, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.LocationInventoryCollection returnObj = new com.mozu.api.contracts.productruntime.LocationInventoryCollection();
		ProductResource resource = new ProductResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProductInventories( query,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

}


