/**
Team JAR (Ruby Friedman and their ducky Tiffany, Ariel Fuchs and his ducky Skelly duckler III, Joshua Gao and his ducky Batman)
APCS
HW10 -- Refactor Big Sib One?
2021-10-04
*/
/**
DISCOVERIES
* System.out.println() serves as a display function to create dots of
light on the screen
* If nothing is printed in the main() method, running the function will
not display anything and the function will seem to have done "nothing"
* A java file does not need a main() method to be used
* In order to be exacutable a java file MUST have a main method
* It is possible to call a class/method from a different file
using the syntax <class>.<method>(<parameter>);

UNRESOLVED QUESTIONS
* When invoking a method from the same class it is common to use
the syntax <MethodName>(<parameters>), however is it also possible to
use the syntax <class>.<method>(<parameter>); for a method in the same
class?
* How is it that BigSib can be invoked from Greet without a main(),
doesn't that execute the file and contradict discovery 4?
*/
public class BigSib {
	public static String greet(String x) {
                String beg = "Why, hello there, ";
                String end = ". How do you do?";
                return beg + x + end;
	}
}
