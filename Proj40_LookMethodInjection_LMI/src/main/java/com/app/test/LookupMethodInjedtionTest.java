package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.WebContainer;

public class LookupMethodInjedtionTest {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		WebContainer container =  context.getBean("webContainer",WebContainer.class);
		
		container.processRequest("abac .. ram ..");
	}

}
