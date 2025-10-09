package com.app.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.EmployeeDto;
import com.app.entity.EmployeeEntity;
import com.app.repo.EmployeeRepo;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;

	@Override
	public Integer registerEmployee(EmployeeDto empDto) {
		
		EmployeeEntity entity = new EmployeeEntity();
		BeanUtils.copyProperties(empDto, entity);
		
		// save the entity
		EmployeeEntity savedEntity =  empRepo.save(entity);
		
		return savedEntity.getEid();
	}

}
