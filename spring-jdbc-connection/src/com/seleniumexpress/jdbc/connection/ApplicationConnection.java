package com.seleniumexpress.jdbc.connection;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		JDBCConnection jdbc = context.getBean("jdbc",JDBCConnection.class);	
		
				jdbc.display();
		
	}
}
