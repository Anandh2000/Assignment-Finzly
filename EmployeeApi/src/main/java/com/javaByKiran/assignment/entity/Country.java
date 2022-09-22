package com.javaByKiran.assignment.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Country {
	@Id
	private int empId;
	private String countryId;
	private String countryName;
	
	
	public Country() {
	}

	public Country(String countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		
	}
	

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryId() {
		return countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	
	
	
}
