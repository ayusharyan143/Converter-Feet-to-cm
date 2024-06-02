package EndPracticalTheory;

import java.util.Scanner;

public class isbn {


    public static void checkISBN( String ISBN )
    {

        if (ISBN.length() != 10 ) 
        {
          System.out.println("Illegal ISBN");
        }
    


        int sum = 0 ; 

        for( int  i = 0 ; i < 10 ; i++ )
        {
            int digit = Character.getNumericValue( ISBN.charAt(i) ) ;

            sum += (i+1) * digit ; 
        }


        if( sum % 11 == 0 )
        {
            System.out.println("Legal ISBN");
        }
        else System.out.println("Illegal ISBN");

    }



  public static void main(String[] args)
  {
  
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the ISBN number: ");
    String isbn = sc.nextLine();

    checkISBN(isbn);
   
    sc.close();
  }
}
