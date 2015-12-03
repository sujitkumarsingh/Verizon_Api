package com.verizon.api.beans;

import javax.xml.bind.annotation.XmlElement;

public class OrderKeyInfo {
	@XmlElement
	private String clusterInfo;
	@XmlElement
	private String location;
	@XmlElement
	private String creditApplicationNum;
	@XmlElement
	private String orderNum;
	@XmlElement
	private String billingSystem;
	@XmlElement
	private String salesForceId;
	@XmlElement
	private String outletId;

	public String getClusterInfo() {
		return clusterInfo;
	}

	public void setClusterInfo(String clusterInfo) {
		this.clusterInfo = clusterInfo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCreditApplicationNum() {
		return creditApplicationNum;
	}

	public void setCreditApplicationNum(String creditApplicationNum) {
		this.creditApplicationNum = creditApplicationNum;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getBillingSystem() {
		return billingSystem;
	}

	public void setBillingSystem(String billingSystem) {
		this.billingSystem = billingSystem;
	}

	public String getSalesForceId() {
		return salesForceId;
	}

	public void setSalesForceId(String salesForceId) {
		this.salesForceId = salesForceId;
	}

	public String getOutletId() {
		return outletId;
	}

	public void setOutletId(String outletId) {
		this.outletId = outletId;
	}

}
