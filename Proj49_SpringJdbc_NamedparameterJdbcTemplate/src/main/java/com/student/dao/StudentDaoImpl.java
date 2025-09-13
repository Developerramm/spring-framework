package com.student.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {
	
	// sql query part
	
	private static final String GET_STUDENT_NAME= "SELECT name FROM student_details"
			+ " WHERE id =:id";
	
	@Autowired
	@Qualifier("npmjt")
	private NamedParameterJdbcTemplate npmjt;
	

	@Override
	public String getStudentName(int id) throws Exception {
		
		Map<String, Object> mapParam = new HashMap<String,Object>();
		mapParam.put("id", id);
		
		String studentName = npmjt.queryForObject(
					GET_STUDENT_NAME,
					mapParam,
					String.class
					);
		
		return studentName;
	}
	
}


