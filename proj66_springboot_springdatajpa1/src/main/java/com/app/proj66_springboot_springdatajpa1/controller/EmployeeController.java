package com.app.proj66_springboot_springdatajpa1.controller;

import com.app.proj66_springboot_springdatajpa1.dto.EmployeeDto;
import com.app.proj66_springboot_springdatajpa1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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
}
