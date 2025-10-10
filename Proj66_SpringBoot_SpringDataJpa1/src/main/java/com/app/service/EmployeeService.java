package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.dto.EmployeeDto;



@Service("empService")
public interface EmployeeService {
	
	public Integer registerEmployee(EmployeeDto empDto);
	
	public Integer[] registerEmployeeInGroup(List<EmployeeDto> listEmpDto);
	
	public long getTotalNoOfEmployees();
	
	public boolean checkEmpExist(Integer id);
	
	public void deleteEmpById(Integer id);

}
