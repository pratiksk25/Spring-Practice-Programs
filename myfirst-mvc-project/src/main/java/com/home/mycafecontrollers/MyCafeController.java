package com.home.mycafecontrollers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//welcome
@Controller
public class MyCafeController {
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) {
		
	model.addAttribute("myWebSiteTitle", "MoM's Cafe");	
		return "welcome-page";
	}
	
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request,Model model) {
		//handle the data received from the user
		String value = request.getParameter("foodtype");
		//adding capture value to model
		model.addAttribute("value",value);
		
		//set the user data with the model object and send it to view
		return "process-order";
	}
}
