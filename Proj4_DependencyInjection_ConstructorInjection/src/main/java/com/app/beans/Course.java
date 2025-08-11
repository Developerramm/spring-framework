package com.app.beans;

// dependent spring bean class
public class Course {
	
	private String name;
	
	public void startCourse() {
		System.out.println("course is loading");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + "]";
	}
	
}
