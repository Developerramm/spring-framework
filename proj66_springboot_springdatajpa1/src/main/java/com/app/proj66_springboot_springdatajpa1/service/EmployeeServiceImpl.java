package com.app.proj66_springboot_springdatajpa1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.BeanUtils;

import com.app.proj66_springboot_springdatajpa1.dto.EmployeeDto;
import com.app.proj66_springboot_springdatajpa1.entity.EmployeeEntity;
import com.app.proj66_springboot_springdatajpa1.repo.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo empRepo;

    @Override
    public Integer registerEmployee(EmployeeDto empDto) {
        // convert the dto to entity

        EmployeeEntity entity = new EmployeeEntity();
        BeanUtils.copyProperties(empDto, entity);

        // save the entity

        EmployeeEntity savedEntity = empRepo.save(entity);
        return savedEntity.getEid();
    }

    @Override
    public Integer[] regisgerEmployeeInGroup(List<EmployeeDto> listEmpDto) {

        // convert the dto list to entity list
        List<EmployeeEntity> listEntity = new ArrayList<>();

        listEmpDto.forEach(dto -> {
            EmployeeEntity entity = new EmployeeEntity();
            BeanUtils.copyProperties(dto, entity);
            listEntity.add(entity);
        });

        List<EmployeeEntity> savedData = (List<EmployeeEntity>) empRepo.saveAll(listEntity);

        Integer[] ids = new Integer[savedData.size()];

        for (int i = 0; i < savedData.size(); i++) {
            ids[i] = savedData.get(i).getEid();
        }

        return ids;
    }

    @Override
    public long getTotlaNoOfEmployees() {
        return  empRepo.count();
    }

    @Override
    public boolean isEmployeeExist(Integer id) {
       return empRepo.existsById(id);
    }

    @Override
    public void deleteEmployeeById(Integer id) {
        empRepo.deleteById(id);
    }

    @Override
    public Optional<EmployeeDto> gitEmployeebyId(Integer id) {

        Optional<EmployeeEntity> entityInOptional =  empRepo.findById(id);

        Optional<EmployeeDto> optionalDto = Optional.empty();

        if(entityInOptional.isPresent()){
          EmployeeEntity entity =  entityInOptional.get();

          // convert entity to dto
            EmployeeDto dto = new EmployeeDto();
            BeanUtils.copyProperties(entity,dto);

           optionalDto =  Optional.of(dto);
        }


        return optionalDto;
    }

}
