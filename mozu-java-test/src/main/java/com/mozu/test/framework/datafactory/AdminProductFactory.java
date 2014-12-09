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
import com.mozu.api.resources.commerce.catalog.admin.ProductResource;

/** <summary>
 * Use the Product Administration resource to create new product definitions in the master catalog and determine which catalogs will feature products. You can also assign attribute values for defined products, manage product-level location inventory, and configure the variations of a product.
 * </summary>
 */
public class AdminProductFactory
{

	public static com.mozu.api.contracts.productadmin.ProductCollection getProducts(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, int expectedCode, int successCode) throws Exception
	{
		return getProducts(apiContext, dataViewMode,  null,  null,  null,  null,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.ProductCollection getProducts(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer startIndex, Integer pageSize, String sortBy, String filter, String q, Integer qLimit, Boolean noCount, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductCollection returnObj = new com.mozu.api.contracts.productadmin.ProductCollection();
		ProductResource resource = new ProductResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProducts( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  noCount,  responseFields);
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

	public static List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> getProductInCatalogs(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>();
		ProductResource resource = new ProductResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProductInCatalogs( productCode);
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

	public static com.mozu.api.contracts.productadmin.ProductInCatalogInfo getProductInCatalog(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, Integer catalogId, int expectedCode, int successCode) throws Exception
	{
		return getProductInCatalog(apiContext, dataViewMode,  productCode,  catalogId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.ProductInCatalogInfo getProductInCatalog(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, Integer catalogId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductInCatalogInfo returnObj = new com.mozu.api.contracts.productadmin.ProductInCatalogInfo();
		ProductResource resource = new ProductResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProductInCatalog( productCode,  catalogId,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.Product getProduct(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, int expectedCode, int successCode) throws Exception
	{
		return getProduct(apiContext, dataViewMode,  productCode,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.Product getProduct(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.Product returnObj = new com.mozu.api.contracts.productadmin.Product();
		ProductResource resource = new ProductResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProduct( productCode,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.Product addProduct(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Product product, int expectedCode, int successCode) throws Exception
	{
		return addProduct(apiContext, dataViewMode,  product,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.Product addProduct(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Product product, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.Product returnObj = new com.mozu.api.contracts.productadmin.Product();
		ProductResource resource = new ProductResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.addProduct( product,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.ProductInCatalogInfo addProductInCatalog(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductInCatalogInfo productInCatalogInfoIn, String productCode, int expectedCode, int successCode) throws Exception
	{
		return addProductInCatalog(apiContext, dataViewMode,  productInCatalogInfoIn,  productCode,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.ProductInCatalogInfo addProductInCatalog(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductInCatalogInfo productInCatalogInfoIn, String productCode, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductInCatalogInfo returnObj = new com.mozu.api.contracts.productadmin.ProductInCatalogInfo();
		ProductResource resource = new ProductResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.addProductInCatalog( productInCatalogInfoIn,  productCode,  responseFields);
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

	public static void renameProductCodes(ApiContext apiContext, List<com.mozu.api.contracts.productadmin.ProductCodeRename> productCodeRenames, int expectedCode, int successCode) throws Exception
	{
		ProductResource resource = new ProductResource(apiContext);
		try
		{
			resource.renameProductCodes( productCodeRenames);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
	}

	public static List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> updateProductInCatalogs(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> productInCatalogsIn, String productCode, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>();
		ProductResource resource = new ProductResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.updateProductInCatalogs( productInCatalogsIn,  productCode);
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

	public static com.mozu.api.contracts.productadmin.ProductInCatalogInfo updateProductInCatalog(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductInCatalogInfo productInCatalogInfoIn, String productCode, Integer catalogId, int expectedCode, int successCode) throws Exception
	{
		return updateProductInCatalog(apiContext, dataViewMode,  productInCatalogInfoIn,  productCode,  catalogId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.ProductInCatalogInfo updateProductInCatalog(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductInCatalogInfo productInCatalogInfoIn, String productCode, Integer catalogId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductInCatalogInfo returnObj = new com.mozu.api.contracts.productadmin.ProductInCatalogInfo();
		ProductResource resource = new ProductResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.updateProductInCatalog( productInCatalogInfoIn,  productCode,  catalogId,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.Product updateProduct(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Product product, String productCode, int expectedCode, int successCode) throws Exception
	{
		return updateProduct(apiContext, dataViewMode,  product,  productCode,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.Product updateProduct(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Product product, String productCode, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.Product returnObj = new com.mozu.api.contracts.productadmin.Product();
		ProductResource resource = new ProductResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.updateProduct( product,  productCode,  responseFields);
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

	public static void deleteProduct(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, int expectedCode, int successCode) throws Exception
	{
		ProductResource resource = new ProductResource(apiContext, dataViewMode);
		try
		{
			resource.deleteProduct( productCode);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
	}

	public static void deleteProductInCatalog(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, Integer catalogId, int expectedCode, int successCode) throws Exception
	{
		ProductResource resource = new ProductResource(apiContext, dataViewMode);
		try
		{
			resource.deleteProductInCatalog( productCode,  catalogId);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
	}

}



