package jcodebook;

import java.io.*;

public class bufferReadingforfile {

    public static void main(String[] args) {
        
        File f = new File("ayush.txt") ;

        try( FileWriter w = new FileWriter( f ,  false ))
        {
            System.out.println("Content Cleared Successfully");
        }
        catch( IOException e )
        {
            System.err.println("error : "+e.getMessage());
        }
    }
    
}
