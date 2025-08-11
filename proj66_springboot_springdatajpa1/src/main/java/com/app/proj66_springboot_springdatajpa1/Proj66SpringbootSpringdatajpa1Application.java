package com.app.proj66_springboot_springdatajpa1;

import com.app.proj66_springboot_springdatajpa1.controller.EmployeeController;
import com.app.proj66_springboot_springdatajpa1.dto.EmployeeDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Proj66SpringbootSpringdatajpa1Application {

	public static void main(String[] args) {
        ApplicationContext context = null;
        EmployeeController controller = null;
        EmployeeDto dto = new EmployeeDto();
		context =  SpringApplication.run(Proj66SpringbootSpringdatajpa1Application.class, args);

       controller =  context.getBean("empController", EmployeeController.class);
       dto.setEid(1004);
       dto.setEname("mahi");
       dto.setEmail("mahi@gmail.com");
       dto.setSalary(15000d);
       controller.processEmployeeRegRequest(dto);

	}

}
