package com.app.service;

import java.util.Map;

public interface StudentService {
	
	public int getTotalNoOfStudents() throws Exception;
	
	public String getStudentName(int id) throws Exception;
	
	public Map<String, Object> getStudentDetails(int id) throws Exception;

}
