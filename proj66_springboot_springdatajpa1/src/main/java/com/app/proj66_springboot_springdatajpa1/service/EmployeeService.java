package com.app.proj66_springboot_springdatajpa1.service;

import com.app.proj66_springboot_springdatajpa1.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

   public Integer registerEmployee(EmployeeDto empDto);

   public Integer[] regisgerEmployeeInGroup(List<EmployeeDto> listEmpDto);

}
