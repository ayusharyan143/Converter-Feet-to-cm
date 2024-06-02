package praticaljava;

import java.util.Scanner;

public class JaggedArray {

  public static void main(String[] args) {
    System.out.println(
      "\n\nName : Ayush Aryan \nCourse : B.TECH CSE\nRoll No. : 22\nSection : G2 \nSemester : 4th\n\n\nOUTPUT : \n"
    );
    // Define the jagged array
    int[][] jaggedArray = new int[3][];

    // Specify the number of columns for each row
    jaggedArray[0] = new int[3]; // 1st row with 3 columns
    jaggedArray[1] = new int[4]; // 2nd row with 4 columns
    jaggedArray[2] = new int[2]; // 3rd row with 2 columns

    // Insert data into the array
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < jaggedArray.length; i++) {
      System.out.println(
        "Enter " + jaggedArray[i].length + " elements for row " + (i + 1) + ":"
      );
      for (int j = 0; j < jaggedArray[i].length; j++) {
        jaggedArray[i][j] = scanner.nextInt();
      }
    }

    // Traverse and display the jagged array
    System.out.println("Jagged Array elements:");
    for (int i = 0; i < jaggedArray.length; i++) {
      System.out.print("Row " + (i + 1) + ": ");
      for (int j = 0; j < jaggedArray[i].length; j++) {
        System.out.print(jaggedArray[i][j] + " ");
      }
      System.out.println();
    }

    scanner.close();
  }
}
