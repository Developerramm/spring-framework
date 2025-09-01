package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.app.entity.StudentEntity;

public class StudentDaoImpl implements StudentDao {
	
	private final static String GET_ALL_STUDENT="SELECT * FROM student_details_new";
	
	private DataSource dataSource;
	

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	@Override
	public List<StudentEntity> getAllStudent() throws Exception {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<StudentEntity> studentList = null;
		
		con = dataSource.getConnection();
		
		pstmt = con.prepareStatement(GET_ALL_STUDENT);
		
		rs = pstmt.executeQuery();
		
		studentList = new ArrayList<StudentEntity>();
		
		while(rs.next()) {
			StudentEntity entity = new StudentEntity();
			entity.setId(rs.getInt(1));
			entity.setName(rs.getString(2));
			entity.setEmail(rs.getString(3));
			entity.setPassword(rs.getString(4));
			
			studentList.add(entity);
		}
		
		
		return studentList;
	}

}
