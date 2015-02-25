/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.mzdb;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.mzdb.IndexedProperty;
import com.mozu.api.contracts.mzdb.ListView;

/**
 *	The definition of an MZDB EntityList which describes the characteristics of the EntityList on a per tenant basis. EntityLists are created at the tenant level, but instances of the EntityLists are implicitly created at the appropriate context level as entities are added or removed from the EntityList.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntityList implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * At which context level are entities stored in the list. Possible values are "tenant", "site", "masterCatalog" or "catalog".  Each list instance will exist at this context level for the tenant.
	 */
	protected String contextLevel;

	public String getContextLevel() {
		return this.contextLevel;
	}

	public void setContextLevel(String contextLevel) {
		this.contextLevel = contextLevel;
	}

	/**
	 * The date time in UTC format set when the object was created. 
	 */
	protected DateTime createDate;

	public DateTime getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}

	/**
	 * Indicates whether MZDB should store entities in the EntityList instance specific to the localeCode provided.  If true, all operations on the EntityList will be filtered by the provided localeCode on the request or using the defautLocaleCode for the context.  All entities created in the EntityList will be stored with the localeCode provided on the request or the defautLocaleCode for the context as an additional implicit key. The default value is false.
	 */
	protected Boolean isLocaleSpecific;

	public Boolean getIsLocaleSpecific() {
		return this.isLocaleSpecific;
	}

	public void setIsLocaleSpecific(Boolean isLocaleSpecific) {
		this.isLocaleSpecific = isLocaleSpecific;
	}

	/**
	 * Indicates whether MZDB should clone all of the Entities in the EntityList when cloning an existing sandbox for which this list is already defined.  The default value is false.
	 */
	protected Boolean isSandboxDataCloningSupported;

	public Boolean getIsSandboxDataCloningSupported() {
		return this.isSandboxDataCloningSupported;
	}

	public void setIsSandboxDataCloningSupported(Boolean isSandboxDataCloningSupported) {
		this.isSandboxDataCloningSupported = isSandboxDataCloningSupported;
	}

	/**
	 * Indicates whether MZDB should store entities in the EntityList instance specific to the current shopper on the request.  If true, all operations on the EntityList will be filtered by the id of the shopper from the shopper claims provided on the request.  All entities created in the EntityList will be stored with the id of the shopper from the shopper claims provided on the request as an additional implicit key. The default value is false.
	 */
	protected Boolean isShopperSpecific;

	public Boolean getIsShopperSpecific() {
		return this.isShopperSpecific;
	}

	public void setIsShopperSpecific(Boolean isShopperSpecific) {
		this.isShopperSpecific = isShopperSpecific;
	}

	/**
	 * Indicates whether Enitities in the EntityList are allowed to be accessed from a Mozu storefront.
	 */
	protected Boolean isVisibleInStorefront;

	public Boolean getIsVisibleInStorefront() {
		return this.isVisibleInStorefront;
	}

	public void setIsVisibleInStorefront(Boolean isVisibleInStorefront) {
		this.isVisibleInStorefront = isVisibleInStorefront;
	}

	/**
	 * The display name of the source product property. For a product field it will be the display name of the field. For a product attribute it will be the Attribute Name.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * If applicable, the registered namespace associated with objects, used to generate the fully qualified name. If no namespace is defined, the namespace associated with the tenant is automatically assigned.
	 */
	protected String nameSpace;

	public String getNameSpace() {
		return this.nameSpace;
	}

	public void setNameSpace(String nameSpace) {
		this.nameSpace = nameSpace;
	}

	/**
	 * Unique identifier of the Mozu tenant.
	 */
	protected Integer tenantId;

	public Integer getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	/**
	 * The date and time the object was updated most recently. The date is in UTC format.
	 */
	protected DateTime updateDate;

	public DateTime getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * List description of usages for content within a view and scope.
	 */
	protected List<String> usages;
	public List<String> getUsages() {
		return this.usages;
	}
	public void setUsages(List<String> usages) {
		this.usages = usages;
	}

	/**
	 * Indicates whether or not Mozu should assign a generated identifier for each entity in the list or whether a unique identifier will be provided for each identity. If set to false, then a value must be provided for the IdProperty for the list.
	 */
	protected Boolean useSystemAssignedId;

	public Boolean getUseSystemAssignedId() {
		return this.useSystemAssignedId;
	}

	public void setUseSystemAssignedId(Boolean useSystemAssignedId) {
		this.useSystemAssignedId = useSystemAssignedId;
	}

	/**
	 * An IndexedProperty defintion which indicates the property on every entity provided should be used as the unique identifier for the document. Within an EntityList instance each entity must have a unique identifier.
	 */
	protected IndexedProperty idProperty;

	public IndexedProperty getIdProperty() {
		return this.idProperty;
	}

	public void setIdProperty(IndexedProperty idProperty) {
		this.idProperty = idProperty;
	}

	/**
	 * An IndexedProperty defintion which indicates a property on every entity provided that should be indexed to enable querying and sorting.  Non-indexed properties may be used in queries as long as at least one indexed property is also provided in the query.
	 */
	protected IndexedProperty indexA;

	public IndexedProperty getIndexA() {
		return this.indexA;
	}

	public void setIndexA(IndexedProperty indexA) {
		this.indexA = indexA;
	}

	/**
	 * An IndexedProperty defintion which indicates a property on every entity provided that should be indexed to enable querying and sorting.  Non-indexed properties may be used in queries as long as at least one indexed property is also provided in the query.
	 */
	protected IndexedProperty indexB;

	public IndexedProperty getIndexB() {
		return this.indexB;
	}

	public void setIndexB(IndexedProperty indexB) {
		this.indexB = indexB;
	}

	/**
	 * An IndexedProperty defintion which indicates a property on every entity provided that should be indexed to enable querying and sorting.  Non-indexed properties may be used in queries as long as at least one indexed property is also provided in the query.
	 */
	protected IndexedProperty indexC;

	public IndexedProperty getIndexC() {
		return this.indexC;
	}

	public void setIndexC(IndexedProperty indexC) {
		this.indexC = indexC;
	}

	/**
	 * An IndexedProperty defintion which indicates a property on every entity provided that should be indexed to enable querying and sorting.  Non-indexed properties may be used in queries as long as at least one indexed property is also provided in the query.
	 */
	protected IndexedProperty indexD;

	public IndexedProperty getIndexD() {
		return this.indexD;
	}

	public void setIndexD(IndexedProperty indexD) {
		this.indexD = indexD;
	}

	/**
	 * Metadata content for entities, used by document lists, document type lists, document type, views, entity lists, and list views.
	 */
	protected com.fasterxml.jackson.databind.JsonNode metadata;

	public com.fasterxml.jackson.databind.JsonNode getMetadata() {
		return this.metadata;
	}

	public void setMetadata(com.fasterxml.jackson.databind.JsonNode metadata) {
		this.metadata = metadata;
	}

	/**
	 * The view in the site used by associated entities or document lists/list types.
	 */
	protected List<ListView> views;
	public List<ListView> getViews() {
		return this.views;
	}
	public void setViews(List<ListView> views) {
		this.views = views;
	}

}
