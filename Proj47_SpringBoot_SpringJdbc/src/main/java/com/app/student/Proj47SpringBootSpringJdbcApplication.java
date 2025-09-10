package com.app.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.student.controller.StudentMainAppController;

// this is our runner class or main class
@SpringBootApplication
public class Proj47SpringBootSpringJdbcApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = null;	
		context =  SpringApplication.run(Proj47SpringBootSpringJdbcApplication.class, args);
		
		StudentMainAppController controller = null;
		controller = context.getBean("controller",StudentMainAppController.class);
		
		try {
			int i = controller.fetchTotalNoOfStudents();
			System.out.println("Total No of Student is " + i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(context);
		
		System.out.println("Ram kumar maniyari");
	}

}
