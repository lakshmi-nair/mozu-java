/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.event.push.subscriptions;

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
 * 
 * </summary>
 */
public class EventDeliverySummaryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public EventDeliverySummaryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * This operation method is the external/public event entity used specifically in pull/poll event scenarios.
	 * <p><pre><code>
	 *	EventDeliverySummary eventdeliverysummary = new EventDeliverySummary();
	 *	EventDeliverySummary eventDeliverySummary = eventdeliverysummary.getDeliveryAttemptSummary( subscriptionId);
	 * </code></pre></p>
	 * @param subscriptionId This operation paramenter is the unique identifer for a subscription.
	 * @return com.mozu.api.contracts.event.EventDeliverySummary
	 * @see com.mozu.api.contracts.event.EventDeliverySummary
	 */
	public com.mozu.api.contracts.event.EventDeliverySummary getDeliveryAttemptSummary(String subscriptionId) throws Exception
	{
		return getDeliveryAttemptSummary( subscriptionId,  null,  null);
	}

	/**
	 * This operation method is the external/public event entity used specifically in pull/poll event scenarios.
	 * <p><pre><code>
	 *	EventDeliverySummary eventdeliverysummary = new EventDeliverySummary();
	 *	EventDeliverySummary eventDeliverySummary = eventdeliverysummary.getDeliveryAttemptSummary( subscriptionId,  id,  responseFields);
	 * </code></pre></p>
	 * @param id This parameter is the unique identifer for an event attempt delivery summary.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param subscriptionId This operation paramenter is the unique identifer for a subscription.
	 * @return com.mozu.api.contracts.event.EventDeliverySummary
	 * @see com.mozu.api.contracts.event.EventDeliverySummary
	 */
	public com.mozu.api.contracts.event.EventDeliverySummary getDeliveryAttemptSummary(String subscriptionId, Integer id, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.event.EventDeliverySummary> client = com.mozu.api.clients.event.push.subscriptions.EventDeliverySummaryClient.getDeliveryAttemptSummaryClient( subscriptionId,  id,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	EventDeliverySummary eventdeliverysummary = new EventDeliverySummary();
	 *	EventDeliverySummaryCollection eventDeliverySummaryCollection = eventdeliverysummary.getDeliveryAttemptSummaries( subscriptionId);
	 * </code></pre></p>
	 * @param subscriptionId 
	 * @return com.mozu.api.contracts.event.EventDeliverySummaryCollection
	 * @see com.mozu.api.contracts.event.EventDeliverySummaryCollection
	 */
	public com.mozu.api.contracts.event.EventDeliverySummaryCollection getDeliveryAttemptSummaries(String subscriptionId) throws Exception
	{
		return getDeliveryAttemptSummaries( subscriptionId,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	EventDeliverySummary eventdeliverysummary = new EventDeliverySummary();
	 *	EventDeliverySummaryCollection eventDeliverySummaryCollection = eventdeliverysummary.getDeliveryAttemptSummaries( subscriptionId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @param subscriptionId 
	 * @return com.mozu.api.contracts.event.EventDeliverySummaryCollection
	 * @see com.mozu.api.contracts.event.EventDeliverySummaryCollection
	 */
	public com.mozu.api.contracts.event.EventDeliverySummaryCollection getDeliveryAttemptSummaries(String subscriptionId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.event.EventDeliverySummaryCollection> client = com.mozu.api.clients.event.push.subscriptions.EventDeliverySummaryClient.getDeliveryAttemptSummariesClient( subscriptionId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



