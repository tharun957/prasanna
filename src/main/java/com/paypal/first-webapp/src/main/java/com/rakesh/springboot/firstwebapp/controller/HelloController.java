package com.rakesh.springboot.firstwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rakesh.springboot.firstwebapp.validate.Validateuser;

@Controller
public class HelloController {
	//private static final Object msg = null;

	@RequestMapping(value = "/FWhello", method = RequestMethod.GET)
	public String message() {
		return "login";
		

	}
    @Autowired
	 Validateuser use;
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String displaymessage(@RequestParam String name, ModelMap model ) {
		 boolean isValid = use.Check(name);
		 if(!isValid){
			model.put("msg", "Invalid");
			 return "login";
		 }
		 else {
		model.put("name", name);
		return "user";

	}
	}}

