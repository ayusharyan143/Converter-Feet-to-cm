package praticaljava;

abstract class Animal {

  private String name;

  public Animal(String name) {
    this.name = name;
  }

  public abstract void makeSound();

  public String getName() {
    return name;
  }

  public void eat() {
    System.out.println(getName() + " is eating food");
  }
}

class Dog extends Animal {

  public Dog(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println(getName() + " says: Bark");
  }
}

class Cat extends Animal {

  public Cat(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println(getName() + " says: Meow");
  }
}

public class abstractanimal {

  public static void main(String[] args) {
    Dog dog = new Dog("Buddy");
    dog.makeSound();
    dog.eat();

    Animal cat = new Cat("Whiskers");
    cat.makeSound();
    cat.eat();
  }
}
