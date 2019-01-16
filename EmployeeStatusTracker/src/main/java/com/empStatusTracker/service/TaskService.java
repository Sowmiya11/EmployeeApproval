package com.empStatusTracker.service;

import java.io.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empStatusTracker.dao.inter.TrackDAOInter;
import com.empStatusTracker.service.inter.TaskServiceInter;


@Service
public class TaskService implements TaskServiceInter {
	
	@Autowired
	TrackDAOInter taskDAO;
	
	@Override
	public String uploadFileService(File file) {
		
		return taskDAO.uploadFile(file);//uploadFileService(file);
	}
	

}
