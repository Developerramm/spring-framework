package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.controller.EmployeeController;
import com.app.dto.EmployeeDto;

@SpringBootApplication
public class Proj66SpringBootSpringDataJpa1Application {

	public static void main(String[] args) {
		ApplicationContext context = null;
		EmployeeController controller = null;
		context =  SpringApplication.run(Proj66SpringBootSpringDataJpa1Application.class, args);
		System.out.println("Spring data jpa project 1");
		
		controller = context.getBean("empController",EmployeeController.class);
		
		EmployeeDto dto = new EmployeeDto();
		dto.setEid(1003);
		dto.setName("ramu");
		dto.setEmail("ramu@gmail.com");
		dto.setSalary(10000.0f);
		
		controller.processEmployeeRegRequest(dto);
		
		
	}

}
