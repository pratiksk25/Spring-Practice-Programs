package com.seleniumexpress.college;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean("college",College.class);
		System.out.println("college object is created by spring" + college);
		college.test();
		context.close();
	}
}
