/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform.entitylists;

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
 * 
 * </summary>
 */
public class EntityResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public EntityResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	JObject json = entity.getEntity( entityListFullName,  id);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param id 
	 * @return JObject
	 * @see JObject
	 */
	public com.fasterxml.jackson.databind.JsonNode getEntity(String entityListFullName, String id) throws Exception
	{
		return getEntity( entityListFullName,  id,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	CountDownLatch latch = entity.getEntity( entityListFullName,  id, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param id 
	 * @param  callback callback handler for asynchronous operations
	 * @return JObject
	 * @see JObject
	 */
	public CountDownLatch getEntityAsync(String entityListFullName, String id, AsyncCallback<com.fasterxml.jackson.databind.JsonNode> callback) throws Exception
	{
		return getEntityAsync( entityListFullName,  id,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	JObject json = entity.getEntity( entityListFullName,  id,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param id 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return JObject
	 * @see JObject
	 */
	public com.fasterxml.jackson.databind.JsonNode getEntity(String entityListFullName, String id, String responseFields) throws Exception
	{
		MozuClient<com.fasterxml.jackson.databind.JsonNode> client = com.mozu.api.clients.platform.entitylists.EntityClient.getEntityClient( entityListFullName,  id,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	CountDownLatch latch = entity.getEntity( entityListFullName,  id,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param id 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @return JObject
	 * @see JObject
	 */
	public CountDownLatch getEntityAsync(String entityListFullName, String id, String responseFields, AsyncCallback<com.fasterxml.jackson.databind.JsonNode> callback) throws Exception
	{
		MozuClient<com.fasterxml.jackson.databind.JsonNode> client = com.mozu.api.clients.platform.entitylists.EntityClient.getEntityClient( entityListFullName,  id,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	EntityCollection entityCollection = entity.getEntities( entityListFullName);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @return com.mozu.api.contracts.mzdb.EntityCollection
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityCollection getEntities(String entityListFullName) throws Exception
	{
		return getEntities( entityListFullName,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	CountDownLatch latch = entity.getEntities( entityListFullName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.mzdb.EntityCollection
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public CountDownLatch getEntitiesAsync(String entityListFullName, AsyncCallback<com.mozu.api.contracts.mzdb.EntityCollection> callback) throws Exception
	{
		return getEntitiesAsync( entityListFullName,  null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	EntityCollection entityCollection = entity.getEntities( entityListFullName,  pageSize,  startIndex,  filter,  sortBy,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.mzdb.EntityCollection
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityCollection getEntities(String entityListFullName, Integer pageSize, Integer startIndex, String filter, String sortBy, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> client = com.mozu.api.clients.platform.entitylists.EntityClient.getEntitiesClient( entityListFullName,  pageSize,  startIndex,  filter,  sortBy,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	CountDownLatch latch = entity.getEntities( entityListFullName,  pageSize,  startIndex,  filter,  sortBy,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.mzdb.EntityCollection
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public CountDownLatch getEntitiesAsync(String entityListFullName, Integer pageSize, Integer startIndex, String filter, String sortBy, String responseFields, AsyncCallback<com.mozu.api.contracts.mzdb.EntityCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> client = com.mozu.api.clients.platform.entitylists.EntityClient.getEntitiesClient( entityListFullName,  pageSize,  startIndex,  filter,  sortBy,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	JObject json = entity.insertEntity( item,  entityListFullName);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param item 
	 * @return JObject
	 * @see JObject
	 * @see JObject
	 */
	public com.fasterxml.jackson.databind.JsonNode insertEntity(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName) throws Exception
	{
		return insertEntity( item,  entityListFullName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	CountDownLatch latch = entity.insertEntity( item,  entityListFullName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param  callback callback handler for asynchronous operations
	 * @param item 
	 * @return JObject
	 * @see JObject
	 * @see JObject
	 */
	public CountDownLatch insertEntityAsync(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, AsyncCallback<com.fasterxml.jackson.databind.JsonNode> callback) throws Exception
	{
		return insertEntityAsync( item,  entityListFullName,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	JObject json = entity.insertEntity( item,  entityListFullName,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param item 
	 * @return JObject
	 * @see JObject
	 * @see JObject
	 */
	public com.fasterxml.jackson.databind.JsonNode insertEntity(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, String responseFields) throws Exception
	{
		MozuClient<com.fasterxml.jackson.databind.JsonNode> client = com.mozu.api.clients.platform.entitylists.EntityClient.insertEntityClient( item,  entityListFullName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	CountDownLatch latch = entity.insertEntity( item,  entityListFullName,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param item 
	 * @return JObject
	 * @see JObject
	 * @see JObject
	 */
	public CountDownLatch insertEntityAsync(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, String responseFields, AsyncCallback<com.fasterxml.jackson.databind.JsonNode> callback) throws Exception
	{
		MozuClient<com.fasterxml.jackson.databind.JsonNode> client = com.mozu.api.clients.platform.entitylists.EntityClient.insertEntityClient( item,  entityListFullName,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	JObject json = entity.updateEntity( item,  entityListFullName,  id);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param id 
	 * @param item 
	 * @return JObject
	 * @see JObject
	 * @see JObject
	 */
	public com.fasterxml.jackson.databind.JsonNode updateEntity(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, String id) throws Exception
	{
		return updateEntity( item,  entityListFullName,  id,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	CountDownLatch latch = entity.updateEntity( item,  entityListFullName,  id, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param id 
	 * @param  callback callback handler for asynchronous operations
	 * @param item 
	 * @return JObject
	 * @see JObject
	 * @see JObject
	 */
	public CountDownLatch updateEntityAsync(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, String id, AsyncCallback<com.fasterxml.jackson.databind.JsonNode> callback) throws Exception
	{
		return updateEntityAsync( item,  entityListFullName,  id,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	JObject json = entity.updateEntity( item,  entityListFullName,  id,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param id 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param item 
	 * @return JObject
	 * @see JObject
	 * @see JObject
	 */
	public com.fasterxml.jackson.databind.JsonNode updateEntity(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, String id, String responseFields) throws Exception
	{
		MozuClient<com.fasterxml.jackson.databind.JsonNode> client = com.mozu.api.clients.platform.entitylists.EntityClient.updateEntityClient( item,  entityListFullName,  id,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	CountDownLatch latch = entity.updateEntity( item,  entityListFullName,  id,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param id 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param item 
	 * @return JObject
	 * @see JObject
	 * @see JObject
	 */
	public CountDownLatch updateEntityAsync(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, String id, String responseFields, AsyncCallback<com.fasterxml.jackson.databind.JsonNode> callback) throws Exception
	{
		MozuClient<com.fasterxml.jackson.databind.JsonNode> client = com.mozu.api.clients.platform.entitylists.EntityClient.updateEntityClient( item,  entityListFullName,  id,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	entity.deleteEntity( entityListFullName,  id);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param id 
	 * @return 
	 */
	public void deleteEntity(String entityListFullName, String id) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.entitylists.EntityClient.deleteEntityClient( entityListFullName,  id);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



