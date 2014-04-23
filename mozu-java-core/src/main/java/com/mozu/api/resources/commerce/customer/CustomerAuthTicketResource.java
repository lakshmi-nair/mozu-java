/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer;

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
public class CustomerAuthTicketResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public CustomerAuthTicketResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAuthTicket customerauthticket = new CustomerAuthTicket();
	 *	Stream stream = customerauthticket.CreateAnonymousShopperAuthTicket();
	 * </code></pre></p>
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream createAnonymousShopperAuthTicket() throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.customer.CustomerAuthTicketClient.createAnonymousShopperAuthTicketClient();
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAuthTicket customerauthticket = new CustomerAuthTicket();
	 *	CustomerAuthTicket customerAuthTicket = customerauthticket.CreateUserAuthTicket( userAuthInfo);
	 * </code></pre></p>
	 * @param userAuthInfo 
	 * @return com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerUserAuthInfo
	 */
	public com.mozu.api.contracts.customer.CustomerAuthTicket createUserAuthTicket(com.mozu.api.contracts.customer.CustomerUserAuthInfo userAuthInfo) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> client = com.mozu.api.clients.commerce.customer.CustomerAuthTicketClient.createUserAuthTicketClient( userAuthInfo);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAuthTicket customerauthticket = new CustomerAuthTicket();
	 *	CustomerAuthTicket customerAuthTicket = customerauthticket.RefreshUserAuthTicket( refreshToken);
	 * </code></pre></p>
	 * @param refreshToken 
	 * @return com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 */
	public com.mozu.api.contracts.customer.CustomerAuthTicket refreshUserAuthTicket(String refreshToken) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> client = com.mozu.api.clients.commerce.customer.CustomerAuthTicketClient.refreshUserAuthTicketClient( refreshToken);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



