package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Faculty;
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
		
		
		student = context.getBean("student2",Student.class);
		
		System.out.println(student.hashCode());
		
		System.out.println("--------------------------------------------");
		
		
		Faculty faculty = context.getBean("faculty",Faculty.class);
		System.out.println(faculty.hashCode());
		
		Faculty f1 = context.getBean("faculty",Faculty.class);
		System.out.println(f1.hashCode());
		
		Faculty f2 = context.getBean("faculty",Faculty.class);
		System.out.println(f2.hashCode());
		
		
		
		((AbstractApplicationContext)context).close();
		
		
	}

}
