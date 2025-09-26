package com.app.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("welcome")
	public String welcome()
	{
		return "Welcome page here , Your are learning spring security in spring boot";
	}
}
