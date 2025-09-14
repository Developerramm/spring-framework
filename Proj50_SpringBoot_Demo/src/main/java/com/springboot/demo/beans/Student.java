package com.springboot.demo.beans;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("student")
@ConfigurationProperties(prefix = "student.info")
public class Student {
	
	@Value("${user.info.id}")
	private Integer id;
	
	@Value("${user.info.email}")
	private String email;
	
	@Value("${user.info.name}")
	private String name;
	
	
	private int[] marks;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", email=" + email + ", name=" + name + ", marks=" + Arrays.toString(marks) + "]";
	}
}
