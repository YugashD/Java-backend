package march10Todo.payrollManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    String name;
    int age;
    String designation;
    double salary;

    public void displayEmployee() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Age: " + this.age);
        System.out.println("Employee Designation: " + this.designation);
        System.out.println("Employee Salary: " + this.salary);
    }

    public void raiseSalary(int increment) {
        this.salary+=increment;
    }

    public void createEmployee(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }
}
public class PayrollManagement extends Employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Employee> employees=new ArrayList<>();
        System.out.println("Welcome to Payroll Management System");
        boolean flag=true;
        boolean found;
        while(flag) {
            System.out.println("-------------------------------------");
            System.out.println("Options:\n1. Create Employee\n2. Display Employee\n3. Raise Salary\n4. Exit");
            System.out.print("Choose an option:");
            int op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    Employee emp = new Employee();
                    System.out.println("Enter Employee Name:");
                    String name = sc.nextLine();
                    System.out.println("Enter Employee Age:");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Employee Designation:");
                    String designation = sc.nextLine();
                    System.out.println("Enter Employee Salary:");
                    double salary = sc.nextDouble();
                    sc.nextLine();
                    emp.createEmployee(name, age, designation, salary);
                    employees.add(emp);
                    break;
                case 2:
                    System.out.println("Enter Employee Name to Display:");
                    String empName = sc.nextLine();
                    found=false;
                    for (Employee e : employees) {
                        if (e.name.equals(empName)) {
                            e.displayEmployee();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No records found for the given employee name.");
                    }
                    break;
                case 3:
                    System.out.println("Enter Employee Name to Raise Salary:");
                    String empName2 = sc.nextLine();
                    found=false;
                    for (Employee e : employees) {
                        if (e.name.equals(empName2)) {
                            System.out.println("Enter the increment amount:");
                            int increment = sc.nextInt();
                            sc.nextLine();
                            e.raiseSalary(increment);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No records found for the given employee name.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        sc.close();
    }
}
