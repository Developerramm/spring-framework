package com.springrest.app.controller;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.springrest.app.entity.StudentEntity;



@RestController
@RequestMapping("/student")
public class StudentRestController {
	
	@PostMapping("/data")
	public String getDataFromRequestBody(@RequestBody StudentEntity entity) {
		System.out.println("StudentRestController.getDataFromRequestBody()");
		return "The student data is " + entity;
	}
	

}
