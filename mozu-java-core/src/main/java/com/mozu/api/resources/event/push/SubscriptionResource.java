/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.event.push;

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
 * The Subscriptions resource triggers a push service to sent immediate notifications to the subscribed tenants and applications when triggers. The resource sends messages regarding a subscription event tha occurs in the tenant or site.
 * </summary>
 */
public class SubscriptionResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public SubscriptionResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of events according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	Subscription subscription = new Subscription();
	 *	SubscriptionCollection subscriptionCollection = subscription.getSubscriptions();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.event.SubscriptionCollection
	 * @see com.mozu.api.contracts.event.SubscriptionCollection
	 */
	public com.mozu.api.contracts.event.SubscriptionCollection getSubscriptions() throws Exception
	{
		return getSubscriptions( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of events according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	Subscription subscription = new Subscription();
	 *	SubscriptionCollection subscriptionCollection = subscription.getSubscriptions( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The amount is divided and displayed on the `pageCount `amount of pages. The default is 20 and maximum value is 200 per page.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a `pageSize `of 25, to get the 51st through the 75th items, use `startIndex=50`.
	 * @return com.mozu.api.contracts.event.SubscriptionCollection
	 * @see com.mozu.api.contracts.event.SubscriptionCollection
	 */
	public com.mozu.api.contracts.event.SubscriptionCollection getSubscriptions(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.event.SubscriptionCollection> client = com.mozu.api.clients.event.push.SubscriptionClient.getSubscriptionsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



