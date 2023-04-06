package com.seleniumexpress.beanlifecycle.annotation;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//((ClassPathXmlApplicationContext)context).registerShutdownHook();
		//StudentDao studentDao = context.getBean("studentDAO",StudentDao.class);
		//System.out.println("Student Dao object ::" + studentDao);
		//studentDao.selectAllRow();
		
		//
		
		
		Hello hello = context.getBean("hello",Hello.class);
		hello.sapmle();
		
		((ClassPathXmlApplicationContext)context).close();
	}
} 