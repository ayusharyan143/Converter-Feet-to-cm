package examcode;

class myclass {

  protected void finalize() {
    System.out.println("Object Garbage Colleted");
  }
}

public class garbage_demo {

  public static void main(String[] args) {
    myclass obj1 = new myclass();
    myclass obj2 = new myclass();

    obj1 = null;

    System.gc();
  }
}
