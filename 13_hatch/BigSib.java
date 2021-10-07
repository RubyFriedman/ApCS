/**
Team dynamicDuoBackAtIt (Ruby Friedman and their ducky Tiffany, Anjini Katari and her ducky Watson)
APCS
HW13 -- Where do BigSibs Come From?
2021-10-06
*/

/**
DISCO:
 * A contructor is a special method, invoked by 'new'. 
   It's syntax is:
    <protection> <className> {
        <task to be done @ birth>;
    }
 * Constructors must be public in order to function.
 * When connecting to the StuyCS lab on one's home device, 
   it's possible for one to get disconnected if the window is
   inactive for too long. If code isn't saved, then it will 
   vanish into the void - meaning it is  imperitive to save work
   frequently.

QCC:
 * What does null mean? Why/How did this get returned?
 * Why must a contructor be public? Why were we 
   told it can't be private?
 * How do we get BigSib to return each individual greeting?

*/



public class BigSib {

        public BigSib() {
                helloMsg = "Word up";
        }

        public static String helloMsg;

        public static String greet(String y) {
                return helloMsg + " " + y;
        }
}
