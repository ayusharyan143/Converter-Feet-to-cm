package classCode;


class A implements Runnable
{
    public void run()
    {
        for(int i = 1 ; i <= 3 ; i++ )
        {   
            System.out.println("Thread A:   i=  "+i);
        }
        System.out.println("Finishing thread A....");
    }
}


class B implements Runnable 
{
    public void run()
    {
        for( int i = 0  ;  i <= 3 ; i++ )
        {
            System.out.println("Thread B:   j=  "+ i );
        }
        System.out.println("Finishing thread B....");

    }
}




class C implements Runnable 
{
    public void run()
    {
        for( int i = 0  ;  i <= 3 ; i++ )
        {
            System.out.println("Thread C:   j=  "+i);
        }
        System.out.println("Finishing thread C....");

    }
}






public class runabbleinterface {
    public static void main(String[] args)
    {
        A a = new A() ;     
        B b = new B() ; 
        C c = new C() ; 

        Thread t1 = new Thread(a) ; 
        Thread t2 = new Thread(b) ; 
        Thread t3 = new Thread(c) ; 

        t1.start();
        t2.start();
        t3.start();
    }
    
}
