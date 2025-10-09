package com.app.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.EmployeeEntity;

@Repository("empRepo")
public interface EmployeeRepo extends CrudRepository<EmployeeEntity, Integer> {

}
