package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Clinet {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("bean.xml file found");
		Student student = context.getBean("stu",Student.class);
		student.cheating();
		
		Student st = new Student();
		Cheat ch = new JavaCheat();
		
		st.setCheat(ch);
		st.cheating();
		
		
	}
	
}
