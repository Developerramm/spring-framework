package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.controller.EmployeeController;
import com.app.dto.EmployeeDto;

@SpringBootApplication
public class Proj68SpringBootJpaRePoApplication {

	public static void main(String[] args) {
		ApplicationContext context = null;
		EmployeeController controller = null;
		
		context = SpringApplication.run(Proj68SpringBootJpaRePoApplication.class, args);
		controller = context.getBean("empController",EmployeeController.class);
		
		System.out.println("******************************************************");
		System.out.println("JPA Repository ");
		System.out.println("******************************************************");
		
		EmployeeDto dto = new EmployeeDto(1005);
		
		controller.fetchEmpExampleData(dto, "name", true);
		
	}

}
