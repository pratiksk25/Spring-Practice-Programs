package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student pratik = context.getBean("student",Student.class);
		pratik.displayStudetnInfo();
		
		Student prasad  = context.getBean("prasad",Student.class);
		prasad.displayStudetnInfo();
		
	}
	
}
