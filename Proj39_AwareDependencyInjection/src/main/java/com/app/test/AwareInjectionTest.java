package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Vehicle;

public class AwareInjectionTest {
	
	public static void main(String[] args) {
		ApplicationContext context =null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		Vehicle vehicle = null;
		vehicle = context.getBean("vehicle",Vehicle.class);
		
		System.out.println(vehicle);
		
		vehicle.musicSystem();
		vehicle.journey(context);
		
		
		((AbstractApplicationContext)context).close();
	}

}
