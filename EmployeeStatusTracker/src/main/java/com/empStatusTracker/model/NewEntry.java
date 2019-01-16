package com.empStatusTracker.model;

import java.io.File;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class NewEntry {
	
	@Id
	@GeneratedValue
	@Column
	private int s_No; 
	
	@NotNull
	@Column
	private File file;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	

}
