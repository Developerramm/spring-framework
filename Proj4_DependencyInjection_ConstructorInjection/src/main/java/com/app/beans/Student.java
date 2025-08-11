package com.app.beans;

// spring bean class
public class Student {
	
	// bean property
	private String name;
	private String email;
	private int roll;
	
	private Course course;
	
	public Student() {
		System.out.println("Zero param consturtor");
	}
	
	public Student(String name, String email, int roll, Course course) {
		System.out.println("param consturctor");
		this.name = name;
		this.email = email;
		this.roll = roll;
		this.course = course;
	}
	
	public void startMyCourse() {
		course.startCourse();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", roll=" + roll + ", course=" + course + "]";
	}
	
}
