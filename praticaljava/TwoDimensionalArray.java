package praticaljava;

import java.util.Scanner;

public class TwoDimensionalArray {

  public static void main(String[] args) {
    System.out.println(
      "\n\nName : Ayush Aryan \nCourse : B.TECH CSE\nRoll No. : 22\nSection : G2 \nSemester : 4th\n\n\nOUTPUT : \n"
    );
    Scanner scanner = new Scanner(System.in);

    // Ask the user for the dimensions of the array
    System.out.print("Enter the number of rows: ");
    int rows = scanner.nextInt();
    System.out.print("Enter the number of columns: ");
    int cols = scanner.nextInt();

    // Create the 2D array with the specified dimensions
    int[][] array = new int[rows][cols];

    // Insert data into the array
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        array[i][j] = scanner.nextInt();
      }
    }

    // Display the array
    System.out.println("Array elements:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }

    // Search for a specific value in the array
    System.out.print("Enter the value to search for: ");
    int searchValue = scanner.nextInt();
    boolean found = false;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (array[i][j] == searchValue) {
          System.out.println(
            "Value " + searchValue + " found at position (" + i + ", " + j + ")"
          );
          found = true;
        }
      }
    }
    if (!found) {
      System.out.println("Value " + searchValue + " not found in the array.");
    }

    scanner.close();
  }
}
