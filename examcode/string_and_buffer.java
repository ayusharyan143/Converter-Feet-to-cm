package examcode;

public class string_and_buffer {

  public static void main(String[] args) {
    String str1 = "";
    long startTime = System.nanoTime();

    for (int i = 0; i < 10000; i++) {
      str1 += "a";
    }

    long endTime = System.nanoTime();

    System.out.println(
      "Time taken for simple concatenation: " +
      (endTime - startTime) +
      " nanoseconds"
    );

    StringBuffer str2 = new StringBuffer();

    startTime = System.nanoTime();

    for (int i = 0; i < 10000; i++) {
      str2.append("a");
    }

    endTime = System.nanoTime();
    System.out.println(
      "Time taken for stringBuffer append :  " +
      (endTime - startTime) +
      " nanoseconds"
    );
  }
}
