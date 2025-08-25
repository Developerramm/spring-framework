package com.app.student.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LayerAppTest {
	public static void main(String[] args) {
		System.out.println("Layered App");
		
		ApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("config.xml");
		
		System.out.println(context);
	}

}
