package com.app.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// target class
public class Student {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private ZoomStreamingApi zoomApi;
	
	public void markAttendence() {
		System.out.println("attendence done");
	}
	
	public void giveTest() {
		System.out.println("test is started");
	}
	
	public void vewExamResult() {
		System.out.println("last semester result");
	}
	
	public void startOnlineClass() {
		
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		zoomApi = context.getBean("zoomApi",ZoomStreamingApi.class);
		
		zoomApi.streamVideoClassOnline();
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	

}
