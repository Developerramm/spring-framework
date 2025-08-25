package com.app.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Employee {
	
	private LinkedList<String> name;
	private ArrayList<Date> joiningDate;
	
	
	public LinkedList<String> getName() {
		return name;
	}
	public void setName(LinkedList<String> name) {
		this.name = name;
	}
	public ArrayList<Date> getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(ArrayList<Date> joiningDate) {
		this.joiningDate = joiningDate;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", joiningDate=" + joiningDate + "]";
	}
	
	
	
	

}
