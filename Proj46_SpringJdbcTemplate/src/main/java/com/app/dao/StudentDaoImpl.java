package com.app.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao {
	
	// query part
	private static final String countStudent = "SELECT COUNT(*) FROM student_details";
	
	private static final String getName = "SELECT name FROM "
			+ "student_details WHERE id = ?";
	
	private static final String getStudentDetails = "SELECT  id,"
			+ "name,email,course_name,obtained_marks,grade FROM student_details"
			+ " WHERE id = ?";
	
	private static final String getAllStudentList = "SELECT * FROM student_details "
			+ "WHERE course_name = ?"; 
			
	
	
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


	@Override
	public Map<String, Object> getStudentDetailsById(int id) throws Exception {
		
		Map<String, Object> studentRecord = null;
		studentRecord=jdbcTemplate.queryForMap(getStudentDetails, id);
		
		return studentRecord;
	}


	@Override
	public List<Map<String, Object>> getAllStudent(String course) throws Exception {
		
		List<Map<String, Object>> studentList = null;
		studentList = jdbcTemplate.queryForList(getAllStudentList,course);
		
		return studentList;
	}

}
