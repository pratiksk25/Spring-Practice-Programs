package com.seleniumexpress.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.seleniumexpress.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {
		System.out.println("inside the print() of formatter class");

		return phone.getCountryCode() + "-" + phone.getUserNumber();

	}
	
	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {

		int index = completePhoneNumber.indexOf('-');
		Phone phone = new Phone();
		String[] phoneNumberArray = completePhoneNumber.split("-");
		if (index == -1 || completePhoneNumber.startsWith("-")) {
			phone.setCountryCode("91");
			if (completePhoneNumber.startsWith("-")) 
			{
				phone.setUserNumber(phoneNumberArray[1]);
			} 
			else 
			{
				phone.setUserNumber(phoneNumberArray[0]);
			}
		} 
		else 
		{

			System.out.println("paser method of phone no.");
			// split the string

			phone.setCountryCode(phoneNumberArray[0]);
			phone.setUserNumber(phoneNumberArray[1]);
		}
		return phone;
	}
}
