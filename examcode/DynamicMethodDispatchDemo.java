package examcode;

class animal {

  public void makesound() {
    System.out.println("Some Generic sound");
  }
}

class dog extends animal {

  @Override
  public void makesound() {
    System.out.println("Dog sounds...");
  }
}

class cat extends animal {

  @Override
  public void makesound() {
    System.out.println("cat sound .............");
  }
}

public class DynamicMethodDispatchDemo {

  public static void main(String[] args) {
    animal obj1 = new dog();
    animal obj2 = new cat();

    obj1.makesound();
    obj2.makesound();
  }
}
