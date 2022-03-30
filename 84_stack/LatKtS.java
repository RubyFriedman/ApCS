// Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
// APCS pd7
// HW84 -- Stack: What Is It Good For?
// 2022-03-30w   
// time spent: 0.5 hr
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
  public static boolean allMatched( String s )
  {
	Latkes stack = new Latkes(s.length());
	boolean place = false;
	for (int i = 0; i < s.length(); i++) {
		stack.push(s.substring(i, i+1));
		if (place) {
			stack.pop();
			place = false;
		}
                if (s.substring(i, i+2).equals("()") || s.substring(i, i+2).equals("[]") ||s.substring(i, i+2).equals("{}")) {
			stack.pop();
			place = true;
			s = s.substring(0, i) + s.substring(i+1, s.length()-1);
			i = 0;
		}
		if (stack.isEmpty()) {
			return true;
		}
        }
	return false;

  }


  //main method to test
  public static void main( String[] args )
  {
    System.out.println(flip("stressed"));
    String s = "({}[()])";
    String a = "([)]";
    String r = "(){([])}";
    String t = "](){([])}";
    String b = "(){([])}(";
    String y = "()[[]]{{{{((([])))}}}}";
    System.out.println(allMatched( s )); //true
    System.out.println(allMatched( a ) ); //false
    System.out.println(allMatched( r ) ); //true
    System.out.println(allMatched( t ) ); //false
    System.out.println(allMatched( b ) ); //false
    System.out.println(allMatched( y ) ); //true
  }

}//end class
