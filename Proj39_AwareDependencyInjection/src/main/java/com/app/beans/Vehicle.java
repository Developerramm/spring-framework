package com.app.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class Vehicle implements ApplicationContextAware{
	
	private Engine engine;
	
	private String dependentBeanId;
	
	private ApplicationContext context;
	
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
	
	public void journey() {
		
//		ApplicationContext context = null;
//		context = new ClassPathXmlApplicationContext("config.xml");
		
		engine = context.getBean(dependentBeanId,Engine.class);
		// here only engine is required
		engine.startEngine();
		System.out.println("Journey continue and reached to the destination");
		engine.stopEngine();
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}

}
