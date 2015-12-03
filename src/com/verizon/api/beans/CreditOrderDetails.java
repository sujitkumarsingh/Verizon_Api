package com.verizon.api.beans;

public class CreditOrderDetails {
	
	private String bussOrIndvCustomer;
	
	private String saleType;
	
	private String customerType;
	
	private String numOfLines;
	
	private String familyShare;
	
	private String globalFeatureIndicator;
	
	private String edgeIndicator;
	
	private IndvCustomer indvCustomer;
	
	private boolean receivableControlled;
	
	private String serviceClass;
	
	private String installClass;
	
	private String securityDepositAmount;
	
	private String creditStatusReason;
	
	private String creditApprovalStatus;
	
	private String message;
	
	private String fraudLevel;

	public String getBussOrIndvCustomer() {
		return bussOrIndvCustomer;
	}

	public void setBussOrIndvCustomer(String bussOrIndvCustomer) {
		this.bussOrIndvCustomer = bussOrIndvCustomer;
	}

	public String getSaleType() {
		return saleType;
	}

	public void setSaleType(String saleType) {
		this.saleType = saleType;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getNumOfLines() {
		return numOfLines;
	}

	public void setNumOfLines(String numOfLines) {
		this.numOfLines = numOfLines;
	}

	public String getFamilyShare() {
		return familyShare;
	}

	public void setFamilyShare(String familyShare) {
		this.familyShare = familyShare;
	}

	public String getGlobalFeatureIndicator() {
		return globalFeatureIndicator;
	}

	public void setGlobalFeatureIndicator(String globalFeatureIndicator) {
		this.globalFeatureIndicator = globalFeatureIndicator;
	}

	public String getEdgeIndicator() {
		return edgeIndicator;
	}

	public void setEdgeIndicator(String edgeIndicator) {
		this.edgeIndicator = edgeIndicator;
	}

	public IndvCustomer getIndvCustomer() {
		return indvCustomer;
	}

	public void setIndvCustomer(IndvCustomer indvCustomer) {
		this.indvCustomer = indvCustomer;
	}

	public boolean isReceivableControlled() {
		return receivableControlled;
	}

	public void setReceivableControlled(boolean receivableControlled) {
		this.receivableControlled = receivableControlled;
	}

	public String getServiceClass() {
		return serviceClass;
	}

	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}

	public String getInstallClass() {
		return installClass;
	}

	public void setInstallClass(String installClass) {
		this.installClass = installClass;
	}

	public String getSecurityDepositAmount() {
		return securityDepositAmount;
	}

	public void setSecurityDepositAmount(String securityDepositAmount) {
		this.securityDepositAmount = securityDepositAmount;
	}

	public String getCreditStatusReason() {
		return creditStatusReason;
	}

	public void setCreditStatusReason(String creditStatusReason) {
		this.creditStatusReason = creditStatusReason;
	}

	public String getCreditApprovalStatus() {
		return creditApprovalStatus;
	}

	public void setCreditApprovalStatus(String creditApprovalStatus) {
		this.creditApprovalStatus = creditApprovalStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFraudLevel() {
		return fraudLevel;
	}

	public void setFraudLevel(String fraudLevel) {
		this.fraudLevel = fraudLevel;
	}

}
