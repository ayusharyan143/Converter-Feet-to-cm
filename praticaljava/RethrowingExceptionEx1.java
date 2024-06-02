package praticaljava;

public class RethrowingExceptionEx1 {

    public static void checkAge(int age)
    {
        try
        {
            if (age < 18)
            {
                throw new ArithmeticException("Access denied - " + "You must be at least 18 years old.");
            } 
            else
            {
                System.out.println("Access granted - You are old enough!");
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception caught in Method: "+e);
            throw e;
        }
    }
 
    public static void main(String[] args)
    {
        try
        {
            checkAge(15);  
        }
        catch (Exception e)
        {
            System.out.println("Exception caught in main");
        }
    }
}
