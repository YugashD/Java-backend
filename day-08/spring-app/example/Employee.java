package org.example;

public class Employee {
    int id;
    int age;
    int salary;
    Employee(int id, int age)
    {
        this.id = id;
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void display()
    {
        System.out.println("Employee id : " + id);
        System.out.println("Employee age : " + age);
        System.out.println("Employee salary : " + salary);
    }
}
