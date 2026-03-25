package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.MyService;

@RestController
public class myController {

    @Autowired
    private MyService service;

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees(){
        return service.getAllEmployees();
    }
    @GetMapping("/getAllEmployees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee) {
        return service.addEmployee(employee);
    }
}
