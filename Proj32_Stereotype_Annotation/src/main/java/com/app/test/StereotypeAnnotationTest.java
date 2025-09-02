package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Student;

public class StereotypeAnnotationTest {
	public static void main(String[] args) {
		ApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("config.xml");
		
		Student student = context.getBean("student",Student.class);
		
		student.setName("ram kumar");
		
		System.out.println(student);
		
		
		((AbstractApplicationContext)context).close();
	}

}
