/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.platform.UserDataResource;

/** <summary>
 * Use the user data subresource to store user-level data required for a third-party application in the Mozu database.
 * </summary>
 */
public class UserDataFactory
{

	public static String getDBValue(ApiContext apiContext, String dbEntryQuery, int expectedCode) throws Exception
	{
		return getDBValue(apiContext,  dbEntryQuery,  null, expectedCode);
	}

	public static String getDBValue(ApiContext apiContext, String dbEntryQuery, String responseFields, int expectedCode) throws Exception
	{
		String returnObj = new String();
		UserDataResource resource = new UserDataResource(apiContext);
		try
		{
			returnObj = resource.getDBValue( dbEntryQuery,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static void createDBValue(ApiContext apiContext, String value, String dbEntryQuery, int expectedCode) throws Exception
	{
		UserDataResource resource = new UserDataResource(apiContext);
		try
		{
			resource.createDBValue( value,  dbEntryQuery);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

	public static void updateDBValue(ApiContext apiContext, String value, String dbEntryQuery, int expectedCode) throws Exception
	{
		UserDataResource resource = new UserDataResource(apiContext);
		try
		{
			resource.updateDBValue( value,  dbEntryQuery);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

	public static void deleteDBValue(ApiContext apiContext, String dbEntryQuery, int expectedCode) throws Exception
	{
		UserDataResource resource = new UserDataResource(apiContext);
		try
		{
			resource.deleteDBValue( dbEntryQuery);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

}



