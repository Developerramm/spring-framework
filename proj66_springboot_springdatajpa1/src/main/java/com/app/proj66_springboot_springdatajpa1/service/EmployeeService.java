package com.app.proj66_springboot_springdatajpa1.service;

import com.app.proj66_springboot_springdatajpa1.dto.EmployeeDto;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

   public Integer registerEmployee(EmployeeDto empDto);

   public Integer[] regisgerEmployeeInGroup(List<EmployeeDto> listEmpDto);

   public long getTotlaNoOfEmployees();

   public  boolean isEmployeeExist(Integer id);

   public void deleteEmployeeById(Integer id);

   public Optional<EmployeeDto> gitEmployeebyId(Integer id);

   public String deleteEmployeeById(int id);

   public  List<EmployeeDto> getAllEmployees();

   public String removeEmployeesByGivenEntities(List<EmployeeDto> empDtoList);

   public List<EmployeeDto> getEmployeesByIds(List<Integer> ids);
}
