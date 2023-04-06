package com.selniumexpress.ioc;

public class Airtel implements Sim{

	public Airtel() {
		System.out.println("Airtel con");
	}
	
	@Override
	public void calling() {
		System.out.println("Calling using airtel Sim");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using airtel sim");
	}
	
}
