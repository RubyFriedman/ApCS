// Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
// APCS pd7
// HW88 -- BPC Kiddies Do Not Wait in Line Either / modified dequeue and shuffling
// 2022-04-05t
// time spent: 2.0 hrs
//
// DISCO
// * Don't forget to make LLNodes in LLNode.java of type SWASHBUCKLE.
//
// QCC
// * When we compile, there is an error that states that sample() method is not found
//   "error: cannot find symbol". Why?

/***
 * class RQueue
 * SKELETON
 * A node-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 **/


public class RQueue<SWASHBUCKLE> implements Queue<SWASHBUCKLE>
{
  //instance variables
  private LLNode<SWASHBUCKLE> _front, _end;
  private int _size;


  // default constructor creates an empty queue
  public RQueue()
  {
    _front = _end = null;
    _size = 0;
  }


  public void enqueue( SWASHBUCKLE enQVal )
  {
    if ( isEmpty() ) {
      _front = _end = new LLNode<SWASHBUCKLE>( enQVal, null );
    }
    else {
      _end.setNext( new LLNode<SWASHBUCKLE>( enQVal, null ) );
      _end = _end.getNext();
    }
    _size++;
    System.out.println("enqueued " + enQVal);
  }//O(1)


  // remove and return thing at front of queue
  // assume _queue ! empty
  public SWASHBUCKLE dequeue()
  {
    int index = (int)(Math.random() * _size-1);
    if ( index < 0 || index >= _size ) {
      return null;
     // throw new IndexOutOfBoundsException();
   }

    SWASHBUCKLE retVal;
    LLNode tmp = _front; //create alias to head

    //if index==0, remove head node
    if ( index == 0 ) {
     //check target node's cargo hold
     retVal = _front.getCargo();

     //remove target node
     _front = _front.getNext();
    }
    else {
     //walk to node before desired node
     for( int i=0; i < index-1; i++ )
       tmp = tmp.getNext();

     //check target node's cargo hold
     retVal = (SWASHBUCKLE)tmp.getNext().getCargo();

     //remove target node
     tmp.setNext( tmp.getNext().getNext() );
   }

   //decrement size attribute
   _size--;

   return retVal;
 }//O(n)


  public SWASHBUCKLE peekFront()
  {
    return _front.getCargo();
  }//O(1)


  /***
   * void sample() -- a means of "shuffling" the queue
   * Algo:
   *   < YOUR SUCCINCT SUMMARY HERE >
   **/
   public void sample()
   {
     SWASHBUCKLE temp = null;
     for (int i = 0; i < _size; i++) {
       temp = dequeue();
       enqueue(temp);
     }
   }//O(n^2)


  public boolean isEmpty()
  {
    return _front == null;
  } //O(1)


  // print each node, separated by spaces
  public String toString()
  {
    String retNodes = "";
    LLNode<SWASHBUCKLE> temp = _front;
    while( temp != null ) {
      retNodes += temp.getCargo() + " ";
      temp = temp.getNext();
    }
    return retNodes;
  }//end toString()



  //main method for testing
  public static void main( String[] args )
  {

    Queue<String> PirateQueue = new RQueue<String>();

    System.out.println("\nnow enqueuing...");
    PirateQueue.enqueue("Dread");
    PirateQueue.enqueue("Pirate");
    PirateQueue.enqueue("Roberts");
    PirateQueue.enqueue("Blackbeard");
    PirateQueue.enqueue("Peter");
    PirateQueue.enqueue("Stuyvesant");

    System.out.println("............");
    PirateQueue.sample();
    System.out.println("testing sample: " + PirateQueue);

    System.out.println("\nnow testing toString()...");
    System.out.println( PirateQueue ); //for testing toString()...

    System.out.println(PirateQueue);

    System.out.println("\nnow dequeuing...");
    System.out.println( PirateQueue.dequeue() );
    System.out.println(PirateQueue);
    System.out.println( PirateQueue.dequeue() );
    System.out.println(PirateQueue);
    System.out.println( PirateQueue.dequeue() );
    System.out.println(PirateQueue);
    System.out.println( PirateQueue.dequeue() );
    System.out.println(PirateQueue);
    System.out.println( PirateQueue.dequeue() );
    System.out.println(PirateQueue);
    System.out.println( PirateQueue.dequeue() );

    System.out.println(PirateQueue);

    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n");
    System.out.println( PirateQueue.dequeue() );

      /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main

}//end class RQueue
