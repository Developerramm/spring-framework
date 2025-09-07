package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.controller.StudentMainAppController;

public class JdbcTemplateTest {
	
	public static void main(String[] args) {
		ApplicationContext parentCtx,childCtx = null;
		
		parentCtx = new ClassPathXmlApplicationContext("parentApplicationContext.xml");
		
		
		childCtx = new ClassPathXmlApplicationContext(
				new String[] {"childApplicationContext.xml"},parentCtx);
		
		StudentMainAppController controller =	childCtx.getBean("controller",StudentMainAppController.class);
	 
	 try {
		
		 	int i = controller.fetchTotalNoOfStudents();
		 	System.out.println("total students " + i);
		
	 	}catch (Exception e) {
		
	 		e.printStackTrace();
		
	 	}finally {
		
	 		((AbstractApplicationContext)childCtx).close();
	 	}
	}

}



