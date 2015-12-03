package com.verizon.api.beans;

public class IndvCustomer {
	
	private CustomerName custName;
	
	private Address address;
	
	private String emailId;
	
	private NewOrPrevCustomer newOrPrevCustomer;
	
	private String billLanguage;
	
	private EmployerDetails employerDetails;

	public CustomerName getCustName() {
		return custName;
	}

	public void setCustName(CustomerName custName) {
		this.custName = custName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public NewOrPrevCustomer getNewOrPrevCustomer() {
		return newOrPrevCustomer;
	}

	public void setNewOrPrevCustomer(NewOrPrevCustomer newOrPrevCustomer) {
		this.newOrPrevCustomer = newOrPrevCustomer;
	}

	public String getBillLanguage() {
		return billLanguage;
	}

	public void setBillLanguage(String billLanguage) {
		this.billLanguage = billLanguage;
	}

	public EmployerDetails getEmployerDetails() {
		return employerDetails;
	}

	public void setEmployerDetails(EmployerDetails employerDetails) {
		this.employerDetails = employerDetails;
	}

}
