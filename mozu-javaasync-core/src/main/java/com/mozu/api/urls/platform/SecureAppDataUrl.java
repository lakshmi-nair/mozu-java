/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.platform;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class SecureAppDataUrl
{

	/**
	 * Get Resource Url for GetDBValue
	 * @param appKeyId 
	 * @param dbEntryQuery 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getDBValueUrl(String appKeyId, String dbEntryQuery, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/secureappdata/{appKeyId}/{dbEntryQuery}?responseFields={responseFields}");
		formatter.formatUrl("appKeyId", appKeyId);
		formatter.formatUrl("dbEntryQuery", dbEntryQuery);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateDBValue
	 * @param appKeyId 
	 * @param dbEntryQuery 
	 * @return   String Resource Url
	 */
	public static MozuUrl createDBValueUrl(String appKeyId, String dbEntryQuery)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/secureappdata/{appKeyId}/{dbEntryQuery}");
		formatter.formatUrl("appKeyId", appKeyId);
		formatter.formatUrl("dbEntryQuery", dbEntryQuery);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateDBValue
	 * @param appKeyId 
	 * @param dbEntryQuery 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateDBValueUrl(String appKeyId, String dbEntryQuery)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/secureappdata/{appKeyId}/{dbEntryQuery}");
		formatter.formatUrl("appKeyId", appKeyId);
		formatter.formatUrl("dbEntryQuery", dbEntryQuery);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteDBValue
	 * @param appKeyId 
	 * @param dbEntryQuery 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteDBValueUrl(String appKeyId, String dbEntryQuery)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/secureappdata/{appKeyId}/{dbEntryQuery}");
		formatter.formatUrl("appKeyId", appKeyId);
		formatter.formatUrl("dbEntryQuery", dbEntryQuery);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

