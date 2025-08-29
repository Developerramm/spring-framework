package com.app.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInternationalisationTest {
	
	public static void main(String[] args) {
		System.out.println("Ram kumar");
		
		ApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("config.xml");
		
		Locale locale = new Locale(args[0], args[1]);
		
		String msg = context.getMessage("loginBtn",null, locale);
		System.out.println(msg);
		
		String msg2 = context.getMessage("regBtn",null, locale);
		System.out.println(msg2);
		
		String msg3 = context.getMessage("buyBtn",null, locale);
		System.out.println(msg3);
		
		
		System.out.println(context);
	}

}
