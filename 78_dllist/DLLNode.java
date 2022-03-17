/***
// Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
// APCS pd7
// HW78 -- Double Up
// 2022-03-17r
// time spent: 0.5 hr
//
// DISCO
// - Tracing is very helpful when visualizing how to go about a method
// - Use System.out.println() sparingly to see what's going wrong
// - DLLNode takes 3 parameters
// - Head utilizes getNext while tail utilizes getPrev
// QCC
// - "DLLNode can not be converted to String" reminder that String != getNext();
// - How can we add to the end of the DLLNode like Scheme does with lists?
// ALGO ADD
// 1. If we're trying to add to the zeroth index aka the front of the list, use
//    the regular add method.
// 2. If not, add everything before the index in a temporary DLLNode.
// 3. Create another DLLNode that adds the newVal at the index specified then
//    stores the nodes after the index.
// 4. Connect the two DLLNodes, resulting in an DLLNode that has all the nodes
//    and the newVal at the right index.
// 5. Increase size by 1.
// ALGO REM
// 1. If we're trying to remove the zeroth index aka the front of the list,
//    get everything after the car.
// 2. If not, add everything before the index to a temporary DLLNode.
// 3. When getting to the index that should be removed, skip it, and continue
//    adding everything after.
// 4. Decrease size by 1.
  /***
   * interface List
   * subset of actual Java List interface
   * Specifies actions a List must be able to perform.
   *
   * If placed in current working dir, will be consulted instead of
   *  built-in Java library interface.
   *
   * new in version 2.0:
   * REMOVE-AT-INDEX
   * ADD-AT-INDEX
   **/

/*****************************************************
 * class DLLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 *****************************************************/

public class DLLNode
{
    //instance vars
    private String _cargo;    //cargo may only be of type String
    private DLLNode _nextNode; //pointer to next DLLNode
    private DLLNode _prevNode; //pointer to previous DLLNode

    // constructor -- initializes instance vars
    public DLLNode(DLLNode prev, String value, DLLNode next ) {
	_cargo = value;
	_nextNode = next;
  _prevNode = prev;
    }


    //--------------v  ACCESSORS  v--------------
    public String getCargo() { return _cargo; }

    public DLLNode getNext() { return _nextNode; }

    public DLLNode getPrev() { return _prevNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public String setCargo( String newCargo ) {
	String foo = getCargo();
	_cargo = newCargo;
	return foo;
    }

    public DLLNode setNext( DLLNode newNext ) {
	DLLNode foo = getNext();
	_nextNode = newNext;
	return foo;
    }

    public DLLNode setPrev( DLLNode newPrev ) {
	DLLNode foo = getPrev();
	_prevNode = newPrev;
	return foo;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString() { return _cargo.toString(); }


    //main method for testing
    public static void main( String[] args )
    {

	//Below is an exercise in creating a linked list...

	//Create a node
	DLLNode first = new DLLNode(null, "cat", null );

	//Create a new node after the first
	first.setNext( new DLLNode(null, "dog", null ) );

	//Create a third node after the second
	first.getNext().setNext( new DLLNode(null, "cow", null ) );

	/* A naive list traversal, has side effects.... ??
	   while( first != null ) {
	   System.out.println( first );
	   first = first.getNext();
	   }
	*/

	//Q: when head ptr moves to next node in list, what happens to the node it just left?

	//...so better: ?
	//
	//
	//

    }//end main

}//end class DLLNode
