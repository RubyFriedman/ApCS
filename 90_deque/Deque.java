/*
Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
APCS pd7
HW91 -- Deque the Halls / double ended queue
2022-04-14r
time spent: 0.5 hrs
*/

import java.util.Iterator;
import java.util.Collection;

public interface Deque<CARD> {

  //Inserts the specified element at the front of this deque
  public void addFirst(CARD c);

  //Inserts the specified element at the end of this deque
  public void addLast(CARD c);

  //Retrieves the first element of this deque, returns null if deque is empty
  public CARD peekFirst();

  //Retrieves the last element of this deque, returns null if deque is empty
  public CARD peekLast();

  //Retrieves and removes the first element of this deque
  public CARD removeFirst();

  //Retrieves and removes the last element of this deque
  public CARD removeLast();

  //Returns whether deque is empty or not
  public boolean isEmpty();

  //Returns the number of elements in this deque
  public int size();

  //Returns true if this deque contains the specified element
  public boolean contains(Object c);

  //Returns an iterator over the elements in this deque in proper sequence
  public Iterator<CARD> iterator();

  //Adds all of the elements in the specified collection at the end of this deque
  public boolean addAll(Collection<CARD> c);

  //Returns an iterator over the elements in this deque in reverse sequential order
  public Iterator<CARD> descendingIterator();

  //Removes the first occurrence of the specified element from this deque
  public boolean removeFirstOccurrence(Object c);

  //Removes the last occurrence of the specified element from this deque
  public boolean removeLastOccurrence(Object c);
}
