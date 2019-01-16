package com.empStatusTracker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Department {
	
	@Id
	@Column
	private String depId;
	
	@Column
	private String managerName;


	public String getDepId() {
		return depId;
	}


	public void setDepId(String depId) {
		this.depId = depId;
	}

	
	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	
}
