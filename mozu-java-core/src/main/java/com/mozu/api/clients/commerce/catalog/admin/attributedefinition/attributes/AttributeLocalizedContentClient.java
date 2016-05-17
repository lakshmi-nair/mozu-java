/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes;

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
public class AttributeLocalizedContentClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>> mozuClient=GetAttributeLocalizedContentsClient( attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeLocalizedContent attributeLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>>
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>> getAttributeLocalizedContentsClient(String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeLocalizedContentUrl.getAttributeLocalizedContentsUrl(attributeFQN);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> mozuClient=GetAttributeLocalizedContentClient( attributeFQN,  localeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeLocalizedContent attributeLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> getAttributeLocalizedContentClient(String attributeFQN, String localeCode) throws Exception
	{
		return getAttributeLocalizedContentClient( attributeFQN,  localeCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> mozuClient=GetAttributeLocalizedContentClient( attributeFQN,  localeCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeLocalizedContent attributeLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> getAttributeLocalizedContentClient(String attributeFQN, String localeCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeLocalizedContentUrl.getAttributeLocalizedContentUrl(attributeFQN, localeCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeLocalizedContent.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> mozuClient=AddLocalizedContentClient( localizedContent,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeLocalizedContent attributeLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param dataViewMode DataViewMode
	 * @param localizedContent 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> addLocalizedContentClient(com.mozu.api.contracts.productadmin.AttributeLocalizedContent localizedContent, String attributeFQN) throws Exception
	{
		return addLocalizedContentClient( localizedContent,  attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> mozuClient=AddLocalizedContentClient( localizedContent,  attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeLocalizedContent attributeLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> addLocalizedContentClient(com.mozu.api.contracts.productadmin.AttributeLocalizedContent localizedContent, String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeLocalizedContentUrl.addLocalizedContentUrl(attributeFQN, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeLocalizedContent.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(localizedContent);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>> mozuClient=UpdateLocalizedContentsClient( localizedContent,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeLocalizedContent attributeLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param dataViewMode DataViewMode
	 * @param localizedContent 
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>>
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>> updateLocalizedContentsClient(List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> localizedContent, String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeLocalizedContentUrl.updateLocalizedContentsUrl(attributeFQN);
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(localizedContent);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> mozuClient=UpdateLocalizedContentClient( localizedContent,  attributeFQN,  localeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeLocalizedContent attributeLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> updateLocalizedContentClient(com.mozu.api.contracts.productadmin.AttributeLocalizedContent localizedContent, String attributeFQN, String localeCode) throws Exception
	{
		return updateLocalizedContentClient( localizedContent,  attributeFQN,  localeCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> mozuClient=UpdateLocalizedContentClient( localizedContent,  attributeFQN,  localeCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeLocalizedContent attributeLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> updateLocalizedContentClient(com.mozu.api.contracts.productadmin.AttributeLocalizedContent localizedContent, String attributeFQN, String localeCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeLocalizedContentUrl.updateLocalizedContentUrl(attributeFQN, localeCode, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeLocalizedContent.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(localizedContent);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteLocalizedContentClient( attributeFQN,  localeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteLocalizedContentClient(String attributeFQN, String localeCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeLocalizedContentUrl.deleteLocalizedContentUrl(attributeFQN, localeCode);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



