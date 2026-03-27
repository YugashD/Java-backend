package com.example.validation.controller;

import com.example.validation.model.Employee;
import com.example.validation.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService  service;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id){
        return service.getEmployeeById(id);
    }

    @PostMapping
    public Employee createEmployee(@Valid @RequestBody Employee employee){
        return service.addEmployee(employee);
    }

    @PutMapping
    public Employee updateEmployee(@Valid @RequestBody Employee employee){
        for(Employee e: getAllEmployees()){
            if(e.getId() == employee.getId()){
                return service.updateEmployee(employee);
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@Valid @PathVariable Long id){
        service.deleteEmployee(id);
    }
}
