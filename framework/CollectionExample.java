package framework;

import java.util.*;;

public class CollectionExample {

  public static void main(String[] args) {
    // ArrayList example
    List<String> arrayList = new ArrayList<>();
    arrayList.add("Java");
    arrayList.add("Python");

    // LinkedList example
    List<String> linkedList = new LinkedList<>();
    linkedList.add("Java");
    linkedList.add("Python");

    // HashSet example
    Set<String> hashSet = new HashSet<>();
    hashSet.add("Java");
    hashSet.add("Python");

    // ArrayDeque example
    Deque<String> arrayDeque = new ArrayDeque<>();
    arrayDeque.add("Java");
    arrayDeque.addFirst("Python");
    arrayDeque.addLast("C++");

    // Iterator example
    Iterator<String> iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      String element = iterator.next();
      System.out.println(element);
    }
  }
}
