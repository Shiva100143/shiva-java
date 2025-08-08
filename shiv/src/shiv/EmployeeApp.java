package shiv;
import java.util.Scanner;


class Employee {
 protected String name;
 protected int id;
 protected double salary;

 public void inputDetails(Scanner scanner) {
     System.out.print("Enter Employee ID: ");
     id = scanner.nextInt();
     scanner.nextLine(); 

     System.out.print("Enter Employee Name: ");
     name = scanner.nextLine();

     System.out.print("Enter Salary: ");
     salary = scanner.nextDouble();
 }

 public void displayDetails() {
     System.out.println("ID: " + id);
     System.out.println("Name: " + name);
     System.out.println("Salary: " + salary);
 }
}


class Manager extends Employee {
 private String department;

 
 public void inputDetails(Scanner scanner) {
     super.inputDetails(scanner);
     scanner.nextLine(); 
     System.out.print("Enter Department: ");
     department = scanner.nextLine();
 }

 
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Department: " + department);
 }
}

class Developer extends Employee {
 private String programmingLanguage;

 
 public void inputDetails(Scanner scanner) {
     super.inputDetails(scanner);
     scanner.nextLine(); 
     System.out.print("Enter Programming Language: ");
     programmingLanguage = scanner.nextLine();
 }

 public void displayDetails() {
     super.displayDetails();
     System.out.println("Programming Language: " + programmingLanguage);
 }
}

public class EmployeeApp {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Choose Employee Type:");
     System.out.println("1. Manager");
     System.out.println("2. Developer");
     System.out.print("Enter choice: ");
     int choice = scanner.nextInt();

     Employee emp;

     if (choice == 1) {
         emp = new Manager();
     } else if (choice == 2) {
         emp = new Developer();
     } else {
         System.out.println("Invalid choice.");
         scanner.close();
         return;
     }

   
     emp.inputDetails(scanner);
     System.out.println("\n--- Employee Details ---");
     emp.displayDetails();

     scanner.close();
 }
}

