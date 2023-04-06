package com.mobile.ser;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sim {
	public static void main(String[] args) {
		
	
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	System.out.println("Beans.xml file is loaded");
	Airtel air = context.getBean("air",Airtel.class);
	air.servicing();
	
	}
}
