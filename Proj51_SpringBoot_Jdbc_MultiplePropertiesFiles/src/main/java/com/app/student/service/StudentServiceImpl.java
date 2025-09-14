package com.app.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.student.dao.StudentDao;
import com.app.student.dto.StudentDto;
import com.app.student.entity.StudentEntity;


@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao dao;

	@Override
	public int registerNewStudent(StudentDto dto) throws Exception {
		
		StudentEntity entity = null;
		entity = new StudentEntity();
		
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setCourse_name(dto.getCourseName());
		entity.setObtained_marks(dto.getObtainedMarks());
		entity.setGrade(dto.getGrade());
		
		int count = dao.resgisterStudent(entity);
		
		return count;
	}
	



}
