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

public class DocumentListUrl
{

	/**
	 * Get Resource Url for GetDocumentLists
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getDocumentListsUrl(Integer pageSize, String responseFields, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/?pageSize={pageSize}&startIndex={startIndex}&responseFields={responseFields}");
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetDocumentList
	 * @param documentListName Name of content documentListName to delete
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getDocumentListUrl(String documentListName, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}?responseFields={responseFields}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateDocumentList
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl createDocumentListUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateDocumentList
	 * @param documentListName Name of content documentListName to delete
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateDocumentListUrl(String documentListName, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}?responseFields={responseFields}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteDocumentList
	 * @param documentListName Name of content documentListName to delete
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteDocumentListUrl(String documentListName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}");
		formatter.formatUrl("documentListName", documentListName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

