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
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Document Types resource to view the document types supplied by the Content API.
 * </summary>
 */
public class DocumentTypeClient {
	
	/**
	 * Retrieves a paged list of the system-defined document types.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentTypeCollection> mozuClient=GetDocumentTypesClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentTypeCollection documentTypeCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentTypeCollection>
	 * @see com.mozu.api.contracts.content.DocumentTypeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentTypeCollection> getDocumentTypesClient(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getDocumentTypesClient(dataViewMode,  null,  null,  null);
	}

	/**
	 * Retrieves a paged list of the system-defined document types.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentTypeCollection> mozuClient=GetDocumentTypesClient(dataViewMode,  pageSize,  startIndex,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentTypeCollection documentTypeCollection = client.Result();
	 * </code></pre></p>
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentTypeCollection>
	 * @see com.mozu.api.contracts.content.DocumentTypeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentTypeCollection> getDocumentTypesClient(com.mozu.api.DataViewMode dataViewMode, Integer pageSize, Integer startIndex, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.DocumentTypeUrl.getDocumentTypesUrl(pageSize, responseFields, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.DocumentTypeCollection.class;
		MozuClient<com.mozu.api.contracts.content.DocumentTypeCollection> mozuClient = (MozuClient<com.mozu.api.contracts.content.DocumentTypeCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves a system-defined document type.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentType> mozuClient=GetDocumentTypeClient(dataViewMode,  documentTypeName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentType documentType = client.Result();
	 * </code></pre></p>
	 * @param documentTypeName The name of the document type to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentType>
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentType> getDocumentTypeClient(com.mozu.api.DataViewMode dataViewMode, String documentTypeName) throws Exception
	{
		return getDocumentTypeClient(dataViewMode,  documentTypeName,  null);
	}

	/**
	 * Retrieves a system-defined document type.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentType> mozuClient=GetDocumentTypeClient(dataViewMode,  documentTypeName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentType documentType = client.Result();
	 * </code></pre></p>
	 * @param documentTypeName The name of the document type to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentType>
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentType> getDocumentTypeClient(com.mozu.api.DataViewMode dataViewMode, String documentTypeName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.DocumentTypeUrl.getDocumentTypeUrl(documentTypeName, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.DocumentType.class;
		MozuClient<com.mozu.api.contracts.content.DocumentType> mozuClient = (MozuClient<com.mozu.api.contracts.content.DocumentType>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentType> mozuClient=CreateDocumentTypeClient(dataViewMode,  documentType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentType documentType = client.Result();
	 * </code></pre></p>
	 * @param documentType 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentType>
	 * @see com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentType> createDocumentTypeClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.DocumentType documentType) throws Exception
	{
		return createDocumentTypeClient(dataViewMode,  documentType,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentType> mozuClient=CreateDocumentTypeClient(dataViewMode,  documentType,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentType documentType = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param documentType 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentType>
	 * @see com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentType> createDocumentTypeClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.DocumentType documentType, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.DocumentTypeUrl.createDocumentTypeUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.content.DocumentType.class;
		MozuClient<com.mozu.api.contracts.content.DocumentType> mozuClient = (MozuClient<com.mozu.api.contracts.content.DocumentType>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(documentType);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentType> mozuClient=UpdateDocumentTypeClient( documentType,  documentTypeName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentType documentType = client.Result();
	 * </code></pre></p>
	 * @param documentTypeName 
	 * @param documentType 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentType>
	 * @see com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentType> updateDocumentTypeClient(com.mozu.api.contracts.content.DocumentType documentType, String documentTypeName) throws Exception
	{
		return updateDocumentTypeClient( documentType,  documentTypeName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentType> mozuClient=UpdateDocumentTypeClient( documentType,  documentTypeName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentType documentType = client.Result();
	 * </code></pre></p>
	 * @param documentTypeName 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param documentType 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentType>
	 * @see com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentType> updateDocumentTypeClient(com.mozu.api.contracts.content.DocumentType documentType, String documentTypeName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.DocumentTypeUrl.updateDocumentTypeUrl(documentTypeName, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.content.DocumentType.class;
		MozuClient<com.mozu.api.contracts.content.DocumentType> mozuClient = (MozuClient<com.mozu.api.contracts.content.DocumentType>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(documentType);
		return mozuClient;

	}

}



