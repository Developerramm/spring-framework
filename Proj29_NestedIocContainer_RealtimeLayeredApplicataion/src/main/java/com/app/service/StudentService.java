package com.app.service;

import java.util.List;

import com.app.dto.StudentDto;

public interface StudentService {
	
	public List<StudentDto> getAllStudentsRecords() throws Exception;

}
