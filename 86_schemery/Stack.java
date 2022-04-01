// Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
// APCS pd7
// HW86 -- What a Racket
// 2022-04-01f
// time spent: 2.0hrs
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
