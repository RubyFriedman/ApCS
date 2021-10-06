/**
Team dynamicDuoBackAtIt (Ruby Friedman and their ducky Tiffany, Anjini Katari and her ducky Watson)
APCS
HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
2021-10-05
*/

/**
DISCO
 * The order in which you write your code matters -> in the case of
   'greeting', if the print statement didn't follow the corresponding
   Big Sib name, each of the outputs would turn out to be 'Sup <name>'
 * It is possible to define a variable outside of a method, this is shown
   in line 2 of the code in which we created the variable helloMsg outside
   of a method.
 * The dot operator invokes a method outside the class. 

QCC
 * Can main methods return  other return types aside from void?
 * Are the Big Sib names classes? Because the usage of the dot
   operator suggests that Richard is a class.
 * Is it possible to write java code outside of methods in a
   class?
 */
public class BigSib {
	public static String helloMsg;
	public static String setHelloMsg(String x) {
		helloMsg = x;
		return helloMsg;
	}

	public static String greet(String y) {
		return helloMsg + " " + y;
	}
}
