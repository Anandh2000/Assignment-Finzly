package com.javaByKiran.assignment.repository;

import javax.transaction.Transactional;

import com.javaByKiran.assignment.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	

}
