package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Beans.xml file loaded");
		Student student = context.getBean("stu",Student.class);
		student.cheating();
	
		AnotherStudent an = context.getBean("anotherStudent",AnotherStudent.class);
		an.startCheatig();
	}
}
