package com.seleniumexpress.beanlifecycle.annotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDao {
	
	private String driver;
	private String url;
	private String userName;
	private String password;
	
	Connection con;
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		System.out.println("setting driver");
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		System.out.println("setting url");
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("setting userName");
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("setting password");
		this.password = password;
	}
	
	@PostConstruct
	public void init() throws ClassNotFoundException, SQLException {
		System.out.println("Inside the custom init() ");
		createStudentDBConnection();
	}
	
	@PostConstruct
	public void createStudentDBConnection() throws ClassNotFoundException, SQLException {
		System.out.println("Creating the conncetion");
		Class.forName(driver);
		con = DriverManager.getConnection(url,userName,password);
	}
	

	public void selectAllRow() throws ClassNotFoundException, SQLException 
	{
		System.out.println("retriving data");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM techblog.user");
		while(rs.next()) {
			int userId = rs.getInt(1);
			String name = rs.getString(2);
			String email = rs.getString(3);
			String password = rs.getString(4);
			String gender = rs.getString(5);
			String about = rs.getString(6);
			Timestamp rdate = rs.getTimestamp(7);
			
			System.out.println(userId + " " + name + " " + email + " " + password +" "
					+ "" + gender + " " + about + " " + rdate);
		}	
	}
	
	public void deleteARow(int userId) throws ClassNotFoundException, SQLException {
		Statement stmt = con.createStatement();
		stmt.executeUpdate("delete from techblog.user where id = " + userId);
		
		System.out.println("Record deleted : " + userId);
		
		
	}
	
	@PreDestroy
	public void destory() throws SQLException {
		//System.out.println("This is original destroy()");
		closeConnection();
	}
	
	
	public void closeConnection() throws SQLException {
		//close the connection clean up job
		System.out.println("inside destroy method close the connection");
		con.close();
	}
	

}
