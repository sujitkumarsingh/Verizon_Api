package com.verizon.api.beans;

public class VzwServicesResponse {

	private ServiceHeader serviceHeader;

	private ServiceBodyResponse serviceBody;

	public ServiceHeader getServiceHeader() {
		return serviceHeader;
	}

	public void setServiceHeader(ServiceHeader serviceHeader) {
		this.serviceHeader = serviceHeader;
	}

	public ServiceBodyResponse getServiceBody() {
		return serviceBody;
	}

	public void setServiceBody(ServiceBodyResponse serviceBody) {
		this.serviceBody = serviceBody;
	}
}
