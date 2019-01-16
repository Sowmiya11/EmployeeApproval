package com.empStatusTracker.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empStatusTracker.service.inter.TaskServiceInter;

@RestController
public class TaskController {
	
	@Autowired
	TaskServiceInter taskController;
	
	
	@GetMapping("/upload")
	public String fileUpload() {
		File file=new File("D:\\inputData.csv");
		return taskController.uploadFileService(file);
	}
	
	

}
