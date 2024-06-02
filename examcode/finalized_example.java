package examcode;

class FinalizedExample {

  public FinalizedExample() {
    System.out.println("Object created.");
  }

  // Finalizer method
  protected void finalize() {
    System.out.println("Object finalized.");
  }
}

public class finalized_example {

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    FinalizedExample obj = new FinalizedExample();

    // Nullifying reference to the object
    obj = null;

    // Triggering garbage collection
    System.gc();

    System.out.println("End of main method.");
  }
}
