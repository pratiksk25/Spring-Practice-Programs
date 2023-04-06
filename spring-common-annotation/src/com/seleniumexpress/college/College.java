package com.seleniumexpress.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	
	private String collegeName;
	
	@Autowired
	private Principal principal;
	
	@Autowired
	//@Qualifier("scienceteacher")
	private Teacher  teacher;
	
	
	@Required
	@Value("${college.name}")
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	/*
	public College(Principal principal) {
		super();
		this.principal = principal;
	}*/



	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("my colllege name is " + collegeName);
		System.out.println("testing this class");
	}

	
	
}
