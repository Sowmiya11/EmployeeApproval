package com.empStatusTracker.model;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface  DepartmentDAO extends CrudRepository<Department, Long> {

}
