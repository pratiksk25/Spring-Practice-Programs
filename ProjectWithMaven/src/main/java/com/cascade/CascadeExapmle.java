package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;

public class CascadeExapmle {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		
		Question q1 = new Question();
		q1.setQuestionId(5678);
		q1.setQuestion("What is Persist");
		
		Answer a1 =  new Answer(23423, "save");
		Answer a2 =  new Answer(255, "cascade will save all the data reqlated to the main entity ");
		Answer a3 =  new Answer(35, "we dose not need to save it diffrently");
		
		List<Answer> list = new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		q1.setAnswers(list);
		Transaction tx = s.beginTransaction();
		
		s.save(q1);
		
		
		
		tx.commit();
		s.close();
		factory.close();
	}
}
