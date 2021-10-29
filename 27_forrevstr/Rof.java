/**
Team Purr: Perry Huang, Ruby Friedman, Raven Tang
APCS
HW27 -- FOR the Love of Strings (Printing Strings with loops and
recursion and using length and substring to print out strings
and their reverses)
2021-10-28
time spent: 01.0 hours

DISCO:
 * Substring is overloaded, it can have either 1 or 2 parameters.
   If substring has one parameter it removes the first x charecters
   where x is the parameter. If substring has 2 parameters, the first
   removes the first x characters, and the second removes the characters
   at and after the given index.
 * <stringname>.length() returns the number of charecters in the given
   String.
 * Learned how to use the syntax of for loops.


QCC:
 * Is it possible to use a while loop for the reverse functions?
 * For reverseR, do we need the intermediate variable word or
   could we run the program without it?
 * When would we choose a for loop over a recusrive program or a
   while loop? When should we use it?
*/

public class Rof {
	public static String fenceF(int posts){
		String results = "";
		for(int i = 1; i <= posts; i++){
			if(i == 1){
				results += "|";
			}
			else if (i > 1) {
				results += "--|";
			}
		}
		return results;
	}

	public static String reverseF(String s){
		String results = "";
		int findLength = s.length();
		for(int i = 1; i <= findLength; i++) {
			results += s.substring(findLength-i, findLength-i + 1);
		}
		return results;
	}

	public static String reverseR(String s){
		String word = s;
		if (word.length() == 1) {
			return word;
		}
		else {
			return word.substring(word.length()-1) + reverseR(word.substring(0, word.length()-1));
		}
	}

	public static void main(String[] args) {
		System.out.println(fenceF(1));
		System.out.println(fenceF(2));
		System.out.println(fenceF(3));
		System.out.println(reverseF("stressed"));
		System.out.println(reverseF("hey"));
		System.out.println(reverseR("stressed"));
		System.out.println(reverseR("hey"));
	}
}
