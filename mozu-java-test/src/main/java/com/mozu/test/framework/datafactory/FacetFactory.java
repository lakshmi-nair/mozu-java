/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.content.documentlists.FacetResource;

/** <summary>
 * Use the facets subresource to allow a merchant to add information for product indexing and searching.
 * </summary>
 */
public class FacetFactory
{

	public static List<com.mozu.api.contracts.content.Facet> getFacets(ApiContext apiContext, String documentListName, String propertyName, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.content.Facet> returnObj = new ArrayList<com.mozu.api.contracts.content.Facet>();
		FacetResource resource = new FacetResource(apiContext);
		try
		{
			returnObj = resource.getFacets( documentListName,  propertyName);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

}



