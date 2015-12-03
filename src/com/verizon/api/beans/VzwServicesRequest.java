package com.verizon.api.beans;

public class VzwServicesRequest{
	
	private ServiceHeader serviceHeader;
	
	private ServiceBodyRequest serviceBody;

	public ServiceHeader getServiceHeader() {
		return serviceHeader;
	}

	public void setServiceHeader(ServiceHeader serviceHeader) {
		this.serviceHeader = serviceHeader;
	}

	public ServiceBodyRequest getServiceBody() {
		return serviceBody;
	}

	public void setServiceBody(ServiceBodyRequest serviceBody) {
		this.serviceBody = serviceBody;
	}
	

}
