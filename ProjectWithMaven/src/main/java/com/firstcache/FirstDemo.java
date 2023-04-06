package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class FirstDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
//		first level is by defalut enabled : in first level chche it wont retrigger the query
		
		Student student = session.get(Student.class, 1414);
		System.out.println(student);
		
		System.out.println("working something");
		
		Student student1 = session.get(Student.class,1414);
		System.out.println(student1);
		
		System.out.println(session.contains(student1));
		
		session.close();	
		
	}
}
