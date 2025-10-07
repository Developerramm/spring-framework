package com.springrest.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	
	@GetMapping("/get")
	public ResponseEntity<String> getStudent(){
		System.out.println("fetch student here");
		return new ResponseEntity<String>("Ram kumar",HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> createStudent(){
		System.out.println("Student register successfully");
		return new ResponseEntity<String>("Mahi gupta",HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateStudent(){
		System.out.println("Student updated here ");
		return new ResponseEntity<String>("pooji updated",HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteStudent(){
		System.out.println("Student deleted here ");
		return new ResponseEntity<String>("Rohan Das",HttpStatus.OK);
	}

}
