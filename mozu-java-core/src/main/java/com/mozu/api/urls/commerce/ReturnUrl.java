/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ReturnUrl
{

	/**
	 * Get Resource Url for GetReturns
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return   String Resource Url
	 */
	public static MozuUrl getReturnsUrl(String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAvailableReturnActions
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAvailableReturnActionsUrl(String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/actions");
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetReturnItem
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @param returnItemId Unique identifier of the return item whose details you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl getReturnItemUrl(String responseFields, String returnId, String returnItemId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/items/{returnItemId}?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		formatter.formatUrl("returnItemId", returnItemId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetReturnItems
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl getReturnItemsUrl(String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/items?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAvailablePaymentActionsForReturn
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAvailablePaymentActionsForReturnUrl(String paymentId, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/payments/{paymentId}/actions");
		formatter.formatUrl("paymentId", paymentId);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetPayment
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPaymentUrl(String paymentId, String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/payments/{paymentId}?responseFields={responseFields}");
		formatter.formatUrl("paymentId", paymentId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetPayments
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPaymentsUrl(String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/payments?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetReturn
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl getReturnUrl(String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateReturn
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl createReturnUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateReturnItem
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl createReturnItemUrl(String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/items?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for PerformPaymentActionForReturn
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl performPaymentActionForReturnUrl(String paymentId, String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/payments/{paymentId}/actions?responseFields={responseFields}");
		formatter.formatUrl("paymentId", paymentId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreatePaymentActionForReturn
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl createPaymentActionForReturnUrl(String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/payments/actions?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for PerformReturnActions
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl performReturnActionsUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/actions?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateReturn
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateReturnUrl(String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ResendReturnEmail
	 * @return   String Resource Url
	 */
	public static MozuUrl resendReturnEmailUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/Resend-Email");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteOrderItem
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @param returnItemId Unique identifier of the return item whose details you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteOrderItemUrl(String returnId, String returnItemId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{orderId}/items/{orderItemId}?updatemode={updateMode}&version={version}");
		formatter.formatUrl("returnId", returnId);
		formatter.formatUrl("returnItemId", returnItemId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteReturn
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteReturnUrl(String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}");
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

