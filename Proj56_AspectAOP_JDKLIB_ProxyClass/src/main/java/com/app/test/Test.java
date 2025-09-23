package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.service.BankService;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("config.xml");
		
		BankService bs = context.getBean("bs",BankService.class);
		
		System.out.println(bs.calSi(1200, 2, 2));
		
		System.out.println("---------------------------------------------");
		
		
		System.out.println(bs.calCi(1200, 2, 2));
		
		System.out.println("----------------------------------------------");
		
		System.out.println(bs.getClass().getName());
		
		
		((AbstractApplicationContext)context).close();
	}

}
