/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.customer;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the Customer Accounts resource to manage the components of shopper accounts, including attributes, contact information, company notes, and groups associated with the customer account.
 * </summary>
 */
public class CustomerAccountClient {
	
	/**
	 * Retrieves a list of customer accounts.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> mozuClient=GetAccountsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAccountCollection customerAccountCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccountCollection>
	 * @see com.mozu.api.contracts.customer.CustomerAccountCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> getAccountsClient() throws Exception
	{
		return getAccountsClient( null,  null,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of customer accounts.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> mozuClient=GetAccountsClient( startIndex,  pageSize,  sortBy,  filter,  fields,  q,  qLimit,  isAnonymous,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAccountCollection customerAccountCollection = client.Result();
	 * </code></pre></p>
	 * @param fields The fields to include in the response.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param isAnonymous 
	 * @param pageSize 
	 * @param q A list of customer account search terms to use in the query when searching across customer name and email. Separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccountCollection>
	 * @see com.mozu.api.contracts.customer.CustomerAccountCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> getAccountsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String fields, String q, Integer qLimit, Boolean isAnonymous, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.getAccountsUrl(fields, filter, isAnonymous, pageSize, q, qLimit, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAccountCollection.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.LoginState> mozuClient=GetLoginStateClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LoginState loginState = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.LoginState>
	 * @see com.mozu.api.contracts.customer.LoginState
	 */
	public static MozuClient<com.mozu.api.contracts.customer.LoginState> getLoginStateClient(Integer accountId) throws Exception
	{
		return getLoginStateClient( accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.LoginState> mozuClient=GetLoginStateClient( accountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LoginState loginState = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.LoginState>
	 * @see com.mozu.api.contracts.customer.LoginState
	 */
	public static MozuClient<com.mozu.api.contracts.customer.LoginState> getLoginStateClient(Integer accountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.getLoginStateUrl(accountId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.LoginState.class;
		MozuClient<com.mozu.api.contracts.customer.LoginState> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieve details of a customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient=GetAccountClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAccount customerAccount = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccount>
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccount> getAccountClient(Integer accountId) throws Exception
	{
		return getAccountClient( accountId,  null);
	}

	/**
	 * Retrieve details of a customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient=GetAccountClient( accountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAccount customerAccount = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account to retrieve.
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccount>
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccount> getAccountClient(Integer accountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.getAccountUrl(accountId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAccount.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new customer account based on the information specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient=AddAccountClient( account);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAccount customerAccount = client.Result();
	 * </code></pre></p>
	 * @param account Properties of the customer account to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccount>
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccount> addAccountClient(com.mozu.api.contracts.customer.CustomerAccount account) throws Exception
	{
		return addAccountClient( account,  null);
	}

	/**
	 * Creates a new customer account based on the information specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient=AddAccountClient( account,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAccount customerAccount = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param account Properties of the customer account to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccount>
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccount> addAccountClient(com.mozu.api.contracts.customer.CustomerAccount account, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.addAccountUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAccount.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(account);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=ChangePasswordClient( passwordInfo,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId 
	 * @param passwordInfo 
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.customer.PasswordInfo
	 */
	public static MozuClient changePasswordClient(com.mozu.api.contracts.customer.PasswordInfo passwordInfo, Integer accountId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.changePasswordUrl(accountId);
		String verb = "POST";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(passwordInfo);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> mozuClient=AddLoginToExistingCustomerClient( customerAuthInfo,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAuthTicket customerAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @param customerAuthInfo 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAuthTicket>
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerLoginInfo
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> addLoginToExistingCustomerClient(com.mozu.api.contracts.customer.CustomerLoginInfo customerAuthInfo, Integer accountId) throws Exception
	{
		return addLoginToExistingCustomerClient( customerAuthInfo,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> mozuClient=AddLoginToExistingCustomerClient( customerAuthInfo,  accountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAuthTicket customerAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @param responseFields 
	 * @param customerAuthInfo 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAuthTicket>
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerLoginInfo
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> addLoginToExistingCustomerClient(com.mozu.api.contracts.customer.CustomerLoginInfo customerAuthInfo, Integer accountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.addLoginToExistingCustomerUrl(accountId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAuthTicket.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(customerAuthInfo);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=RecomputeCustomerLifetimeValueClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient recomputeCustomerLifetimeValueClient(Integer accountId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.recomputeCustomerLifetimeValueUrl(accountId);
		String verb = "POST";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=SetLoginLockedClient( isLocked,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId 
	 * @param isLocked 
	 * @return Mozu.Api.MozuClient 
	 * @see bool
	 */
	public static MozuClient setLoginLockedClient(Boolean isLocked, Integer accountId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.setLoginLockedUrl(accountId);
		String verb = "POST";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(isLocked);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=SetPasswordChangeRequiredClient( isPasswordChangeRequired,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId 
	 * @param isPasswordChangeRequired 
	 * @return Mozu.Api.MozuClient 
	 * @see bool
	 */
	public static MozuClient setPasswordChangeRequiredClient(Boolean isPasswordChangeRequired, Integer accountId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.setPasswordChangeRequiredUrl(accountId);
		String verb = "POST";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(isPasswordChangeRequired);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> mozuClient=AddAccountAndLoginClient( accountAndAuthInfo);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAuthTicket customerAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param accountAndAuthInfo 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAuthTicket>
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> addAccountAndLoginClient(com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo accountAndAuthInfo) throws Exception
	{
		return addAccountAndLoginClient( accountAndAuthInfo,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> mozuClient=AddAccountAndLoginClient( accountAndAuthInfo,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAuthTicket customerAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param accountAndAuthInfo 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAuthTicket>
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> addAccountAndLoginClient(com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo accountAndAuthInfo, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.addAccountAndLoginUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAuthTicket.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(accountAndAuthInfo);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> mozuClient=AddAccountsClient( customers);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAccountCollection customerAccountCollection = client.Result();
	 * </code></pre></p>
	 * @param customers 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccountCollection>
	 * @see com.mozu.api.contracts.customer.CustomerAccountCollection
	 * @see com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> addAccountsClient(List<com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo> customers) throws Exception
	{
		return addAccountsClient( customers,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> mozuClient=AddAccountsClient( customers,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAccountCollection customerAccountCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param customers 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccountCollection>
	 * @see com.mozu.api.contracts.customer.CustomerAccountCollection
	 * @see com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> addAccountsClient(List<com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo> customers, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.addAccountsUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAccountCollection.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(customers);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.LoginState> mozuClient=GetLoginStateByEmailAddressClient( emailAddress);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LoginState loginState = client.Result();
	 * </code></pre></p>
	 * @param emailAddress 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.LoginState>
	 * @see com.mozu.api.contracts.customer.LoginState
	 */
	public static MozuClient<com.mozu.api.contracts.customer.LoginState> getLoginStateByEmailAddressClient(String emailAddress) throws Exception
	{
		return getLoginStateByEmailAddressClient( emailAddress,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.LoginState> mozuClient=GetLoginStateByEmailAddressClient( emailAddress,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LoginState loginState = client.Result();
	 * </code></pre></p>
	 * @param emailAddress 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.LoginState>
	 * @see com.mozu.api.contracts.customer.LoginState
	 */
	public static MozuClient<com.mozu.api.contracts.customer.LoginState> getLoginStateByEmailAddressClient(String emailAddress, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.getLoginStateByEmailAddressUrl(emailAddress, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.LoginState.class;
		MozuClient<com.mozu.api.contracts.customer.LoginState> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.LoginState> mozuClient=GetLoginStateByUserNameClient( userName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LoginState loginState = client.Result();
	 * </code></pre></p>
	 * @param userName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.LoginState>
	 * @see com.mozu.api.contracts.customer.LoginState
	 */
	public static MozuClient<com.mozu.api.contracts.customer.LoginState> getLoginStateByUserNameClient(String userName) throws Exception
	{
		return getLoginStateByUserNameClient( userName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.LoginState> mozuClient=GetLoginStateByUserNameClient( userName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LoginState loginState = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param userName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.LoginState>
	 * @see com.mozu.api.contracts.customer.LoginState
	 */
	public static MozuClient<com.mozu.api.contracts.customer.LoginState> getLoginStateByUserNameClient(String userName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.getLoginStateByUserNameUrl(responseFields, userName);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.LoginState.class;
		MozuClient<com.mozu.api.contracts.customer.LoginState> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=ResetPasswordClient( resetPasswordInfo);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param resetPasswordInfo 
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.customer.ResetPasswordInfo
	 */
	public static MozuClient resetPasswordClient(com.mozu.api.contracts.customer.ResetPasswordInfo resetPasswordInfo) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.resetPasswordUrl();
		String verb = "POST";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(resetPasswordInfo);
		return mozuClient;

	}

	/**
	 * Updates a customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient=UpdateAccountClient( account,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAccount customerAccount = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param account Properties of the customer account to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccount>
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccount> updateAccountClient(com.mozu.api.contracts.customer.CustomerAccount account, Integer accountId) throws Exception
	{
		return updateAccountClient( account,  accountId,  null);
	}

	/**
	 * Updates a customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient=UpdateAccountClient( account,  accountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAccount customerAccount = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields 
	 * @param account Properties of the customer account to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccount>
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccount> updateAccountClient(com.mozu.api.contracts.customer.CustomerAccount account, Integer accountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.updateAccountUrl(accountId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAccount.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(account);
		return mozuClient;

	}

	/**
	 * Deletes a customer account. A customer account cannot be deleted if any orders exist, past or present.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteAccountClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account to delete.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteAccountClient(Integer accountId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.deleteAccountUrl(accountId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



