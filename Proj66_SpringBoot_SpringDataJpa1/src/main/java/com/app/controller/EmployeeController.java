package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.app.dto.EmployeeDto;
import com.app.service.EmployeeService;

@Controller("empController")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	public void processEmployeeRegRequest(EmployeeDto empDto) {
		// call the service method
		
		Integer id = empService.registerEmployee(empDto);
		
		if(id != null) {
			System.out.println("Employee registration successfull");
		}else {
			System.out.println("Employee registration failed");
		}
	}
	
	
	public Integer[] processEmpRegistrationInGroup(List<EmployeeDto> empDtoList) {
		return empService.registerEmployeeInGroup(empDtoList);
	}

}
