package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.app.dto.EmployeeDto;
import com.app.entity.EmployeeEntity;
import com.app.repo.EmployeeRepo;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;

	@Override
	public List<EmployeeDto> fetchEmployeesBySomeData(EmployeeDto dto, String property, boolean asc) {
		
		EmployeeEntity entity = new EmployeeEntity();
		BeanUtils.copyProperties(dto, entity);
		
		// prepare the example object
		Example<EmployeeEntity> ex = Example.of(entity);
		
		// use repository
		List<EmployeeEntity> etityList =  empRepo.findAll(ex, asc ? 
						Sort.by(Direction.ASC,property) : 
						Sort.by(Direction.DESC,property)
					);
		
		List<EmployeeDto> empListDto = new ArrayList<EmployeeDto>();
		
		etityList.forEach(empEntity->{
			EmployeeDto empDto = new EmployeeDto();
			BeanUtils.copyProperties(empEntity, empDto);
			empListDto.add(empDto);
			
		});
		
		return empListDto;
	}



	
}
