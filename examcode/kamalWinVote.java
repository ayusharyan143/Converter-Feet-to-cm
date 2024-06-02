package examcode;

import java.util.Scanner;

public class kamalWinVote {

  public static void main(String[] agrs) {
    Scanner sc = new Scanner(System.in);

    String[] candidates = new String[5];
    int[] vote = new int[5];

    for (int i = 0; i < 5; i++) {
      System.out.print("Enter name of candidate " + (i + 1) + " : ");
      candidates[i] = sc.nextLine();

      System.out.print("Enter vote received  " + (i + 1) + " : ");
      vote[i] = sc.nextInt();

      sc.nextLine();
    }

    int totalvote = 0;

    for (int i = 0; i < 5; i++) {
      totalvote += vote[i];
    }

    double maxpercentage = 0;
    String winner = "";

    System.out.println("Candidate\tvote\t percentage");
    for (int i = 0; i < 5; i++) {
      double perc = ((double) vote[i] / totalvote) * 100;

      System.out.printf("%s\t\t%d\t\t%.2f%%\n", candidates[i], vote[i], perc);

      if (perc > maxpercentage) {
        maxpercentage = perc;
        winner = candidates[i];
      }
    }
    System.out.println("The winneer of election : " + winner);

    sc.close();
  }
}
