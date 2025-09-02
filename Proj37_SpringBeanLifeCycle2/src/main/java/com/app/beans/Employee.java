package com.app.beans;

import java.util.Date;

public class Employee {
	
	private String name;
	private Date joiningDate;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", joiningDate=" + joiningDate + "]";
	}
	
	public void init() {
		System.out.println("Employee initialize");
	}
	
	public void destroy() {
		System.out.println("Employee destroy");
	}
	
	
}
