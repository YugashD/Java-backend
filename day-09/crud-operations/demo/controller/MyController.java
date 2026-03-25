package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	private MyRepo repository;
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee(){
		return repository.findAll();
	}
	
	@GetMapping("/getEmployee/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		Optional<Employee> emp = repository.findById(id);
		return emp.orElse(null);
	}
	
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		repository.save(employee);
		return "Employee saved successfully!";
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);
			return "employee deleted successfully";
		}
		return "employee not found";
	}
}
