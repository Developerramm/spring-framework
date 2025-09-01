package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.User;

public class AnnotationTest {
	
	public static void main(String[] args) {
		System.out.println("Ram kumar");
		
		ApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("config.xml");
		
		User user = null;
		user = context.getBean("user",User.class);
		
		System.out.println(user);
		
	}

}
