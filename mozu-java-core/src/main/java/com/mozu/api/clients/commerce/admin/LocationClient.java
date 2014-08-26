/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.admin;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * 
 * </summary>
 */
public class LocationClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient=GetLocationsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationCollection locationCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationCollection>
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationCollection> getLocationsClient() throws Exception
	{
		return getLocationsClient( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient=GetLocationsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationCollection locationCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationCollection>
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationCollection> getLocationsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationUrl.getLocationsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.LocationCollection.class;
		MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=GetLocationClient( locationCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param locationCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> getLocationClient(String locationCode) throws Exception
	{
		return getLocationClient( locationCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=GetLocationClient( locationCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param locationCode 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> getLocationClient(String locationCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationUrl.getLocationUrl(locationCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.Location.class;
		MozuClient<com.mozu.api.contracts.location.Location> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=AddLocationClient( location);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param location 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> addLocationClient(com.mozu.api.contracts.location.Location location) throws Exception
	{
		return addLocationClient( location,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=AddLocationClient( location,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param location 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> addLocationClient(com.mozu.api.contracts.location.Location location, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationUrl.addLocationUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.location.Location.class;
		MozuClient<com.mozu.api.contracts.location.Location> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(location);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=UpdateLocationClient( location,  locationCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param locationCode 
	 * @param location 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> updateLocationClient(com.mozu.api.contracts.location.Location location, String locationCode) throws Exception
	{
		return updateLocationClient( location,  locationCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=UpdateLocationClient( location,  locationCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param locationCode 
	 * @param responseFields 
	 * @param location 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> updateLocationClient(com.mozu.api.contracts.location.Location location, String locationCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationUrl.updateLocationUrl(locationCode, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.location.Location.class;
		MozuClient<com.mozu.api.contracts.location.Location> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(location);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteLocationClient( locationCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param locationCode 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteLocationClient(String locationCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationUrl.deleteLocationUrl(locationCode);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



