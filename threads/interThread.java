package threads;


class Banking 
{
    static public int balance = 0 ; 

    public synchronized void withdraw(int amt )
    {
        if( balance <= 0 )
        {
            try
            {
                System.out.println("Waiting for your balance to update before withdrawal of $" + amt);
                wait();
            }
            catch( InterruptedException e )
            {
                e.printStackTrace();
            }
        }

        balance -= amt ; 
        System.out.println("Withdrawal successful. The current balance is: $" + balance);
    }

    public synchronized void deposit(int amount)
    {
        System.out.println("We are depositing the amount $" + amount);
        balance = balance + amount;
        notify(); 
    } 
}




class Bankingthread1 extends Thread 
{
    Banking banking ; 

    public Bankingthread1( Banking b )
    {
        this.banking = b ; 
    }

    @Override
    public void run()
    {
        try
        {
            Thread.sleep(1000);

        }
        catch(InterruptedException e )
        {
            e.printStackTrace();
        }

        banking.withdraw(1500);
    }
}





class Bankingthread2 extends Thread 
{
    Banking banking ; 

    public Bankingthread2( Banking b )
    {
        this.banking = b ; 
    }

    @Override
    public void run()
    {
        try 
        {
            Thread.sleep(2000);
        } 
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        banking.deposit(5000);

    }

}



public class interThread {

    public static void main(String[] args)
    {
        Banking b = new Banking() ; 
        
        Bankingthread1 bt1 = new Bankingthread1(b) ;
        Bankingthread2 bt2 = new Bankingthread2(b) ;

        bt1.start(); 
        bt2.start(); 

    }
    
}
