package praticaljava;

public class student {

  // Instance variables
  private int ID;
  private String name;
  private String branch;
  private String university;

  // Method to set details
  public void setDetails(
    int ID,
    String name,
    String branch,
    String university
  ) {
    this.ID = ID;
    this.name = name;
    this.branch = branch;
    this.university = university;
  }

  // Method to display details
  public void showDetails() {
    System.out.println("Student ID: " + ID);
    System.out.println("Name: " + name);
    System.out.println("Branch: " + branch);
    System.out.println("University: " + university);
  }

  public static void main(String[] args) {
    System.out.println(
      "\n\nName : Ayush Aryan \nCourse : B.TECH CSE\nRoll No. : 22\nSection : G2 \nSemester : 4th\n\n\nOUTPUT : \n"
    );
    // Create a Student object
    student student1 = new student();

    // Set details using setDetails() method
    student1.setDetails(
      123,
      "Ayush Aryan ",
      "Computer Science",
      "Graphic Era Hill University"
    );

    // Display details using showDetails() method
    System.out.println("Student Details:");
    student1.showDetails();
  }
}
