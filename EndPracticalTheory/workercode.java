package EndPracticalTheory;


class Worker 
{
    protected String name;
    protected double basicWage;

    
    public Worker(String name, double basicWage)
    {
        this.name = name;
        this.basicWage = basicWage;
    }

    
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Basic Wage: " + basicWage);
    }
}

class Wages extends Worker 
{
    private int hr;
    private double rupeesPerhr ;

    
    public Wages(String name, double basicWage, int time, double rupeesPerhr    )
    {
        super(name, basicWage); 

        this.hr = time;
        this.rupeesPerhr = rupeesPerhr;
    }

    
    public double calculateMonthlyWage() 
    {
        double basicMonthlyWage = basicWage * 30;
        
        double overtimePay = hr  * rupeesPerhr ;
        
        double monthlyWage = basicMonthlyWage + overtimePay;

        
        

        return monthlyWage;
    }

    
    @Override
    public void display()
    {
        super.display(); 

        System.out.println("Overtime Hours: " + hr);
        System.out.println("Rate per Hour: " + rupeesPerhr);
      
        System.out.println("Monthly Wage: " + calculateMonthlyWage());
    }


}



public class workercode
{
    public static void main(String[] args) {
        
        Wages worker = new Wages("Ayush Aryan", 15000, 20, 100);
        
        worker.display();
    }
}