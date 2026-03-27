package com.example.validation.service;

import com.example.validation.model.Employee;
import com.example.validation.repository.EmployeeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public List<Employee> getAllEmployees(){
        return repo.findAll();
    }

    public Employee getEmployeeById(Long id){
        for(Employee e: getAllEmployees()){
            if(e.getId()==id){
                return e;
            }
        }
        return null;
    }

    public Employee addEmployee(Employee employee){
        return repo.save(employee);
    }

    public Employee updateEmployee(@Valid @RequestBody Employee employee){
        return repo.save(employee);
    }

    public void deleteEmployee(long id){
        for(Employee e: getAllEmployees()){
            if(id==e.getId()){
                repo.delete(e);
            }
        }
    }
}
