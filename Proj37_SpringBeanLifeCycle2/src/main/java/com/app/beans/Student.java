package com.app.beans;

import java.util.Date;

public class Student {
	
	private String name;
	private Date dob;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", dob=" + dob + "]";
	}
	
	public void init() {
		System.out.println("Student initialize");
	}
	
	public void destroy() {
		System.out.println("Student destroy");
	}
	

}
