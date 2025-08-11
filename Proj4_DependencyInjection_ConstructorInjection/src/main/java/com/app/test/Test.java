package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("config.xml");
		
		Student student = null;
		student = (Student)context.getBean("student");
		System.out.println(student.hashCode());
		System.out.println(student);
		
		((AbstractApplicationContext)context).close();
	}

}
