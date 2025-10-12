package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.controller.EmployeeController;

@SpringBootApplication
public class Proj67SpringBootPagingAndSortingRepoApplication {

	public static void main(String[] args) {
		ApplicationContext context = null;
		EmployeeController controller = null;
		
		context = SpringApplication.run(Proj67SpringBootPagingAndSortingRepoApplication.class, args);
		System.out.println("paging and sorting repository");
		
		controller = context.getBean("empController",EmployeeController.class);
		
		controller.getAllEmployeesInSortingOrder("name", true);
		System.out.println("************************************************");
		controller.getAllEmployeesInSortingOrderByMultipleProperties(true, "eid","name");
		System.out.println("*******************************************************");
		controller.getEmployeesByPageNumber(5, 3);
		System.out.println("------------------------------------------------");
		controller.fetchEmpByPage(3);
		
	}

}
