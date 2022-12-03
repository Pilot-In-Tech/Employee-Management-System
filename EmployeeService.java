package com.example.employmentmanagment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;

public class EmployeeService {

    HashSet<Employee> empset = new HashSet<Employee>();

    Employee emp1 = new Employee(101, "Ofonmbuk", 24, "Developer", "IT", 1000000);

    Employee emp2 = new Employee(102, "Samuel", 30, "Supervisor", "Management", 20000);

    Employee emp3 = new Employee(103, "Akan", 21, "IT", "Developer", 80000);

    Employee emp4 = new Employee(104, "Linda", 20, "Marketing", "Marketer", 20000);

    Employee emp5 = new Employee(105, "Simon", 24, "Sales", "forman", 10000);

    Scanner sc = new Scanner(System.in);


    boolean found = false;
    int id;


    String name;
    int age;
    String department;
    String designation;
    double salary;

    public EmployeeService() {
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
        empset.add(emp5);

    }

    //view all
    public void viewAllEmps() {
        for (Employee emp : empset) {
            System.out.println(emp);
        }
    }


    //view based on id

    public void viewEmp() {


        System.out.println("Enter id: ");
        id = sc.nextInt();
        for (Employee emp : empset) {
            if (emp.getId() == id) {
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee with that id is not available");

        }
    }

    //update employee
    public void updateEmployee() {
        System.out.println("Enter id: ");
        id = sc.nextInt();
        boolean found = false;
        for (Employee emp : empset) {
            if (emp.getId() == id) {
                System.out.println("Enter name: ");
                name = sc.next();
                System.out.println("Enter new Salary");
                salary = sc.nextDouble();
                emp.setName(name);
                emp.setSalary(salary);
                System.out.println("Updated details are: ");
                System.out.println(emp);
                found = true;

            }
        }
        if (!found) {
            System.out.println("Employee not found");

        } else {
            System.out.println("Employee details updated successfully");
        }
    }

    //delete employee
    public void deleteEmp() {
        System.out.println("Enter id");
        id = sc.nextInt();
        boolean found = false;
        Employee empdelete = null;
        for (Employee emp : empset) {
            if (emp.getId() == id) {
                empdelete = emp;
                found = true;

            }
        }
        if (!found) {
            System.out.println("Employee not found");

        } else {
            empset.remove(empdelete);
            System.out.println("Employee deleted successfully");
        }
    }
    //adding employee

    public void addEmp() {
        System.out.println("Enter id: ");
        id = sc.nextInt();
        boolean found = false;
        //Check if an instance of that id already exist
        for (Employee emp : empset) {
            if (id == emp.getId()) {
                found = true;
                System.out.println("Employee with this ID exist");
            }
        }
//if it doesnt, then continue adding

          if (!found) {


            System.out.println("Enter name: ");
            name = sc.next();
            System.out.println("Enter age:  ");
            age = sc.nextInt();
            System.out.println("Enter Designation ");
            designation = sc.next();
            System.out.println("Enter Department ");
            department = sc.next();
            System.out.println("Enter salary");
            salary = sc.nextDouble();

            Employee emp = new Employee(id, name, age, designation, department, salary);

            empset.add(emp);

            System.out.println("Employee Added Successfully!!");
            System.out.println(emp);


        }
    }
}





















