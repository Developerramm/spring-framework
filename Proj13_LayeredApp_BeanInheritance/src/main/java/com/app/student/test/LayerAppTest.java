package com.app.student.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.student.controller.StudentMainController;
import com.app.student.vo.StudentVo;

public class LayerAppTest {
	public static void main(String[] args) {
		System.out.println("Layered App");
		
		ApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("config.xml");
		
		StudentMainController controller = null;
		
		controller = context.getBean("controller",StudentMainController.class);
		
		StudentVo vo = new StudentVo();
		
		vo.setId("1008");
		vo.setName("Prem raj");
		vo.setEmail("prema@gmail.com");
		vo.setCourseName("Angular developer");
		vo.setObtMarks("350");
		
		try {
			controller.registerStudentRequest(vo);
			
		} catch (Exception e) {
			System.out.println("something went wrong");
			e.printStackTrace();
		}
	}

}
