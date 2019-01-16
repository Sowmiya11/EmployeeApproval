package com.empStatusTracker.model;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface EmployeeDAo extends CrudRepository<Employee,Long>{

}
