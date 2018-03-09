/**
 * 
 */
package com.spring.boot.web.application.springbootwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//Spring app

@Controller
public class LoginController {
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	
	public String loginMessage(ModelMap model) {
		
		/*model.put("name", name);*/
		return "login";
	}
	
@RequestMapping(value="/login",method=RequestMethod.POST)
	
	public String welcomeMessage(ModelMap model,@RequestParam String name,@RequestParam String password) {
		
		model.put("name", name);
		model.put("password", password);
		
		return "welcome";
	

}
}
