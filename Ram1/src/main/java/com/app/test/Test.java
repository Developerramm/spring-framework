package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("Ram kumar maniyari ");
		
		ApplicationContext context = null;
		context = new ClassPathXmlApplicationContext();
		
		System.out.println(context);
	}

}
