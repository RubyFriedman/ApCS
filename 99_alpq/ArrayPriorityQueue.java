import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue {
  /**
    ArrayPriorityQueue class
      IVs
        - ArrayList<>() al
        +
      Methods
        -
        +
  */

  private ArrayList<Integer> al;
  public int size;

  public ArrayPriorityQueue() {
    al = new ArrayList<Integer>();
    size = 0;
  }

  public void add(int x) {
    int ind = al.size() - 1;
    while (ind >= 0 && al.get(ind) < x) {
      ind--;
    }
    al.add(ind, x);
    size++;
  }

  public boolean isEmpty() {
    return al.size() == 0;
  }

  public int peekMin() {
    return al.get(al.size() - 1);
  }

  public int removeMin() {
    size--;
    return al.remove(al.size() - 1);
  }

  public int size() {
    return al.size();
  }

  public String toString() {
    String retVal = "";
    for(int i = size-1; i>=0; i--) {
      retVal += al.get(i);
    }
    return retVal;
  }

  public static void main(String[] args) {
    ArrayPriorityQueue KDubs = new ArrayPriorityQueue();
    KDubs.add(4);
    KDubs.add(4);
    KDubs.add(4);
    KDubs.add(4);
    KDubs.add(4);
    KDubs.add(4);
    KDubs.add(4);
  }
}
