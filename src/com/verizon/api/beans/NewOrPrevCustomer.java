package com.verizon.api.beans;

public class NewOrPrevCustomer {
	
	private IndvCustCredential indvCustCredential;
	
	private ContactDetail contactDetail;

	public IndvCustCredential getIndvCustCredential() {
		return indvCustCredential;
	}

	public void setIndvCustCredential(IndvCustCredential indvCustCredential) {
		this.indvCustCredential = indvCustCredential;
	}

	public ContactDetail getContactDetail() {
		return contactDetail;
	}

	public void setContactDetail(ContactDetail contactDetail) {
		this.contactDetail = contactDetail;
	}

}
