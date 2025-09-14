package com.student.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.controller.StudentMainController;
import com.student.dto.StudentDto;


public class JdbcTemplate_CallbackInterface_Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("config.xml");
		System.out.println(context);
		
		StudentMainController controller = null;
		
		controller = context.getBean("controller",StudentMainController.class);
		
		try {
			String studentName = controller.fetchStudentName(1001);
			System.out.println("Student Name is " +  studentName);
			
			System.out.println("------------------------------");
			List<StudentDto> dto = null;
			
			dto =  controller.fetchStudentDetailsByCourse("java", "Angular developer");
			
			System.out.println(dto);
			
			System.out.println("---------------------------------");
			
			StudentDto studentDto  = new StudentDto();
			studentDto.setId(1013);
			studentDto.setName("Piku");
			studentDto.setEmail("abc@gmail.com");
			studentDto.setCourseName("backend");
			studentDto.setObtainedMarks(450);
			studentDto.setGrade("A++");
			
			int studentCount = controller.processNewStudentRegistration(studentDto);
			System.out.println("student count is " + studentCount); 
			 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			((AbstractApplicationContext)context).close();
		}
		
	}

}
