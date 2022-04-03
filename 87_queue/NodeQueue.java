// Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
// APCS pd7
// HW87 -- The English Do Not Wait In Line for Soup / linked list node queue
// 2022-04-04m
// time spent: 2.0 hrs
//
// DISCO
// * We can have inner classes.
// * We can have a NodeQueue of type Object that would accept all objects.
// * It's always a great idea to look back at the code at the end to get rid of any unnecessary code / "clutter" - Ruby.
//
// QCC
// * Is there another way to go about this without the creation of an inner class?

public class NodeQueue<QUASAR> implements Queue<QUASAR> {

  public class Node {
    private QUASAR _cargo;
    private Node _nextNode;

    public Node(QUASAR value, Node next) {
      _cargo = value;
      _nextNode = next;
    }

    public QUASAR getCargo() {
      return _cargo;
    }

    public Node getNext() {
      return _nextNode;
    }

    public QUASAR setCargo(QUASAR newCargo) {
      QUASAR foo = getCargo();
  	   _cargo = newCargo;
	      return foo;
    }

    public Node setNext(Node newNext ) {
      Node foo = getNext();
      _nextNode = newNext;
      return foo;
    }

}

  private int _size;
  private Node _head;

  public NodeQueue() {
    _head = new Node(null, null);
    _size = 0;
  }

  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue() {
    if (isEmpty()){
      return null;
    }
    _size = _size-1;
    QUASAR temp = _head._cargo;
    _head = _head._nextNode;
    return temp;
  }

  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR newVal ) {
    if (isEmpty()) {
      _head._cargo = newVal;
    }
    else {
      Node another = _head;
      while (!(another._nextNode == null)) {
        another = another._nextNode;
      }
      another._nextNode = (new Node(newVal, null));
    }
      _size+=1;
    }

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty() {
    return _size == 0;
  }

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront() {
    return _head._cargo;
  }

  public static void main(String[] args) {
    System.out.println("Testing with Strings...");
    Queue<String> test = new NodeQueue<String>();
    test.enqueue("does");
    test.enqueue("this");
    test.enqueue("work");
    test.enqueue("?");
    System.out.println("The first element: " + test.peekFront());
    System.out.println(test.dequeue());
    System.out.println(test.dequeue());
    System.out.println(test.dequeue());
    System.out.println(test.dequeue());
    System.out.println("Is it empty? " + test.isEmpty());

    System.out.println("---------------------------------");

    System.out.println("Testing with Integers...");
    Queue<Integer> test1 = new NodeQueue<Integer>();
    test1.enqueue(1);
    test1.enqueue(3);
    test1.enqueue(5);
    test1.enqueue(7);
    System.out.println("The first element: " + test1.peekFront());
    System.out.println(test1.dequeue());
    System.out.println(test1.dequeue());
    System.out.println(test1.dequeue());
    System.out.println(test1.dequeue());
    System.out.println("Is it empty? " + test1.isEmpty());

    System.out.println("---------------------------------");

    System.out.println("Testing with Objects...");
    Queue<Object> test2 = new NodeQueue<Object>();
    test2.enqueue("does");
    test2.enqueue(24);
    test2.enqueue('t');
    test2.enqueue(true);
    System.out.println("The first element: " + test2.peekFront());
    System.out.println(test2.dequeue());
    System.out.println(test2.dequeue());
    System.out.println(test2.dequeue());
    System.out.println(test2.dequeue());
    System.out.println("Is it empty? " + test2.isEmpty());
  }

}
