package praticaljava;

import java.util.Scanner;

public class ImplemCustomExceptionMain {



    public static void processGoing( int age ) throws customException
    {
        if( age < 18 )
        {
            throw new customException(age);
        }
        else
        {
            System.out.println("Eligible for Driving ");
        }
    }



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int age ; 
        System.out.print("Enter the age : ");
        age = sc.nextInt() ; 

        try
        {
            processGoing(age);
        }
        catch( customException e  )
        {
            System.out.println("Exception Caught : "+e);
        }
        finally
        {
            sc.close(); 
        }
    }
    
}
