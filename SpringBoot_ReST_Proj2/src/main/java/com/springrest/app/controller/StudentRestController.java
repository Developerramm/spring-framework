package com.springrest.app.controller;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.app.entity.Address;
import com.springrest.app.entity.StudentEntity;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	
	@GetMapping("/greet")
	private String greetMsg() {
		System.out.println("StudentRestController.greetMsg()");
		return "Hello ram kumar";
	}
	
	@GetMapping("/get")
	@ResponseBody
	public StudentEntity getStudent() {
		
		System.out.println("StudentRestController.getStudent()");
		Address address = new Address("riga road", "Sitamarhi", "843302");
		return new StudentEntity(1001,"Ram kumar Singh ","java",address);
	}
	
	@GetMapping("/getcoursemodule")
	public List<String> courseModules(){
		return Arrays.asList("spring core","spring mvc","spring boot rest","microservice");
	}
	
	
	@GetMapping("/getcoursemodule1")
	public Set<String> courseModules1(){
		System.out.println("Set data show below ");
		return Set.of("spring core","spring mvc","spring boot rest","microservice","set data here");
	}
	
	
	@GetMapping("get-all-student")
	public List<StudentEntity> getAllStudents(){
		System.out.println("StudentRestController.getAllStudents()");
		Address address = new Address("riga road", "Sitamarhi", "843302");
		return Arrays.asList(
				new StudentEntity(1001,"ram","java developer",address),
				new StudentEntity(1002,"maghul","React JS",address),
				new StudentEntity(1003,"kapil","Node JS",address),
				new StudentEntity(1004,"Sreya","CSS",address),
				new StudentEntity(1005,"priya","Full Stack developer",address)
				
				);
	}
	
	
	@GetMapping("/getMarks")
	public Map<String, Integer> getStudentMarks(){
		System.out.println("StudentRestController.getStudentMarks()");
		return Map.of("java",88,"Cpp",90,"React",98,"node",100);
	}
	

}
