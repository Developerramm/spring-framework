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
	
	public void getAllEmployeesInSortingOrderByMultipleProperties(boolean asc,String ...properties) {
		List<EmployeeDto> empDtoList = empService.getAllEmployees(asc,properties);
		System.out.println(empDtoList);
	}
	
	public void getEmployeesByPageNumber(int pageNo,int pageSize) {
		List<EmployeeDto> dtoList =  empService.getPageRecored(pageNo, pageSize);
		System.out.println(dtoList);
	}
	
	public void fetchEmpByPage(int size) {
		empService.getRecordByPagination(size);
	}
	
	

}
