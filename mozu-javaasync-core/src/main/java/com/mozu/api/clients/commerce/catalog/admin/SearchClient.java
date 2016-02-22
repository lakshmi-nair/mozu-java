/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * The Search resource manages all settings and options for providing product search on your site.
 * </summary>
 */
public class SearchClient {
	
	/**
	 * Retrieves the details of the specified search tuning rule.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> mozuClient=GetSearchTuningRuleClient( searchTuningRuleCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRule searchTuningRule = client.Result();
	 * </code></pre></p>
	 * @param searchTuningRuleCode The unique identifier of the search tuning rule.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRule>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> getSearchTuningRuleClient(String searchTuningRuleCode) throws Exception
	{
		return getSearchTuningRuleClient( searchTuningRuleCode,  null);
	}

	/**
	 * Retrieves the details of the specified search tuning rule.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> mozuClient=GetSearchTuningRuleClient( searchTuningRuleCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRule searchTuningRule = client.Result();
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param searchTuningRuleCode The unique identifier of the search tuning rule.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRule>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> getSearchTuningRuleClient(String searchTuningRuleCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.getSearchTuningRuleUrl(responseFields, searchTuningRuleCode);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.search.SearchTuningRule.class;
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * admin-search Get GetSearchTuningRules description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection> mozuClient=GetSearchTuningRulesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRuleCollection searchTuningRuleCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection> getSearchTuningRulesClient() throws Exception
	{
		return getSearchTuningRulesClient( null,  null,  null,  null,  null);
	}

	/**
	 * admin-search Get GetSearchTuningRules description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection> mozuClient=GetSearchTuningRulesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRuleCollection searchTuningRuleCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The amount is divided and displayed on the `pageCount `amount of pages. The default is 20 and maximum value is 200 per page.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a `pageSize `of 25, to get the 51st through the 75th items, use `startIndex=50`.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection> getSearchTuningRulesClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.getSearchTuningRulesUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * admin-search Get GetSearchTuningRuleSortFields description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> mozuClient=GetSearchTuningRuleSortFieldsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRuleSortFields searchTuningRuleSortFields = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> getSearchTuningRuleSortFieldsClient() throws Exception
	{
		return getSearchTuningRuleSortFieldsClient( null);
	}

	/**
	 * admin-search Get GetSearchTuningRuleSortFields description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> mozuClient=GetSearchTuningRuleSortFieldsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRuleSortFields searchTuningRuleSortFields = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> getSearchTuningRuleSortFieldsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.getSearchTuningRuleSortFieldsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields.class;
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Get site search settings
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> mozuClient=GetSettingsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchSettings searchSettings = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SearchSettings>
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> getSettingsClient() throws Exception
	{
		return getSettingsClient( null);
	}

	/**
	 * Get site search settings
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> mozuClient=GetSettingsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchSettings searchSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SearchSettings>
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> getSettingsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.getSettingsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.SearchSettings.class;
		MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.SearchSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a collection of synonyms definitions for product searches. Synonyms aid with determining matches for entered searches.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> mozuClient=GetSynonymDefinitionCollectionClient( localeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SynonymDefinitionCollection synonymDefinitionCollection = client.Result();
	 * </code></pre></p>
	 * @param localeCode The two character country code that sets the locale, such as US for United States. Sites, tenants, and catalogs use locale codes for localizing content, such as translated product text per supported country.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection>
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> getSynonymDefinitionCollectionClient(String localeCode) throws Exception
	{
		return getSynonymDefinitionCollectionClient( localeCode,  null);
	}

	/**
	 * Retrieves a collection of synonyms definitions for product searches. Synonyms aid with determining matches for entered searches.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> mozuClient=GetSynonymDefinitionCollectionClient( localeCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SynonymDefinitionCollection synonymDefinitionCollection = client.Result();
	 * </code></pre></p>
	 * @param localeCode The two character country code that sets the locale, such as US for United States. Sites, tenants, and catalogs use locale codes for localizing content, such as translated product text per supported country.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection>
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> getSynonymDefinitionCollectionClient(String localeCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.getSynonymDefinitionCollectionUrl(localeCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * admin-search Post AddSearchTuningRule description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> mozuClient=AddSearchTuningRuleClient( searchTuningRuleIn);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRule searchTuningRule = client.Result();
	 * </code></pre></p>
	 * @param searchTuningRuleIn Mozu.ProductAdmin.Contracts.Search.SearchTuningRule ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRule>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> addSearchTuningRuleClient(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn) throws Exception
	{
		return addSearchTuningRuleClient( searchTuningRuleIn,  null);
	}

	/**
	 * admin-search Post AddSearchTuningRule description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> mozuClient=AddSearchTuningRuleClient( searchTuningRuleIn,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRule searchTuningRule = client.Result();
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param searchTuningRuleIn Mozu.ProductAdmin.Contracts.Search.SearchTuningRule ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRule>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> addSearchTuningRuleClient(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.addSearchTuningRuleUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.search.SearchTuningRule.class;
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(searchTuningRuleIn);
		return mozuClient;

	}

	/**
	 * admin-search Post UpdateSearchTuningRuleSortFields description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> mozuClient=UpdateSearchTuningRuleSortFieldsClient( searchTuningRuleSortFieldsIn);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRuleSortFields searchTuningRuleSortFields = client.Result();
	 * </code></pre></p>
	 * @param searchTuningRuleSortFieldsIn Mozu.ProductAdmin.Contracts.Search.SearchTuningRuleSortFields ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> updateSearchTuningRuleSortFieldsClient(com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields searchTuningRuleSortFieldsIn) throws Exception
	{
		return updateSearchTuningRuleSortFieldsClient( searchTuningRuleSortFieldsIn,  null);
	}

	/**
	 * admin-search Post UpdateSearchTuningRuleSortFields description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> mozuClient=UpdateSearchTuningRuleSortFieldsClient( searchTuningRuleSortFieldsIn,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRuleSortFields searchTuningRuleSortFields = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param searchTuningRuleSortFieldsIn Mozu.ProductAdmin.Contracts.Search.SearchTuningRuleSortFields ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> updateSearchTuningRuleSortFieldsClient(com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields searchTuningRuleSortFieldsIn, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.updateSearchTuningRuleSortFieldsUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields.class;
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(searchTuningRuleSortFieldsIn);
		return mozuClient;

	}

	/**
	 * Updates synonym definitions for product searches. Synonyms aid with determining matches for entered searches.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> mozuClient=UpdateSynonymDefinitionCollectionClient( collection,  localeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SynonymDefinitionCollection synonymDefinitionCollection = client.Result();
	 * </code></pre></p>
	 * @param localeCode The two character country code that sets the locale, such as US for United States. Sites, tenants, and catalogs use locale codes for localizing content, such as translated product text per supported country.
	 * @param collection Collection of synonym definitions used for determining search results.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection>
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> updateSynonymDefinitionCollectionClient(com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection collection, String localeCode) throws Exception
	{
		return updateSynonymDefinitionCollectionClient( collection,  localeCode,  null);
	}

	/**
	 * Updates synonym definitions for product searches. Synonyms aid with determining matches for entered searches.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> mozuClient=UpdateSynonymDefinitionCollectionClient( collection,  localeCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SynonymDefinitionCollection synonymDefinitionCollection = client.Result();
	 * </code></pre></p>
	 * @param localeCode The two character country code that sets the locale, such as US for United States. Sites, tenants, and catalogs use locale codes for localizing content, such as translated product text per supported country.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param collection Collection of synonym definitions used for determining search results.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection>
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> updateSynonymDefinitionCollectionClient(com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection collection, String localeCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.updateSynonymDefinitionCollectionUrl(localeCode, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(collection);
		return mozuClient;

	}

	/**
	 * admin-search Put UpdateSearchTuningRule description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> mozuClient=UpdateSearchTuningRuleClient( searchTuningRuleIn,  searchTuningRuleCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRule searchTuningRule = client.Result();
	 * </code></pre></p>
	 * @param searchTuningRuleCode The unique identifier of the search tuning rule.
	 * @param searchTuningRuleIn Mozu.ProductAdmin.Contracts.Search.SearchTuningRule ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRule>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> updateSearchTuningRuleClient(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, String searchTuningRuleCode) throws Exception
	{
		return updateSearchTuningRuleClient( searchTuningRuleIn,  searchTuningRuleCode,  null);
	}

	/**
	 * admin-search Put UpdateSearchTuningRule description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> mozuClient=UpdateSearchTuningRuleClient( searchTuningRuleIn,  searchTuningRuleCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRule searchTuningRule = client.Result();
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param searchTuningRuleCode The unique identifier of the search tuning rule.
	 * @param searchTuningRuleIn Mozu.ProductAdmin.Contracts.Search.SearchTuningRule ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRule>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> updateSearchTuningRuleClient(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, String searchTuningRuleCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.updateSearchTuningRuleUrl(responseFields, searchTuningRuleCode);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.search.SearchTuningRule.class;
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(searchTuningRuleIn);
		return mozuClient;

	}

	/**
	 * Adds or Updates (Upsert) the Search Settings for a specific site
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> mozuClient=UpdateSettingsClient( settings);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchSettings searchSettings = client.Result();
	 * </code></pre></p>
	 * @param settings The settings to control product search and indexing behavior.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SearchSettings>
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> updateSettingsClient(com.mozu.api.contracts.productadmin.SearchSettings settings) throws Exception
	{
		return updateSettingsClient( settings,  null);
	}

	/**
	 * Adds or Updates (Upsert) the Search Settings for a specific site
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> mozuClient=UpdateSettingsClient( settings,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchSettings searchSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param settings The settings to control product search and indexing behavior.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SearchSettings>
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> updateSettingsClient(com.mozu.api.contracts.productadmin.SearchSettings settings, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.updateSettingsUrl(responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.SearchSettings.class;
		MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.SearchSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(settings);
		return mozuClient;

	}

	/**
	 * Deletes the specified search tuning rule.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteSearchTuningRuleClient( searchTuningRuleCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param searchTuningRuleCode The unique identifier of the search tuning rule.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteSearchTuningRuleClient(String searchTuningRuleCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.deleteSearchTuningRuleUrl(searchTuningRuleCode);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



