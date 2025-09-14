package com.student.dao;

import java.util.List;

import com.student.entity.StudentEntity;

public interface StudentDao {
	
	public String getStudentName(int id) throws Exception;
	
	public List<StudentEntity> getStudentDetailsByCourse(
			String course1, String course2) throws Exception;
	
	public int resgisterStudent(StudentEntity entity) throws Exception;
	
	
}
