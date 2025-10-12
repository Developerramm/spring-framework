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
	
	
	public void fetchEmpExampleData(EmployeeDto dto, String property, boolean asc) {
		
		List<EmployeeDto> dtoList = empService.fetchEmployeesBySomeData(dto, property, asc);
		System.out.println(dtoList);
	}

}
