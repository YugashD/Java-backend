package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private MyService Service;

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee(){
        return Service.getAllEmployees();
    }
    @GetMapping("/getEmployee/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return Service.getEmployeeById(id);
    }
    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee){
        return Service.addEmployee(employee);
    }
    @PutMapping("/updateEmployee/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        return Service.updateEmployee(id,employee);
    }
    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id){
        return Service.deleteEmployee(id);
    }
    @DeleteMapping("/deleteAllEmployee")
    public String deleteAllEmployee() {
            return Service.deleteAllEmployees();
    }
}
