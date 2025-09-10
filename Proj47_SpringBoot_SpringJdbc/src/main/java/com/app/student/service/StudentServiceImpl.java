package com.app.student.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.app.student.dao.StudentDao;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	@Qualifier("studentDao")
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

	@Override
	public Map<String, Object> getStudentDetails(int id) throws Exception {
		
		return dao.getStudentDetailsById(id);
	}

	@Override
	public List<Map<String, Object>> getStudentByCourseName(String course) throws Exception {
		
		return dao.getAllStudent(course);
	}
	
	

}
