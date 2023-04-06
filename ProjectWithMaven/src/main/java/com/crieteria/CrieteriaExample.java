package com.crieteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.tut.Student;

public class CrieteriaExample {
	public static void main(String[] args) {
		
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		
		Criteria c = s.createCriteria(Student.class);
		
		//c.add(Restrictions.eq("certi.course", "java hibernate"));
		c.add(Restrictions.like("certi.course", "java " ));
		
		List<Student> list =  c.list();
		
		for(Student st : list) {
			System.out.println(st);
		}
		
		s.close();
	}
}
