package com.app.proj66_springboot_springdatajpa1;

import com.app.proj66_springboot_springdatajpa1.controller.EmployeeController;
import com.app.proj66_springboot_springdatajpa1.dto.EmployeeDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Proj66SpringbootSpringdatajpa1Application {

        public static void main(String[] args) {
                ApplicationContext context = null;
                EmployeeController controller = null;
                context = SpringApplication.run(Proj66SpringbootSpringdatajpa1Application.class, args);

                controller = context.getBean("empController", EmployeeController.class);

                // EmployeeDto dto = new EmployeeDto();
                // dto.setEid(1004);
                // dto.setEname("mahi");
                // dto.setEmail("mahi@gmail.com");
                // dto.setSalary(15000d);
                // controller.processEmployeeRegRequest(dto);

                // inserting record in a batch

                Integer[] ids = controller.processEmpRegisterInGroup(
                List.of(new EmployeeDto(1008, "priya", "p@gmail.com",1000d),
                        new EmployeeDto(1009, "ranjana", "riya@gmail.com", 2000d),
                        new EmployeeDto(1010, "charu", "param@gmail.com", 10000d)));

                System.out.println("Saved ids " + Arrays.toString(ids));
        }
}
