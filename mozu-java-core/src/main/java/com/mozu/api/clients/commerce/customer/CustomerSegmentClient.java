/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.customer;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class CustomerSegmentClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> mozuClient=GetSegmentsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegmentCollection customerSegmentCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegmentCollection>
	 * @see com.mozu.api.contracts.customer.CustomerSegmentCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> getSegmentsClient() throws Exception
	{
		return getSegmentsClient( null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> mozuClient=GetSegmentsClient( startIndex,  pageSize,  sortBy,  filter);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegmentCollection customerSegmentCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegmentCollection>
	 * @see com.mozu.api.contracts.customer.CustomerSegmentCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> getSegmentsClient(Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSegmentUrl.getSegmentsUrl(filter, pageSize, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerSegmentCollection.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient=GetSegmentClient( id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegment customerSegment = client.Result();
	 * </code></pre></p>
	 * @param id 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegment>
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegment> getSegmentClient(Integer id) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSegmentUrl.getSegmentUrl(id);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerSegment.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient=AddSegmentClient( segment);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegment customerSegment = client.Result();
	 * </code></pre></p>
	 * @param segment 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegment>
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegment> addSegmentClient(com.mozu.api.contracts.customer.CustomerSegment segment) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSegmentUrl.addSegmentUrl();
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerSegment.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(segment);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=AddSegmentAccountsClient( accountIds,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param id 
	 * @param accountIds 
	 * @return Mozu.Api.MozuClient 
	 * @see int
	 */
	public static MozuClient addSegmentAccountsClient(List<Integer> accountIds, Integer id) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSegmentUrl.addSegmentAccountsUrl(id);
		String verb = "POST";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(accountIds);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient=UpdateSegmentClient( segment,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegment customerSegment = client.Result();
	 * </code></pre></p>
	 * @param id 
	 * @param segment 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegment>
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegment> updateSegmentClient(com.mozu.api.contracts.customer.CustomerSegment segment, Integer id) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSegmentUrl.updateSegmentUrl(id);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerSegment.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(segment);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteSegmentClient( id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param id 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteSegmentClient(Integer id) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSegmentUrl.deleteSegmentUrl(id);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteSegmentAccountsClient( accountIds,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param id 
	 * @param accountIds 
	 * @return Mozu.Api.MozuClient 
	 * @see int
	 */
	public static MozuClient deleteSegmentAccountsClient(List<Integer> accountIds, Integer id) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSegmentUrl.deleteSegmentAccountsUrl(id);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(accountIds);
		return mozuClient;

	}

}



