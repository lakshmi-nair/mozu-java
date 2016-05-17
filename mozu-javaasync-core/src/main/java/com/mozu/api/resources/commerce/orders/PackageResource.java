/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.orders;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Packages subresource to manage the physical packages to ship for an order.
 * </summary>
 */
public class PackageResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public PackageResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of the actions available to perform for a package associated with order fulfillment.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	string string = package.getAvailablePackageFulfillmentActions( orderId,  packageId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package fulfillment.
	 * @param packageId Unique identifier of the package associated with the fulfillment actions to retrieve.
	 * @return List<string>
	 * @see string
	 */
	public List<String> getAvailablePackageFulfillmentActions(String orderId, String packageId) throws Exception
	{
		MozuClient<List<String>> client = com.mozu.api.clients.commerce.orders.PackageClient.getAvailablePackageFulfillmentActionsClient( orderId,  packageId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of the actions available to perform for a package associated with order fulfillment.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	CountDownLatch latch = package.getAvailablePackageFulfillmentActions( orderId,  packageId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package fulfillment.
	 * @param packageId Unique identifier of the package associated with the fulfillment actions to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @return List<string>
	 * @see string
	 */
	public CountDownLatch getAvailablePackageFulfillmentActionsAsync(String orderId, String packageId, AsyncCallback<List<String>> callback) throws Exception
	{
		MozuClient<List<String>> client = com.mozu.api.clients.commerce.orders.PackageClient.getAvailablePackageFulfillmentActionsClient( orderId,  packageId);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieves the package label image supplied by the carrier.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Stream stream = package.getPackageLabel( orderId,  packageId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package label to retrieve.
	 * @param packageId Unique identifier of the package for which to retrieve the label.
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream getPackageLabel(String orderId, String packageId) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.orders.PackageClient.getPackageLabelClient( orderId,  packageId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the package label image supplied by the carrier.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	CountDownLatch latch = package.getPackageLabel( orderId,  packageId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package label to retrieve.
	 * @param packageId Unique identifier of the package for which to retrieve the label.
	 * @param  callback callback handler for asynchronous operations
	 * @return Stream
	 * @see Stream
	 */
	public CountDownLatch getPackageLabelAsync(String orderId, String packageId, AsyncCallback<java.io.InputStream> callback) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.orders.PackageClient.getPackageLabelClient( orderId,  packageId);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieves the details of a package of order items.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.getPackage( orderId,  packageId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package to retrieve.
	 * @param packageId Unique identifier of the package to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Package getPackage(String orderId, String packageId) throws Exception
	{
		return getPackage( orderId,  packageId,  null);
	}

	/**
	 * Retrieves the details of a package of order items.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	CountDownLatch latch = package.getPackage( orderId,  packageId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package to retrieve.
	 * @param packageId Unique identifier of the package to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public CountDownLatch getPackageAsync(String orderId, String packageId, AsyncCallback<com.mozu.api.contracts.commerceruntime.fulfillment.Package> callback) throws Exception
	{
		return getPackageAsync( orderId,  packageId,  null, callback);
	}

	/**
	 * Retrieves the details of a package of order items.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.getPackage( orderId,  packageId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package to retrieve.
	 * @param packageId Unique identifier of the package to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Package getPackage(String orderId, String packageId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> client = com.mozu.api.clients.commerce.orders.PackageClient.getPackageClient( orderId,  packageId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a package of order items.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	CountDownLatch latch = package.getPackage( orderId,  packageId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package to retrieve.
	 * @param packageId Unique identifier of the package to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public CountDownLatch getPackageAsync(String orderId, String packageId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.fulfillment.Package> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> client = com.mozu.api.clients.commerce.orders.PackageClient.getPackageClient( orderId,  packageId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Creates a new physical package of order items.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.createPackage( pkg,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with this package.
	 * @param package Properties of the physical package of order items.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Package createPackage(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String orderId) throws Exception
	{
		return createPackage( pkg,  orderId,  null);
	}

	/**
	 * Creates a new physical package of order items.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	CountDownLatch latch = package.createPackage( pkg,  orderId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with this package.
	 * @param  callback callback handler for asynchronous operations
	 * @param package Properties of the physical package of order items.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public CountDownLatch createPackageAsync(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String orderId, AsyncCallback<com.mozu.api.contracts.commerceruntime.fulfillment.Package> callback) throws Exception
	{
		return createPackageAsync( pkg,  orderId,  null, callback);
	}

	/**
	 * Creates a new physical package of order items.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.createPackage( pkg,  orderId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with this package.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param package Properties of the physical package of order items.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Package createPackage(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String orderId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> client = com.mozu.api.clients.commerce.orders.PackageClient.createPackageClient( pkg,  orderId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new physical package of order items.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	CountDownLatch latch = package.createPackage( pkg,  orderId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with this package.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param package Properties of the physical package of order items.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public CountDownLatch createPackageAsync(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String orderId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.fulfillment.Package> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> client = com.mozu.api.clients.commerce.orders.PackageClient.createPackageClient( pkg,  orderId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Updates one or more properties of a physical package of order items.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.updatePackage( pkg,  orderId,  packageId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package to update.
	 * @param packageId Unique identifier of the package of order items to update.
	 * @param package Wrapper of properties for the package of order items to update.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Package updatePackage(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String orderId, String packageId) throws Exception
	{
		return updatePackage( pkg,  orderId,  packageId,  null);
	}

	/**
	 * Updates one or more properties of a physical package of order items.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	CountDownLatch latch = package.updatePackage( pkg,  orderId,  packageId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package to update.
	 * @param packageId Unique identifier of the package of order items to update.
	 * @param  callback callback handler for asynchronous operations
	 * @param package Wrapper of properties for the package of order items to update.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public CountDownLatch updatePackageAsync(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String orderId, String packageId, AsyncCallback<com.mozu.api.contracts.commerceruntime.fulfillment.Package> callback) throws Exception
	{
		return updatePackageAsync( pkg,  orderId,  packageId,  null, callback);
	}

	/**
	 * Updates one or more properties of a physical package of order items.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.updatePackage( pkg,  orderId,  packageId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package to update.
	 * @param packageId Unique identifier of the package of order items to update.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param package Wrapper of properties for the package of order items to update.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Package updatePackage(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String orderId, String packageId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> client = com.mozu.api.clients.commerce.orders.PackageClient.updatePackageClient( pkg,  orderId,  packageId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more properties of a physical package of order items.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	CountDownLatch latch = package.updatePackage( pkg,  orderId,  packageId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package to update.
	 * @param packageId Unique identifier of the package of order items to update.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param package Wrapper of properties for the package of order items to update.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public CountDownLatch updatePackageAsync(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String orderId, String packageId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.fulfillment.Package> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> client = com.mozu.api.clients.commerce.orders.PackageClient.updatePackageClient( pkg,  orderId,  packageId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Removes a physical package of items from the specified order.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	package.deletePackage( orderId,  packageId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package to delete.
	 * @param packageId Unique identifier of the package to delete.
	 * @return 
	 */
	public void deletePackage(String orderId, String packageId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.orders.PackageClient.deletePackageClient( orderId,  packageId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



