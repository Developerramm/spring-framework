package com.app.beans;

import java.util.Set;

public class Student {
	
	private Set<String> subjects;

	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [subjects=" + subjects + "]";
	}

}
