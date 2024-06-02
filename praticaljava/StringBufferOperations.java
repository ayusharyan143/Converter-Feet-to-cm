package praticaljava;

public class StringBufferOperations {

  public static void main(String[] args) {
    System.out.println(
      "\n\nName : Ayush Aryan \nCourse : B.TECH CSE\nRoll No. : 22\nSection : G2 \nSemester : 4th\n\n\nOUTPUT : \n"
    );

    StringBuffer stringBuffer = new StringBuffer("HELLO");

    // (i) Append "Java"
    stringBuffer.append("Java");
    System.out.println("(i) After appending \"Java\": " + stringBuffer);

    // (ii) Insert "Java" at index 1
    stringBuffer.insert(1, "Java");
    System.out.println(
      "(ii) After inserting \"Java\" at index 1: " + stringBuffer
    );

    // (iii) Replace "Java" with characters between index 1 to 2
    stringBuffer.replace(1, 3, "Java");
    System.out.println(
      "(iii) After replacing with \"Java\" between index 1 to 2: " +
      stringBuffer
    );

    // (iv) Delete characters between index 1 and 2
    stringBuffer.delete(1, 3);
    System.out.println(
      "(iv) After deleting characters between index 1 and 2: " + stringBuffer
    );

    // (v) Reverse the string
    stringBuffer.reverse();
    System.out.println("(v) Reversed string: " + stringBuffer);
  }
}
