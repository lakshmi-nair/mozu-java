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
public class LocationTypeClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.location.LocationType>> mozuClient=GetLocationTypesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationType locationType = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.location.LocationType>>
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public static MozuClient<List<com.mozu.api.contracts.location.LocationType>> getLocationTypesClient() throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationTypeUrl.getLocationTypesUrl();
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.location.LocationType>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.location.LocationType>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationType> mozuClient=GetLocationTypeClient( locationTypeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationType locationType = client.Result();
	 * </code></pre></p>
	 * @param locationTypeCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationType>
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationType> getLocationTypeClient(String locationTypeCode) throws Exception
	{
		return getLocationTypeClient( locationTypeCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationType> mozuClient=GetLocationTypeClient( locationTypeCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationType locationType = client.Result();
	 * </code></pre></p>
	 * @param locationTypeCode 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationType>
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationType> getLocationTypeClient(String locationTypeCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationTypeUrl.getLocationTypeUrl(locationTypeCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.LocationType.class;
		MozuClient<com.mozu.api.contracts.location.LocationType> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationType> mozuClient=AddLocationTypeClient( locationType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationType locationType = client.Result();
	 * </code></pre></p>
	 * @param locationType 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationType>
	 * @see com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationType> addLocationTypeClient(com.mozu.api.contracts.location.LocationType locationType) throws Exception
	{
		return addLocationTypeClient( locationType,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationType> mozuClient=AddLocationTypeClient( locationType,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationType locationType = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param locationType 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationType>
	 * @see com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationType> addLocationTypeClient(com.mozu.api.contracts.location.LocationType locationType, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationTypeUrl.addLocationTypeUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.location.LocationType.class;
		MozuClient<com.mozu.api.contracts.location.LocationType> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(locationType);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationType> mozuClient=UpdateLocationTypeClient( locationType,  locationTypeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationType locationType = client.Result();
	 * </code></pre></p>
	 * @param locationTypeCode 
	 * @param locationType 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationType>
	 * @see com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationType> updateLocationTypeClient(com.mozu.api.contracts.location.LocationType locationType, String locationTypeCode) throws Exception
	{
		return updateLocationTypeClient( locationType,  locationTypeCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationType> mozuClient=UpdateLocationTypeClient( locationType,  locationTypeCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationType locationType = client.Result();
	 * </code></pre></p>
	 * @param locationTypeCode 
	 * @param responseFields 
	 * @param locationType 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationType>
	 * @see com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationType> updateLocationTypeClient(com.mozu.api.contracts.location.LocationType locationType, String locationTypeCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationTypeUrl.updateLocationTypeUrl(locationTypeCode, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.location.LocationType.class;
		MozuClient<com.mozu.api.contracts.location.LocationType> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(locationType);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteLocationTypeClient( locationTypeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param locationTypeCode 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteLocationTypeClient(String locationTypeCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationTypeUrl.deleteLocationTypeUrl(locationTypeCode);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



