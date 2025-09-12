package com.student.service;

import java.util.ArrayList;
import java.util.List;

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


	@Override
	public List<StudentDto> getStudentListByCourseName(String course1, String Course2) throws Exception {
		List<StudentEntity> studentEntityList = dao.getStudentListByCourse(course1, Course2);
		
		List<StudentDto> studentDtoList = new ArrayList<StudentDto>();
		
		for(StudentEntity entity : studentEntityList) {
			StudentDto dto = new StudentDto();
			dto.setId(entity.getId());
			dto.setName(entity.getName());
			dto.setEmail(entity.getEmail());
			dto.setCourseName(entity.getCourse_name());
			dto.setObtainedMarks(entity.getObtained_marks());
			dto.setGrade(entity.getGrade());
			
			studentDtoList.add(dto);
		}
		
		return studentDtoList;
	}

}
