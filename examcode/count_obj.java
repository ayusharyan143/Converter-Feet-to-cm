package examcode;

class ObjectCounter {

  private int count = 0;

  public ObjectCounter() {
    count++;
  }

  public void show() {
    System.out.println("Total No.  of object : " + count);
  }
}

public class count_obj {

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    ObjectCounter obj1 = new ObjectCounter();
    ObjectCounter obj2 = new ObjectCounter();
    ObjectCounter obj3 = new ObjectCounter();
    ObjectCounter obj4 = new ObjectCounter();
    ObjectCounter obj5 = new ObjectCounter();
    ObjectCounter obj6 = new ObjectCounter();
    ObjectCounter obj7 = new ObjectCounter();
    ObjectCounter obj8 = new ObjectCounter();
    ObjectCounter obj9 = new ObjectCounter();

    obj9.show();
  }
}
