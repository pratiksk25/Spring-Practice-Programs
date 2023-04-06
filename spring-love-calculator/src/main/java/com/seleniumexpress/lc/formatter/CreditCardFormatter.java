package com.seleniumexpress.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.seleniumexpress.lc.api.CreditCard;

public class CreditCardFormatter implements Formatter<CreditCard>{

	@Override
	public String print(CreditCard creditCard, Locale locale) {
		
		return null;
	}

	@Override
	public CreditCard parse(String text, Locale locale) throws ParseException {
		
		String[] digitArray = text.split("-");
		
		CreditCard creditCard = new CreditCard();
		
		creditCard.setFirstFourDigits(Integer.valueOf(digitArray[0]));
		creditCard.setSecondFourDigits(Integer.valueOf(digitArray[1]));
		creditCard.setThirdFourDigits(Integer.valueOf(digitArray[2]));
		creditCard.setFourthGourDigits(Integer.valueOf(digitArray[3]));
		
		return creditCard;
	}

}
