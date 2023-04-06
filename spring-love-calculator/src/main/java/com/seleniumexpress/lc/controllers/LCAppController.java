package com.seleniumexpress.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.api.UserInfoDTO;

@Controller
public class LCAppController {

	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfo) {
		
		return "home-page";
	}

	@RequestMapping("/process-homepage")
	public String showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult resut) {
		
		System.out.println(userInfoDTO.isTermAndCondition());
		
		if(resut.hasErrors()) {
			List<ObjectError> allError =  resut.getAllErrors();
			for(ObjectError temp : allError) {
				System.out.println(temp + "\n");
			}
			return "home-page";
		}
		
		return "result-page";
	}
}
