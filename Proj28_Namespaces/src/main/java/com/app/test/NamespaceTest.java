package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Employee;
import com.app.beans.Student;

public class NamespaceTest {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("config.xml");
		
		Employee emp = context.getBean("employee",Employee.class);
		
		System.out.println(emp);
		
		Student student = context.getBean("student",Student.class);
		System.out.println(student);
		
		((AbstractApplicationContext)context).close();
	}

}
