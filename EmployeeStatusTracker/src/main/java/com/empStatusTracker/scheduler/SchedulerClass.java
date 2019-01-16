package com.empStatusTracker.scheduler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.empStatusTracker.model.NewEntry;


@Component
public class SchedulerClass {
	
	public static int s=0;
	@Autowired
	EntityManager entitymanager;
	
	@Scheduled(initialDelay=1000,fixedRate=1000)
	public void readDataFromDB() {
		Query query=entitymanager.createQuery("select e.file from NewEntry e");
		List<Object[]> listAll=query.getResultList();
		int n=s;
		
		System.out.println("Schedule started");
		for(int i=0;i<n&&i<listAll.size();i++) {
			String line = "";
			try {
				BufferedReader fileReader=new BufferedReader(new FileReader(new NewEntry().getFile()));
				
					while ((line = fileReader.readLine()) != null) {
						String[] tokens = line.split(",");
						if (tokens.length > 0) {
							System.out.println(tokens[0]+" "+tokens[1]+tokens[2]);
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			s++;	
			} 
		System.out.println("Schedule ended....");
	}

}
