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
import com.mozu.api.resources.commerce.orders.OrderItemResource;

/** <summary>
 * Use this subresource to retrieve details about items in an active order.
 * </summary>
 */
public class OrderItemFactory
{

	public static com.mozu.api.contracts.commerceruntime.orders.OrderItem getOrderItem(ApiContext apiContext, String orderId, String orderItemId, int expectedCode, int successCode) throws Exception
	{
		return getOrderItem(apiContext,  orderId,  orderItemId,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.orders.OrderItem getOrderItem(ApiContext apiContext, String orderId, String orderItemId, Boolean draft, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.OrderItem returnObj = new com.mozu.api.contracts.commerceruntime.orders.OrderItem();
		OrderItemResource resource = new OrderItemResource(apiContext);
		try
		{
			returnObj = resource.getOrderItem( orderId,  orderItemId,  draft,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection getOrderItems(ApiContext apiContext, String orderId, int expectedCode, int successCode) throws Exception
	{
		return getOrderItems(apiContext,  orderId,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection getOrderItems(ApiContext apiContext, String orderId, Boolean draft, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection returnObj = new com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection();
		OrderItemResource resource = new OrderItemResource(apiContext);
		try
		{
			returnObj = resource.getOrderItems( orderId,  draft,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.orders.Order createOrderItem(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId, int expectedCode, int successCode) throws Exception
	{
		return createOrderItem(apiContext,  orderItem,  orderId,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order createOrderItem(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId, String updateMode, String version, Boolean skipInventoryCheck, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		OrderItemResource resource = new OrderItemResource(apiContext);
		try
		{
			returnObj = resource.createOrderItem( orderItem,  orderId,  updateMode,  version,  skipInventoryCheck,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.orders.Order updateOrderItemDiscount(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, String orderItemId, Integer discountId, int expectedCode, int successCode) throws Exception
	{
		return updateOrderItemDiscount(apiContext,  discount,  orderId,  orderItemId,  discountId,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order updateOrderItemDiscount(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, String orderItemId, Integer discountId, String updateMode, String version, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		OrderItemResource resource = new OrderItemResource(apiContext);
		try
		{
			returnObj = resource.updateOrderItemDiscount( discount,  orderId,  orderItemId,  discountId,  updateMode,  version,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.orders.Order updateItemFulfillment(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId, String orderItemId, int expectedCode, int successCode) throws Exception
	{
		return updateItemFulfillment(apiContext,  orderItem,  orderId,  orderItemId,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order updateItemFulfillment(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId, String orderItemId, String updateMode, String version, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		OrderItemResource resource = new OrderItemResource(apiContext);
		try
		{
			returnObj = resource.updateItemFulfillment( orderItem,  orderId,  orderItemId,  updateMode,  version,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.orders.Order updateItemProductPrice(ApiContext apiContext, String orderId, String orderItemId, Double price, int expectedCode, int successCode) throws Exception
	{
		return updateItemProductPrice(apiContext,  orderId,  orderItemId,  price,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order updateItemProductPrice(ApiContext apiContext, String orderId, String orderItemId, Double price, String updateMode, String version, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		OrderItemResource resource = new OrderItemResource(apiContext);
		try
		{
			returnObj = resource.updateItemProductPrice( orderId,  orderItemId,  price,  updateMode,  version,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.orders.Order updateItemQuantity(ApiContext apiContext, String orderId, String orderItemId, Integer quantity, int expectedCode, int successCode) throws Exception
	{
		return updateItemQuantity(apiContext,  orderId,  orderItemId,  quantity,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order updateItemQuantity(ApiContext apiContext, String orderId, String orderItemId, Integer quantity, String updateMode, String version, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		OrderItemResource resource = new OrderItemResource(apiContext);
		try
		{
			returnObj = resource.updateItemQuantity( orderId,  orderItemId,  quantity,  updateMode,  version,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.orders.Order deleteOrderItem(ApiContext apiContext, String orderId, String orderItemId, int expectedCode, int successCode) throws Exception
	{
		return deleteOrderItem(apiContext,  orderId,  orderItemId,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order deleteOrderItem(ApiContext apiContext, String orderId, String orderItemId, String updateMode, String version, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		OrderItemResource resource = new OrderItemResource(apiContext);
		try
		{
			returnObj = resource.deleteOrderItem( orderId,  orderItemId,  updateMode,  version);
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



