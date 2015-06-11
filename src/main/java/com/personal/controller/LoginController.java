package com.personal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.personal.service.UserAccountService;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private UserAccountService userAccountService;
	

	
	
}
