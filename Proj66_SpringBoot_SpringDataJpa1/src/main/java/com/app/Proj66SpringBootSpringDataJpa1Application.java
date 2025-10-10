package com.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		
		/*
		System.out.println("------------------------------------------------");
		EmployeeDto dto = new EmployeeDto();
		dto.setEid(1003);
		dto.setName("ram kumar");
		dto.setEmail("ram@gmail.com");
		dto.setSalary(120000.0f);
		
		controller.processEmployeeRegRequest(dto);
		*/
		
		/*
		System.out.println("-------------------------------------------------------");
		
		EmployeeDto dto1 = new EmployeeDto(1004, "Sarita", "sarita@gmail.com", 12000.0f);
		EmployeeDto dto2 = new EmployeeDto(1005,"Ranji","ranji@gmail.com",64000.0f);
		
		List<EmployeeDto> dtoList = new ArrayList<EmployeeDto>();
		dtoList.add(dto1);
		dtoList.add(dto2);
		
		
		Integer[] empIds = controller.processEmpRegistrationInGroup(dtoList);
		System.out.println(Arrays.toString(empIds));
		*/
		
		System.out.println("-------------------------------------------------");
		
		long totalEmp = controller.getTotalEmpRecordCount();
		System.out.println("Total Employes are " + totalEmp);
		
		System.out.println("----------------------------------------------------");
		
		controller.checkEmpById(1008);
		
		System.out.println("----------------------------------------------------");
		
//		controller.deleteEmpByGivenId(1003);
		
		System.out.println("**************************************************");
		System.out.println("---------------------------------------------");
		controller.checkEmployee(1004);
		System.out.println("--------------------------------------------");
		System.out.println("***************************************************");
		
	}

}
