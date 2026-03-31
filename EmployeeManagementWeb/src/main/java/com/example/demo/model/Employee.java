package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message="Name cannot be empty")
    @Pattern(regexp = "^[A-Za-z]+(?: [A-Za-z]+){0,2}$", message = "Name must contain only letters and can have up to 3 words")
    private String name;
    @Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 60, message = "Age should not be greater than 60")
    private int age;
    @Enumerated(EnumType.STRING)
    @NotNull
    private Designation designation;
    private int salary;

    public Employee() {
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public enum Designation{
        MANAGER, TESTER, PROGRAMMER
    }

    @PrePersist
    public void setInitialSalary() {
        if (this.salary == 0) {
            switch (this.designation) {
                case PROGRAMMER:
                    this.salary = 20000;
                    break;
                case MANAGER:
                    this.salary = 25000;
                    break;
                case TESTER:
                    this.salary = 15000;
                    break;
            }
        }
    }
}
