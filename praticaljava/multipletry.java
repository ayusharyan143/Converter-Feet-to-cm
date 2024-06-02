package praticaljava;

import java.util.Scanner;

class ex extends Exception {
  public ex(String message) {
      super(message);
  }
}


public class multipletry {

  public static void main(String[] args) {
    int[] marks = new int[3];

    marks[0] = 7;
    marks[1] = 56;
    marks[2] = 6;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the array index : ");
    int index = sc.nextInt();

    System.out.print("Enter the number you want to divide the value with : ");
    int num = sc.nextInt();

    System.out.print("Enter the rand no. : ");
    int x = sc.nextInt();

    try
    {

      System.out.println("The value at array index entered is : " + marks[index]);
      System.out.println("The value of array ( value/number ) : " + marks[index] / num);

      if( x < 18 )
      {
        throw new ex("under 18");
      }
    }
    catch (ArithmeticException e)
    {
      System.out.println("ArithmeticException occured");
      System.out.println(e);
    } 
    catch (ArrayIndexOutOfBoundsException e)
    {
      System.out.println("ArrayIndexOutOfBoundsException occured");
      System.out.println(e);
    }
    catch (ex e)
    {
      System.out.println("other  occured");
      System.out.println(e);
    }
    catch (Exception e)
    {
      System.out.println("other exception occured");
      System.out.println(e);
    }
    finally
    {
      sc.close();
    }
  }
}
