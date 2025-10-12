package com.app.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.app.dto.EmployeeDto;
import com.app.entity.EmployeeEntity;
import com.app.repo.EmployeeRepo;

import jakarta.transaction.Transactional;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;

	@Override
	public List<EmployeeDto> getAllEmployees(String property, boolean ascendingOrder) {
		
		List<EmployeeEntity> entityList = null;
		entityList = (List<EmployeeEntity>) empRepo.findAll(
							ascendingOrder ?
							Sort.by(Sort.Direction.ASC,property) :
							Sort.by(Sort.Direction.DESC,property)
						);
		
		List<EmployeeDto> listDto = new ArrayList<EmployeeDto>();
		
		entityList.forEach(entity->{
			EmployeeDto dto = new EmployeeDto();
			BeanUtils.copyProperties(entity, dto);
			listDto.add(dto);
		});
		
		return listDto;
	}

	@Override
	public List<EmployeeDto> getAllEmployees(boolean ascendingOrder, String... properties) {
		
		List<EmployeeEntity> entityList = null;
		entityList = (List<EmployeeEntity>) empRepo.findAll(
							ascendingOrder ?
							Sort.by(Sort.Direction.ASC,properties) :
							Sort.by(Sort.Direction.DESC,properties)
						);
		
		List<EmployeeDto> listDto = new ArrayList<EmployeeDto>();
		
		entityList.forEach(entity->{
			EmployeeDto dto = new EmployeeDto();
			BeanUtils.copyProperties(entity, dto);
			listDto.add(dto);
		});
		
		return listDto;
	}

	@Override
	public List<EmployeeDto> getPageRecored(int pageNo, int pageSize) {
		
		// create the pageable objec 
		
		Pageable pageable = PageRequest.of(pageNo, pageSize, Direction.DESC, "eid");
		
		Page<EmployeeEntity> page = empRepo.findAll(pageable);
		
//		System.out.println("----------------------------");
//		System.out.println(page.getNumber() + " " + page.getNumberOfElements());
		
		List<EmployeeEntity> entityList = page.getContent();
		
		List<EmployeeDto> dtoList = new ArrayList<EmployeeDto>();
		
		entityList.forEach(entity->{
			EmployeeDto dto = new EmployeeDto();
			BeanUtils.copyProperties(entity, dto);
			dtoList.add(dto);
		});
		
		return dtoList;
	}

	@Override
	public void getRecordByPagination(int pageSize) {
		
		long totalNoRecord = empRepo.count();
		
		int pageCount = (int) (totalNoRecord) /pageSize;
		
		if(totalNoRecord % pageSize != 0) {
			pageCount++;
			// recored page by page
			
			for(int i = 0; i<pageCount; i++) {
				Pageable pageable = PageRequest.of(i,pageSize);
				
				Page<EmployeeEntity> page = empRepo.findAll(pageable);
				
				List<EmployeeEntity> entityList = page.getContent();
				
				entityList.forEach(System.out::println);
				System.out.println(page.getNumber() + 1);
				System.out.println("-------------------------");
			}
		}
		
	}

	@Override
	@Transactional
	public EmployeeDto fetchEmployeeById(int eid) {
		
		EmployeeEntity entity =	empRepo.getReferenceById(eid);
		
		// convet the entity to dto
		EmployeeDto dto = new EmployeeDto();
		
		BeanUtils.copyProperties(entity, dto);
		
		return dto;
	}

	@Override
	public void removeEmployeesInBatch(List<EmployeeDto> listDto) {
		
		// convert the dto to entity list
		List<EmployeeEntity> listEntity = new ArrayList<EmployeeEntity>();
		
		listDto.forEach(dto->{
			EmployeeEntity entity = new EmployeeEntity();
			BeanUtils.copyProperties(dto, entity);
			listEntity.add(entity);
		});
		
		empRepo.deleteAllInBatch(listEntity);
		
	}

	
}
