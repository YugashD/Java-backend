package com.example.validation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Pattern(regexp = "^[a-zA-Z]+$", message = "UserName must contain only letters")
    private String userName;

    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,20}$",
            message = "Password must contain at least one uppercase letter, one number, one special character, and be 8-20 characters long.")
    private String password;

    @NotBlank(message="Name cannot be empty")
    private String name;
    @Positive(message="Salary must be greater than 0")
    private double salary;
    @Min(value = 1000000000L, message = "Phone number must have at least 10 digits")
    @Max(value = 9999999999L, message = "Phone number must have at most 10 digits")
    private long phoneNumber;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
