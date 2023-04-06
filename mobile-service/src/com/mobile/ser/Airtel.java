package com.mobile.ser;

public class Airtel {
	private ServicesDemo service;

	public void setService(ServicesDemo service) {
		this.service = service;
	}
	
	public void servicing() {
		service.service();
	}
}
