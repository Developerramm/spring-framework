package com.app.proj66_springboot_springdatajpa1.controller;

import com.app.proj66_springboot_springdatajpa1.dto.EmployeeDto;
import com.app.proj66_springboot_springdatajpa1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller("empController")
public class EmployeeController {

    @Autowired
    private EmployeeService empService;

    public  void processEmployeeRegRequest(EmployeeDto empDto){
        // call the service method
       Integer eid =  empService.registerEmployee(empDto);

       if(eid > 0){
           System.out.println("Employee register successful");
       }else{
           System.out.println("Registration failed");
       }
    }

    public  Integer[] processEmpRegisterInGroup(List<EmployeeDto> empDtoList){
         return   empService.regisgerEmployeeInGroup(empDtoList);
    }

    public  long getTotalEmployeeRecordCount(){
        return empService.getTotlaNoOfEmployees();
    }

    public boolean isEmployeeRegistered(Integer id){
        return empService.isEmployeeExist(id);
    }

    public void processDeleteEmployee(Integer id){
        empService.deleteEmployeeById(id);
    }

    public void checkEmployee(Integer id){
        Optional<EmployeeDto> optionalDto = empService.gitEmployeebyId(id);

        if(optionalDto.isPresent()){
            System.out.println("Employee is present " + optionalDto.get());
        }else{
            System.out.println("Employee not found ");
        }
    }

    public  void deleteEmployee(int id){
      String status=   empService.deleteEmployeeById(id);
        System.out.println(status);
    }

    public void getAllEmployees(){
       List<EmployeeDto> dtoList =  empService.getAllEmployees();
        System.out.println(dtoList);
    }

    public void deleteAllGivenEntities(List<EmployeeDto> dtoList){
        String status = empService.removeEmployeesByGivenEntities(dtoList);
        System.out.println(status);
    }

    public  void getAllEmployeesByIds(List<Integer> ids){
       List<EmployeeDto> dto =  empService.getEmployeesByIds(ids);
        System.out.println(dto);
    }
}
