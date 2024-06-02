package jcodebook;

import java.io.*;
public class bufferWritterSizeExample {

    public static void main(String[] args) {
        
        int size =  2; 

        try
        {
            BufferedWriter w = new BufferedWriter(new FileWriter("ayush.txt") , size ) ;
           
            w.write("Hello, this text uses a custom buffer size.");
            w.newLine();
            w.write("More efficient for large amounts of data.");
            w.newLine();
            w.write("Hello, this text uses a custom buffer size.");
            w.newLine();
            w.write("More efficient for large amounts of data.");
            w.newLine();
            w.write("Hello, this text uses a custom buffer size.");
            w.newLine();
            w.write("More efficient for large amounts of data.");
            w.newLine();
            w.write("Hello, this text uses a custom buffer size.");
            w.newLine();
            w.write("More efficient for large amounts of data.");
           
            System.out.println("The file writing operation completed!");
           
            w.close();
        }
        catch( IOException e )
        {
            e.printStackTrace();
        }
    }
    
}
