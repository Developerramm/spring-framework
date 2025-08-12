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

    @Override
    public String deleteEmployeeById(int id) {
        Optional<EmployeeEntity> optionalEntity = empRepo.findById(id);

        String status = "";
        if(optionalEntity.isPresent()){
            empRepo.delete(optionalEntity.get());
            status = "Employee deleted";
        }else {
            status = "Employee cannot be deleted,as there is no employee of this given id";
        }

        return status;
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        Iterable <EmployeeEntity> itrEntities = empRepo.findAll();
        Iterable<EmployeeDto> itrDto = new ArrayList<EmployeeDto>();

        itrEntities.forEach(entity->{
            EmployeeDto dto = new EmployeeDto();
            BeanUtils.copyProperties(entity,dto);
            ((List<EmployeeDto>)itrDto).add(dto);
        });

        return (List<EmployeeDto>) itrDto;
    }

    @Override
    public String removeEmployeesByGivenEntities(List<EmployeeDto> empDtoList) {
        // convert dto entity list
        List<EmployeeEntity> entityList = new ArrayList();
        empDtoList.forEach(dto->{
            EmployeeEntity entity = new EmployeeEntity();
            BeanUtils.copyProperties(dto,entity);
            entityList.add(entity);
        });
        empRepo.deleteAll(entityList);
        return "Entities Deleted";
    }

    // @Override
    // public List<EmployeeDto> getEmployeesByIds(List<Integer> ids) {
    //     // TODO Auto-generated method stub
    //    List<EmployeeEntity> entityList = (List<EmployeeEntity>) empRepo.findAll(ids);
    //     List<EmployeeDto> dtoList = new ArrayList<EmployeeDto>();
    //          entityList.forEach(entity->{
    //              EmployeeDto dto = new EmployeeDto();
    //              BeanUtils.copyProperties(entity,dto);
    //              dtoList.add(dto);
    //          });
    //          return dtoList;
    // }

    @Override
    public List<EmployeeDto> getEmployeesByIds(List<Integer> ids) {
        List<EmployeeEntity> listEntity = (List<EmployeeEntity>)empRepo.findAll(ids);
        List<EmployeeDto> dtoList = new ArrayList<EmployeeDto>();
        listEntity.forEach(entity->{
            EmployeeDto dto = new EmployeeDto();
            BeanUtils.copyProperties(entity,dto);
            dtoList.add(dto);
        });
        return dtoList;
    }

}
