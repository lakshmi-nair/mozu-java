/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.customer.accounts;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class CustomerPurchaseOrderAccountUrl
{

	/**
	 * Get Resource Url for GetCustomerPurchaseOrderAccount
	 * @param accountId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getCustomerPurchaseOrderAccountUrl(Integer accountId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/purchaseOrderAccount?responseFields={responseFields}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetCustomerPurchaseOrderTransactions
	 * @param accountId 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getCustomerPurchaseOrderTransactionsUrl(Integer accountId, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/PurchaseOrderTransaction?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&responseFields={responseFields}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateCustomerPurchaseOrderAccount
	 * @param accountId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl createCustomerPurchaseOrderAccountUrl(Integer accountId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/purchaseOrderAccount?responseFields={responseFields}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreatePurchaseOrderTransaction
	 * @param accountId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl createPurchaseOrderTransactionUrl(Integer accountId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/PurchaseOrderTransaction?responseFields={responseFields}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateCustomerPurchaseOrderAccount
	 * @param accountId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateCustomerPurchaseOrderAccountUrl(Integer accountId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/purchaseOrderAccount?responseFields={responseFields}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteCustomerPurchaseOrderAccount
	 * @param accountId 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteCustomerPurchaseOrderAccountUrl(Integer accountId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/purchaseOrderAccount");
		formatter.formatUrl("accountId", accountId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

