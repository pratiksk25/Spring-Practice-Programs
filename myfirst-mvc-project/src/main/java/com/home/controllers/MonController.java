package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MonController {
	
	@ResponseBody
	@RequestMapping("/suger")
	public String giveSuger() {
		return "Ok...here is your suger.";
	}

}
