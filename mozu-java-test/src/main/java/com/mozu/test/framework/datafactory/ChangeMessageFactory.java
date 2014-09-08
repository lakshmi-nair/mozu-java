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
import com.mozu.api.resources.commerce.carts.ChangeMessageResource;

/** <summary>
 * Use the Cart Messages resource to retrieve messages for live carts that the system logs when a product's price or inventory level changes.
 * </summary>
 */
public class ChangeMessageFactory
{

	public static com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection getMessages(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		return getMessages(apiContext,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection getMessages(ApiContext apiContext, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection returnObj = new com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection();
		ChangeMessageResource resource = new ChangeMessageResource(apiContext);
		try
		{
			returnObj = resource.getMessages( responseFields);
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

	public static void removeAllMessages(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
				ChangeMessageResource resource = new ChangeMessageResource(apiContext);
		try
		{
			resource.removeAllMessages();
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

	public static void removeMessage(ApiContext apiContext, String messageId, int expectedCode, int successCode) throws Exception
	{
				ChangeMessageResource resource = new ChangeMessageResource(apiContext);
		try
		{
			resource.removeMessage( messageId);
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



