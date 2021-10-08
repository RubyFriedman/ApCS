/**
Team isUnavalible (Ruby Friedman and their ducky Tiffany)
APCS
HW14 -- Customize Your Creation
2021-10-07
*/

/**
DISCO
 * Constructors cannot be static or it will lead to
   error messages about the constructor being used
   from a static context.
 * A class can have multiple constructors
 * Default constructors do not take any arguments
   however overloaded constructors can take
   arguments/parameters.

QCC
 * What exactly is static and why can constructors not
be static?
 * What is the difference between an instance variable
   defined with <datatype> <name> as opposed to something
   like public static <datatype> <name>?
 
*/
public class BigSib {
        String helloMsg;

	public BigSib(String x) {
		helloMsg = x;
	}

        public String greet(String y) {
                return helloMsg + " " + y;
        }
}
