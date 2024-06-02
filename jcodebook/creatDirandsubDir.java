package jcodebook;

import java.io.File;

public class creatDirandsubDir {

    public static void main(String[] args) {
        
        // File dir = new File("new directory") ;

        // if( dir.mkdir() )
        // {
        //     System.out.println("dir created");
        // }
        // else 
        // {
        //     System.out.println("Failed to creat dir ");
        // }
    
    
        
        File subdir  = new File("new directory/subdir1/subdir2/subdir3/subdir4");
        if( subdir.mkdirs())
        {
            System.out.println("dir created");
        }
        else
        {
            System.out.println("dir not created");
        }
    }

}
