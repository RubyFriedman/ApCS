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
import java.util.LinkedList;

public class LLQueue<E> implements Queue<E> {
	private LinkedList<E> _queue;
        private int _size;

        public LLQueue() {
                _size = 0;
                _queue = new LinkedList<E>();
        }

	public boolean isEmpty() {
		return _size == 0;
	}

	public E peekFront() {
		return _queue.peekFirst();
	}

	public E dequeue() {
		_size--;
		return _queue.removeFirst();
	}

	public void enqueue(E slay) {
		_queue.addLast(slay);
		_size++;
	}
public static void main(String[] args) {
  Queue<String> testStr = new ALQueue<String>();
  System.out.println("Testing with Strings... ");
  testStr.enqueue("does");
  testStr.enqueue("this");
  testStr.enqueue("work");
  testStr.enqueue("?");
  System.out.println("The first element: " + testStr.peekFront());
  System.out.println(testStr.dequeue());
  System.out.println(testStr.dequeue());
  System.out.println(testStr.dequeue());
  System.out.println(testStr.dequeue());
  System.out.println("Is it empty? " + testStr.isEmpty());

  System.out.println("---------------------------------");

  Queue<Integer> testInt = new ALQueue<Integer>();
  System.out.println("Testing with Integers... ");
  testInt.enqueue(2);
  testInt.enqueue(4);
  testInt.enqueue(6);
  testInt.enqueue(8);
  System.out.println("The first element: " + testInt.peekFront());
  System.out.println(testInt.dequeue());
  System.out.println(testInt.dequeue());
  System.out.println(testInt.dequeue());
  System.out.println(testInt.dequeue());
  System.out.println("Is it empty? " + testInt.isEmpty());

  System.out.println("---------------------------------");

  Queue<Object> testObj = new ALQueue<Object>();
  System.out.println("Testing with Objects... ");
  testObj.enqueue('b');
  testObj.enqueue(99.99);
  testObj.enqueue(false);
  testObj.enqueue("done");
  System.out.println("The first element: " + testObj.peekFront());
  System.out.println(testObj.dequeue());
  System.out.println(testObj.dequeue());
  System.out.println(testObj.dequeue());
  System.out.println(testObj.dequeue());
  System.out.println("Is it empty? " + testObj.isEmpty());

 }
}
