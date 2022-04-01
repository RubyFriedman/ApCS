// Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
// APCS pd7
// HW86 -- What a Racket
// 2022-04-01f
// time spent: 2.0hrs

/***
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. Create a Stack of type String and then a String Array that, via split(), splits the Stack into
 *      multiple Strings.
 *   2. Traverse through the String Array recursively.
 *   3. If an open parenthesis is encountered, we would perform the operation within, remove
 *      the closed parenthesis, and, via unload(), push the sum/difference/product to the Stack.
 *   4. Steps 1, 2, and 3 continue until the Stack is fully traversed.
 *   5. The Stack contains the simplified value of the expression, which, of type String, is returned.
 *
 * STACK OF CHOICE: ALStack by library code
 * b/c it was a matter of preference as, ultimately, both have the same functionality due to the similar
 *     methods.
 **/

public class Scheme
{
  /***
   * precond:  Assumes expr is a valid Scheme (prefix) expression,
   *           with whitespace separating all operators, parens, and 
   *           integer operands.
   * postcond: Returns the simplified value of the expression, as a String
   * eg,
   *           evaluate( "( + 4 3 )" ) -> 7
   *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
   **/
  public static String evaluate( String expr )
  {
    Stack<String> stack = new ALStack<String>();
    String pain[] = expr.split("\\s+");
    int opr = 0;

    for (int i = pain.length - 1; i >= 0; i --) {

      if (pain[i].equals("(")) {
        String placeholder = (unload(opr, stack));
        stack.pop();
        stack.push(placeholder);
      }

      else if (pain[i].equals("+")) {
	opr = 1;
	}
      else if (pain[i].equals("-")) {
	opr = 2;
	}
      else if (pain[i].equals("*")) {
	opr = 3;
	}
      else {stack.push(pain[i]);}
      
    }
    return stack.peekTop();
  }//end evaluate()


  /***
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   **/
  public static String unload( int op, Stack<String> numbers )
  {
    Integer start = Integer.parseInt(numbers.pop());
	if (op == 1) {
		while ( !numbers.peekTop().equals(")") ) {
			start += Integer.parseInt(numbers.pop());
		}
	}
        else if (op == 2) {
                while ( !numbers.peekTop().equals(")") ) {
                        start -= Integer.parseInt(numbers.pop());
                }
        }
      else {
		while ( !numbers.peekTop().equals(")") ) {
			start *= Integer.parseInt(numbers.pop());
		}
	}

    return Integer.toString(start);
  }//end unload()


  /*
  //optional check-to-see-if-its-a-number helper fxn:
  public static boolean isNumber( String s ) {
    try {
      Integer.parseInt(s);
      return true;
    }
    catch( NumberFormatException e ) {
      return false;
    }
  }
  */


  //main method for testing
  public static void main( String[] args )
  {

    String zoo1 = "( + 4 3 )";
    System.out.println(zoo1);
    System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
    //...7
    
    String zoo2 = "( + 4 ( * 2 5 ) 3 )";
    System.out.println(zoo2);
    System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
    //...17
    
    String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
    System.out.println(zoo3);
    System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
    //...29
    
    String zoo4 = "( - 1 2 3 )";
    System.out.println(zoo4);
    System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
    //...-4
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }//main()

}//end class Scheme
