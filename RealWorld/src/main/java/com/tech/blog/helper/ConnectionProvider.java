package com.tech.blog.helper;

import java.sql.*;
import java.sql.DriverManager;

public class ConnectionProvider {

	private static Connection con;

	public static Connection getConnection() {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
			// create connection con =
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/techblog", "root", "pratik");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Connection" + con);
		return con;
	}
}
