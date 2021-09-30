/**
Ruby Friedman
APCS
HW08 -- Refactor Freshie Zero
2021-09-30
*/

/**
DISCOVERIES
The main method can be used to test the other methods by invoking and
displaying the results.
System.out.println seems to display the results as dots of light rather
than returning the outputs.
The class name must be the same as the file name.
UNRESOLVED QUESTIONS
What does public do in a function, how would the function run if it were
private?
What does static do in java functions and what are the alteritives?
*/
public class Greet {
	public static void main(String[] args) {
		System.out.println(greet("Foo"));
		System.out.println(greet("Moo"));
		System.out.println(greet("UWU"));
	}
	public static String greet(String x) {
		String beg = "Why, hello there, ";
		String end = ". How do you do?";
		return beg + x + end;
	}
}
