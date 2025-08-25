package com.app.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.CollegeInfo;
import com.app.beans.Employee;
import com.app.beans.Faculty;
import com.app.beans.Student;
import com.app.beans.User;

public class CollectionInjectionTest {
	
	public static void main(String[] args) {
		System.out.println("Ram kumar");
		
		ApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("config.xml");
		
		Student student = null;
		
		student = (Student)context.getBean("student");
		System.out.println(student);
		
		System.out.println("-------------------------------");
		
		Faculty faculty = null;
		faculty = context.getBean("faculty",Faculty.class);
		System.out.println(faculty);
		
		System.out.println("--------------------------------------------");
		
		Employee employee = null;
		employee = context.getBean("emp",Employee.class);
		System.out.println(employee);
		
		System.out.println("---------------------------------------------------");
		
		User user = null;
		user = context.getBean("user",User.class);
		System.out.println(user);
		
		System.out.println("_________________________________________________________");
		
		CollegeInfo info = null;
		info = context.getBean("clg",CollegeInfo.class);
		System.out.println(info);
		
		System.out.println("_____________________________________________");

//		((AbstractApplicationContext)context).close();
	}

}
