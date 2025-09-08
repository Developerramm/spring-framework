package com.app.service;

import java.util.List;
import java.util.Map;

public interface StudentService {
	
	public int getTotalNoOfStudents() throws Exception;
	
	public String getStudentName(int id) throws Exception;
	
	public Map<String, Object> getStudentDetails(int id) throws Exception;
	
	public List<Map<String, Object>> getStudentByCourseName(String course) throws Exception;
	
	

}
