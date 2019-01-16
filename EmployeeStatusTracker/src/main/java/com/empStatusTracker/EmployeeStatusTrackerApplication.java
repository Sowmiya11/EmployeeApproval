package com.empStatusTracker;

import java.util.List;

import javax.persistence.Query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class EmployeeStatusTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeStatusTrackerApplication.class, args);
	}
	
	
}

