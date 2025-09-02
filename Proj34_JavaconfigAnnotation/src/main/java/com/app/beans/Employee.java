package com.app.beans;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Controller;

import jakarta.inject.Named;

//@Controller
@Named
public class Employee {
	
	
	@Value("Ram kumar")
	private String name;
	
	@Value("${emp.desgn}")
	private String designation;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + "]";
	}
	
	

}
