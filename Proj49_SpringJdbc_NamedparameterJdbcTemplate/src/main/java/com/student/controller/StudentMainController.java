package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.student.dto.StudentDto;
import com.student.service.StudentService;

@Controller("controller")
public class StudentMainController {
	
	@Autowired
	private StudentService studentService;
	
	public String fetchStudentName(int id) throws Exception{
		return  studentService.getStudentName(id);
	}
	
	public List<StudentDto> fetchStudentDetailsByCourse(String c1,String c2) throws Exception{
		return studentService.getStudentDetailsByCourse(c1, c2);
	}
	
	
}
