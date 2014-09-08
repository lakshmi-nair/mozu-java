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
import com.mozu.api.resources.commerce.catalog.admin.CategoryResource;

/** <summary>
 * Use the Categories resource to organize products and control where they appear on the storefront. Create and maintain a hierarchy of categories and subcategories where the site will store properties.
 * </summary>
 */
public class CategoryFactory
{

	public static com.mozu.api.contracts.productadmin.CategoryPagedCollection getCategories(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		return getCategories(apiContext,  null,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.CategoryPagedCollection getCategories(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.CategoryPagedCollection returnObj = new com.mozu.api.contracts.productadmin.CategoryPagedCollection();
		CategoryResource resource = new CategoryResource(apiContext);
		try
		{
			returnObj = resource.getCategories( startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.CategoryCollection getChildCategories(ApiContext apiContext, Integer categoryId, int expectedCode, int successCode) throws Exception
	{
		return getChildCategories(apiContext,  categoryId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.CategoryCollection getChildCategories(ApiContext apiContext, Integer categoryId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.CategoryCollection returnObj = new com.mozu.api.contracts.productadmin.CategoryCollection();
		CategoryResource resource = new CategoryResource(apiContext);
		try
		{
			returnObj = resource.getChildCategories( categoryId,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.Category getCategory(ApiContext apiContext, Integer categoryId, int expectedCode, int successCode) throws Exception
	{
		return getCategory(apiContext,  categoryId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.Category getCategory(ApiContext apiContext, Integer categoryId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.Category returnObj = new com.mozu.api.contracts.productadmin.Category();
		CategoryResource resource = new CategoryResource(apiContext);
		try
		{
			returnObj = resource.getCategory( categoryId,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.Category addCategory(ApiContext apiContext, com.mozu.api.contracts.productadmin.Category category, int expectedCode, int successCode) throws Exception
	{
		return addCategory(apiContext,  category,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.Category addCategory(ApiContext apiContext, com.mozu.api.contracts.productadmin.Category category, Boolean incrementSequence, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.Category returnObj = new com.mozu.api.contracts.productadmin.Category();
		CategoryResource resource = new CategoryResource(apiContext);
		try
		{
			returnObj = resource.addCategory( category,  incrementSequence,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.Category updateCategory(ApiContext apiContext, com.mozu.api.contracts.productadmin.Category category, Integer categoryId, int expectedCode, int successCode) throws Exception
	{
		return updateCategory(apiContext,  category,  categoryId,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.Category updateCategory(ApiContext apiContext, com.mozu.api.contracts.productadmin.Category category, Integer categoryId, Boolean cascadeVisibility, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.Category returnObj = new com.mozu.api.contracts.productadmin.Category();
		CategoryResource resource = new CategoryResource(apiContext);
		try
		{
			returnObj = resource.updateCategory( category,  categoryId,  cascadeVisibility,  responseFields);
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

	public static void deleteCategoryById(ApiContext apiContext, Integer categoryId, int expectedCode, int successCode) throws Exception
	{
		deleteCategoryById(apiContext,  categoryId,  null, expectedCode, successCode );
	}

	public static void deleteCategoryById(ApiContext apiContext, Integer categoryId, Boolean cascadeDelete, int expectedCode, int successCode) throws Exception
	{
				CategoryResource resource = new CategoryResource(apiContext);
		try
		{
			resource.deleteCategoryById( categoryId,  cascadeDelete);
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



