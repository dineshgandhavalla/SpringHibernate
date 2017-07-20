package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController{




	@RequestMapping(value="/", method=RequestMethod.GET)
	protected String handleRequestInternal()
	{
	
	return "index";
	
	
	}
	@RequestMapping(value="/Welcome", method=RequestMethod.GET)
	protected String WelcomPage(Model model)  {
		
		model.addAttribute("ms", "Welcome to spring");
		return "hello";
	
	
}

}
