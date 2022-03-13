/***
  Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
  APCS pd7
  HW75 -- Nodal Recall
  2022-03-14m
  time spent: 0.5 hr

 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 **/

public class LLNode
{
  //instance vars
  private String cargo;
  private LLNode nextt;

  // constructor
  public LLNode( String value, LLNode next )
  {
    cargo = value;
    nextt = next;
  }


  //--------------v  ACCESSORS  v--------------
  public String getCargo()
  {
    return cargo;
  }

  public LLNode getNext()
  {
    return nextt;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public String setCargo( String newCargo )
  {
    cargo = newCargo;
    return cargo;
  }

  public LLNode setNext( LLNode newNext )
  {
    nextt = newNext;
    return nextt;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    String foo = "(";
    foo += cargo + " " + nextt + ")";
    return foo;
  }


  //main method for testing
  public static void main( String[] args )
  {

    //Below is an exercise in creating a linked list...

    //Create a node
    LLNode first = new LLNode( "cat", null );

    //Create a new node after the first
    first.setNext( new LLNode( "dog", null ) );

    //Create a third node after the second
    first.getNext().setNext( new LLNode( "cow", null ) );

     //A naive list traversal, has side effects.... ??
       while( first != null ) {
       System.out.println( first );
       first = first.getNext();
       }


    //Q: when head ptr moves to next node in list, what happens to the node it just left?
    //A: it removes the previous node from the list

  }//end main

}//end class LLNode
