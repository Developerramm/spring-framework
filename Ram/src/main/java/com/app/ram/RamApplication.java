package com.app.ram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RamApplication {

	public static void main(String[] args) {
		ApplicationContext context = null;
		
		context = SpringApplication.run(RamApplication.class, args);
		System.out.println("Ram kumar");
		System.out.println("Sitamarhi");
		System.out.println(context);
	}

}
