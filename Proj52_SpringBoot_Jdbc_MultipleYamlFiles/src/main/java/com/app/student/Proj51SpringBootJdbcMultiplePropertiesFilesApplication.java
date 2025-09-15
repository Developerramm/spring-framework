package com.app.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.student.controller.StudentMainController;
import com.app.student.dto.StudentDto;

@SpringBootApplication
public class Proj51SpringBootJdbcMultiplePropertiesFilesApplication {

	public static void main(String[] args) {
		ApplicationContext context = null;
	
		context = SpringApplication.run(Proj51SpringBootJdbcMultiplePropertiesFilesApplication.class, args);
		
		StudentMainController controller = null;
		controller = context.getBean("controller",StudentMainController.class);
		
		StudentDto dto = new StudentDto();
		dto.setId(1021);
		dto.setName("Mobile");
		dto.setEmail("m@gmail.com");
		dto.setCourseName("Node");
		dto.setObtainedMarks(400);
		dto.setGrade("A");
		
		try {
			int rowCount =  controller.processNewStudentRegistration(dto);
			System.out.println(rowCount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
