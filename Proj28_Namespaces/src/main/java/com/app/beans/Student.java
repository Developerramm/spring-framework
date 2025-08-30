package com.app.beans;

import java.util.Date;

public class Student {
	
	private String name;
	
	private Date date;

	public Student(String name, Date date) {
		
		this.name = name;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", date=" + date + "]";
	}
	
	
	

}
