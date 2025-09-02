package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Employee;

public class StereotypeAnnotataionTest {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		Employee employee = context.getBean(Employee.class);
		Employee emp = context.getBean(Employee.class);
	
		System.out.println(employee);
		System.out.println(emp);
		
		System.out.println("RAm kumar");
		 
		
		((AbstractApplicationContext)context).close();
	}

}
