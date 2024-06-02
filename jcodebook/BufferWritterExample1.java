package jcodebook ; 

import java.io.IOException; 
import java.io.FileWriter; 
import java.io.BufferedWriter; 

public class BufferWritterExample1 {

    public static void main(String[] args) {
        
        try
        {   
            BufferedWriter w = new BufferedWriter( new FileWriter("ayushBuffer.txt"));

            w.write("Hello, Ayush Ayan ");
            w.newLine(); 
            w.write("How are you ?");

            System.out.println("The file writing operation done succesfully ");

            w.close(); 

        }
        catch( IOException e )
        {
            e.printStackTrace();
        }
    }

    
}
