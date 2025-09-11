package com.student.test;

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
			StudentDto dto = null;
			dto = controller.processGetStudentDetailRequest(1001);
			
			System.out.println(dto);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			((AbstractApplicationContext)context).close();
		}
		
	}

}
