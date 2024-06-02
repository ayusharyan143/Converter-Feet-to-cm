package praticaljava;

public class Student11 {

  private int ID;
  private String name;
  private String branch;
  private String city;
  private String university;

  // Constructor with one argument
  public Student11(int ID) {
    this(ID, "", "", "", "");
  }

  // Constructor with two arguments
  public Student11(int ID, String name) {
    this(ID, name, "", "", "");
  }

  // Constructor with three arguments
  public Student11(int ID, String name, String branch) {
    this(ID, name, branch, "", "");
  }

  // Constructor with four arguments
  public Student11(int ID, String name, String branch, String city) {
    this(ID, name, branch, city, "");
  }

  // Constructor with five arguments
  public Student11(
    int ID,
    String name,
    String branch,
    String city,
    String university
  ) {
    this.ID = ID;
    this.name = name;
    this.branch = branch;
    this.city = city;
    this.university = university;
  }

  // Method to display Student11 details
  public void displayDetails() {
    System.out.println("Student11 ID: " + ID);
    System.out.println("Name: " + name);
    System.out.println("Branch: " + branch);
    System.out.println("City: " + city);
    System.out.println("University: " + university);
  }

  // Main method for testing
  public static void main(String[] args) {
    System.out.println(
      "\n\nName : Ayush Aryan \nCourse : B.TECH CSE\nRoll No. : 22\nSection : G2 \nSemester : 4th\n\n\nOUTPUT : \n"
    );
    // Creating objects using different constructors
    Student11 Student111 = new Student11(1);
    Student11 Student112 = new Student11(2, "John");
    Student11 Student113 = new Student11(3, "Alice", "Computer Science");
    Student11 Student114 = new Student11(4, "Bob", "Electrical", "New York");
    Student11 Student115 = new Student11(
      5,
      "Emily",
      "Mechanical",
      "Los Angeles",
      "ABC University"
    );

    // Displaying Student11 details
    Student111.displayDetails();
    Student112.displayDetails();
    Student113.displayDetails();
    Student114.displayDetails();
    Student115.displayDetails();
  }
}
