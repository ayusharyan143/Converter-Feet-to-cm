package praticaljava;

import java.util.Scanner;

public class Employee1 {

  private int ID;
  private String name;
  private String department;
  private double salary;

  // Constructor
  public Employee1() {
    this.ID = 0;
    this.name = "";
    this.department = "";
    this.salary = 0.0;
  }

  // Method to set details using Scanner
  public void setDetails() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter employee ID: ");
    this.ID = sc.nextInt();
    sc.nextLine(); // Consume newline
    System.out.print("Enter employee name: ");
    this.name = sc.nextLine();
    System.out.print("Enter employee department: ");
    this.department = sc.nextLine();
    System.out.print("Enter employee salary: ");
    this.salary = sc.nextDouble();

    sc.close();
  }

  // Method to display employee details
  public void showDetails() {
    System.out.println("Employee ID: " + this.ID);
    System.out.println("Employee Name: " + this.name);
    System.out.println("Employee Department: " + this.department);
    System.out.println("Employee Salary: " + this.salary);
  }

  // Main method to create an Employee object and demonstrate functionality
  public static void main(String[] args) {
    System.out.println(
      "\n\nName : Ayush Aryan \nCourse : B.TECH CSE\nRoll No. : 22\nSection : G2 \nSemester : 4th\n\n\nOUTPUT : \n"
    );
    Employee1 employee = new Employee1();
    employee.setDetails();
    System.out.println("\nEmployee Details:");
    employee.showDetails();
  }
}
