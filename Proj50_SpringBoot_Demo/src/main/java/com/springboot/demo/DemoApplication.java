package com.springboot.demo;

import com.springboot.demo.beans.Student;
import com.springboot.demo.beans.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication


public class DemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = null;
		
		context =  SpringApplication.run(DemoApplication.class, args);
		
		User user = null;
		user = context.getBean("user",User.class);
		
		System.out.println(user);
		
		System.out.println("------------------------------");
		Student student = null;
		student = context.getBean("student",Student.class);
		System.out.println(student);
		
//		System.out.println(user.getUserId());
//		System.out.println(user.getName());
//		System.out.println(user.getEmail());
		System.out.println("Ram kumar");
	}

}
