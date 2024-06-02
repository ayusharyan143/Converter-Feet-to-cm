package examcode;

// Interface definition
interface Animal {
  void sound();
}

// Class implementing the Animal interface
class Dog implements Animal {

  // Implementation of sound method
  public void sound() {
    System.out.println("Dog barks");
  }
}

// Another class implementing the Animal interface
class Cat implements Animal {

  // Implementation of sound method
  public void sound() {
    System.out.println("Cat meows");
  }
}

public class interfaceexample {

  public static void main(String[] args) {
    // Create objects of Dog and Cat
    Dog dog = new Dog();
    Cat cat = new Cat();

    // Call sound method of Dog and Cat
    dog.sound();
    cat.sound();
  }
}
