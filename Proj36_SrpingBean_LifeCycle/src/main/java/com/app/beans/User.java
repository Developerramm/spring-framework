package com.app.beans;

import java.util.Date;

public class User {
	
	private String name;
	
	private Date date;

	public void setName(String name) {
		this.name = name;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", date=" + date + "]";
	}
	
	public void initialize() {
		System.out.println("User.initialize()");
		
		if(date == null) {
			throw new IllegalArgumentException("Dob cannot be null");
		}
	}
	
	public void destroy() {
		System.out.println("User.destroy()");
		name = null;
		date = null;
		
		System.out.println("name = " +  name + " " + date);
	}
	
}
