package com.app.controller;


import java.util.List;
import java.util.Map;

import com.app.service.StudentService;


public class StudentMainAppController {
	
	private StudentService studentService;

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	public int fetchTotalNoOfStudents() throws Exception{
		
		return studentService.getTotalNoOfStudents();
		
	}
	
	public String fetchStudentNameById(int id) throws Exception {
		return studentService.getStudentName(id);
	}
	
	public Map<String, Object> fetchStudentDetails(int id) throws Exception{
		return studentService.getStudentDetails(id);
	}
	
	public List<Map<String, Object>> fetchStudentByCourseName(String couruse) throws Exception{
		return studentService.getStudentByCourseName(couruse);
	}
	

}
