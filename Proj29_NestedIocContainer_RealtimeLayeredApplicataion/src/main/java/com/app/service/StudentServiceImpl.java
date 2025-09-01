package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.app.dao.StudentDao;
import com.app.dto.StudentDto;
import com.app.entity.StudentEntity;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao dao;
	

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}



	@Override
	public List<StudentDto> getAllStudentsRecords() throws Exception {

		List<StudentEntity> studentList =  dao.getAllStudent();
		
		List<StudentDto> studentDtoList = new ArrayList<StudentDto>();
		
		// convert the student entity list to dto
		
		studentList.forEach(entity->{
			StudentDto dto = new StudentDto();
			
			BeanUtils.copyProperties(entity, dto);
			studentDtoList.add(dto);
			
		});
		
		
		return studentDtoList;
	}

}
