package com.app.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.app.student.entity.StudentEntity;

public class StudentDaoImpl implements StudentDao {
	
	private final static String INSERT_STUDENT = 
			"INSERT INTO student_details(id, name, email, course_name, obtained_marks, grade)"
			+ " values (?,?,?,?,?,?)";
	
	private DataSource dataSource;
	
	public StudentDaoImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public int saveStudent(StudentEntity entity) throws Exception {
		
		Connection con = null;
		PreparedStatement pstm = null;
		
		con = dataSource.getConnection();
		pstm = con.prepareStatement(INSERT_STUDENT);
		
		pstm.setInt(1, entity.getId());
		pstm.setString(2, entity.getName());
		pstm.setString(3, entity.getEmail());
		pstm.setString(4, entity.getCourseName());
		pstm.setInt(5, entity.getObtMarks());
		pstm.setString(6, entity.getGrade());
		
		int i = pstm.executeUpdate();
		
		return i;
	}

}
