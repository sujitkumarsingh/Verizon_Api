package com.verizon.api.services;

import com.verizon.api.beans.Address;
import com.verizon.api.beans.ContactDetail;
import com.verizon.api.beans.CreditOrderDetails;
import com.verizon.api.beans.CreditReadOrderResponse;
import com.verizon.api.beans.CustomerName;
import com.verizon.api.beans.EmployerDetails;
import com.verizon.api.beans.IndvCustCredential;
import com.verizon.api.beans.IndvCustomer;
import com.verizon.api.beans.NewOrPrevCustomer;
import com.verizon.api.beans.Response;
import com.verizon.api.beans.ServiceBodyRequest;
import com.verizon.api.beans.ServiceBodyResponse;
import com.verizon.api.beans.VzwServicesRequest;
import com.verizon.api.beans.VzwServicesResponse;

public class VerizonServices {
	
	
	/*public VzwServices<CreditWriteOrder<SubmitResponse>> submitCreditApplication(VzwServices<CreditWriteOrder<Request<CreditOrderDetails>>> request) {
		VzwServices<CreditWriteOrder<SubmitResponse>> vzwServices = new VzwServices<CreditWriteOrder<SubmitResponse>>();
		vzwServices.setHeader(request.getHeader());
		ServiceBody<CreditWriteOrder<SubmitResponse>> serviceBody = new ServiceBody<CreditWriteOrder<SubmitResponse>>();
		CreditWriteOrder<SubmitResponse> creditWriteOrder = new CreditWriteOrder<SubmitResponse>();
		SubmitResponse response = new SubmitResponse();
		response.setCreditApplicationNum("809003250");
		response.setCreditApprovalStatus("AP");
		response.setCreditStatusReason("CA CVAS AUTOMATIC APPROVAL");
		response.setInstallClass("B");
		response.setMessage("");
		response.setReceivableControlled(false);
		response.setSecurityDepositAmount("0");
		response.setServiceClass("B");
		creditWriteOrder.setReq_res(response);
		serviceBody.setObj(creditWriteOrder);
		vzwServices.setServiceBody(serviceBody);
		return vzwServices;
		
	}*/
	
	public VzwServicesResponse retreiveCreditApplication(VzwServicesRequest request) {
		VzwServicesResponse vzwServices = new VzwServicesResponse();
		vzwServices.setServiceHeader(request.getServiceHeader());
		ServiceBodyResponse serviceBody = new ServiceBodyResponse();
		CreditReadOrderResponse creditReadOrder = new CreditReadOrderResponse();
		Response response = new Response();
		IndvCustomer indvCustomer = new IndvCustomer();
		indvCustomer.setAddress(getAddress());
		indvCustomer.setBillLanguage("E");
		indvCustomer.setCustName(getCustomerName());
		indvCustomer.setEmailId("");
		indvCustomer.setEmployerDetails(getEmpDetails());
		indvCustomer.setNewOrPrevCustomer(getNewOrPrevCustomer());
		CreditOrderDetails creditOrderDetails = new CreditOrderDetails();
		creditOrderDetails.setBussOrIndvCustomer("R");
		creditOrderDetails.setCustomerType("N");
		creditOrderDetails.setFamilyShare("N");;
		creditOrderDetails.setIndvCustomer(indvCustomer);
		creditOrderDetails.setNumOfLines("1");
		creditOrderDetails.setSaleType("S");
		creditOrderDetails.setCreditApprovalStatus("AP");
		creditOrderDetails.setCreditStatusReason("CA CVAS AUTOMATIC APPROVAL");
		creditOrderDetails.setInstallClass("B");
		creditOrderDetails.setServiceClass("B");
		creditOrderDetails.setFraudLevel("L");
		creditOrderDetails.setMessage("");
		creditOrderDetails.setReceivableControlled(false);
		response.setCreditOrderDetails(creditOrderDetails);
		creditReadOrder.setResponse(response);
		serviceBody.setCreditReadOrder(creditReadOrder);
		vzwServices.setServiceBody(serviceBody);
		return vzwServices;
	}

	private NewOrPrevCustomer getNewOrPrevCustomer() {
		NewOrPrevCustomer newOrPrevCustomer = new NewOrPrevCustomer();
		newOrPrevCustomer.setContactDetail(getContactDetails());
		newOrPrevCustomer.setIndvCustCredential(getIndvCustCredential());
		return newOrPrevCustomer;
	}

	private IndvCustCredential getIndvCustCredential() {
		IndvCustCredential indvCustCredential = new IndvCustCredential();
		indvCustCredential.setDateOfBirth("12/01/1980");
		indvCustCredential.setDrvLic("123456");
		indvCustCredential.setDrvLicState("NJ");
		indvCustCredential.setSsn("000007777");
		return indvCustCredential;
	}

	private ContactDetail getContactDetails() {
		ContactDetail contactDetail = new ContactDetail();
		contactDetail.setHomePhone("7325551212");
		contactDetail.setWorkPhone("9085551212");
		return contactDetail;
	}

	private EmployerDetails getEmpDetails() {
		EmployerDetails details = new EmployerDetails();
		details.setEmployerCity("BASKING RIDGE");
		details.setEmployerName("VERIZON WIRELESS");
		details.setEmployerState("NJ");
		return details;
	}

	private CustomerName getCustomerName() {
		CustomerName customerName = new CustomerName();
		customerName.setFirstName("Test");
		customerName.setLastName("Test");
		customerName.setMidInitials("Z");
		customerName.setSuffix("");
		return customerName;
	}

	private Address getAddress() {
		Address address = new Address();
		address.setAptNum("");
		address.setCity("WARREN");
		address.setCountry("USA");
		address.setDir("");
		address.setPobox("");
		address.setStreetName("INDEPENDENCE");
		address.setStreetNum("30");
		address.setType("BL");
		address.setZipCode("07059");
		address.setZipCode4("6747");
		return address;
	}

}
