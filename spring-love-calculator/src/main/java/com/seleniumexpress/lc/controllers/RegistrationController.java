package com.seleniumexpress.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.api.CommunicationDTO;
import com.seleniumexpress.lc.api.Phone;
import com.seleniumexpress.lc.api.UserRegistrationDTO;
import com.seleniumexpress.lc.propertyeditor.NamePropertEditor;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO dto) {
		
		System.out.println("inside show registration page");
		
		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setUserNumber("8487918192");
		
		CommunicationDTO communicationDTO = new CommunicationDTO();
		communicationDTO.setPhone(phone);
		
		dto.setCommunicationDTO(communicationDTO);
		
		return "user-registeration-page"; 
	}
	
	@RequestMapping("/registration-success")
	public String processUserReg(@Valid @ModelAttribute("userReg") UserRegistrationDTO dto, BindingResult result) {
		
		System.out.println("Name value entered by the user is : " + "|" + dto.getName() + "|");
		
		if(result.hasErrors()) {
			System.out.println("Page has errors!");
			
			List<ObjectError> allError = result.getAllErrors();
			
			for(ObjectError error : allError) {
				System.out.println(error);
			}
			return "user-registeration-page";
		}
		
		System.out.println("inside the processUserRegister()");
		
		
		
		return "registration-success";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("Inside init binder methos");
	
		
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, "name", editor);
		
		//binder.setDisallowedFields("name");
		NamePropertEditor nameEditor = new NamePropertEditor();
		binder.registerCustomEditor(String.class,"name", nameEditor);
	
	}
	
	
}
