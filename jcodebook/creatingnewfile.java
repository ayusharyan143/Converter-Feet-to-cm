package jcodebook;

import java.io.File;
import java.io.IOException;

public class creatingnewfile {

    public static void main(String[] args) throws IOException {
        
        File file = new File("C:\\Users\\Asus_pc\\Desktop\\JAVA 4th SEM\\jcodebook\\myfile.txt");

        if(file.createNewFile())
        {
            System.out.println("File Created");
        }
        else
        {
            System.out.println("File Created");
        }
    }
    
}
