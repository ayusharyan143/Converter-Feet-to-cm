package EndPracticalTheory;

class Employee {
    private int id;
    private String name, department,city;
    private double salary;

    
    public Employee(int id, String name, String department, String city, double salary) 
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.city = city;
        this.salary = salary;
    }

    
    public Employee(int id, String name, String department, String city) {
        this(id, name, department, city, 0.0);
    }

    
    public Employee(int id, String name, String department) {
        this(id, name, department, "Unknown", 0.0);
    }

    
    public Employee(int id, String name) {
        this(id, name, "Unknown", "Unknown", 0.0);
    }

    
    public Employee(int id) {
        this(id, "Unknown", "Unknown", "Unknown", 0.0);
    }

    
    public Employee() {
        this(0, "Unknown", "Unknown", "Unknown", 0.0);
    }

    
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department + ", City: " + city + ", Salary: " + salary);
    }
}




public class constructorChain {

    public static void main(String[] args) {

        
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(1);
        Employee emp3 = new Employee(2, "Alice");
        Employee emp4 = new Employee(3, "Bob", "HR");
        Employee emp5 = new Employee(4, "Charlie", "Finance", "New York");
        Employee emp6 = new Employee(5, "David", "IT", "San Francisco", 75000);

        
        emp1.display();
        emp2.display();
        emp3.display();
        emp4.display();
        emp5.display();
        emp6.display();
    }
}