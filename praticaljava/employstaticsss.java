import java.util.Scanner;

public class employstaticsss {

  private static int ID;
  private static String name;
  private static String department;
  private static double salary;

  public static void setDetails() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter employee ID: ");
    ID = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Enter employee name: ");
    name = scanner.nextLine();
    System.out.print("Enter employee department: ");
    department = scanner.nextLine();
    System.out.print("Enter employee salary: ");
    salary = scanner.nextDouble();

    scanner.close();
  }

  public static void showDetails() {
    System.out.println("Employee ID: " + ID);
    System.out.println("Employee Name: " + name);
    System.out.println("Employee Department: " + department);
    System.out.println("Employee Salary: " + salary);
  }

  public static void main(String[] args) {
    setDetails();
    System.out.println("\nEmployee Details:");
    showDetails();
  }
}
