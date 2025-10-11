package com.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

	@Override
	public Optional<EmployeeDto> getEmployeeById(Integer id) {
		Optional<EmployeeEntity> entityInOptional = 	empRepo.findById(id);
		// convert the entity to dto
		Optional<EmployeeDto> optionalDto = Optional.empty();
		
		if(entityInOptional.isPresent()) {
			EmployeeEntity entity =entityInOptional.get();
			EmployeeDto dto = new EmployeeDto();
			BeanUtils.copyProperties(entity, dto);
			optionalDto = Optional.of(dto);
		}
		
		return optionalDto;
	}

	@Override
	public String deleteEmployeeById(int  id) {
		
		Optional<EmployeeEntity> optionalEntity = empRepo.findById(id);
		
		String status = "";
		if(optionalEntity.isPresent()) {
			empRepo.delete(optionalEntity.get());
			status = "employee deleted";
		}else {
			status = "Employee cannot be deleted ";
		}
		
		
		return status;
	}

	@Override
	public List<EmployeeDto> getAllemployess() {
			Iterable<EmployeeEntity> itrEntities = empRepo.findAll();
			
			Iterable<EmployeeDto> itrDto = new ArrayList<EmployeeDto>();
			
			itrEntities.forEach(entity->{
				EmployeeDto dto = new EmployeeDto();
				BeanUtils.copyProperties(entity, dto);
				((List<EmployeeDto>)itrDto).add(dto);
			});
			
		return (List<EmployeeDto>)itrDto;
	}

	@Override
	public String removeEmployeesByGivenEntities(List<EmployeeDto> empDtoList) {
		
		// convert dto to entity list
		List<EmployeeEntity> entityList = new ArrayList<EmployeeEntity>();
		
		empDtoList.forEach(dto->{
			EmployeeEntity entity = new EmployeeEntity();
			BeanUtils.copyProperties(dto, entity);
			entityList.add(entity);
		});
		
		empRepo.deleteAll(entityList);
		
		return "entities deleted";
	}

	@Override
	public List<EmployeeDto> getEmployeesByIds(List<Integer> ids) {
		List<EmployeeEntity> listEntity = (List<EmployeeEntity>)empRepo.findAllById(ids);
		
		// convert the entity list to DTO list
		List<EmployeeDto> dtoList = new ArrayList<EmployeeDto>();
		
		listEntity.forEach(entity->{
			EmployeeDto dto = new EmployeeDto();
			BeanUtils.copyProperties(entity, dto);
			dtoList.add(dto);
		});
		
		return dtoList;
	}

}
