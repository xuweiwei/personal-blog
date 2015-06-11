package com.personal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.personal.service.UserAccountService;

@Controller
@RequestMapping("/user")
public class UserAccountController {
	@Autowired
	public UserAccountService userService;

	@RequestMapping(value="/send", method = RequestMethod.GET)
	public String showUser() {
		
		
		return "/login/login";
	}

}