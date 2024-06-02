package examcode;

abstract class superclass {

  public superclass() {
    System.out.println("This is constructor of super class ");
  }

  abstract void amethod();

  public void bmethod() {
    System.out.println("Here  method B called");
  }
}

class subclass extends superclass {

  public void amethod() {
    System.out.println("Here method A called");
  }
}

public class abstracttt {

  public static void main(String[] args) {
    subclass obj = new subclass();

    obj.amethod();
    obj.bmethod();
  }
}
