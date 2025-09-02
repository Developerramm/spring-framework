package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Amazon;
import com.app.beans.Employee;

public class JavaConfigAnnotationTest {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		Employee employee = context.getBean(Employee.class);
		
		System.out.println(employee);
		
		Amazon amazon = context.getBean(Amazon.class);
		
		System.out.println(amazon);
		
		
		((AbstractApplicationContext)context).close();
	}

}
