package com.app.beans;

import java.util.Date;

public class User {
	
	private String name;
	private Date regDate;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", regDate=" + regDate + "]";
	}
	
	public void init() {
		System.out.println("User initialize");
	}
	
	public void destroy() {
		System.out.println("user destroy");
	}
	
}
