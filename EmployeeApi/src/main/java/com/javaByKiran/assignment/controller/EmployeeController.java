package com.javaByKiran.assignment.controller;

import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;
import com.javaByKiran.assignment.entity.Country;
import com.javaByKiran.assignment.entity.Employee;
import com.javaByKiran.assignment.repository.EmployeeRepository;
import com.javaByKiran.assignment.service.EmployeeDaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeDaoService service;
	@Autowired
	private EmployeeRepository emp;
	
	@GetMapping("GetEmployee")
	public ResponseEntity<List<Employee>> getEmployee() {
		return service.printAllEmployees();
	}
	
	@PostMapping("AddEmployee")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
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
	
	@PostMapping("UpdateEmployee")
	public void update(@RequestBody Employee employee) {
		 service.updateEmp(employee);
		
	}
	
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
//	@PatchMapping(path = "/{id}", consumes = "application/json-patch+json")
//    public ResponseEntity<Employee> updateCustomer(@PathVariable int id,
//                                                   @RequestBody JsonPatch patch) {
//       
//            Optional<Employee> employee  =  emp.findById(id);
//            Employee customerPatched = applyPatchToCustomer(patch, employee);
//            service.updateCustomer(customerPatched);
//	}
//
//	private Employee applyPatchToCustomer(JsonPatch patch, Optional<Employee> employee) throws JsonPatchException, JsonProcessingException {
//		JsonNode patched = patch.apply(ObjectMapper.convertValue(employee, JsonNode.class));
//        return ObjectMapper.treeToValue(patched, Employee.class);
//	
//	}
}
