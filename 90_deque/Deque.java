/*
Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
APCS pd7
HW90 -- Swabbing the Deque / double ended queue
2022-04-13w
time spent: 1.0 hrs
*/

public interface Deque<CARD> {
  public void addFirst(CARD c);
  public void addLast(CARD c);
  public CARD peekFirst();
  public CARD peekLast();
  public CARD removeFirst();
  public CARD removeLast();
  public boolean isEmpty();
  public int size();
}
