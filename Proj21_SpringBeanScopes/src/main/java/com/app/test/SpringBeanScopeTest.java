package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Student;

public class SpringBeanScopeTest {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		Student student = null;
		
		student = context.getBean("student",Student.class);
		
		System.out.println(student.hashCode());
		
		Student s1 = context.getBean("student",Student.class);
		System.out.println(s1.hashCode());
		
		
	}

}
