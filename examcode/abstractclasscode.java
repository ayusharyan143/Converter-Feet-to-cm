package examcode;

abstract class MyAbstract {

  public MyAbstract() {
    System.out.println("This is a constructor of abstract class");
  }

  // Abstract Method
  abstract void amethod();

  // Non - Abstract Method
  public void normalMethod() {
    System.out.println("This is a normal method of abstract class");
  }
}

class mySubclass extends MyAbstract {

  @Override
  void amethod() {
    System.out.println("This is an abstract Method ");
  }
}

public class abstractclasscode {

  public static void main(String[] args) {
    MyAbstract obj = new mySubclass();

    obj.amethod();
    obj.normalMethod();
  }
}
