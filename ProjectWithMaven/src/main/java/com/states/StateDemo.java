package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tut.Certificate;
import com.tut.Student;

public class StateDemo {
	public static void main(String[] args) {
		System.out.println("Example");
		
		SessionFactory f = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); 
		
		//Student object 
		Student student = new Student();
		student.setId(1414);
		student.setName("Prasad");
		student.setCity("Karve");
		student.setCerti(new Certificate("java hibernate","2 months"));
		
		//Student object in transient state
		Session s = f.openSession();
		Transaction tx = s.beginTransaction();
		s.save(student);
		
		//Student object in persistent state : associated with session and database
		student.setName("Pratik");
		
		tx.commit();
		
		s.close();
		//student object in detached state
		student.setName("Sachin");
		
		System.out.println(student);
		
		//remove state : get data from the database and use remove method to remove it from the database
		
		
		f.close();
	}
}
