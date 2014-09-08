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
import com.mozu.api.resources.commerce.catalog.admin.SearchResource;

/** <summary>
 * 
 * </summary>
 */
public class SearchFactory
{

	public static com.mozu.api.contracts.productadmin.SearchSettings getSettings(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		return getSettings(apiContext,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.SearchSettings getSettings(ApiContext apiContext, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.SearchSettings returnObj = new com.mozu.api.contracts.productadmin.SearchSettings();
		SearchResource resource = new SearchResource(apiContext);
		try
		{
			returnObj = resource.getSettings( responseFields);
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

	public static com.mozu.api.contracts.productadmin.SearchSettings updateSettings(ApiContext apiContext, com.mozu.api.contracts.productadmin.SearchSettings settings, int expectedCode, int successCode) throws Exception
	{
		return updateSettings(apiContext,  settings,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.SearchSettings updateSettings(ApiContext apiContext, com.mozu.api.contracts.productadmin.SearchSettings settings, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.SearchSettings returnObj = new com.mozu.api.contracts.productadmin.SearchSettings();
		SearchResource resource = new SearchResource(apiContext);
		try
		{
			returnObj = resource.updateSettings( settings,  responseFields);
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



