package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.AccountHolder;
import com.app.beans.CreditCard;
import com.app.beans.Employee;
import com.app.beans.Student;
import com.app.beans.User;

public class SprinBeanLifeCycleTest {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		User user = context.getBean("user",User.class);
		Employee emp = context.getBean("employee",Employee.class);
		Student student = context.getBean("student",Student.class);
		
		AccountHolder ac = context.getBean("ac",AccountHolder.class);
		
		
		System.out.println(user);
		System.out.println(emp);
		System.out.println(student);
		
		System.out.println(ac);
		
		CreditCard card = context.getBean("card",CreditCard.class);
		System.out.println(card);
		
		((AbstractApplicationContext)context).close();
	}

}
