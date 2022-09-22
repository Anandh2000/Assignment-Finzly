package com.javaByKiran.assignment.repository;

import com.javaByKiran.assignment.entity.Country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CountryRepository extends JpaRepository<Country,Integer>{

}
