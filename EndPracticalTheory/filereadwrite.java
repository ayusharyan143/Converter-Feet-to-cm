package EndPracticalTheory;

import java.io.* ; 

public class filereadwrite {


    public static void main(String[] args) {
        
        
        FileReader r = null ; 
        FileWriter w = null ; 
        try
        {
             r = new FileReader( "C:\\Users\\Asus_pc\\Desktop\\JAVA 4th SEM\\inputfile.txt" ) ;
             w = new FileWriter( "C:\\Users\\Asus_pc\\Desktop\\JAVA 4th SEM\\outputfile.txt" ) ;

            int ch ; 

            while( (ch = r.read() ) != -1 )
            {
                w.write(ch);
            }

            r.close(); 
            w.close(); 

            System.out.println("File Copied Successfully ");
        }
        catch( IOException e )
        {
            System.out.println("An error Occurred ");
            e.printStackTrace();
        }
       
    }
    
}
