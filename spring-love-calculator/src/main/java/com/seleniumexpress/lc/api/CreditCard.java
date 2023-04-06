package com.seleniumexpress.lc.api;

public class CreditCard {
	
	private Integer firstFourDigits;
	private Integer secondFourDigits;
	private Integer thirdFourDigits;
	private Integer fourthGourDigits;
	
	public Integer getFirstFourDigits() {
		return firstFourDigits;
	}
	
	public void setFirstFourDigits(Integer firstFourDigits) {
		this.firstFourDigits = firstFourDigits;
	}
	
	public Integer getSecondFourDigits() {
		return secondFourDigits;
	}
	
	public void setSecondFourDigits(Integer secondFourDigits) {
		this.secondFourDigits = secondFourDigits;
	}
	
	public Integer getThirdFourDigits() {
		return thirdFourDigits;
	}
	
	public void setThirdFourDigits(Integer thirdFourDigits) {
		this.thirdFourDigits = thirdFourDigits;
	}
	
	public Integer getFourthGourDigits() {
		return fourthGourDigits;
	}
	
	public void setFourthGourDigits(Integer fourthGourDigits) {
		this.fourthGourDigits = fourthGourDigits;
	}

	public CreditCard(Integer firstFourDigits, Integer secondFourDigits, Integer thirdFourDigits,
			Integer fourthGourDigits) {
		super();
		this.firstFourDigits = firstFourDigits;
		this.secondFourDigits = secondFourDigits;
		this.thirdFourDigits = thirdFourDigits;
		this.fourthGourDigits = fourthGourDigits;
	}

	public CreditCard() {
		// TODO Auto-generated constructor stub
	}
	
	

}
