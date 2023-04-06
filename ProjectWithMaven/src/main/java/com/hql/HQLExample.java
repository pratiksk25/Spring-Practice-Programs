package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tut.Student;



public class HQLExample {
	public static void main(String[] args) {
		org.hibernate.cfg.Configuration cfg = new org.hibernate.cfg.Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session s = factory.openSession();
		
		//HQL SYntax
		
		String query = "from Student as s where s.city =:x and s.name =:n" ;
		
		Query q = s.createQuery(query);
		q.setParameter("x", "Karve");
		q.setParameter("n", "pratik");
		
		//single result (unique) 
		List<Student> list = q.list();
		for(Student student : list)
		{
			System.out.println(student + " : " + student.getCerti().getCourse());
		}
		
		System.out.println("-----------------------------------Delete-----------------------------------");
		
		Transaction tx = s.beginTransaction();
//		Query q2 = s.createQuery("delete from Student s where s.city=:c");
//		q2.setParameter("c", "silvassa");
//		
//		int r = q2.executeUpdate();
//		System.out.println("Deleted ::" + r);
		
		System.out.println("-----------------------------------Update----------------------------------");
		//Upadate
		Query q2 = s.createQuery("update Student set city =:c where name =:n");
		q2.setParameter("c", "Pune");
		q2.setParameter("n", "Pratik");
		int r = q2.executeUpdate();
		System.out.println(r + "Rows Updated");
		
		System.out.println("------------------------------------ join -------------------------");
//		how to execute join query
		Query q3 = s.createQuery("select q.question , q.questionId, a.answer from Question as q INNER JOIN q.Answers as a");
		
		List<Object []> list3= q3.getResultList();
		for(Object[] arr : list3)
		{
			System.out.println(Arrays.toString(arr));
		}
		
		
		tx.commit();
		s.close();
		factory.close();
	}
}
