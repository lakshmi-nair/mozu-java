/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.storefront;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class ObjectResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public ObjectResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * 
	 * <p><pre><code>
	 *	Object object = new Object();
	 *	RatesResponse ratesResponse = object.GetRates( rateRequest);
	 * </code></pre></p>
	 * @param rateRequest 
	 * @return com.mozu.api.contracts.shippingruntime.RatesResponse
	 * @see com.mozu.api.contracts.shippingruntime.RatesResponse
	 * @see com.mozu.api.contracts.shippingruntime.RateRequest
	 */
	public com.mozu.api.contracts.shippingruntime.RatesResponse getRates(com.mozu.api.contracts.shippingruntime.RateRequest rateRequest) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingruntime.RatesResponse> client = com.mozu.api.clients.commerce.catalog.storefront.ObjectClient.getRatesClient( rateRequest);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



