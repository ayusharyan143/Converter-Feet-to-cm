package threads;




class Myclass extends Thread 
{
    // @Override
    public void singlethread()
    {
        try
        {
            for( int i = 1 ; i < 5 ; i++ )
            {
                System.out.println("Ayush");
                Thread.sleep(1000);
            }
        }
        catch( InterruptedException e )
        {
            e.printStackTrace(); 
        }
    }
}


public class creatThreadByExtend {

    public static void main(String[] args)
    {
        Myclass obj = new Myclass() ;
        
        obj.singlethread(); 

        try
        {
            for( int i = 1 ; i < 5 ; i++ )
            {
                System.out.println("Mamta ji ");
                Thread.sleep(1000);
            }
        }
        catch( InterruptedException e )
        {
            e.printStackTrace();
        }


    }
    
}
