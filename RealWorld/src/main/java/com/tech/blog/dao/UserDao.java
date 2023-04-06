package com.tech.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tech.blog.entities.User;

public class UserDao {
	
	private Connection con;

	public UserDao(Connection con) {
		this.con = con;
	}
	
	//method to insert user data
	
	public boolean saveUser(User user) {
		boolean f = false;
		try {
			
			
			//user -> database
			String query ="insert into user(name,email,password,gender,about) values (?,?,?,?,?)";
			PreparedStatement psmt = this.con.prepareStatement(query);
			psmt.setString(1, user.getName());
			psmt.setString(2, user.getEmail());
			psmt.setString(3, user.getPassword());
			psmt.setString(4, user.getGender());
			psmt.setString(5, user.getAbout());
			
			psmt.executeUpdate();
			f=true;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	//get user by email and password
	
	public User getUserByEmailAndPassword(String email,String password) {
		User user = null;
		
		try
		{
			String query = "select * from user where email =? and password =?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			
			ResultSet set = pstmt.executeQuery();
			
			if(set.next()) {
				user = new User();
				String name = set.getString("name");
				user.setName(name);
				
				user.setId(set.getInt("Id"));
				user.setEmail(set.getString("email"));
				user.setPassword(set.getString("password"));
				user.setGender(set.getString("gender"));
				user.setAbout(set.getString("about"));
				user.setDateTime(set.getTimestamp("rdate"));
				user.setProfile(set.getString("profile"));
			
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return user;
	}
	
	
}
