/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.content;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class DocumentTypeUrl
{

	/**
	 * Get Resource Url for GetDocumentTypes
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return   String Resource Url
	 */
	public static MozuUrl getDocumentTypesUrl(Integer pageSize, String responseFields, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documenttypes/?pageSize={pageSize}&startIndex={startIndex}&responseFields={responseFields}");
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetDocumentType
	 * @param documentTypeName The name of the document type to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getDocumentTypeUrl(String documentTypeName, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documenttypes/{documentTypeName}?responseFields={responseFields}");
		formatter.formatUrl("documentTypeName", documentTypeName);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateDocumentType
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl createDocumentTypeUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documenttypes/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateDocumentType
	 * @param documentTypeName The name of the document type to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateDocumentTypeUrl(String documentTypeName, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documenttypes/{documentTypeName}?responseFields={responseFields}");
		formatter.formatUrl("documentTypeName", documentTypeName);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

