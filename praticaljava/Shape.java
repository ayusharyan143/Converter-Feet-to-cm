package praticaljava;

public class Shape {

  // Method to calculate area for general shapes (default implementation)
  public double area() {
    return 0.0; // Default implementation returns 0 for unknown shapes
  }

  // Method to calculate area for a triangle
  public double area(double base, double height) {
    return 0.5 * base * height;
  }

  // Method to calculate area for a rectangle
  public double areaRectangle(double length, double width) {
    return length * width;
  }

  // Method to calculate area for a circle
  public double area(double radius) {
    return Math.PI * radius * radius;
  }

  // Main method for testing
  public static void main(String[] args) {
    System.out.println(
      "\n\nName : Ayush Aryan \nCourse : B.TECH CSE\nRoll No. : 22\nSection : G2 \nSemester : 4th\n\n\nOUTPUT : \n"
    );
    Shape shape = new Shape();

    // Calculate area for a triangle
    double triangleArea = shape.area(5, 7);
    System.out.println("Area of the triangle: " + triangleArea);

    // Calculate area for a rectangle
    double rectangleArea = shape.areaRectangle(4, 6);
    System.out.println("Area of the rectangle: " + rectangleArea);

    // Calculate area for a circle
    double circleArea = shape.area(3);
    System.out.println("Area of the circle: " + circleArea);
  }
}
