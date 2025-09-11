package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.student.dto.StudentDto;
import com.student.service.StudentService;

@Controller("controller")
public class StudentMainController {
	
	@Autowired
	private StudentService studentService;
	
	public StudentDto processGetStudentDetailRequest(int id) throws Exception {
		return studentService.getStudentDetailsById(id);
	}

}
