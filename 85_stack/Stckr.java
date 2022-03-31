// Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
// APCS pd7
// HW85 -- Leon Leonwood Stack / Stack but with ArrayList and Linked List
// 2022-03-31r
// time spent: 0.5 hr

/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
  public static void main( String[] args )
    {

      //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      // USAGE: un-comment exactly 1 assignment below
      //Stack<String> cakes = new ALStack<String>();
      Stack<String> cakes = new LLStack<String>();
      cakes.push("5");
      cakes.push("9");
      cakes.push("2");
      cakes.push("4");
      cakes.push("awrojawr");
      cakes.push("/");
      System.out.println(cakes.pop());
      System.out.println(cakes.isEmpty());
      System.out.println(cakes.peekTop());
      //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

      //...

    }//end main

}//end class
