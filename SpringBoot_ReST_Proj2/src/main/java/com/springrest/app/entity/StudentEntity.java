package com.springrest.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {
	
	private Integer id;
	private String name;
	private String course;
	
	private Address address;
	
//	
//	public StudentEntity(Integer id, String name, String course) {
//		this.id = id;
//		this.name = name;
//		this.course = course;
//	}
//
//	public StudentEntity() {
//		
//	}

//	public Integer getId() {
//		return id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public String getCourse() {
//		return course;
//	}

}
