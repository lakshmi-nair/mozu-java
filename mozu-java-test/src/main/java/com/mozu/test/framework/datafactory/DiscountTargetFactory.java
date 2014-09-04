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
import com.mozu.api.resources.commerce.catalog.admin.discounts.DiscountTargetResource;

/** <summary>
 * Retrieves and modifies the products, categories, and shipping methods eligible for discounts in the form of a fixed dollar amount, percentage off a product price, or free shipping.
 * </summary>
 */
public class DiscountTargetFactory
{

	public static com.mozu.api.contracts.productadmin.DiscountTarget getDiscountTarget(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer discountId, int expectedCode, int successCode) throws Exception
	{
		return getDiscountTarget(apiContext, dataViewMode,  discountId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.DiscountTarget getDiscountTarget(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer discountId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.DiscountTarget returnObj = new com.mozu.api.contracts.productadmin.DiscountTarget();
		DiscountTargetResource resource = new DiscountTargetResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getDiscountTarget( discountId,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.DiscountTarget updateDiscountTarget(ApiContext apiContext, com.mozu.api.contracts.productadmin.DiscountTarget discountTarget, Integer discountId, int expectedCode, int successCode) throws Exception
	{
		return updateDiscountTarget(apiContext,  discountTarget,  discountId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.DiscountTarget updateDiscountTarget(ApiContext apiContext, com.mozu.api.contracts.productadmin.DiscountTarget discountTarget, Integer discountId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.DiscountTarget returnObj = new com.mozu.api.contracts.productadmin.DiscountTarget();
		DiscountTargetResource resource = new DiscountTargetResource(apiContext);
		try
		{
			returnObj = resource.updateDiscountTarget( discountTarget,  discountId,  responseFields);
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


