package com.springrest.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	@JsonIgnore
	private String password="mohit";
}
