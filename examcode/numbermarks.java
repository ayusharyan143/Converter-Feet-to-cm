package examcode;

public class numbermarks {

  public static void main(String[] args) {
    int[] marks = {
      85,
      110,
      98,
      87,
      99,
      92,
      93,
      96,
      45,
      75,
      25,
      130,
      95,
      60,
      40,
      100,
      30,
      50,
      34,
      2,
      32,
      43,
    };
    int n = marks.length;

    int range1 = 0, range2 = 0, range3 = 0, range4 = 0, range5 = 0;

    for (int i = 0; i < n; i++) {
      if (marks[i] >= 101 && marks[i] <= 150) {
        range1++;
      } else if (marks[i] >= 81 && marks[i] <= 100) {
        range2++;
      } else if (marks[i] >= 51 && marks[i] <= 80) {
        range3++;
      } else if (marks[i] >= 31 && marks[i] <= 50) {
        range4++;
      } else if (marks[i] >= 0 && marks[i] <= 30) {
        range5++;
      }
    }

    System.out.println(
      "Number of students in the range 101 to 150:   " + range1
    );
    System.out.println(
      "Number of students in the range 81 to 100:    " + range2
    );
    System.out.println(
      "Number of students in the range 51 to 80:     " + range3
    );
    System.out.println(
      "Number of students in the range 31 to 50:     " + range4
    );
    System.out.println(
      "Number of students in the range 0 to 30:      " + range5
    );
  }
}
