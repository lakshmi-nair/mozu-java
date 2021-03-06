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
import com.mozu.api.resources.commerce.customer.accounts.CustomerNoteResource;

/** <summary>
 * Tenant administrators can add and view internal notes for a customer account. For example, a client can track a shopper's interests or complaints. Only clients can add and view notes. Shoppers cannot view these notes from the My Account page.
 * </summary>
 */
public class CustomerNoteFactory
{

	public static com.mozu.api.contracts.customer.CustomerNote getAccountNote(ApiContext apiContext, Integer accountId, Integer noteId, int expectedCode) throws Exception
	{
		return getAccountNote(apiContext,  accountId,  noteId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerNote getAccountNote(ApiContext apiContext, Integer accountId, Integer noteId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerNote returnObj = new com.mozu.api.contracts.customer.CustomerNote();
		CustomerNoteResource resource = new CustomerNoteResource(apiContext);
		try
		{
			returnObj = resource.getAccountNote( accountId,  noteId,  responseFields);
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

	public static com.mozu.api.contracts.customer.CustomerNoteCollection getAccountNotes(ApiContext apiContext, Integer accountId, int expectedCode) throws Exception
	{
		return getAccountNotes(apiContext,  accountId,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerNoteCollection getAccountNotes(ApiContext apiContext, Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerNoteCollection returnObj = new com.mozu.api.contracts.customer.CustomerNoteCollection();
		CustomerNoteResource resource = new CustomerNoteResource(apiContext);
		try
		{
			returnObj = resource.getAccountNotes( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.customer.CustomerNote addAccountNote(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, int expectedCode) throws Exception
	{
		return addAccountNote(apiContext,  note,  accountId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerNote addAccountNote(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerNote returnObj = new com.mozu.api.contracts.customer.CustomerNote();
		CustomerNoteResource resource = new CustomerNoteResource(apiContext);
		try
		{
			returnObj = resource.addAccountNote( note,  accountId,  responseFields);
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

	public static com.mozu.api.contracts.customer.CustomerNote updateAccountNote(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, Integer noteId, int expectedCode) throws Exception
	{
		return updateAccountNote(apiContext,  note,  accountId,  noteId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerNote updateAccountNote(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, Integer noteId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerNote returnObj = new com.mozu.api.contracts.customer.CustomerNote();
		CustomerNoteResource resource = new CustomerNoteResource(apiContext);
		try
		{
			returnObj = resource.updateAccountNote( note,  accountId,  noteId,  responseFields);
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

	public static void deleteAccountNote(ApiContext apiContext, Integer accountId, Integer noteId, int expectedCode) throws Exception
	{
		CustomerNoteResource resource = new CustomerNoteResource(apiContext);
		try
		{
			resource.deleteAccountNote( accountId,  noteId);
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



