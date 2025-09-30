package com.app.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;

import com.app.security.config.UserManagementService;

@SpringBootApplication
public class SpringSecurityProj5UserDetailsManagerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = null;
		
		context =  SpringApplication.run(SpringSecurityProj5UserDetailsManagerApplication.class, args);
		
		UserManagementService service = context.getBean(UserManagementService.class);
		
		service.createUser("userssss", "123", "writer");
		
	}

}
