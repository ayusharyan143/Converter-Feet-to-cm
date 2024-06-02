package examcode;

public class checkstringbudderfast {

  public static void main(String[] args) {
    long starrTime = System.nanoTime();

    String str1 = "";

    for (int i = 0; i < 1000; i++) {
      str1 += "a";
    }

    long endTime = System.nanoTime();

    System.out.println(
      "Time Taken for simple concat : " + (endTime - starrTime) + "ms"
    );

    StringBuffer str2 = new StringBuffer();

    starrTime = System.nanoTime();

    for (int i = 0; i < 1000; i++) {
      str2.append("a");
    }

    endTime = System.nanoTime();

    System.out.println(
      "Time Taken for Buffer string  concat : " + (endTime - starrTime) + "ms"
    );
  }
}
