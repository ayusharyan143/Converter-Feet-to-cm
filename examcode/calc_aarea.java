package examcode;

class shape {

  public double calculateArea() {
    return 0;
  }
}

class rectangle extends shape {

  private int l;
  private int w;

  public rectangle(int l, int w) {
    this.l = l;
    this.w = w;
  }

  // Overloaded method to calculate area for rectangle

  public double calculateArea(int l, int w) {
    return l * w;
  }

  // Overridden method to calculate area inherited from Shape

  @Override
  public double calculateArea() {
    return l * w;
  }
}

public class calc_aarea {

  public static void main(String[] args) {
    rectangle objR = new rectangle(5, 4);

    double area1 = objR.calculateArea(5, 4);
    System.out.println("Area using overloaded method: " + area1);

    // Calling overridden method to calculate area
    double area2 = objR.calculateArea();
    System.out.println("Area using overridden method: " + area2);
  }
}
