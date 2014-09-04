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
import com.mozu.api.resources.commerce.customer.credits.CreditAuditEntryResource;

/** <summary>
 * Use the Customer Credit Audit Entries subresource to retrieve entries logged in the audit report of a store credit or gift card applied to a customer account. The system creates a new audit entry when the credit is created, deleted, activated, or deactivated. The system then creates a new audit entry each time the credit is updated or redeemed in a transaction.
 * </summary>
 */
public class CreditAuditEntryFactory
{

	public static com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection getAuditEntries(ApiContext apiContext, String code, int expectedCode, int successCode) throws Exception
	{
		return getAuditEntries(apiContext,  code,  null,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection getAuditEntries(ApiContext apiContext, String code, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection returnObj = new com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection();
		CreditAuditEntryResource resource = new CreditAuditEntryResource(apiContext);
		try
		{
			returnObj = resource.getAuditEntries( code,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
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


