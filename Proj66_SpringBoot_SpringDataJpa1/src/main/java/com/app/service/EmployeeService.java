package com.app.service;

import org.springframework.stereotype.Service;

import com.app.dto.EmployeeDto;



@Service("empService")
public interface EmployeeService {
	
	public Integer registerEmployee(EmployeeDto empDto);

}
