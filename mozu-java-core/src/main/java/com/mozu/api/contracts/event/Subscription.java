/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.event;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.event.SubscribingSite;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Subscription implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Boolean isActive;

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	protected Boolean noCallback;

	public Boolean getNoCallback() {
		return this.noCallback;
	}

	public void setNoCallback(Boolean noCallback) {
		this.noCallback = noCallback;
	}

	protected String notificationDeliveryType;

	public String getNotificationDeliveryType() {
		return this.notificationDeliveryType;
	}

	public void setNotificationDeliveryType(String notificationDeliveryType) {
		this.notificationDeliveryType = notificationDeliveryType;
	}

	protected List<String> topics;
	public List<String> getTopics() {
		return this.topics;
	}
	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	protected String updateBy;

	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	protected DateTime updateDate;

	public DateTime getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}

	protected String apiVersion;

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	protected String appId;

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	protected Boolean confirmed;

	public Boolean getConfirmed() {
		return this.confirmed;
	}

	public void setConfirmed(Boolean confirmed) {
		this.confirmed = confirmed;
	}

	protected String contentType;

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	protected String createBy;

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	protected DateTime createDate;

	public DateTime getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}

	protected String endpoint;

	public String getEndpoint() {
		return this.endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected List<SubscribingSite> subscribingSites;
	public List<SubscribingSite> getSubscribingSites() {
		return this.subscribingSites;
	}
	public void setSubscribingSites(List<SubscribingSite> subscribingSites) {
		this.subscribingSites = subscribingSites;
	}

}
