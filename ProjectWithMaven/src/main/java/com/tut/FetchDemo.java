package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		//get() , load()
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		//get-StudentId 102
		Student student = (Student)session.get(Student.class, 102);//you can also use load() it will work the same
		System.out.println(student);
		
		Address ad = (Address)session.load(Address.class, 1);
		System.out.println(ad.getStreet() + " :: " + ad.getCity() );
		
		session.close();
		factory.close();
	}
}

/*
 * diffrenace between get and load method is 
 * 1) in get method when you call the get() that time only it fire the select query and store the data inside the session so that next time if you ask for the same data then it will not it will not fire the select query it just take the data from that session and display the data
 * 2) in load method when you call the load () that time it will not fire the select query untill you do not use the data of the asked object once any of the data is used then it will automatically fire the select the query
 * 
 * 
 */
