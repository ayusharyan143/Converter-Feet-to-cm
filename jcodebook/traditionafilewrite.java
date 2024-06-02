package jcodebook;

import java.io.* ;

public class traditionafilewrite {

    public static void main(String[] args) {
        
        BufferedWriter br = null ; 

        try
        {
            br = new BufferedWriter(new FileWriter("ayush.txt") );

            br.write("It is a traditional approach");
            br.newLine();
            br.write("Make sure to close resources in the finally block.");

            
            System.out.println("file written successfully");

            

        }
        catch(IOException e )
        {
            System.err.println("Error Occured : "+e.getMessage());
        }
        finally
        {
            if( br != null )
            {
                try
                {
                    br.close();
                }
                catch(IOException e )
                {
                    System.err.println("Fails to close : "+e.getMessage() );
                }
            }
        }
    }


    
}
