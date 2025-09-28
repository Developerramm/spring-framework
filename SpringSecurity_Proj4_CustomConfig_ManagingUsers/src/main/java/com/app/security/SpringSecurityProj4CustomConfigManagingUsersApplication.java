package com.app.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityProj4CustomConfigManagingUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityProj4CustomConfigManagingUsersApplication.class, args);
		
		System.out.println("spring boot custom authentication part 4");
	}

}
