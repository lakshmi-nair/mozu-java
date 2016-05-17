/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class SoftAllocationUrl
{

	/**
	 * Get Resource Url for GetSoftAllocations
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getSoftAllocationsUrl(String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/softallocations/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetSoftAllocation
	 * @param responseFields 
	 * @param softAllocationId 
	 * @return   String Resource Url
	 */
	public static MozuUrl getSoftAllocationUrl(String responseFields, Integer softAllocationId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/softallocations/{softAllocationId}?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("softAllocationId", softAllocationId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddSoftAllocations
	 * @return   String Resource Url
	 */
	public static MozuUrl addSoftAllocationsUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/softallocations/");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ConvertToProductReservation
	 * @return   String Resource Url
	 */
	public static MozuUrl convertToProductReservationUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/softallocations/convert");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for RenewSoftAllocations
	 * @return   String Resource Url
	 */
	public static MozuUrl renewSoftAllocationsUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/softallocations/renew");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateSoftAllocations
	 * @return   String Resource Url
	 */
	public static MozuUrl updateSoftAllocationsUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/softallocations/");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteSoftAllocation
	 * @param softAllocationId 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteSoftAllocationUrl(Integer softAllocationId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/softallocations/{softAllocationId}");
		formatter.formatUrl("softAllocationId", softAllocationId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

