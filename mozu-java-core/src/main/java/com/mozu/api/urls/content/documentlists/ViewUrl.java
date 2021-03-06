/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.content.documentlists;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class ViewUrl
{

	/**
	 * Get Resource Url for GetViewDocuments
	 * @param documentListName Name of content documentListName to delete
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param includeInactive Include inactive content.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return   String Resource Url
	 */
	public static MozuUrl getViewDocumentsUrl(String documentListName, String filter, Boolean includeInactive, Integer pageSize, String responseFields, String sortBy, Integer startIndex, String viewName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/views/{viewName}/documents?filter={filter}&sortBy={sortBy}&pageSize={pageSize}&startIndex={startIndex}&includeInactive={includeInactive}&responseFields={responseFields}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("includeInactive", includeInactive);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		formatter.formatUrl("viewName", viewName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

