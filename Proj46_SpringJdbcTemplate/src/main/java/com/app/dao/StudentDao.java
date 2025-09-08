package com.app.dao;

import java.util.Map;

public interface StudentDao {
	
	
	public int getTotalNoOfStudents() throws Exception;
	
	public String getStudentNameById(int id) throws Exception;
	
	public Map<String, Object> getStudentDetailsById(int id) throws Exception;

}
