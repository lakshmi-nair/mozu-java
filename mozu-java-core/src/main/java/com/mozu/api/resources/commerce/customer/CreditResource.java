/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Customer Credits resource to manage the store credit associated with a customer account. Store credit can represent a static amount the customer can redeem at any of the tenant's sites, or a gift card registered for a customer account. At this time, gift card functionality is reserved for future use.
 * </summary>
 */
public class CreditResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CreditResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of store credits applied to customer accounts, according any filter and sort criteria specified in the request.
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	CreditCollection creditCollection = credit.getCredits();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.customer.credit.CreditCollection
	 * @see com.mozu.api.contracts.customer.credit.CreditCollection
	 */
	public com.mozu.api.contracts.customer.credit.CreditCollection getCredits() throws Exception
	{
		return getCredits( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of store credits applied to customer accounts, according any filter and sort criteria specified in the request.
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	CreditCollection creditCollection = credit.getCredits( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return com.mozu.api.contracts.customer.credit.CreditCollection
	 * @see com.mozu.api.contracts.customer.credit.CreditCollection
	 */
	public com.mozu.api.contracts.customer.credit.CreditCollection getCredits(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.CreditCollection> client = com.mozu.api.clients.commerce.customer.CreditClient.getCreditsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a store credit applied to a customer account.
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	Credit credit = credit.getCredit( code);
	 * </code></pre></p>
	 * @param code User-defined code that identifies the store credit to retrieve.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public com.mozu.api.contracts.customer.credit.Credit getCredit(String code) throws Exception
	{
		return getCredit( code,  null);
	}

	/**
	 * Retrieves the details of a store credit applied to a customer account.
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	Credit credit = credit.getCredit( code,  responseFields);
	 * </code></pre></p>
	 * @param code User-defined code that identifies the store credit to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public com.mozu.api.contracts.customer.credit.Credit getCredit(String code, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> client = com.mozu.api.clients.commerce.customer.CreditClient.getCreditClient( code,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new store credit for the customer account specified in the request.
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	Credit credit = credit.addCredit( credit);
	 * </code></pre></p>
	 * @param credit Properties of the store credit to create.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public com.mozu.api.contracts.customer.credit.Credit addCredit(com.mozu.api.contracts.customer.credit.Credit credit) throws Exception
	{
		return addCredit( credit,  null);
	}

	/**
	 * Creates a new store credit for the customer account specified in the request.
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	Credit credit = credit.addCredit( credit,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param credit Properties of the store credit to create.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public com.mozu.api.contracts.customer.credit.Credit addCredit(com.mozu.api.contracts.customer.credit.Credit credit, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> client = com.mozu.api.clients.commerce.customer.CreditClient.addCreditClient( credit,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Associates an unclaimed customer credit with the shopper user authenticated in the request header.
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	Credit credit = credit.associateCreditToShopper( code);
	 * </code></pre></p>
	 * @param code The code that represents the credit to claim for the shopper.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public com.mozu.api.contracts.customer.credit.Credit associateCreditToShopper(String code) throws Exception
	{
		return associateCreditToShopper( code,  null);
	}

	/**
	 * Associates an unclaimed customer credit with the shopper user authenticated in the request header.
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	Credit credit = credit.associateCreditToShopper( code,  responseFields);
	 * </code></pre></p>
	 * @param code The code that represents the credit to claim for the shopper.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public com.mozu.api.contracts.customer.credit.Credit associateCreditToShopper(String code, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> client = com.mozu.api.clients.commerce.customer.CreditClient.associateCreditToShopperClient( code,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	credit.resendCreditCreatedEmail( code);
	 * </code></pre></p>
	 * @param code 
	 * @return 
	 */
	public void resendCreditCreatedEmail(String code) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.CreditClient.resendCreditCreatedEmailClient( code);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * Updates one or more properties of a defined store credit applied to a customer account.
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	Credit credit = credit.updateCredit( credit,  code);
	 * </code></pre></p>
	 * @param code User-defined code of the store credit to update.
	 * @param credit Properties of the store credit to update.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public com.mozu.api.contracts.customer.credit.Credit updateCredit(com.mozu.api.contracts.customer.credit.Credit credit, String code) throws Exception
	{
		return updateCredit( credit,  code,  null);
	}

	/**
	 * Updates one or more properties of a defined store credit applied to a customer account.
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	Credit credit = credit.updateCredit( credit,  code,  responseFields);
	 * </code></pre></p>
	 * @param code User-defined code of the store credit to update.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param credit Properties of the store credit to update.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public com.mozu.api.contracts.customer.credit.Credit updateCredit(com.mozu.api.contracts.customer.credit.Credit credit, String code, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> client = com.mozu.api.clients.commerce.customer.CreditClient.updateCreditClient( credit,  code,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes a store credit previously applied to a customer account.
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	credit.deleteCredit( code);
	 * </code></pre></p>
	 * @param code User-defined code of the store credit to delete.
	 * @return 
	 */
	public void deleteCredit(String code) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.CreditClient.deleteCreditClient( code);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



