// Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
// APCS pd7
// HW85 -- Leon Leonwood Stack / Stack but with ArrayList and Linked List
// 2022-03-31r
// time spent: 0.5 hr

/***
 * interface Stack
 * Specifies actions a stack must be able to perform.
 * Allows for generic typing.
 **/

public interface Stack<PANCAKE>
{
    //Return true if this stack is empty, otherwise false.
    public boolean isEmpty();

    //Return top element of stack without popping it.
    public PANCAKE peekTop();

    //Pop and return top element of stack.
    public PANCAKE pop();

    //Push an element onto top of this stack.
    public void push( PANCAKE x );

}//end interface
