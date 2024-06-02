package praticaljava;

import java.util.Scanner;

public class ExaminationResults {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(
      "\n\nName : Ayush Aryan \nCourse : B.TECH CSE\nRoll No. : 22\nSection : G2 \nSemester : 4th\n\n\nOUTPUT : \n"
    );

    // Initialize variables to store highest marks and corresponding roll numbers
    int highestSubject1 = Integer.MIN_VALUE;
    int highestSubject2 = Integer.MIN_VALUE;
    int highestSubject3 = Integer.MIN_VALUE;
    int highestTotalMarks = Integer.MIN_VALUE;
    int rollNoHighestSubject1 = -1;
    int rollNoHighestSubject2 = -1;
    int rollNoHighestSubject3 = -1;
    int rollNoHighestTotalMarks = -1;

    // Initialize variables to store total marks for each student
    int[] totalMarks = new int[2];

    // Input data and calculate total marks for each student
    for (int i = 0; i < 2; i++) {
      System.out.println("Enter data for student " + (i + 1) + ":");
      int rollNo = i + 1;
      System.out.print("Subject 1 marks: ");
      int subject1 = scanner.nextInt();
      System.out.print("Subject 2 marks: ");
      int subject2 = scanner.nextInt();
      System.out.print("Subject 3 marks: ");
      int subject3 = scanner.nextInt();

      // Calculate total marks for the student
      totalMarks[i] = subject1 + subject2 + subject3;

      // Update highest marks and corresponding roll numbers for each subject
      if (subject1 > highestSubject1) {
        highestSubject1 = subject1;
        rollNoHighestSubject1 = rollNo;
      }
      if (subject2 > highestSubject2) {
        highestSubject2 = subject2;
        rollNoHighestSubject2 = rollNo;
      }
      if (subject3 > highestSubject3) {
        highestSubject3 = subject3;
        rollNoHighestSubject3 = rollNo;
      }

      // Update highest total marks and corresponding roll number
      if (totalMarks[i] > highestTotalMarks) {
        highestTotalMarks = totalMarks[i];
        rollNoHighestTotalMarks = rollNo;
      }
    }

    // Output total marks obtained by each student
    System.out.println("\nTotal marks obtained by each student:");
    for (int i = 0; i < 2; i++) {
      System.out.println("Student " + (i + 1) + ": " + totalMarks[i]);
    }

    // Output highest marks in each subject and corresponding roll numbers
    System.out.println("\nHighest marks in each subject:");
    System.out.println(
      "Subject 1: " +
      highestSubject1 +
      " (Student " +
      rollNoHighestSubject1 +
      ")"
    );
    System.out.println(
      "Subject 2: " +
      highestSubject2 +
      " (Student " +
      rollNoHighestSubject2 +
      ")"
    );
    System.out.println(
      "Subject 3: " +
      highestSubject3 +
      " (Student " +
      rollNoHighestSubject3 +
      ")"
    );

    // Output student who obtained the highest total marks
    System.out.println("\nStudent who obtained the highest total marks:");
    System.out.println(
      "Student " +
      rollNoHighestTotalMarks +
      " with total marks: " +
      highestTotalMarks
    );

    scanner.close();
  }
}
