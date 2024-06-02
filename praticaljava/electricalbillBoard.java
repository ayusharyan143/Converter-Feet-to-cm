package praticaljava;

import java.util.Scanner;

public class electricalbillBoard {

  public static void main(String[] agrs) {
    System.out.println(
      "\n\nName : Ayush Aryan \nCourse : B.TECH CSE\nRoll No. : 22\nSection : G2 \nSemester : 4th\n\n\nOUTPUT : \n"
    );

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of users: ");
    int n = sc.nextInt();
    sc.nextLine();

    String[] names = new String[n];
    int[] unitsConsumed = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Enter name of user " + (i + 1) + ": ");
      names[i] = sc.nextLine();

      System.out.print("Enter units consumed by " + names[i] + ": ");
      unitsConsumed[i] = sc.nextInt();
      // sc.nextLine();
    }

    // Calculate and display charges for each user

    for (int i = 0; i < n; i++) {
      double charges = calculateCharges(unitsConsumed[i]);

      System.out.println(names[i] + "'s charges: Rs " + charges);
    }

    sc.close();
  }

  public static double calculateCharges(int unitsConsumed) {
    double charges = 0;

    if (unitsConsumed <= 100) {
      charges = unitsConsumed * 0.60;
    } else if (unitsConsumed <= 300) {
      charges = 100 * 0.60 + (unitsConsumed - 100) * 0.80;
    } else {
      charges = 100 * 0.60 + 200 * 0.80 + (unitsConsumed - 300) * 1.20;
    }

    return charges;
  }
}
