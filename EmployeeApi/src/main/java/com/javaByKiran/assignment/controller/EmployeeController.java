package com.javaByKiran.assignment.controller;

import java.util.List;

import com.javaByKiran.assignment.entity.Country;
import com.javaByKiran.assignment.entity.Employee;
import com.javaByKiran.assignment.service.EmployeeDaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeDaoService service;
	
	@GetMapping("GetEmployee")
	public ResponseEntity<List<Employee>> getEmployee() {
		return service.printAllEmployees();
	}
	
	@PostMapping("AddEmployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
	System.out.println(employee.toString());
		return service.saveEmployee(employee);
	}
	
	@GetMapping("GetEmp")
	public Employee getEmp() {
		return new Employee();
	}
	
	@PostMapping("DeleteEmployee/{id}")
	public void deleteEmployee(@PathVariable int id) {
		service.deleteEmployee(id);
	}
	
//	@PostMapping("UpdateEmployee/{id}/{first}")
//	public void update(@PathVariable int id,@PathVariable String first,@RequestBody String second) {
//		String query = "UPDATE Employee SET "+first+" = "+second+"WHERE empId= "+id;
//		 service.updateEmp(query);
//		
//	}
	
	@PostMapping("AddCountry")
	public ResponseEntity<Country> addCountry(@RequestBody Country country) {
		return service.saveCountry(country);
	}
	
	@PostMapping("DeleteCountry/{id}")
	public void deleteCountry(@PathVariable int id) {
		service.deleteCountry(id);
	}
	
	@GetMapping("GetCountry")
	public ResponseEntity<List<Country>> getCountry() {
		return service.printAllCountries();
	}
	
	@GetMapping("GetCou")
	public Country getCou() {
		return new Country();
	}

	
	
	

}
