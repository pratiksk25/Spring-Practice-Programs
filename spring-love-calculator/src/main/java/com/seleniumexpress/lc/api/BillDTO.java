package com.seleniumexpress.lc.api;

import java.math.BigDecimal;
import java.util.Date;

public class BillDTO {

	private BigDecimal amount;
	private Currancy currancy;
	private Date date;
	private CreditCard creditCard;
	
	
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Currancy getCurrancy() {
		return currancy;
	}
	public void setCurrancy(Currancy currancy) {
		this.currancy = currancy;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public CreditCard getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
	public BillDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BillDTO(BigDecimal amount, Currancy currancy, Date date, CreditCard creditCard) {
		super();
		this.amount = amount;
		this.currancy = currancy;
		this.date = date;
		this.creditCard = creditCard;
	}
	
	
	
	
}
