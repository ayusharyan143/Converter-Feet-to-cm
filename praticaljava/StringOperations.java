package praticaljava;

public class StringOperations {

  public static void main(String[] args) {
    System.out.println(
      "\n\nName : Ayush Aryan \nCourse : B.TECH CSE\nRoll No. : 22\nSection : G2 \nSemester : 4th\n\n\nOUTPUT : \n"
    );

    String str = "Java";

    // (i) Concatenation
    String concatStr = str.concat("Welcome");
    System.out.println("(i) Concatenated String: " + concatStr);

    // (ii) Character at index 1
    char charAtIndex1 = str.charAt(1);
    System.out.println("(ii) Character at index 1: " + charAtIndex1);

    // (iii) Index of first 'a'
    int indexOfA = str.indexOf('a');
    System.out.println("(iii) Index of first 'a': " + indexOfA);

    // (iv) Index of second 'a'
    int secondIndexOfA = str.indexOf('a', indexOfA + 1);
    System.out.println("(iv) Index of second 'a': " + secondIndexOfA);

    // (v) Comparison with "JAVA"
    boolean isEqual = str.equals("JAVA");
    System.out.println("(v) Comparison with \"JAVA\": " + isEqual);

    // (vi) Comparison with "JAVA" ignoring case
    boolean isEqualIgnoreCase = str.equalsIgnoreCase("JAVA");
    System.out.println(
      "(vi) Comparison with \"JAVA\" ignoring case: " + isEqualIgnoreCase
    );

    // (vii) Index of first 'a' from last
    int lastIndexofA = str.lastIndexOf('a');
    System.out.println("(vii) Index of first 'a' from last: " + lastIndexofA);
  }
}
