package examcode;

// Define two interfaces
interface Animal {
  void eat();
}

interface Bird {
  void fly();
}

// Implementing classes
class Sparrow implements Animal, Bird {

  public void eat() {
    System.out.println("Sparrow is eating.");
  }

  public void fly() {
    System.out.println("Sparrow is flying.");
  }
}

public class interfacedemo {

  public static void main(String[] args) {
    Sparrow sparrow = new Sparrow();
    sparrow.eat(); // Output: Sparrow is eating.
    sparrow.fly(); // Output: Sparrow is flying.
  }
}
