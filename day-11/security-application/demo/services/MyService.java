package com.example.demo.services;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyService {
    @Autowired
     private EmployeeRepository repository;

     public List<Employee> getAllEmployees(){
        return repository.findAll();
     }

     public Employee getEmployeeById(int id) {
        return repository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee not found"));
     }

     public String addEmployee(Employee employee) {
        repository.save(employee);
        return "Employee added successfully";
     }
    public String updateEmployee(int id,Employee employee) {
        Optional<Employee> emp = repository.findById(id);
        if(emp.isPresent()) {
            Employee e = emp.get();
            e.setName(employee.getName());
            e.setSalary(employee.getSalary());
            repository.save(e);
            return "Employee value updated successfully!";
        }
        return "Employee ID not found";
    }

    public String deleteEmployee(int id) {
         repository.deleteById(id);
         return "Employee deleted successfully";
    }
    public String deleteAllEmployees() {
        repository.deleteAll();
        return "All employees deleted";
    }
}
