import java.util.ArrayList;
public class Driver {
  public static void main(String[] args) {
    System.out.println(ArrayListPractice.createRandomArray(2));
    ArrayList<String> test1 =ArrayListPractice.createRandomArray(100);
    ArrayListPractice.replaceEmpty(test1);
    System.out.println(test1);
    System.out.println(ArrayListPractice.makeReversedList(test1));
    ArrayList<String> listA = new ArrayList<>();
    listA.add("A");
    listA.add("C");
    listA.add("E");
    ArrayList<String> listB = new ArrayList<>();
    listB.add("B");
    listB.add("D");
    listB.add("F");
    listB.add("G");
    System.out.println(ArrayListPractice.mixLists(listA, listB));
  }
}
