package examcode;

class A {

  A() {
    System.out.println("Constructor of Class A");
  }
}

class B extends A {

  B(int x) {
    System.out.println("Parameterized Constructor of Class B");
  }

  // Adding a default constructor to Class B
  B() {
    System.out.println("Default Constructor of Class B");
  }
}

class C extends B {

  C() {
    System.out.println("Constructor of Class C");
  }
}

public class constructor {

  public static void main(String[] args) {
    // Creating an object of Class C

    C obj1 = new C();
  }
}
