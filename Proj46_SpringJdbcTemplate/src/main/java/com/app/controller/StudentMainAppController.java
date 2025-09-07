package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import com.app.dto.StudentDto;
import com.app.service.StudentService;
import com.app.vo.StudentVo;

public class StudentMainAppController {
	
	private StudentService studentService;

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	public int fetchTotalNoOfStudents() throws Exception{
		
		return studentService.getTotalNoOfStudents();
		
	}

}
