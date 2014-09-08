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
import com.mozu.api.resources.commerce.returns.ShipmentResource;

/** <summary>
 * Use the Return Shipments subresource to manage shipments for a return replacement.
 * </summary>
 */
public class ShipmentFactory
{

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Shipment getShipment(ApiContext apiContext, String returnId, String shipmentId, int expectedCode, int successCode) throws Exception
	{
		return getShipment(apiContext,  returnId,  shipmentId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Shipment getShipment(ApiContext apiContext, String returnId, String shipmentId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.fulfillment.Shipment returnObj = new com.mozu.api.contracts.commerceruntime.fulfillment.Shipment();
		ShipmentResource resource = new ShipmentResource(apiContext);
		try
		{
			returnObj = resource.getShipment( returnId,  shipmentId,  responseFields);
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

	public static List<com.mozu.api.contracts.commerceruntime.fulfillment.Package> createPackageShipments(ApiContext apiContext, List<String> packageIds, String returnId, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.commerceruntime.fulfillment.Package> returnObj = new ArrayList<com.mozu.api.contracts.commerceruntime.fulfillment.Package>();
		ShipmentResource resource = new ShipmentResource(apiContext);
		try
		{
			returnObj = resource.createPackageShipments( packageIds,  returnId);
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

	public static void deleteShipment(ApiContext apiContext, String returnId, String shipmentId, int expectedCode, int successCode) throws Exception
	{
				ShipmentResource resource = new ShipmentResource(apiContext);
		try
		{
			resource.deleteShipment( returnId,  shipmentId);
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



