package com.app.proj66_springboot_springdatajpa1.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.proj66_springboot_springdatajpa1.entity.EmployeeEntity;

import java.util.List;

@Repository("empRepo")
public interface EmployeeRepo extends CrudRepository<EmployeeEntity,Integer> {

    Object findAll(List<Integer> ids);
}
