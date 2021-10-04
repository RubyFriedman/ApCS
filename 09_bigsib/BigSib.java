/**
Team JAR (Ruby Friedman and their ducky Tiffany, Ariel Fuchs and his ducky Skelly duckler III, Joshua Gao and his ducky Batman)
APCS
HW09 -- What Are BigSibs Good For?
2021-10-03
*/

/**
DISCOVERIES
* A java file does not need a main() method to be used
* In order to be exacutable a java file MUST have a main method
* It is possible to call a class/method from a different file
using the syntax <class>.<method>(<parameter>);

UNRESOLVED QUESTIONS
* Can a class/method from a different file be called if it is
in a seperate directory or must it be in the same directory?
* How is it that BigSib can be invoked from Greet without a main(),
doesn't that execute the file and contradict discovery 2?
*/

public class BigSib {
	public static String greet(String x) {
                String beg = "Why, hello there, ";
                String end = ". How do you do?";
                return beg + x + end;
	}
}
