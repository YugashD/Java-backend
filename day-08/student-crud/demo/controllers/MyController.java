package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;

@RestController
public class MyController {

	ArrayList<Employee> emp = new ArrayList<Employee>();

	public MyController() {
		emp.add(new Employee(1, "John", 30, 50000, "Developer"));
		emp.add(new Employee(2, "Jane", 28, 60000, "Test"));
		emp.add(new Employee(3, "Modi", 70, 90000, "PM"));
	}

	@GetMapping("/getAllEmployee")
	public List<Employee> getEmployees() {
		return emp;
	}

	@GetMapping("/getEmployee/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		for (Employee e : emp) {
			if (e.getId() == id) {
				return e;
			}
		}
		return null;
	}
	@PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee e) {
        emp.add(e);
        return "Employee added successfully";
    }
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployeeById(@PathVariable int id) {
		for(Employee e : emp) {
			if(e.getId()==id) {
				emp.remove(e);
				return "Employee with ID :"+id+" deleted successfully";
			}
		}
		return "Employee with ID : "+id+" not found!";
		
	}
}
