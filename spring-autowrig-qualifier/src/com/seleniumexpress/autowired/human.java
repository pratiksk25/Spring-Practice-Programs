package com.seleniumexpress.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class human {
	
	private Heart heart;
	@Autowired
	@Qualifier("humanheart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public human() {}
	
	
	public human(Heart heart) {
		super();
		this.heart = heart;
	}

	public void startPumping()
	{
		if(heart != null) {
			
		
		heart.pump();
		System.out.println("name of the animal :: " + heart.getNameOfAnimal() + "no of hearts :: " + heart.getNoOfHeart()  );
		
		}else
		{
			System.out.println("you are dead");
		}
	}
	

}
