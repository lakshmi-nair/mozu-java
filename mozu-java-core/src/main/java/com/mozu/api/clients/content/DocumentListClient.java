/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.content;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
import com.mozu.api.DataViewMode;
/** <summary>
 * Use the document lists resource to organize your site's documents into a hierarchy. Document lists can contain documents, folders, and complete hierarchies of folders, which contain documents with unique names.
 * </summary>
 */
public class DocumentListClient {
	
	/**
	 * Retrieves a collection of document lists.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentListCollection> mozuClient=GetDocumentListsClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentListCollection documentListCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentListCollection>
	 * @see com.mozu.api.contracts.content.DocumentListCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentListCollection> getDocumentListsClient(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getDocumentListsClient(dataViewMode,  null,  null,  null);
	}

	/**
	 * Retrieves a collection of document lists.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentListCollection> mozuClient=GetDocumentListsClient(dataViewMode,  pageSize,  startIndex,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentListCollection documentListCollection = client.Result();
	 * </code></pre></p>
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentListCollection>
	 * @see com.mozu.api.contracts.content.DocumentListCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentListCollection> getDocumentListsClient(com.mozu.api.DataViewMode dataViewMode, Integer pageSize, Integer startIndex, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.DocumentListUrl.getDocumentListsUrl(pageSize, responseFields, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.DocumentListCollection.class;
		MozuClient<com.mozu.api.contracts.content.DocumentListCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieve the details of a document list by providing the list name.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentList> mozuClient=GetDocumentListClient(dataViewMode,  documentListName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentList documentList = client.Result();
	 * </code></pre></p>
	 * @param documentListName The name of the document list.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentList>
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentList> getDocumentListClient(com.mozu.api.DataViewMode dataViewMode, String documentListName) throws Exception
	{
		return getDocumentListClient(dataViewMode,  documentListName,  null);
	}

	/**
	 * Retrieve the details of a document list by providing the list name.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentList> mozuClient=GetDocumentListClient(dataViewMode,  documentListName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentList documentList = client.Result();
	 * </code></pre></p>
	 * @param documentListName The name of the document list.
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentList>
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentList> getDocumentListClient(com.mozu.api.DataViewMode dataViewMode, String documentListName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.DocumentListUrl.getDocumentListUrl(documentListName, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.DocumentList.class;
		MozuClient<com.mozu.api.contracts.content.DocumentList> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentList> mozuClient=CreateDocumentListClient(dataViewMode,  list);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentList documentList = client.Result();
	 * </code></pre></p>
	 * @param list 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentList>
	 * @see com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentList> createDocumentListClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.DocumentList list) throws Exception
	{
		return createDocumentListClient(dataViewMode,  list,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentList> mozuClient=CreateDocumentListClient(dataViewMode,  list,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentList documentList = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param list 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentList>
	 * @see com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentList> createDocumentListClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.DocumentList list, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.DocumentListUrl.createDocumentListUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.content.DocumentList.class;
		MozuClient<com.mozu.api.contracts.content.DocumentList> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(list);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentList> mozuClient=UpdateDocumentListClient( list,  documentListName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentList documentList = client.Result();
	 * </code></pre></p>
	 * @param documentListName 
	 * @param list 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentList>
	 * @see com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentList> updateDocumentListClient(com.mozu.api.contracts.content.DocumentList list, String documentListName) throws Exception
	{
		return updateDocumentListClient( list,  documentListName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentList> mozuClient=UpdateDocumentListClient( list,  documentListName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentList documentList = client.Result();
	 * </code></pre></p>
	 * @param documentListName 
	 * @param responseFields 
	 * @param list 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentList>
	 * @see com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentList> updateDocumentListClient(com.mozu.api.contracts.content.DocumentList list, String documentListName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.DocumentListUrl.updateDocumentListUrl(documentListName, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.content.DocumentList.class;
		MozuClient<com.mozu.api.contracts.content.DocumentList> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(list);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteDocumentListClient( documentListName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param documentListName 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteDocumentListClient(String documentListName) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.DocumentListUrl.deleteDocumentListUrl(documentListName);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



