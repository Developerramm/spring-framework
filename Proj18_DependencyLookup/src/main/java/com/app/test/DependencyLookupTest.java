package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Student;

public class DependencyLookupTest {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		Student student = null;
		
		student = context.getBean("student",Student.class);
		
		student.markAttendence();
		student.giveTest();
		student.startOnlineClass();
		
		System.out.println(student);
	}

}
