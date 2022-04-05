// Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
// APCS pd7
// HW88 -- BPC Kiddies Do Not Wait in Line Either / modified dequeue and shuffling
// 2022-04-05t
// time spent: 2.0 hrs

/*****************************************************
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 *****************************************************/

public class LLNode<SWASHBUCKLE>
{
    //instance vars
    private SWASHBUCKLE _cargo;    //cargo may only be of type String
    private LLNode<SWASHBUCKLE> _nextNode; //pointer to next LLNode

    // constructor -- initializes instance vars
    public LLNode( SWASHBUCKLE value, LLNode<SWASHBUCKLE> next ) {
	     _cargo = value;
	     _nextNode = next;
    }


    //--------------v  ACCESSORS  v--------------
    public SWASHBUCKLE getCargo() { return _cargo; }

    public LLNode<SWASHBUCKLE> getNext() { return _nextNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public SWASHBUCKLE setCargo( SWASHBUCKLE newCargo ) {
	      SWASHBUCKLE foo = getCargo();
	      _cargo = newCargo;
	      return foo;
    }

    public LLNode<SWASHBUCKLE> setNext( LLNode<SWASHBUCKLE> newNext ) {
	     LLNode<SWASHBUCKLE> foo = getNext();
	     _nextNode = newNext;
	     return foo;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString() { return _cargo.toString(); }


    //main method for testing
    public static void main( String[] args )
    {
      
    }//end main

}//end class LLNode

