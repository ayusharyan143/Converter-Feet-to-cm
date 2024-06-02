package praticaljava;

import java.util.Scanner;

public class exceptionExample {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      System.out.print("Enter a Number : ");
      int n = sc.nextInt();

      if (n > 18 && n < 26) {
        throw new IllegalArgumentException("Better try next time");
      } else {
        System.out.println("Congratulation You Win by " + n + " points");
      }
    } catch (Exception e) {
      System.out.println("You Loss, " + e.getMessage());
    } finally {
      sc.close();
    }
  }
}
