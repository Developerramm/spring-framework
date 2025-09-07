package com.app.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao {
	
	// query part
	private static final String countStudent = "SELECT COUNT(*) FROM student_details";
	
	
	
	private JdbcTemplate jdbcTemplate;
	
	public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

	@Override
	public int getTotalNoOfStudents() throws Exception {
		
		int totalNoOfStudents = 0;
		
		totalNoOfStudents = jdbcTemplate.queryForObject(countStudent,Integer.class);
		
		return totalNoOfStudents;
	}

}
