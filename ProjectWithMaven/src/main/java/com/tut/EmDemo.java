package com.tut;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;

import com.mysql.cj.Session;

public class EmDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Student student1 = new Student();
		student1.setId(103);
		student1.setName("Pratik");
		student1.setCity("Pune");
		
		Certificate certificate = new Certificate();
		certificate.setCourse("Java");
		certificate.setDuration("2 months");
		
		student1.setCerti(certificate);
		
		Student student2 = new Student();
		student2.setId(104);
		student2.setName("Anu");
		student2.setCity("Dighi");
		
		Certificate certificate1 = new Certificate();
		certificate1.setCourse("Marathi");
		certificate1.setDuration("3 months");
		
		student2.setCerti(certificate1);
		
		org.hibernate.Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		//Object save
		s.save(student1);
		s.save(student2);
		
 		
		tx.commit();
		s.close();
		factory.close();
	}
}
