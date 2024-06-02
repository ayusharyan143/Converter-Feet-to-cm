package jcodebook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class readsinglechar {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //-------------to read string -----------------//

        // System.out.print("Enter a name : ");
        // String name  = br.readLine() ; 
        // System.out.println("Hello, "+name+"! How are you ?");



        //------------to Reading Integer Input ----------//

        // System.out.print("Enter value of a : ");
        // int a = Integer.parseInt( br.readLine() );

        // System.out.print("Enter value of b : ");
        // int b = Integer.parseInt(br.readLine());

        // int sum = a+b ; 
        // System.out.println("Sum of 2 number (a+b) : "+sum);








        //-----------reading multiple lines -----------------//

        // String lines ; 
        // System.out.println("Enter Lines of text (type 'stop' to quit) : ");

        // while ( !( lines = br.readLine() ).equalsIgnoreCase("stop") )
        // {
        //     System.out.println("You entered : " + lines );    
        // }
        

        br.close(); 
    }
    
}
