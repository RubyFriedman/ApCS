// Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
// APCS pd7
// HW85 -- Leon Leonwood Stack / Stack but with ArrayList and Linked List
// 2022-03-31r
// time spent: 0.5 hr

import java.util.LinkedList;

public class LLStack<PANCAKE> implements Stack<PANCAKE> {

  private LinkedList<PANCAKE> _stack;

  public LLStack() {
    _stack = new LinkedList<PANCAKE>();
  }

  public boolean isEmpty(){
    return _stack.size() == 0;
  }

  public PANCAKE peekTop(){
    return _stack.getLast();
  }

  public PANCAKE pop(){
    if (isEmpty()) {
      return null;
    }
    PANCAKE temp = _stack.getLast();
    _stack.removeLast();
    return temp;
  }

  public void push(PANCAKE x){
    _stack.add(x);
  }

}
