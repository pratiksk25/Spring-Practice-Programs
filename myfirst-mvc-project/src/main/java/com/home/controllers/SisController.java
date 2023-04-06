package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("sis")
public class SisController {

	@ResponseBody
	@RequestMapping("/makeup")
	public String getMakeUpKit() {
		return "Hey here is your makeup kit";
	}
	
	@ResponseBody
	@RequestMapping("/book")
	public String getBook() {
		System.out.println("This is maths book");
		return "Math Book";
	}
}
