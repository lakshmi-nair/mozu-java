/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin;

import com.mozu.api.ApiContext;
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
public class CouponSetResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CouponSetResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CouponSetCollection couponSetCollection = couponset.getCouponSets();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productadmin.CouponSetCollection
	 * @see com.mozu.api.contracts.productadmin.CouponSetCollection
	 */
	public com.mozu.api.contracts.productadmin.CouponSetCollection getCouponSets() throws Exception
	{
		return getCouponSets( null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CouponSetCollection couponSetCollection = couponset.getCouponSets( startIndex,  pageSize,  sortBy,  filter,  includeCounts,  responseFields);
	 * </code></pre></p>
	 * @param filter 
	 * @param includeCounts 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.productadmin.CouponSetCollection
	 * @see com.mozu.api.contracts.productadmin.CouponSetCollection
	 */
	public com.mozu.api.contracts.productadmin.CouponSetCollection getCouponSets(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeCounts, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CouponSetCollection> client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.getCouponSetsClient( startIndex,  pageSize,  sortBy,  filter,  includeCounts,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CouponSet couponSet = couponset.getCouponSet( couponSetCode);
	 * </code></pre></p>
	 * @param couponSetCode 
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public com.mozu.api.contracts.productadmin.CouponSet getCouponSet(String couponSetCode) throws Exception
	{
		return getCouponSet( couponSetCode,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CouponSet couponSet = couponset.getCouponSet( couponSetCode,  includeCounts,  responseFields);
	 * </code></pre></p>
	 * @param couponSetCode 
	 * @param includeCounts 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public com.mozu.api.contracts.productadmin.CouponSet getCouponSet(String couponSetCode, Boolean includeCounts, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CouponSet> client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.getCouponSetClient( couponSetCode,  includeCounts,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	string string = couponset.getUniqueCouponSetCode();
	 * </code></pre></p>
	 * @return string
	 * @see string
	 */
	public String getUniqueCouponSetCode() throws Exception
	{
		return getUniqueCouponSetCode( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	string string = couponset.getUniqueCouponSetCode( responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @return string
	 * @see string
	 */
	public String getUniqueCouponSetCode(String responseFields) throws Exception
	{
		MozuClient<String> client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.getUniqueCouponSetCodeClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CouponSet couponSet = couponset.addCouponSet( couponSet);
	 * </code></pre></p>
	 * @param couponSet 
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public com.mozu.api.contracts.productadmin.CouponSet addCouponSet(com.mozu.api.contracts.productadmin.CouponSet couponSet) throws Exception
	{
		return addCouponSet( couponSet,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CouponSet couponSet = couponset.addCouponSet( couponSet,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param couponSet 
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public com.mozu.api.contracts.productadmin.CouponSet addCouponSet(com.mozu.api.contracts.productadmin.CouponSet couponSet, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CouponSet> client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.addCouponSetClient( couponSet,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	couponset.validateUniqueCouponSetCode( code);
	 * </code></pre></p>
	 * @param code 
	 * @return 
	 */
	public void validateUniqueCouponSetCode(String code) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.validateUniqueCouponSetCodeClient( code);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CouponSet couponSet = couponset.updateCouponSet( couponSet,  couponSetCode);
	 * </code></pre></p>
	 * @param couponSetCode 
	 * @param couponSet 
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public com.mozu.api.contracts.productadmin.CouponSet updateCouponSet(com.mozu.api.contracts.productadmin.CouponSet couponSet, String couponSetCode) throws Exception
	{
		return updateCouponSet( couponSet,  couponSetCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CouponSet couponSet = couponset.updateCouponSet( couponSet,  couponSetCode,  responseFields);
	 * </code></pre></p>
	 * @param couponSetCode 
	 * @param responseFields 
	 * @param couponSet 
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public com.mozu.api.contracts.productadmin.CouponSet updateCouponSet(com.mozu.api.contracts.productadmin.CouponSet couponSet, String couponSetCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CouponSet> client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.updateCouponSetClient( couponSet,  couponSetCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	couponset.deleteCouponSet( couponSetCode);
	 * </code></pre></p>
	 * @param couponSetCode 
	 * @return 
	 */
	public void deleteCouponSet(String couponSetCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.deleteCouponSetClient( couponSetCode);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



