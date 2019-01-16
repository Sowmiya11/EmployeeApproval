package com.empStatusTracker.dao;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.empStatusTracker.config.TrackConfiguration;
import com.empStatusTracker.dao.inter.TrackDAOInter;
import com.empStatusTracker.model.NewEntry;
import com.empStatusTracker.model.NewEntryDAO;

@Repository
public class TrackDAO implements TrackDAOInter {
	
	@Autowired
	TrackConfiguration trackConfiguration;
	
	@Autowired
	NewEntryDAO newEntryDAO;
	
	@Override
	public String uploadFile(File file){
		try {
			NewEntry newEntry=new NewEntry();
			newEntry.setFile(file);
			newEntryDAO.save(newEntry);
			return "DATA FILE INSERTED SUCCESSFULLY";
		}
		catch (Exception e) {
		return "Reading CSV Error!";
		} 
	}

}
