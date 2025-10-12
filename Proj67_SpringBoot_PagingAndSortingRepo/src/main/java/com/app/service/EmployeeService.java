package com.app.service;

import java.util.List;

import com.app.dto.EmployeeDto;

public interface EmployeeService {
	
	public List<EmployeeDto> getAllEmployees(String property,boolean ascendingOrder);
	
	
}
