package examcode;

class Shape {

  public double calcarea() {
    return 0;
  }
}

class Rectanglee extends Shape {

  private double l;
  private double w;

  public Rectanglee(double l, double w) {
    this.l = l;
    this.w = w;
  }

  // overload
  public double calcarea(double l, double w) {
    return l * w;
  }

  //override
  @Override
  public double calcarea() {
    return l * w;
  }
}

public class aaera {

  public static void main(String[] args) {
    Rectanglee obj = new Rectanglee(4, 5);
    double area1 = obj.calcarea(2, 2);
    System.out.println(area1);

    double area2 = obj.calcarea();
    System.out.println(area2);
  }
}
