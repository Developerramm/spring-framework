package com.app.beans;

import java.util.Date;

public class User {
	
	private String name;
	private String email;
	private Date dob;
	
	
	
	
	public User( Date dob) {
		this.dob = dob;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", dob=" + dob + "]";
	}

	
}
