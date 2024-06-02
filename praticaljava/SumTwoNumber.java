package praticaljava;

public class SumTwoNumber {

  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Usage: java Sum <num1> <num2>");
    } else {
      try {
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double result = sumTwoNumbers(num1, num2);
        System.out.println("Sum: " + result);
      } catch (NumberFormatException e) {
        System.out.println("Please provide valid numbers as arguments.");
      }
    }
  }

  public static double sumTwoNumbers(double num1, double num2) {
    return num1 + num2;
  }
}
