package march10Todo.EmployeeManagement;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

class Employee {
    String name;
    int age;
    String designation;
    double salary;

    public void displayEmployee() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Age: " + this.age);
        System.out.println("Employee Designation: " + this.designation);
        System.out.printf("Employee Salary: %.2f\n",this.salary);
    }

    public void raiseSalary(int increment) {
        this.salary *= (1 + increment / 100.0);
    }

    public void createEmployee(String name, int age, int designation) {
        this.name = name;
        this.age = age;
        switch(designation){
            case 1:
                this.designation = "Manager";
                this.salary = 25000;
                break;
            case 2:
                this.designation = "Programmer";
                this.salary = 20000;
                break;
            case 3:
                this.designation = "Tester";
                this.salary = 15000;
                break;
        }
    }
}

public class EmployeeManagement extends Employee {

    static boolean RaiseSalary(Scanner sc, Employee emp) {

        int increment;
        try {
            System.out.print("Enter the increment percentage (1-10): ");
            increment = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input.");
            return false;
        } finally {
            sc.nextLine();
        }
        if(increment<1 || increment>10){
            System.out.println("Invalid input. Increment percentage should be between 1 and 10.");
            RaiseSalary(sc,emp);
        }
        emp.raiseSalary(increment);
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        System.out.println("Welcome to Employee Management System");
        boolean flag = true;
        boolean found;
        while (flag) {
            System.out.println("-------------------------------------");
            System.out.println("Options:\n1. Create Employee\n2. Display Employee\n3. Raise Salary\n4. Exit");
            System.out.print("Choose an option:");
            int op;
            try {
                op = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nEnter a valid input!");
                continue;
            } finally {
                sc.nextLine();
            }
            switch (op) {
                case 1:
                    boolean continueCreation = true;
                    while (continueCreation) {
                        Employee emp = new Employee();
                        String name;
                        int age;
                        int designation;
                        try {
                            System.out.print("Enter Employee Name:");
                            name = sc.nextLine();
                            if (!Pattern.matches("\\S+(?:\\s\\S+){0,2}", name)) {
                                throw new InputMismatchException();
                            }
                            System.out.print("Enter Employee Age:");
                            age = sc.nextInt();
                            sc.nextLine();
                            if (age < 19 || age > 60) {
                                System.out.println("Age should be between 19 and 60!");
                                throw new Exception();
                            }
                            System.out.println("Enter Employee Designation:\nOptions:\n1 - Manager\n2 - Programmer\n3 - Tester");
                            designation = sc.nextInt();
                        } catch (InputMismatchException e){
                            System.out.println("Name can contain maximum of two spaces\n Please enter the details again.");
                            continue;
                        } catch (Exception e) {
                            System.out.println("Invalid input. Please enter the details again.");
                            continue;
                        }
                        finally {
                            sc.nextLine();
                        }
                        emp.createEmployee(name, age, designation);
                        employees.add(emp);
                        System.out.println("Employee created successfully. Details:");
                        emp.displayEmployee();
                        System.out.print("Do you want to create a new employee? (Y/N)");
                        String response = sc.nextLine();
                        if (response.equalsIgnoreCase("N")) {
                            continueCreation = false;
                        } else if (!response.equalsIgnoreCase("Y")) {
                            System.out.println("Invalid input. Directing to Main menu");
                            continueCreation = false;
                        }
                    }
                    break;
                case 2:
//                    System.out.print("Enter Employee Name to Display: ");
//                    String empName = sc.nextLine();
//                    found = false;
//                    for (Employee emp : employees) {
//                        if (emp.name.equals(empName)) {
//                            emp.displayEmployee();
//                            found = true;
//                            break;
//                        }
//                    }
                    if (employees.isEmpty()) {
                        System.out.println("No records found.");
                        break;
                    }
                    employees.getLast().displayEmployee();
                    break;
                case 3:
                    if (employees.isEmpty()) {
                        System.out.println("No records found.");
                        break;
                    }
                    System.out.print("Enter Employee Name to Raise Salary: ");
                    String empName2 = sc.nextLine();
                    found = false;
                    boolean continueRaising = true;
                    for (Employee emp : employees) {
                        if (emp.name.equals(empName2)) {
                            found = true;
                            do{
                                continueRaising=RaiseSalary(sc, emp);
                            }while(!continueRaising);
                            System.out.println("Salary raised successfully. Updated details:");
                            emp.displayEmployee();
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
