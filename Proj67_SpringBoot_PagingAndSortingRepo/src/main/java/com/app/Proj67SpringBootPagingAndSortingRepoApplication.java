package com.app;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.controller.EmployeeController;
import com.app.dto.EmployeeDto;

@SpringBootApplication
public class Proj67SpringBootPagingAndSortingRepoApplication {

	public static void main(String[] args) {
		ApplicationContext context = null;
		EmployeeController controller = null;
		
		context = SpringApplication.run(Proj67SpringBootPagingAndSortingRepoApplication.class, args);
		System.out.println("paging and sorting repository");
		
		controller = context.getBean("empController",EmployeeController.class);
		
//		controller.getAllEmployeesInSortingOrder("name", true);
//		System.out.println("************************************************");
//		controller.getAllEmployeesInSortingOrderByMultipleProperties(true, "eid","name");
//		System.out.println("*******************************************************");
//		controller.getEmployeesByPageNumber(5, 3);
//		System.out.println("------------------------------------------------");
//		controller.fetchEmpByPage(3);
//		System.out.println("---------------------------------------------");
//		System.out.println("**********************************************");
//		controller.getEmployeeById(1004);
//		System.out.println("------------------------------------------------");
//		System.out.println("888888888888888888888888888888888888");
		
		controller.deleteEmployeInBatch(List.of(
				new EmployeeDto(1001),
				new EmployeeDto(1002),
				new EmployeeDto(1003)
				));
	}

}
