/*
Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
APCS pd7
HW91 -- Deque the Halls / double ended queue
2022-04-14r
time spent: 0.5 hrs
*/

public class MRKPirateBae {

  public static void main(String[] args) {
    Deque<String> testStr = new QQKachoo<String>();
    System.out.println("Testing with Strings... ");
    testStr.addFirst("this");
    testStr.addLast("work");
    testStr.addFirst("does");
    testStr.addLast("?");
    System.out.println("The first element: " + testStr.peekFirst());
    System.out.println("The last element: " + testStr.peekLast());
    System.out.println("The size: " + testStr.size());
    System.out.println("Does this contain the word does? " + testStr.contains("does"));
    System.out.println("Does this contain the word homework? " + testStr.contains("homework"));
    System.out.println(testStr.removeFirst());
    System.out.println(testStr.removeLast());
    System.out.println(testStr.removeFirst());
    System.out.println(testStr.removeLast());
    System.out.println("Is it empty? " + testStr.isEmpty());

    System.out.println("---------------------------------");

    Deque<Integer> testInt = new QQKachoo<Integer>();
    System.out.println("Testing with Integers... ");
    testInt.addFirst(2);
    testInt.addLast(4);
    testInt.addFirst(0);
    testInt.addLast(6);
    System.out.println("The first element: " + testInt.peekFirst());
    System.out.println("The last element: " + testInt.peekLast());
    System.out.println("The size: " + testInt.size());
    System.out.println("Does this contain the number 6? " + testInt.contains(6));
    System.out.println("Does this contain the number 1? " + testInt.contains(1));
    System.out.println(testInt.removeFirst());
    System.out.println(testInt.removeLast());
    System.out.println(testInt.removeFirst());
    System.out.println(testInt.removeLast());
    System.out.println("Is it empty? " + testInt.isEmpty());

    System.out.println("---------------------------------");

    Deque<Object> testObj = new QQKachoo<Object>();
    System.out.println("Testing with Objects... ");
    testObj.addFirst('z');
    testObj.addLast(false);
    testObj.addFirst(72194);
    testObj.addLast('b');
    System.out.println("The first element: " + testObj.peekFirst());
    System.out.println("The last element: " + testObj.peekLast());
    System.out.println("The size: " + testObj.size());
    System.out.println("Does this contain the character b? " + testObj.contains('b'));
    System.out.println("Does this contain the character f " + testObj.contains('f'));
    System.out.println(testObj.removeFirst());
    System.out.println(testObj.removeLast());
    System.out.println(testObj.removeFirst());
    System.out.println(testObj.removeLast());
    System.out.println("Is it empty? " + testObj.isEmpty());

    System.out.println("---------------------------------");

    Deque<Character> testChar = new QQKachoo<Character>();
    System.out.println("Testing with Characters... ");
    testChar.iterator();
    testChar.addFirst('z');
    testChar.addLast('b');
    testChar.addFirst('k');
    testChar.addLast('b');
    testChar.addFirst('k');
    testChar.addLast('v');
    testChar.addFirst('l');
    testChar.addLast('b');
    testChar.addFirst('c');
    testChar.addLast('t');
    
    System.out.println(testChar.removeFirstOccurrence('b'));
    System.out.println(testChar.removeLastOccurrence('b'));
    System.out.println(testChar.iterator());
  }

}
