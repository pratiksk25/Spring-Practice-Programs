package com.selniumexpress.ioc;

public class Jio implements Sim{

	public Jio() {
		System.out.println("Jio COnst");
	}
	
	@Override
	public void calling() {
		System.out.println("Calling using jio Sim");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using jio sim");
	}
	
}
