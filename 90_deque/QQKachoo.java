/*
Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
APCS pd7
HW91 -- Deque the Halls / double ended queue
2022-04-14r
time spent: 0.5 hrs
*/

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collection;

public class QQKachoo<D> implements Deque<D> {
  private LinkedList<D> _deque;

  public QQKachoo() {
    _deque = new LinkedList<D>();
  }

  public void addFirst(D value) {
    _deque.addFirst(value);
  }
  public void addLast(D value) {
    _deque.addLast(value);
  }
  public D peekFirst() {
    return _deque.peekFirst();
  }
  public D peekLast() {
    return _deque.peekLast();
  }
  public D removeFirst() {
    return _deque.removeFirst();
  }
  public D removeLast() {
    return _deque.removeLast();
  }
  public boolean isEmpty() {
    return _deque.size() == 0;
  }
  public int size() {
    return _deque.size();
  }
  public boolean contains(Object c) {
    return _deque.contains(c);
  }

  public Iterator<D> iterator() {
    return _deque.iterator();
  }

  public boolean addAll(Collection<D> c) {
    return _deque.addAll(c);
  }

  public Iterator<D> descendingIterator() {
    return _deque.descendingIterator();
  }

  public boolean removeFirstOccurrence(Object c) {
    return _deque.removeFirstOccurrence(c);
  }

  public boolean removeLastOccurrence(Object c) {
    return _deque.removeLastOccurrence(c);
  }

}
