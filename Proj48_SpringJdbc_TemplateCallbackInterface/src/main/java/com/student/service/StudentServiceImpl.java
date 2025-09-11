package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.dto.StudentDto;
import com.student.entity.StudentEntity;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao dao;
	

	@Override
	public StudentDto getStudentDetailsById(int id) throws Exception {
		StudentDto dto = null;
		dto = new StudentDto();
		
		StudentEntity entity = dao.getStudentById(id);
		
		// convert the entity to dto
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setEmail(entity.getEmail());
		dto.setCourseName(entity.getCourse_name());
		dto.setObtainedMarks(dto.getObtainedMarks());
		dto.setGrade(entity.getGrade());
		
		
		return dto;
	}

}
