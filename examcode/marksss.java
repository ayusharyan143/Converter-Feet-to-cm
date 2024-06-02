package examcode;

public class marksss {

  public static void main(String[] args) {
    int[] marks = { 98, 75, 120, 40, 55, 85, 25, 110, 30, 70, 105 };

    // Array to store the count of students in each range
    int[] count = new int[5];

    // Iterate through the marks and calculate the range index
    for (int mark : marks) {
      int rangeIndex = mark / 31; // Calculate the range index directly

      // Adjust range index for marks > 150
      if (rangeIndex > 4) {
        rangeIndex = 4;
      }
      count[rangeIndex]++;
    }
    // Print the count of students in each range
    System.out.println("Number of students in the range 101-150: " + count[3]);
    System.out.println("Number of students in the range 81-100: " + count[2]);
    System.out.println("Number of students in the range 51-80: " + count[1]);
    System.out.println("Number of students in the range 31-50: " + count[0]);
    System.out.println("Number of students in the range 0-30: " + count[4]); // Corrected index
  }
}
