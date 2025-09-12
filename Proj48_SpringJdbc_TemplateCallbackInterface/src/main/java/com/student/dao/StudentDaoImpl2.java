package com.student.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.student.entity.StudentEntity;


//@Repository("studentDao")
public class StudentDaoImpl2 implements StudentDao{
	
	private static final String GET_STUDENT_BY_ID = "SELECT * FROM student_details"
			+ " WHERE id = ?";
	
	private static final String GET_STUDENT_BY_COURSE="SELECT * FROM student_details"
			+ " WHERE course_name IN(?,?)";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public StudentEntity getStudentById(int id) throws Exception {
				StudentEntity entity =  jdbcTemplate.queryForObject(GET_STUDENT_BY_ID,
				new BeanPropertyRowMapper<StudentEntity>(StudentEntity.class)
		
				,
				
				id);
		
		return entity;
	}
	

	@Override
	public List<StudentEntity> getStudentListByCourse
	(String course1, String course2) throws Exception {
		
		List<StudentEntity> studentEntity = null;
		
		BeanPropertyRowMapper<StudentEntity> rowMapper = null;
		rowMapper = new BeanPropertyRowMapper<StudentEntity>(StudentEntity.class);
		
	
		studentEntity = jdbcTemplate.query(GET_STUDENT_BY_COURSE,
				new RowMapperResultSetExtractor<StudentEntity>(rowMapper)
				,
				course1,course2);
		
/*		
		
		studentEntity = jdbcTemplate.query(
				GET_STUDENT_BY_COURSE, 
				
				// using lembda expression
				
				rs->{
					List<StudentEntity> studentList = null;
					StudentEntity entity = null;
					
					studentList = new ArrayList<StudentEntity>();
					
					while(rs.next()) {
						entity = new StudentEntity();
						
						entity.setId(rs.getInt(1));
						entity.setName(rs.getString(2));
						entity.setEmail(rs.getString(3));
						entity.setCourse_name(rs.getString(4));
						entity.setObtained_marks(rs.getInt(5));
						entity.setGrade(rs.getString(6));
						
						studentList.add(entity);
					}
					return studentList;
				}
				
//				new ResultSetExtractor<List<StudentEntity>>() {
//					@Override
//					public List<StudentEntity> extractData(ResultSet rs) throws SQLException, DataAccessException {
//
//						List<StudentEntity> studentList = null;
//						StudentEntity entity = null;
//						
//						studentList = new ArrayList<StudentEntity>();
//						
//						while(rs.next()) {
//							entity = new StudentEntity();
//							
//							entity.setId(rs.getInt(1));
//							entity.setName(rs.getString(2));
//							entity.setEmail(rs.getString(3));
//							entity.setCourse_name(rs.getString(4));
//							entity.setObtained_marks(rs.getInt(5));
//							entity.setGrade(rs.getString(6));
//							
//							studentList.add(entity);
//						}
//						return studentList;
//					}
//				}
				
				,
				course1,course2);
		*/
		return studentEntity;
		
		
	}
	
	
	private static class StudentExtractor 
	implements ResultSetExtractor<List<StudentEntity>>{

		@Override
		public List<StudentEntity> extractData(ResultSet rs) 
				throws SQLException, DataAccessException {
			
			List<StudentEntity> studentList = null;
			StudentEntity entity = null;
			
			studentList = new ArrayList<StudentEntity>();
			
			while(rs.next()) {
				entity = new StudentEntity();
				
				entity.setId(rs.getInt(1));
				entity.setName(rs.getString(2));
				entity.setEmail(rs.getString(3));
				entity.setCourse_name(rs.getString(4));
				entity.setObtained_marks(rs.getInt(5));
				entity.setGrade(rs.getString(6));
				
				studentList.add(entity);
			}
			
			return studentList;
		}
		
	}

}
