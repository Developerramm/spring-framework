package com.app.controller;


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

}
