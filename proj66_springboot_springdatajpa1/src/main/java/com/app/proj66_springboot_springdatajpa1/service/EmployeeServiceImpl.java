package com.app.proj66_springboot_springdatajpa1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.BeanUtils;

import com.app.proj66_springboot_springdatajpa1.dto.EmployeeDto;
import com.app.proj66_springboot_springdatajpa1.entity.EmployeeEntity;
import com.app.proj66_springboot_springdatajpa1.repo.EmployeeRepo;
import org.springframework.stereotype.Service;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepo empRepo;

    @Override
    public Integer registerEmployee(EmployeeDto empDto) {
        // convert the dto to entity

        EmployeeEntity entity = new EmployeeEntity();
        BeanUtils.copyProperties(empDto,entity);

        // save the entity

        EmployeeEntity savedEntity =  empRepo.save(entity);
        return savedEntity.getEid();
    }

}
