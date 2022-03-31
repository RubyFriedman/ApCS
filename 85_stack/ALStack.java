// Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
// APCS pd7
// HW85 -- Leon Leonwood Stack / Stack but with ArrayList and Linked List
// 2022-03-31r
// time spent: 0.5 hr

import java.util.ArrayList;

public class ALStack<PANCAKE> implements Stack<PANCAKE> {

  private ArrayList<PANCAKE> _stack;

  public ALStack() {
    _stack = new ArrayList<PANCAKE>();
  }

  public boolean isEmpty(){
    return _stack.size() == 0;
  }

  public PANCAKE peekTop(){
    return _stack.get(_stack.size()-1);
  }

  public PANCAKE pop(){
    if (isEmpty()) {
      return null;
    }
    PANCAKE temp = _stack.get(_stack.size() - 1);
    _stack.remove(_stack.size() - 1);
    return temp;
  }

  public void push(PANCAKE x){
    _stack.add(x);
  }

}
