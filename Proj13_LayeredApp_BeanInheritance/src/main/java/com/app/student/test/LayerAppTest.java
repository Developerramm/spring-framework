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
		
		vo.setId("1007");
		vo.setName("Pooja");
		vo.setEmail("pooja@gmail.com");
		vo.setCourseName("React developer");
		vo.setObtMarks("400");
		
		try {
			controller.registerStudentRequest(vo);
			
		} catch (Exception e) {
			System.out.println("something went wrong");
			e.printStackTrace();
		}
	}

}
