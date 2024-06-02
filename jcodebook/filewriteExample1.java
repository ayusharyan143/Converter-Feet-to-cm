package jcodebook;

import java.io.FileWriter;
import java.io.IOException;

public class filewriteExample1 {

    public static void main(String[] args) {
        
        try
        {
            FileWriter w = new FileWriter("jcodebook/example1.txt");
            w.write("Hello, this is text written to a file");
            w.write("Ayush Aryan");
            w.write(" Shikha ");
            System.out.println("The file writing operation completed!");
            w.close();
        }
        catch(IOException e )
        {
            e.printStackTrace();
        }

    }
    
}
