package com.app.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.student.controller.StudentMainController;
import com.app.student.vo.StudentVo;

@SpringBootApplication
public class Proj45SpringBootLayerAppSpringCoreApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = null;
		
		context =  SpringApplication.run(Proj45SpringBootLayerAppSpringCoreApplication.class, args);
		
		StudentMainController controller = null;
		controller = context.getBean("controller",StudentMainController.class);
		
		StudentVo vo = new StudentVo();
		vo.setId("1020");
		vo.setName("ram daas");
		vo.setCourseName("java");
		vo.setEmail("ramdas@gmail.com");
		vo.setObtMarks("450");
		
		try {
			controller.registerStudentRequest(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			((ConfigurableApplicationContext)context).close();
		}
		
		
		
	}

}
