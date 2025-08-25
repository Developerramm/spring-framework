package com.app.beans;

import java.util.Date;
import java.util.List;

public class Faculty {
	
	
	private List<String> name;
	private List<Date> joiningDate;
	
	
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public List<Date> getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(List<Date> joiningDate) {
		this.joiningDate = joiningDate;
	}
	@Override
	public String toString() {
		return "Faculty [name=" + name + ", joiningDate=" + joiningDate + "]";
	}
}
