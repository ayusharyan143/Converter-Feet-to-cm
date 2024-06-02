package classCode;

class Table
{
     void printtable(int x)
    {
        synchronized(this)
        {

            for( int i = 1; i <= 3 ; i++ )
            {
                System.out.println(x*i);
                try
                {
                    Thread.sleep(50);
                }
                catch(InterruptedException e )
                {
                    e.printStackTrace();
                }
            }
        }
    }
}


class A extends Thread
{
    Table t ; 

    A(Table t )
    {
        this.t = t ; 
    }

    public void run()
    {
        t.printtable(10);
    }

}

class B extends Thread
{
    Table t2 ; 

    B(Table t2)
    {
        this.t2 = t2 ; 
    }

    public void run()
    {
        t2.printtable(6);
    }

    
}




public class synchro {

    public static void main(String[] args)
    {
        Table objT = new Table() ; 
        
        A objA = new A(objT);
        B objB = new B(objT);

        
        objA.start();
        objB.start();



    }
    
}
