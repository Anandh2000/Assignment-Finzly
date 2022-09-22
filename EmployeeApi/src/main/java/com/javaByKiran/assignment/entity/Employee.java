package com.javaByKiran.assignment.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Employee {
	@Id
	@Column(name = "ID")
	private int empId;
	private String empName;
	private String empEmailId;
	private String empPhoneNo;
	private String empStatus;
	@CreationTimestamp
	private LocalDate createdDate;
	@Column(name = "CREATEDBY")
	private String createdBy;
	@UpdateTimestamp
	private LocalDate updatedDate;
	private String updatedBy;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "empId")
	private Country country;
	
	public Employee() {
	}
	

	public Employee(int empId, String empName, String empEmailId, String empPhoneNo, String empStatus,
			LocalDate createdDate, String createdBy, LocalDate updatedDate, String updatedBy) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmailId = empEmailId;
		this.empPhoneNo = empPhoneNo;
		this.empStatus = empStatus;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
		
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmailId=" + empEmailId + ", empPhoneNo="
				+ empPhoneNo + ", empStatus=" + empStatus + ", createdDate=" + createdDate + ", createdBy=" + createdBy
				+ ", updatedDate=" + updatedDate + ", updatedBy=" + updatedBy + ", country=" + country + "]";
	}


	public int getEmpId() {
		return empId;
	}


	public String getEmpName() {
		return empName;
	}


	public String getEmpEmailId() {
		return empEmailId;
	}


	public String getEmpPhoneNo() {
		return empPhoneNo;
	}


	public String getEmpStatus() {
		return empStatus;
	}


	public LocalDate getCreatedDate() {
		return createdDate;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public LocalDate getUpdatedDate() {
		return updatedDate;
	}


	public String getUpdatedBy() {
		return updatedBy;
	}


	public Country getCountry() {
		return country;
	}
	
	
	
}
