package examcode;

import java.util.Arrays;
import java.util.Scanner;

public class sortstring {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = "";
    String result = "";

    System.out.print("Enter the String : ");
    str = sc.nextLine();
    System.out.println("Input : " + str);

    char[] charArray = str.toCharArray();

    Arrays.sort(charArray);

    result = new String(charArray);

    System.out.println("Output : " + result);

    sc.close();
  }
}
