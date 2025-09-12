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
	
	public StudentDto processGetStudentDetailRequest(int id) throws Exception {
		return studentService.getStudentDetailsById(id);
	}
	
	public List<StudentDto> fetchStudentList(String c1,String c2) throws Exception{
		
		return studentService.getStudentListByCourseName(c1, c2);
	}

}
