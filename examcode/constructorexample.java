package examcode;

class Person {

  private String name = "Ayush";
  private int age = 20;

  public Person() {
    System.out.println("Name of Person : " + name);
    System.out.println("Age of Person : " + age);
  }
}

public class constructorexample {

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    Person obj = new Person();
  }
}
