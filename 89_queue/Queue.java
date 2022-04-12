/*
Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
APCS pd7
HW89 -- Queue Two Ways / AL and LL based queues
2022-04-12t
time spent: 1.0 hrs
*/

/*
DISCO:
 * We do not need a head or tail pointer when using the given ArrayList
   and LinkedList API methods
 * It is possible to do dequeue and enqueue in constant time.
 * A _size instance variable is still helpful for keeping track of the
    Queue size, though it is not needed.
QCC:
 * What other lists can we use to create Queues other than ArrayList
   and LinkedList?
 * How do you create a diagram for LinedList when it doesn't use nodes?

*/
/***
 * interface Queue
 * Includes only methods listed in AP subset of Java
 * (Local version, to override built-in Java implementation.)
 **/

public interface Queue<QUASAR>
{
  //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue();

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x );

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty();

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront();
  //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~

}//end interface Queue
