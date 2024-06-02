package praticaljava;

class Shape {

  // Method to calculate the area of a triangle

  public double areaTriangle(double h, double base, double height) {
    return 0.5 * h * base * height;
  }

  // Method to calculate the area of a rectangle

  public double areaRectangle(double length, double width) {
    return length * width;
  }

  // Method to calculate the area of a circle

  public double areaCircle(double radius) {
    return Math.PI * radius * radius;
  }
}

public class over {

  public static void main(String[] args) {
    Shape shape = new Shape();

    System.out.println("Area of Triangle: " + shape.areaTriangle(0.5, 5, 7)); // Triangle

    System.out.println("Area of Rectangle: " + shape.areaRectangle(4, 6)); // Rectangle

    System.out.println("Area of Circle: " + shape.areaCircle(3));
  }
}
