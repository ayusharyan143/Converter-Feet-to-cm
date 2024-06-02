package praticaljava;

import java.util.Scanner;

public class runtimeException {

  public static void main(String[] args) {
    int result;

    try {
      result = divide(10, 0);
    } catch (ArithmeticException e) {
      System.out.println("Error: Division by zero");
    }
  }

  public static int divide(int dividend, int divisor) {
    return dividend / divisor; // This line will throw an ArithmeticException if divisor is 0
  }
}
