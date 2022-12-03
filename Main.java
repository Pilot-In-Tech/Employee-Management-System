package com.example.employmentmanagment;
import java.util.Scanner;
public class Main {

     EmployeeService service = new EmployeeService();
    static boolean ordering = true;
    public static void menu(){
        System.out.println("********** WELCOME TO EMPLOYEE MANAGEMENT SYSTEM **********"
                + "\n1. Add Employee"
                + "\n2. View Employee"
                + "\n3. Update Employee"
                + "\n4. Delete Employee"
                + "\n5. View All Employee"
                + "\n0. Exit ");

    }
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
EmployeeService service = new EmployeeService();
        do{
            menu();
            System.out.println("Enter a choice ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Add Employee");
                    service.addEmp();
                    break;
                case 2:
                    System.out.println("View Employee");
                    service.viewEmp();
                case 3:
                    System.out.println("Update Employee");
                    service.updateEmployee();
                    break;
                case 4:
                    System.out.println("Delete Employee");
                    service.deleteEmp();
                    break;
                case 5:
                    System.out.println("View All Employee");
                    service.viewAllEmps();
                    break;
                case 0:
                    System.out.println("Thank you for using the application!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a valid choice");
                    break;


            }
        } while (ordering);



    }
}
