package EndPracticalTheory;


class LowBalanceException extends Exception
{
    LowBalanceException(String msg )
    {
        super(msg);
    }
}




class Bankclint
{
    private String name ; 
    private String accno ; 
    private double amt ; 


    // constructor 

    public Bankclint( String name , String accno , double amt )
    {
        this.name = name ; 
        this.accno = accno ; 
        this.amt = amt ; 
    }



    void withdraw(int withdrawamt ) throws LowBalanceException 
    {
       
        if( withdrawamt > amt )
        {
            throw new LowBalanceException("Your account has a low balance ......."); 
        }
        else
        {
            amt -= withdrawamt ; 
            System.out.println("WithDraw Successful, Remaining Balance : " + amt  );
        }
       
    }


    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Acc/No. : "+accno);
        System.out.println("Balance : "+amt);
    }

}





public class Bank {

    public static void main(String[] args)
    {
        Bankclint clint = new Bankclint("Ayush Aryan" , "84659879661350" , 5000) ; 

        try
        {
            clint.withdraw(2000);
        }
        catch(LowBalanceException e )
        {
            System.out.println( e.getMessage() );
        }

        clint.display(); 


    }
    
}
