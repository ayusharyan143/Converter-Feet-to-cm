package examcode;

import java.util.Scanner;

class voteExample {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Arrays to store candidate names and votes

    String[] candidates = new String[5];
    int[] vote = new int[5];

    for (int i = 0; i < 5; i++) {
      System.out.print("Enter Name of Candidates " + (i + 1) + " : ");
      candidates[i] = sc.nextLine();

      System.out.print(
        "Enter Vote Recived by Candidates " + candidates[i] + " : "
      );
      vote[i] = sc.nextInt();

      sc.nextLine();
    }

    // display

    for (int i = 0; i < 5; i++) {
      System.out.println(candidates[i] + " : " + vote[i]);
    }

    sc.close();
  }
}
