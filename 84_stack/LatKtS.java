// Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
// APCS pd7
// HW84 -- Stack: What Is It Good For?
// 2022-03-30w
// time spent: 2.0 hr
/*
DISCO
* You can look at the old codingbat code for syntax
* peek() helps to return the top of the stack
* Stacks are helpful for ordering or reversing
QCC
* Why did our peek() method in Latkes.java keep causing a NullPointerException?
/***
 * class LatKtS
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.
 **/

public class LatKtS
{

  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
  public static String flip( String s )
  {
	String retVal = "";
	Latkes stack = new Latkes(s.length());
	for (int i = 0; i < s.length(); i++) {
		stack.push(s.substring(i, i+1));
	}
	for (int j = 0; j< s.length();j++) {
		retVal += stack.pop();
	}
	return retVal;
  }



  /***
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **/


  public static boolean allMatched( String s){
    if (s.isEmpty()){
        return true;
    }
    Latkes stack = new Latkes(s.length());
    for (int i = 0; i < s.length(); i++) {
      String hi = s.substring(i, i + 1);

      if (hi.equals("(") || hi.equals("[") || hi.equals("{")) {
          stack.push(hi);
      } else {
        if (stack.isEmpty()) return false;

        String head = stack.pop();
        stack.push(head);

        if ( (hi.equals(")") && !head.equals("(")) || (hi.equals("]") && !head.equals("[")) || (hi.equals("}") && !head.equals("{"))){
          return false;
        } else {
          stack.pop();
        }
      }
  }
  return stack.isEmpty();
}


  //main method to test
  public static void main( String[] args )
  {
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class
