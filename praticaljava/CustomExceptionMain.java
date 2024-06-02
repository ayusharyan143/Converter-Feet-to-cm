package praticaljava;

import java.util.Scanner;

public class CustomExceptionMain {


    static class mycustomException extends Exception
    {
        private int data ; 

        public mycustomException(int age)
        {
            data = age ; 
        }

        @Override
        public String toString()
        {
            return "My Custum Excpetion Data : "+data+" Under 18  Not eligible" ;
        }
    }


    public static void processGoing( int age ) throws mycustomException
    {
        if( age < 18 )
        {
            throw new mycustomException(age);
        }
        else
        {
            System.out.println("Eligible for Driving ");
        }
    }



    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);

        int age ; 
        System.out.print("Enter the age : ");
        age = sc.nextInt() ; 

        try
        {
            processGoing(age);
        }
        catch( mycustomException e )
        {
            System.out.println("Exception Caught : "+e);
        }
        finally
        {
            sc.close(); 
        }
        
    }
    
}
