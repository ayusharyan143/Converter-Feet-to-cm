package jcodebook;

import java.io.* ;

import java.util.Scanner;

public class consoleReadWrite {

    public static void main(String[] args) {
        
        
        try
        {
            File f = new File("ayush.txt") ;
            Scanner sc = new Scanner(f) ;

            while (sc.hasNextLine())
            {
                String line = sc.nextLine() ; 
                System.out.println(line);    
            }

            sc.close(); 

        }
        catch(FileNotFoundException e )
        {
            System.out.println("file not found : "+e.getMessage());
        }
      



    }
    
}
