package com.app.service;

import java.util.ArrayList;
import java.util.List;

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

	@Override
	public Integer[] registerEmployeeInGroup(List<EmployeeDto> listEmpDto) {
		
		// convert the dto list to entity list
		
		List<EmployeeEntity> listEntity = new ArrayList<>();
		
		listEmpDto.forEach(dto->{
			EmployeeEntity entity = new EmployeeEntity();
			BeanUtils.copyProperties(dto, entity);
			listEntity.add(entity);
		});
		
		// save the record
		
		 List<EmployeeEntity> savedEntityList =  (List<EmployeeEntity>) empRepo.saveAll(listEntity);
		 
		 Integer[] ids = new Integer[savedEntityList.size()];
		 
		 for(int i = 0; i<savedEntityList.size(); i++) {
			 ids[i] = savedEntityList.get(i).getEid();
		 }
		
		return ids;
	}

	@Override
	public long getTotalNoOfEmployees() {
		
		return empRepo.count();
	}

	@Override
	public boolean checkEmpExist(Integer id) {
		
		return empRepo.existsById(id);
	}

	@Override
	public void deleteEmpById(Integer id) {
		empRepo.deleteById(id);
	}

}
