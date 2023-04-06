package com.seleniumexpress.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection {
	
	@Value("${mysql.url}")
	private String url;
	
	@Value("${mysql.username}")
	private String userName;
	
	@Value("${mysql.password}")
	private String password;
	
	@Value("${mysql.driver}")
	private String driver;
	
	
	public void display()
	{
		System.out.println(url + " " + userName + " "
				+ "" + password + " " + driver );
	}
	
	public void getJDBCConnection() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url);
		System.out.println("Connection successfull :: " + con);
	}
}
