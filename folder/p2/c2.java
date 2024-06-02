package p2;

import java.util.*;
import p1.*;

public class c2 implements I1 {

  public int div(int a, int b) {
    if (b != 0) {
      return (a / b);
    } else {
      return (-1);
    }
  }

  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);

    c1 d = new c1();
    c2 f = new c2();
    
    System.out.println("Enter 2 numbers");
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    System.out.println("Sum of a and b:" + d.sum(a, b));
    
    System.out.println("Subtraction of a and b:" + d.sub(a, b));
    
    System.out.println("Division of a and b:" + f.div(a, b));

    sc.close(); 
  }
}
