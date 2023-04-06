package com.seleniumexpress.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class ScienceTeacher implements Teacher{

	@Override
	
	public void teach() {
		System.out.println("Hi i am your Science Teacher");
		System.out.println("MY name is anurag");
		
	}

}
