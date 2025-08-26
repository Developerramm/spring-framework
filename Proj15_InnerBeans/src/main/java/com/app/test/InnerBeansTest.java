package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.User;

public class InnerBeansTest {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		User user = null;

		user = context.getBean("u1",User.class);
		System.out.println(user);
		
		System.out.println("-----------------------------------");
		
		user = context.getBean("u2",User.class);
		System.out.println(user);
		
		
	}

}
