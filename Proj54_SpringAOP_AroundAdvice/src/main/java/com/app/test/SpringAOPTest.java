package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.service.BankService;

public class SpringAOPTest {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		BankService bankService =  context.getBean("proxyfactorybean",BankService.class);
		
		float si =  bankService.calSi(1200, 12, 2);
		
		System.out.println("Interest amout " + si);
		
		System.out.println(bankService.getClass());
		
		((AbstractApplicationContext)context).close();
	}

}
