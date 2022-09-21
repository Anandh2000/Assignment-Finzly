package com.javaByKiran.assignment.service;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.javaByKiran.assignment.entity.Employee;
import com.javaByKiran.assignment.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
@Service
public class EmployeeDaoService { 
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	public ResponseEntity<List<Employee>> printAllEmployees() {
		return new ResponseEntity<List<Employee>>(employeeRepo.findAll(),HttpStatus.ACCEPTED);
	}
	
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		Map<String, String> countries = new HashMap<>();
	    for (String iso : Locale.getISOCountries()) {
	        Locale l = new Locale("", iso);
	        countries.put(l.getDisplayCountry(), iso);
	    }
	    String code = countries.get(employee.getCountry().getCountryName());
	    employee.getCountry().setCountryId(code);
	    employee.getCountry().setEmpId(employee.getEmpId());
		return new ResponseEntity<Employee>(employeeRepo.save(employee), HttpStatus.OK);
	}
	
	public void deleteEmployee(int id){
		employeeRepo.deleteById(id);
	}
	
	public void updateEmp(String query) {
		 employeeRepo.updateEmployee(query);

	}

}
