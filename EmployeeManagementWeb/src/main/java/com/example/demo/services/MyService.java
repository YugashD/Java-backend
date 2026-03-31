package com.example.demo.services;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyService {
    @Autowired
    private EmployeeRepo repository;

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

    public String raiseSalary(int id, int percentage) {
        Optional<Employee> emp = repository.findById(id);
//                .orElseThrow(()->new ResourceNotFoundException("Employee not found"));
        if(emp.isPresent()) {
            Employee e = emp.get();
            double newSalary = e.getSalary() + ((double) (e.getSalary() * percentage) / 100);
            e.setSalary((int)newSalary);
            repository.save(e);
            return "Employee salary raised successfully!";
        }
        return "Employee ID not found";
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
