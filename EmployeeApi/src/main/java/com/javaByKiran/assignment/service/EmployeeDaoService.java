package com.javaByKiran.assignment.service;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.javaByKiran.assignment.entity.Country;
import com.javaByKiran.assignment.entity.Employee;
import com.javaByKiran.assignment.repository.CountryRepository;
import com.javaByKiran.assignment.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
@Service
public class EmployeeDaoService { 
	int tempId = 0;
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	@Autowired
	CountryRepository countryRepo;
	
	public ResponseEntity<List<Employee>> printAllEmployees() {
		 System.out.println(employeeRepo.findAll());
		return new ResponseEntity<List<Employee>>(employeeRepo.findAll(),HttpStatus.ACCEPTED);
	}
	
	public ResponseEntity<Employee> saveEmployee(Employee employee) {
		String countryName = employee.getCountry().getCountryName();
	    employee.getCountry().setCountryId(countryCodeGenerator(countryName));
	    employee.getCountry().setEmpId(employee.getEmpId());
		return new ResponseEntity<Employee>(employeeRepo.save(employee), HttpStatus.CREATED);
	}
	
	public void deleteEmployee(int id){
		employeeRepo.deleteById(id);
	}
	
//	public void updateEmp(String query) {
//		 employeeRepo.updateEmployee(query);
//
//	}
	
	public ResponseEntity<Country> saveCountry(Country country){
		String countryName = country.getCountryName();
		country.setCountryId(countryCodeGenerator(countryName));
		country.setEmpId(++tempId);
		return new ResponseEntity<Country>(countryRepo.save(country),HttpStatus.CREATED);
	}
	
	public void deleteCountry(int id){
		countryRepo.deleteById(id);
	}
	
	public ResponseEntity<List<Country>> printAllCountries() {
		return new ResponseEntity<List<Country>>(countryRepo.findAll(),HttpStatus.ACCEPTED);
	}
	
	
	public static String countryCodeGenerator(String countryName) {
		Map<String, String> countries = new HashMap<>();
	    for (String iso : Locale.getISOCountries()) {
	        Locale l = new Locale("", iso);
	        countries.put(l.getDisplayCountry(), iso);
	    }
	    String code = countries.get(countryName);
	    return code;
	}
	

}
