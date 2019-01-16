package com.empStatusTracker.model;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ManagerRoleDAO extends CrudRepository<Employee, Long>{

}
