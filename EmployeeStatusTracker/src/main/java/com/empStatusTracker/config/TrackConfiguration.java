package com.empStatusTracker.config;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.empStatusTracker.model.NewEntry;

@Configuration
public class TrackConfiguration {
	
	@Autowired
	EntityManager entityManager;
	
	public Root<NewEntry> criteriaBuilder() {
		CriteriaBuilder criteriaBuilder=entityManager.getCriteriaBuilder();
		CriteriaQuery<Object> criteriaQuery=criteriaBuilder.createQuery();
		Root<NewEntry> from=criteriaQuery.from(NewEntry.class);
		return from;
	}
	
}
