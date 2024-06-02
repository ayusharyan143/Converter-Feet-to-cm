package threads;


class Myclass2 extends Thread
{
    @Override
    public void run()
    {   
        System.out.println("Thread Started : " + Thread.currentThread().getName());

        try
        {
            Thread.sleep(2000);
        }
        catch( InterruptedException e )
        {
            System.out.println("Thread Interrupted: " + Thread.currentThread().getName());
        }

        System.out.println("Thread finished: " + Thread.currentThread().getName());

    }
}


public class isAliveandJoinExample {

    public static void main(String[] args)
    {
        Myclass2 t = new Myclass2() ; 

        t.start(); 

        System.out.println("Is thread alive ? " + t.isAlive() );


        try
        {
            t.join();
        }
        catch( InterruptedException e )
        {
            System.out.println("Main thread interrupted while waiting for completion.");
        }
   

        System.out.println("Is thread alive after join ? " + t.isAlive() );
        System.out.println("Main thread Exiting.....");
    }
    
}
