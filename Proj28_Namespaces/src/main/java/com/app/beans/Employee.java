package com.app.beans;

import java.util.Date;

public class Employee {
	
	private String name;
	
	private Date date;
	
	public void setDate(Date date) {
		this.date = date;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", date=" + date + "]";
	}
	

}
