// Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
// APCS pd7
// HW81 -- Thank You, Next / Iterator interface
// 2022-03-25f
// time spent: 0.5 hr

/***
 * class ItrWork
 *  SKELETON
 * Facilitates familiarization with iterators
 **/

/***
    DISCO
    - "incompatible types: String cannot be converted to List<Integer>"
      Can't just make a String that contains the specified numbers...
      so we use ArrayList.
    - Can't just assign Integer temp to be it.next() as they are incompatible
      types: Object and Integer.
    - A way to go about this is by making the iterator of Integer.
    - Iteration<Integer> helped when creating a temp and assigning it the next
      value of the list.

    QCC
    - How are Set and Map similar or different to List?
    - Be mindful of the angle brackets -- implement when necessary!
    - ArrayList includes methods that prove to be helpful...
    - In what circumstances would we prefer to use String or ArrayList?

    SUMMARY THE FIRST:
    - Useful for obtaining elements in a Set, List, or Map.
    - Using the next() method, the list can return its 'cdr'.
    - The hasNext() method can tell us if we have something after the element.
      This prevents IndexOutOfBounds errors.
    - Iterators are useful for checking elements after a certain index.

    SUMMARY THE SECOND:
    - As of now, we can go about obtaining elements through FOREACH loops and
      iterators.
    - What to remember for iterators: hasNext(), next(), and remove() that all
      don't have params.
**/




import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ItrWork
{

  //using FOREACH loop
  //returns a boolean to indicate whether key is present in L
  public static boolean foundA( Integer key,
                                List<Integer> L )
  {
    for (Integer work : L) {
      if (work.equals(key)) {
        return true;
      }
    }
    return false;
  }

  //explicitly using an iterator
  //returns a boolean to indicate whether key is present in L
  public static boolean foundB( Integer key,
                                List<Integer> L )
  {
    Iterator it = L.iterator();
    while (it.hasNext()) {
      if (it.next().equals(key)) {
        return true;
      }
    }
    return false;
  }

  //using FOREACH loop
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsA( List<Integer> L )
  {
    List<Integer> ret = new ArrayList<Integer>();
    for (Integer work : L) {
      if (work % 2 != 0) {
        ret.add(work);
      }
    }
    return ret;
  }

  //explicitly using an iterator
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsB( List<Integer> L )
  {
    List<Integer> ret = new ArrayList<Integer>();
    Iterator<Integer> it = L.iterator();
    while (it.hasNext()) {
      Integer temp = it.next();
      if (temp % 2 != 0) {
        ret.add(temp); //can't just put it.next() here as it would get the next element
      }
    }
    return ret;
  }


  //explicitly using an iterator
  //modifies L s.t. it contains no evens
  public static void removeEvens( List<Integer> L )
  {
    Iterator<Integer> it = L.iterator();
    while (it.hasNext()) {
      if (it.next() % 2 == 0) {
        it.remove();
      }
    }
  }


  public static void main( String [] args )
  {

    //var type: List   obj type: ?
    List<Integer> L = new ArrayList<Integer>();

    for( int i = 0; i < 10; i++ )
      L.add(i);


    // TASK: write code to print the contents of L...

    // a) using a FOREACH loop
    for (Integer work : L) {
      System.out.println(work);
    }

    // b) explicitly using an iterator
    Iterator it = L.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }

    System.out.println("\nTesting foundA...");
    System.out.println("9 in L? -> " + foundA(9,L) );
    System.out.println("13 in L? -> " + foundA(13,L) );

    System.out.println("\nTesting foundB...");
    System.out.println("9 in L? -> " + foundB(9,L) );
    System.out.println("13 in L? -> " + foundB(13,L) );

    System.out.println("\nTesting oddsA...");
    List<Integer> A = oddsA(L);
    for( int n : A ) System.out.println(n);

    System.out.println("\nTesting oddsB...");
    List<Integer> B = oddsB(L);
    for( int n : B ) System.out.println(n);

    System.out.println("\nTesting removeEvens...");
    removeEvens(L);
    for( int n : L ) System.out.println(n);
    /*~~~~~~~~~~~~~~~m~o~v~e~~m~e~~d~o~w~n~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//end main

}//end class ItrWork

