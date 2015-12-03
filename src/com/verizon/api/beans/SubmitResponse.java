package com.verizon.api.beans;

public class SubmitResponse extends Response{

	private String creditApplicationNum;
	
	private String creditApprovalStatus;
	
	private String securityDepositAmount;
	
	private String creditStatusReason;
	
	private String serviceClass;
	
	private String installClass;
	
	private boolean receivableControlled;
	
	private String message;

	public String getCreditApplicationNum() {
		return creditApplicationNum;
	}

	public void setCreditApplicationNum(String creditApplicationNum) {
		this.creditApplicationNum = creditApplicationNum;
	}

	public String getCreditApprovalStatus() {
		return creditApprovalStatus;
	}

	public void setCreditApprovalStatus(String creditApprovalStatus) {
		this.creditApprovalStatus = creditApprovalStatus;
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

	public boolean getReceivableControlled() {
		return receivableControlled;
	}

	public void setReceivableControlled(boolean receivableControlled) {
		this.receivableControlled = receivableControlled;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
