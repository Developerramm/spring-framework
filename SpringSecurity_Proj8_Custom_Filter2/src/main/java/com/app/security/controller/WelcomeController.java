package com.app.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("welcome")
	public String welcome()
	{
		return "Welcome page";
	}
	
	@GetMapping("/test")
	public String test() {
		return "This is test router";
	}
}
