package com.app.beans;

import org.springframework.context.ApplicationContext;


public class Vehicle {
	
	private Engine engine;
	
	private String dependentBeanId;
	
	public String getDependentBeanId() {
		return dependentBeanId;
	}

	public void setDependentBeanId(String dependentBeanId) {
		this.dependentBeanId = dependentBeanId;
	}

	public void musicSystem() {
		System.out.println("Music system turn on...");
	}
	
	public void horn() {
		System.out.println("Horn blown");
	}
	
	public void headlight() {
		System.out.println("head light turn on");
	}
	
	public void journey(ApplicationContext context) {
		
//		ApplicationContext context = null;
//		context = new ClassPathXmlApplicationContext("config.xml");
		
		engine = context.getBean(dependentBeanId,Engine.class);
		// here only engine is required
		engine.startEngine();
		System.out.println("Journey continue and reached to the destination");
		engine.stopEngine();
	}

}
