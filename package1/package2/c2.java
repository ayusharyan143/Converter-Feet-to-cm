package package1.package2;

import p1.c1;
import package1.i1;

public class c2 implements i1 {

    public int sub( int a  ,int b )
    {
        return a-b ; 
    }
    
    public static void main(String[] args) {
        
        c1 objc1 = new c1() ; 
        c2 objc2 = new c2() ; 

        int resultsum = objc1.sum( 5, 3 ) ;
        System.out.println("Sum : " + resultsum );

        int resultsub = objc2.sub(5, 3) ;
        System.out.println("Sub : " + resultsub);


    }
}
