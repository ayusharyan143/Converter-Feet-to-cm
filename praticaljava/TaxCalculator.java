package praticaljava;

import java.util.Scanner;

class Employee {

  String pan;
  String name;
  double taxIncome;
  double tax;

  void inputInfo() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter PAN number:");
    pan = sc.nextLine();

    System.out.print("Enter name:");
    name = sc.nextLine();

    System.out.print("Enter taxable income:");
    taxIncome = sc.nextDouble();

    sc.close();
  }

  void taxCalc() {
    if (taxIncome <= 250000) {
      tax = 0;
    } else if (taxIncome <= 300000) {
      tax = 0.1 * (taxIncome - 250000);
    } else if (taxIncome <= 400000) {
      tax = 5000 + 0.2 * (taxIncome - 300000);
    } else {
      tax = 25000 + 0.3 * (taxIncome - 400000);
    }
  }

  void displayInfo() {
    System.out.println("PAN: " + pan);

    System.out.println("Name: " + name);

    System.out.println("Taxable income: Rs " + taxIncome);

    System.out.println("Tax: Rs " + tax);
  }
}

public class TaxCalculator {

  public static void main(String[] args) {
    System.out.println(
      "\n\nName : Ayush Aryan \nCourse : B.TECH CSE\nRoll No. : 22\nSection : G2 \nSemester : 4th\n\n\nOUTPUT : \n"
    );
    Employee obj = new Employee();

    obj.inputInfo();

    obj.taxCalc();

    obj.displayInfo();
  }
}
