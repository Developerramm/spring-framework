package com.app.service;

import com.app.dao.StudentDao;


public class StudentServiceImpl implements StudentService {
	
	private StudentDao dao;
	
	public void setDao(StudentDao dao) {
		this.dao = dao;
	}
	
	@Override
	public int getTotalNoOfStudents() throws Exception {
		// TODO Auto-generated method stub
		return dao.getTotalNoOfStudents();
	}

	@Override
	public String getStudentName(int id) throws Exception {
		
		return dao.getStudentNameById(id);
	}
	
	

}
