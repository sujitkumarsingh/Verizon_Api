package com.verizon.api.beans;

import javax.xml.bind.annotation.XmlElement;

public class ServiceHeader {

	@XmlElement
	private String userName;
	@XmlElement
	private String password;
	@XmlElement
	private String clientAppName;
	@XmlElement
	private String serviceName;
	@XmlElement
	private String serviceAction;
	@XmlElement
	private String timeStamp;
	@XmlElement
	private String storeID;
	@XmlElement
	private String clientAddlInfo;
	@XmlElement
	private String transactionId;
	@XmlElement
	private String sessionID;
	@XmlElement
	private String serviceAreaZip;
	@XmlElement
	private OrderKeyInfo orderKeyInfo;
	@XmlElement
	private String xmlVersion;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getClientAppName() {
		return clientAppName;
	}

	public void setClientAppName(String clientAppName) {
		this.clientAppName = clientAppName;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceAction() {
		return serviceAction;
	}

	public void setServiceAction(String serviceAction) {
		this.serviceAction = serviceAction;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getStoreID() {
		return storeID;
	}

	public void setStoreID(String storeID) {
		this.storeID = storeID;
	}

	public String getClientAddlInfo() {
		return clientAddlInfo;
	}

	public void setClientAddlInfo(String clientAddlInfo) {
		this.clientAddlInfo = clientAddlInfo;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getSessionID() {
		return sessionID;
	}

	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}

	public String getServiceAreaZip() {
		return serviceAreaZip;
	}

	public void setServiceAreaZip(String serviceAreaZip) {
		this.serviceAreaZip = serviceAreaZip;
	}

	public OrderKeyInfo getOrderKeyInfo() {
		return orderKeyInfo;
	}

	public void setOrderKeyInfo(OrderKeyInfo orderKeyInfo) {
		this.orderKeyInfo = orderKeyInfo;
	}

	public String getXmlVersion() {
		return xmlVersion;
	}

	public void setXmlVersion(String xmlVersion) {
		this.xmlVersion = xmlVersion;
	}
}
