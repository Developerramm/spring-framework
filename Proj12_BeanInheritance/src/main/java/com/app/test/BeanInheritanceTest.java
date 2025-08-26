package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Car;

public class BeanInheritanceTest {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		Car car = null;
		
		car = context.getBean("car1",Car.class);
		
		System.out.println(car);
		
		System.out.println("_______________________________________");
		
		car = context.getBean("car2",Car.class);
		
		System.out.println(car);
	}

}
