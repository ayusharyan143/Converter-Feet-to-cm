package threads;

public class creatmainthread {

    public static void main(String[] args) {
         
        Thread t = Thread.currentThread() ; 
        System.out.println("Current Thread : " + t );

        System.out.println("Current Thread : " + t.getName() );


        t.setName("Primary Thread");

        System.out.println("After Name Change : " + t.getName() );

        System.out.println("Main Thread Details : " + t );

        for( int i = 0 ; i < 5 ; i++ )
        {
            System.out.println(i);

            try
            {
                Thread.sleep(3000);

            }
            catch( InterruptedException e )
            {
                System.out.println("Main Thread Interrupted");
            }
        }

    }
    
}
