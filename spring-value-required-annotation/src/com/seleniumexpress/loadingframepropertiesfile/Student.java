package com.seleniumexpress.loadingframepropertiesfile;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${student.name}")
	private String name;
	
	@Value("${student.course}")
	private String course;
	
	@Value("${student.hobby}")
	private String hobby;
		
	
	
	
	
	public void displayStudentInfo()
	{
		System.out.println("Student name ::" + name );
		System.out.println("Intrested course ::" + course);
		System.out.println("Hobby ::" + hobby);
	}
	
}
