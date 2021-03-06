/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.shipping.admin.profiles;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the ShippingInclusionRules sub-resource to manage your shipping inclusion rules that are associated with a specific shipping profile.
 * </summary>
 */
public class ShippingInclusionRuleResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ShippingInclusionRuleResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves the details of the specified shipping inclusion rule.
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	ShippingInclusionRule shippingInclusionRule = shippinginclusionrule.getShippingInclusionRule( profilecode,  id);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule getShippingInclusionRule(String profilecode, String id) throws Exception
	{
		return getShippingInclusionRule( profilecode,  id,  null);
	}

	/**
	 * Retrieves the details of the specified shipping inclusion rule.
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	CountDownLatch latch = shippinginclusionrule.getShippingInclusionRule( profilecode,  id, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public CountDownLatch getShippingInclusionRuleAsync(String profilecode, String id, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> callback) throws Exception
	{
		return getShippingInclusionRuleAsync( profilecode,  id,  null, callback);
	}

	/**
	 * Retrieves the details of the specified shipping inclusion rule.
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	ShippingInclusionRule shippingInclusionRule = shippinginclusionrule.getShippingInclusionRule( profilecode,  id,  responseFields);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule getShippingInclusionRule(String profilecode, String id, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> client = com.mozu.api.clients.commerce.shipping.admin.profiles.ShippingInclusionRuleClient.getShippingInclusionRuleClient( profilecode,  id,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of the specified shipping inclusion rule.
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	CountDownLatch latch = shippinginclusionrule.getShippingInclusionRule( profilecode,  id,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public CountDownLatch getShippingInclusionRuleAsync(String profilecode, String id, String responseFields, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> client = com.mozu.api.clients.commerce.shipping.admin.profiles.ShippingInclusionRuleClient.getShippingInclusionRuleClient( profilecode,  id,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieves a list of shipping inclusion rules and their details.
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	ShippingInclusionRuleCollection shippingInclusionRuleCollection = shippinginclusionrule.getShippingInclusionRules( profilecode);
	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection
	 */
	public com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection getShippingInclusionRules(String profilecode) throws Exception
	{
		return getShippingInclusionRules( profilecode,  null);
	}

	/**
	 * Retrieves a list of shipping inclusion rules and their details.
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	CountDownLatch latch = shippinginclusionrule.getShippingInclusionRules( profilecode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection
	 */
	public CountDownLatch getShippingInclusionRulesAsync(String profilecode, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection> callback) throws Exception
	{
		return getShippingInclusionRulesAsync( profilecode,  null, callback);
	}

	/**
	 * Retrieves a list of shipping inclusion rules and their details.
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	ShippingInclusionRuleCollection shippingInclusionRuleCollection = shippinginclusionrule.getShippingInclusionRules( profilecode,  responseFields);
	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection
	 */
	public com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection getShippingInclusionRules(String profilecode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection> client = com.mozu.api.clients.commerce.shipping.admin.profiles.ShippingInclusionRuleClient.getShippingInclusionRulesClient( profilecode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of shipping inclusion rules and their details.
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	CountDownLatch latch = shippinginclusionrule.getShippingInclusionRules( profilecode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection
	 */
	public CountDownLatch getShippingInclusionRulesAsync(String profilecode, String responseFields, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection> client = com.mozu.api.clients.commerce.shipping.admin.profiles.ShippingInclusionRuleClient.getShippingInclusionRulesClient( profilecode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Creates a new shipping inclusion rule.
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	ShippingInclusionRule shippingInclusionRule = shippinginclusionrule.createShippingInclusionRule( rule,  profilecode);
	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param dataViewMode DataViewMode
	 * @param rule Mozu.ShippingAdmin.Contracts.Profile.ShippingInclusionRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule createShippingInclusionRule(com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule rule, String profilecode) throws Exception
	{
		return createShippingInclusionRule( rule,  profilecode,  null);
	}

	/**
	 * Creates a new shipping inclusion rule.
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	CountDownLatch latch = shippinginclusionrule.createShippingInclusionRule( rule,  profilecode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param rule Mozu.ShippingAdmin.Contracts.Profile.ShippingInclusionRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public CountDownLatch createShippingInclusionRuleAsync(com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule rule, String profilecode, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> callback) throws Exception
	{
		return createShippingInclusionRuleAsync( rule,  profilecode,  null, callback);
	}

	/**
	 * Creates a new shipping inclusion rule.
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	ShippingInclusionRule shippingInclusionRule = shippinginclusionrule.createShippingInclusionRule( rule,  profilecode,  responseFields);
	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param rule Mozu.ShippingAdmin.Contracts.Profile.ShippingInclusionRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule createShippingInclusionRule(com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule rule, String profilecode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> client = com.mozu.api.clients.commerce.shipping.admin.profiles.ShippingInclusionRuleClient.createShippingInclusionRuleClient( rule,  profilecode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new shipping inclusion rule.
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	CountDownLatch latch = shippinginclusionrule.createShippingInclusionRule( rule,  profilecode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param rule Mozu.ShippingAdmin.Contracts.Profile.ShippingInclusionRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public CountDownLatch createShippingInclusionRuleAsync(com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule rule, String profilecode, String responseFields, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> client = com.mozu.api.clients.commerce.shipping.admin.profiles.ShippingInclusionRuleClient.createShippingInclusionRuleClient( rule,  profilecode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Updates the details of the specified shipping inclusion rule.
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	ShippingInclusionRule shippingInclusionRule = shippinginclusionrule.updateShippingInclusionRule( rule,  profilecode,  id);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param dataViewMode DataViewMode
	 * @param rule Mozu.ShippingAdmin.Contracts.Profile.ShippingInclusionRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule updateShippingInclusionRule(com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule rule, String profilecode, String id) throws Exception
	{
		return updateShippingInclusionRule( rule,  profilecode,  id,  null);
	}

	/**
	 * Updates the details of the specified shipping inclusion rule.
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	CountDownLatch latch = shippinginclusionrule.updateShippingInclusionRule( rule,  profilecode,  id, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param rule Mozu.ShippingAdmin.Contracts.Profile.ShippingInclusionRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public CountDownLatch updateShippingInclusionRuleAsync(com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule rule, String profilecode, String id, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> callback) throws Exception
	{
		return updateShippingInclusionRuleAsync( rule,  profilecode,  id,  null, callback);
	}

	/**
	 * Updates the details of the specified shipping inclusion rule.
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	ShippingInclusionRule shippingInclusionRule = shippinginclusionrule.updateShippingInclusionRule( rule,  profilecode,  id,  responseFields);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param rule Mozu.ShippingAdmin.Contracts.Profile.ShippingInclusionRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule updateShippingInclusionRule(com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule rule, String profilecode, String id, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> client = com.mozu.api.clients.commerce.shipping.admin.profiles.ShippingInclusionRuleClient.updateShippingInclusionRuleClient( rule,  profilecode,  id,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the details of the specified shipping inclusion rule.
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	CountDownLatch latch = shippinginclusionrule.updateShippingInclusionRule( rule,  profilecode,  id,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param rule Mozu.ShippingAdmin.Contracts.Profile.ShippingInclusionRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public CountDownLatch updateShippingInclusionRuleAsync(com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule rule, String profilecode, String id, String responseFields, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> client = com.mozu.api.clients.commerce.shipping.admin.profiles.ShippingInclusionRuleClient.updateShippingInclusionRuleClient( rule,  profilecode,  id,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Deletes the specified shipping inclusion rule.
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	shippinginclusionrule.deleteShippingInclusionRule( profilecode,  id);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deleteShippingInclusionRule(String profilecode, String id) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.shipping.admin.profiles.ShippingInclusionRuleClient.deleteShippingInclusionRuleClient( profilecode,  id);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



