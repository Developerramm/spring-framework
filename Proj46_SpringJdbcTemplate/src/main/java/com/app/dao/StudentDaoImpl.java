package com.app.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao {
	
	// query part
	private static final String countStudent = "SELECT COUNT(*) FROM student_details";
	
	private static final String getName = "SELECT name FROM "
			+ "student_details WHERE id = ?";
			
	
	
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


	@Override
	public String getStudentNameById(int id) throws Exception {
		
		String studentName = null;
		
		studentName = jdbcTemplate.queryForObject(getName, String.class,id);
		
		// TODO Auto-generated method stub
		return studentName;
	}

}
