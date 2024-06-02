package  classCode;

class myThread extends  Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread A:   i=  "+i);
        }
        
        System.out.println("Finishing thread A....");
    }

}



public class threadXreat {

    public static void main(String[] args) {
        

    }
    
}
