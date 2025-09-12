package com.student.service;

import java.util.List;

import com.student.dto.StudentDto;

public interface StudentService {
	
	public StudentDto getStudentDetailsById(int id) throws Exception;
	
	public List<StudentDto> getStudentListByCourseName(
			String course1,String Course2) throws Exception;

}
