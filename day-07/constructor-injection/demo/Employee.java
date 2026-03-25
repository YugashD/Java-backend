package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empid;
	private String name;
	private double salary;
	
	public Employee(
			@Value("101") int empid,
			@Value("Ravi") String name,
			@Value("10000") double salary) {
		System.out.println("Inside Employee Constructor");
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
