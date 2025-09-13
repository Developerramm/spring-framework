package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.student.service.StudentService;

@Controller("controller")
public class StudentMainController {
	
	@Autowired
	private StudentService studentService;
	
	public String fetchStudentName(int id) throws Exception{
		return  studentService.getStudentName(id);
	}
	
	
}
