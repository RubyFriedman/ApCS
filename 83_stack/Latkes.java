// Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
// APCS pd7
// HW83 -- Stacks on Stacks / first Stacks assignment
// 2022-03-29t
// time spent: 0.5 hr

/***
 * class Latkes
 * v1
 * SKELETON
 * Implements a stack of Strings using an encapsulated array
 **/

/***
    DISCO
    - The method pop() has a return type of String and not String{}... some alterations
      were made to guarantee compatibility
    QCC
    - We utlized temp String[] (for push) and String (for pull).
    - Be wareful or which line you decrement and increment stackSize.
 **/


public class Latkes
{
  private String [] _stack;
  private int _stackSize;


  //constructor
  public Latkes( int initCapacity )
  {
    _stack = new String[initCapacity];
    _stackSize = 0;
  }// O(1)


  //means of insertion
  public void push( String s )
  {
    _stackSize++;
    if (isFull()) {
      return;
    }
    String[] temp = new String[ _stackSize];
    temp[0] = s;
    for( int i = 1; i < _stackSize; i++ ) {
      temp[i] = _stack[i-1];
    }
    _stack = temp;
  }// O(n)


  //means of removal
  public String pop( )
  {
    if (isEmpty()) {
      return "Stack is empty. Cannot perform pop.";
    }
    String temp = _stack[0];
    for ( int i = 0; i <_stackSize; i++ ) {
      if (i == _stackSize - 1) {
        _stack[i] = null;
      }
      else {
        _stack[i] = _stack[i+1];
      }
    }
    _stackSize--;
    return temp;
  }// O(n)


  //chk for emptiness
  public boolean isEmpty()
  {
    return (_stackSize == 0);
  }// O(1)


  //chk for fullness
  public boolean isFull()
  {
    return (_stackSize == _stack.length);
  }// O(1)


  //main method for testing
  public static void main( String[] args )
  {

    Latkes tastyStack = new Latkes(10);

    tastyStack.push("aoo");
    tastyStack.push("boo");
    tastyStack.push("coo");
    tastyStack.push("doo");
    tastyStack.push("eoo");
    tastyStack.push("foo");
    tastyStack.push("goo");
    tastyStack.push("hoo");
    tastyStack.push("ioo");
    tastyStack.push("joo");
    tastyStack.push("coocoo");
    tastyStack.push("cachoo");

    //cachoo
    System.out.println( tastyStack.pop() );
    //coocoo
    System.out.println( tastyStack.pop() );
    //joo
    System.out.println( tastyStack.pop() );
    //ioo
    System.out.println( tastyStack.pop() );
    //hoo
    System.out.println( tastyStack.pop() );
    //goo
    System.out.println( tastyStack.pop() );
    //foo
    System.out.println( tastyStack.pop() );
    //eoo
    System.out.println( tastyStack.pop() );
    //doo
    System.out.println( tastyStack.pop() );
    //coo
    System.out.println( tastyStack.pop() );
    //boo
    System.out.println( tastyStack.pop() );
    //aoo
    System.out.println( tastyStack.pop() );

    //stack empty by now; SOP(null)
    System.out.println( tastyStack.pop() );

    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main()

}//end class Latkes
