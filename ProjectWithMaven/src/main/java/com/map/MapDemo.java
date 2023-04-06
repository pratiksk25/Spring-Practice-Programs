package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// Creating Question
//		Question q1 = new Question();
//		q1.setQuestionId(1212);
//		q1.setQuestion("What is java ?");
//
//		// creating ans
//		Answer a1 = new Answer();
//		a1.setAnswerid(343);
//		a1.setAnswer("Java is programming Language.");
//		a1.setQuestion(q1);
//
//		// creating ans
//		Answer a2 = new Answer();
//		a2.setAnswerid(33);
//		a2.setAnswer("Java is OOP.");
//		a2.setQuestion(q1);
//
//		// creating ans
//		Answer a3 = new Answer();
//		a3.setAnswerid(34);
//		a3.setAnswer("Java is programming Language.");
//		a3.setQuestion(q1);
//		
//		
//		//List of answers 
//		List<Answer> list = new ArrayList<Answer>();
//		list.add(a1);
//		list.add(a2);
//		list.add(a3);
//		
//		q1.setAnswers(list);
	

		// session
		Session s = factory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();
		
		//Save
//		s.save(q1);
//		s.save(a1);
//		s.save(a2);
//		s.save(a3);
		
		Question q  = (Question)s.get(Question.class,1212);
		
		System.out.println(q.getQuestionId());
		System.out.println(q.getQuestion());
		//lazy
		System.out.println(q.getAnswers().size());
		
		
		//before adding lazy and eger 
//		System.out.println(q.getQuestion());
//		
//		for(Answer a : q.getAnswers()) {
//			System.out.println(a.getAnswer());
//		}
		
		tx.commit();

		// fetching
//		Question newQ = (Question) s.get(Question.class, 1212);
//		System.out.println(newQ.getQuestion());
		

		s.close();
		factory.close();

	}
}
