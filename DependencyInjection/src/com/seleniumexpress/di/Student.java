package com.seleniumexpress.di;

public class Student {
	
	private int id;
	private String studentName;

	
	public Student(int id) {
		this.id=id;
	}

	public Student(int id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
	}
	

	public void displayStudetnInfo()
	{
		System.out.println("student name is :: " + studentName
							+"\nStudent id :: " + id);
	}
	
}
