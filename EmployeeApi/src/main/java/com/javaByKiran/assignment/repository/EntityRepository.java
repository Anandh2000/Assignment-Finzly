package com.javaByKiran.assignment.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaByKiran.assignment.entity.Employee;

@Repository
public class EntityRepository {
	@Autowired
	private EntityManager entity;
	
	@Transactional
	public void save(Employee employee) {
		entity.persist(employee);
		
	}
	@Transactional
	public void update(Employee employee) {
		entity.merge(employee);
	}
	
}
