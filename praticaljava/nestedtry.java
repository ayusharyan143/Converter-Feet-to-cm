package praticaljava;

import java.util.Scanner;


public class nestedtry {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] marks =  new int[3] ;

        marks[0] = 7 ;
        marks[1] = 56 ;
        marks[2] = 6 ;

        System.out.println("Enter the value of index : ");
        int idx = sc.nextInt() ;

        try
        {
            System.out.println("Welcome to my code of nested try block");

            try
            {
                System.out.println(marks[idx]);

            }
            catch(ArrayIndexOutOfBoundsException e )
            {
                System.out.println("sorry this index does not exist");
                System.out.println("Exception in inside nested catch");
            }
        }
        catch( Exception e )
        {
            System.out.println("eException inside outside nested try-catch");
        }
        finally
        {
            System.out.println("Thank you for using my code");
            sc.close();
        }


    }
    
}
