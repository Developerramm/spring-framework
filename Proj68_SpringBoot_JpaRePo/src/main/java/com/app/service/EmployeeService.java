package com.app.service;

import java.util.List;

import com.app.dto.EmployeeDto;

public interface EmployeeService {
	
	public List<EmployeeDto> fetchEmployeesBySomeData(EmployeeDto dto , String property,boolean asc);
	
}
