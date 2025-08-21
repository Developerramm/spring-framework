package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Amazon;

public class DependencyInjection_strategyDp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("config.xml");
		
		Amazon amazon = context.getBean("amazon",Amazon.class);
		String statuString= amazon.checkDeliveryStatus("144752");
		System.out.println(statuString);
		
		
		System.out.println("----------------------------------");
		
		
		
		
		((AbstractApplicationContext)context).close();
	}

}
