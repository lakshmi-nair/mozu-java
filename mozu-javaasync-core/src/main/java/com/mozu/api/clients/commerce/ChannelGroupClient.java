/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce;

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
 * Use the Channel Groups resource to manage groups of channels with common information.
 * </summary>
 */
public class ChannelGroupClient {
	
	/**
	 * Retrieves a list of defined channel groups according to any filter and sort criteria specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection> mozuClient=GetChannelGroupsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ChannelGroupCollection channelGroupCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection>
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection> getChannelGroupsClient() throws Exception
	{
		return getChannelGroupsClient( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of defined channel groups according to any filter and sort criteria specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection> mozuClient=GetChannelGroupsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ChannelGroupCollection channelGroupCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection>
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection> getChannelGroupsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ChannelGroupUrl.getChannelGroupsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of a defined channel group.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> mozuClient=GetChannelGroupClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ChannelGroup channelGroup = client.Result();
	 * </code></pre></p>
	 * @param code The code that uniquely identifies the channel group.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.ChannelGroup>
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> getChannelGroupClient(String code) throws Exception
	{
		return getChannelGroupClient( code,  null);
	}

	/**
	 * Retrieves the details of a defined channel group.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> mozuClient=GetChannelGroupClient( code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ChannelGroup channelGroup = client.Result();
	 * </code></pre></p>
	 * @param code The code that uniquely identifies the channel group.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.ChannelGroup>
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> getChannelGroupClient(String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ChannelGroupUrl.getChannelGroupUrl(code, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.channels.ChannelGroup.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new group of channels with common information.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> mozuClient=CreateChannelGroupClient( channelGroup);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ChannelGroup channelGroup = client.Result();
	 * </code></pre></p>
	 * @param channelGroup Properties of the channel group to create.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.ChannelGroup>
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> createChannelGroupClient(com.mozu.api.contracts.commerceruntime.channels.ChannelGroup channelGroup) throws Exception
	{
		return createChannelGroupClient( channelGroup,  null);
	}

	/**
	 * Creates a new group of channels with common information.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> mozuClient=CreateChannelGroupClient( channelGroup,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ChannelGroup channelGroup = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param channelGroup Properties of the channel group to create.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.ChannelGroup>
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> createChannelGroupClient(com.mozu.api.contracts.commerceruntime.channels.ChannelGroup channelGroup, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ChannelGroupUrl.createChannelGroupUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.channels.ChannelGroup.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(channelGroup);
		return mozuClient;

	}

	/**
	 * Updates one or more properties of a defined channel group.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> mozuClient=UpdateChannelGroupClient( channelGroup,  code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ChannelGroup channelGroup = client.Result();
	 * </code></pre></p>
	 * @param code Code that identifies the channel group.
	 * @param channelGroup Properties of the channel group to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.ChannelGroup>
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> updateChannelGroupClient(com.mozu.api.contracts.commerceruntime.channels.ChannelGroup channelGroup, String code) throws Exception
	{
		return updateChannelGroupClient( channelGroup,  code,  null);
	}

	/**
	 * Updates one or more properties of a defined channel group.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> mozuClient=UpdateChannelGroupClient( channelGroup,  code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ChannelGroup channelGroup = client.Result();
	 * </code></pre></p>
	 * @param code Code that identifies the channel group.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param channelGroup Properties of the channel group to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.ChannelGroup>
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> updateChannelGroupClient(com.mozu.api.contracts.commerceruntime.channels.ChannelGroup channelGroup, String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ChannelGroupUrl.updateChannelGroupUrl(code, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.channels.ChannelGroup.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(channelGroup);
		return mozuClient;

	}

	/**
	 * Deletes a defined group of channels, which removes the group association with each channel in the group but does not delete the channel definitions themselves.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteChannelGroupClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteChannelGroupClient(String code) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ChannelGroupUrl.deleteChannelGroupUrl(code);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



