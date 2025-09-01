package com.app.dao;

import java.util.List;

import com.app.entity.StudentEntity;

public interface StudentDao {
	
	public List<StudentEntity> getAllStudent() throws Exception;

}
