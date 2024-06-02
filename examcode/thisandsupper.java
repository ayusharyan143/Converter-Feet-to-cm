package examcode;

class Animal {

  private String color;

  public Animal(String color) {
    this.color = color;
  }

  public void displaycolor() {
    System.out.println("Color : " + color);
  }
}

class Dog extends Animal {

  private String breed;

  public Dog(String breed, String color) {
    super(color);
    this.breed = breed;
  }

  public void displaybreed() {
    System.out.println("Breed : " + breed);
  }
}

public class thisandsupper {

  public static void main(String[] args) {
    Dog obj = new Dog("German", "Brown");
    obj.displaycolor();
    obj.displaybreed();
  }
}
