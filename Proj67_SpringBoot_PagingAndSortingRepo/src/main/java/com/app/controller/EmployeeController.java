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
	
	public void getAllEmployeesInSortingOrder(String property,boolean ascendingOrder) {
		List<EmployeeDto> empDtoList = empService.getAllEmployees(property, ascendingOrder);
		System.out.println(empDtoList);
	}
	
	

}
