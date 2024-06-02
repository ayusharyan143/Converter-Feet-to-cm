package examcode;

import java.util.Arrays;
import java.util.Scanner;

public class charcarra {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = "";
    String ans = "";

    str = sc.nextLine();

    char[] chararray = str.toCharArray();

    Arrays.sort(chararray);

    ans = new String(chararray);

    System.out.println(ans);

    sc.close();
  }
}
