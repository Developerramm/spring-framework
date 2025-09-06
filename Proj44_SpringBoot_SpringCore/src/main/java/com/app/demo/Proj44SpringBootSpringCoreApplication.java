package com.app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.demo.beans.Student;

@SpringBootApplication
public class Proj44SpringBootSpringCoreApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = null;
	
		context	= SpringApplication.run(Proj44SpringBootSpringCoreApplication.class, args);
		
		System.out.println(context);
		System.out.println("Ram kumar");
		System.out.println("This is spring boot first project here");
		System.out.println(context.getClass().getName());
		
		Student student = context.getBean("student",Student.class);
		System.out.println(student.getClass().getName());
		
		
	}

}
