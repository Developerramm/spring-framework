package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Student;

public class PreInstantiationSingletonBeanTest {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		Student s1 = context.getBean("student",Student.class);
		
		s1.showStudentDetails();
		
		System.out.println(s1.hashCode());
		
		System.out.println(context);
		
		((AbstractApplicationContext)context).close();
	}

}
