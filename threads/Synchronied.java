package threads;


class Counter
{
    static int count = 0 ; 

    public synchronized static void setCount()
    {
        for( int i = 1 ; i <= 1000 ; i++ )
        {
            Counter.count++ ; 
        }
    }
}


class Myclass3 extends Thread 
{
    private int threadNo ; 

    public Myclass3( int threadNo )
    {
        this.threadNo = threadNo ; 
    }

    @Override
    public void run()
    {
        Counter.setCount();
        System.out.println("The Thread " + threadNo + " is over");
    }
}


public class Synchronied {

    public static void main(String[] args) throws InterruptedException
    {
        Myclass3 t1 = new Myclass3(1);
        Myclass3 t2 = new Myclass3(2);

        t1.start();
        t1.join();

        t2.start();
        t2.join();
        
        System.out.println("The value of the counter is: "+Counter.count);

    }
    
}
