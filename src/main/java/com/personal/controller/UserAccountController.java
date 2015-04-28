package com.personal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.personal.service.UserAccountService;

@Controller
@RequestMapping("/user")
public class UserAccountController {
	public class UserController {
		@Autowired
		public UserAccountService userService;


		@RequestMapping(method = RequestMethod.GET)
		public @ResponseBody
		String showUser() {

			return "12";
		}

}
}