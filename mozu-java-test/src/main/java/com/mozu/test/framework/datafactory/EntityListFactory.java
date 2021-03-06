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
import com.mozu.api.resources.platform.EntityListResource;

/** <summary>
 * The Entity Lists resource manages all dynamic entities in your Mozu document store of the Mozu cloud. The content is JSON and can have up to five indexed properties (integer, decimal, string, date, and boolean) with support for additional customized elements as needed. Every document in the entity list has a validated unique ID. 
 * </summary>
 */
public class EntityListFactory
{

	public static com.mozu.api.contracts.mzdb.EntityListCollection getEntityLists(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getEntityLists(apiContext,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.mzdb.EntityListCollection getEntityLists(ApiContext apiContext, Integer pageSize, Integer startIndex, String filter, String sortBy, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.mzdb.EntityListCollection returnObj = new com.mozu.api.contracts.mzdb.EntityListCollection();
		EntityListResource resource = new EntityListResource(apiContext);
		try
		{
			returnObj = resource.getEntityLists( pageSize,  startIndex,  filter,  sortBy,  responseFields);
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

	public static com.mozu.api.contracts.mzdb.EntityList getEntityList(ApiContext apiContext, String entityListFullName, int expectedCode) throws Exception
	{
		return getEntityList(apiContext,  entityListFullName,  null, expectedCode);
	}

	public static com.mozu.api.contracts.mzdb.EntityList getEntityList(ApiContext apiContext, String entityListFullName, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.mzdb.EntityList returnObj = new com.mozu.api.contracts.mzdb.EntityList();
		EntityListResource resource = new EntityListResource(apiContext);
		try
		{
			returnObj = resource.getEntityList( entityListFullName,  responseFields);
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

	public static com.mozu.api.contracts.mzdb.EntityList createEntityList(ApiContext apiContext, com.mozu.api.contracts.mzdb.EntityList entityList, int expectedCode) throws Exception
	{
		return createEntityList(apiContext,  entityList,  null, expectedCode);
	}

	public static com.mozu.api.contracts.mzdb.EntityList createEntityList(ApiContext apiContext, com.mozu.api.contracts.mzdb.EntityList entityList, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.mzdb.EntityList returnObj = new com.mozu.api.contracts.mzdb.EntityList();
		EntityListResource resource = new EntityListResource(apiContext);
		try
		{
			returnObj = resource.createEntityList( entityList,  responseFields);
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

	public static com.mozu.api.contracts.mzdb.EntityList updateEntityList(ApiContext apiContext, com.mozu.api.contracts.mzdb.EntityList entityList, String entityListFullName, int expectedCode) throws Exception
	{
		return updateEntityList(apiContext,  entityList,  entityListFullName,  null, expectedCode);
	}

	public static com.mozu.api.contracts.mzdb.EntityList updateEntityList(ApiContext apiContext, com.mozu.api.contracts.mzdb.EntityList entityList, String entityListFullName, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.mzdb.EntityList returnObj = new com.mozu.api.contracts.mzdb.EntityList();
		EntityListResource resource = new EntityListResource(apiContext);
		try
		{
			returnObj = resource.updateEntityList( entityList,  entityListFullName,  responseFields);
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

	public static void deleteEntityList(ApiContext apiContext, String entityListFullName, int expectedCode) throws Exception
	{
		EntityListResource resource = new EntityListResource(apiContext);
		try
		{
			resource.deleteEntityList( entityListFullName);
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



