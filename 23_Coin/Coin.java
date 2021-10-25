/***
class Coin
Team Watson + Tiffany (Ruby Friedman & Anjini Katari)
APCS
HW23 -- What Does Equality Look Like?
2021-10-24
time spent: 02.0

DISCO:
 * Usage of null -> we now have a better understanding of how it works
   and when to use it.
 * More concrete understanding of how overloaded contructors work.

QCC:
 * Is there another way of making sure that the upFace values after
   the flip are correct? (our method was an odd one)
 * If our bias is set to 0.5 (which is supposedly neutral), why does
   running Driver.Java only return the same upFace everytime?
 * How/When should we use the 'this' alias?

 ***/
import java.lang.Math;
public class Coin {

	//attributes aka instance vars
	public double value;
	public String upFace;
	public String name;
	public int flipCtr;
	public int headsCtr;
	public int tailsCtr;
	public double bias;

	/***
	*  Coin() -- default constuctor
	*  precond:
	*  postcond:
	***/
	public Coin() {
  		value = 0.0;
		upFace = "heads";
		name = null;
		flipCtr = 0;
		headsCtr = 0;
		tailsCtr = 0;
		bias = 0.5;
	}


	/***
	Coin(String) -- overloaded constructor
	precond: input is one of
	"penny",
	"nickel",
	"dime",
	"quarter",
	"half dollar",
	"dollar"
	postcond:
	***/
	public Coin( String s ) {
		upFace = "heads";
		name = s;
		if (s == "penny") {
			value = 0.01;
		}
		else if (s == "nickel") {
			value = 0.05;
		}
		else if (s == "dime") {
			value = 0.10;
		}
		else if (s == "quarter") {
			value = 0.25;
		}
		else if (s == "half dollar") {
			value = 0.50;
		}
		else if (s == "dollar") {
			value = 1.00;
		}
		else {
			value = 0;
		}
	}


	/***
	Coin(String,String) --
	precond:
	postcond:
	***/
	public Coin( String s, String nowFace ) {
		name = s;
		upFace = nowFace;
		if (nowFace == "heads") {
			bias = 1.0;
		}
		else if (nowFace == "tails") {
			bias = 0.0;
		}
	}


	// Accessors...
	// ----------------------------
	public String getUpFace() {
		return upFace;
	}

	public int getFlipCtr() {
		return flipCtr;
	}

	public double getValue() {
        	return value;
	}

	public int getHeadsCtr() {
        	return headsCtr;
	}

	public int getTailsCtr() {
		return tailsCtr;

	}
	// ----------------------------


	/***
	* assignValue() -- set a Coin's monetary value based on its name
	* precond:  input String is a valid coin name ("penny", "nickel", etc.)
	* postcond: instvar value gets appropriate value
	* Returns value assigned.
	***/
	private double assignValue( String s ) {
		if (s == "penny") {
                        value = 0.01;
                }
                else if (s == "nickel") {
                        value = 0.05;
                }
                else if (s == "dime") {
                        value = 0.10;
                }
                else if (s == "quarter") {
                        value = 0.25;
                }
                else if (s == "half dollar") {
                        value = 0.50;
                }
                else if (s == "dollar") {
                        value = 1.00;
                }
                else {
                        value = 0;
                }
		return value;
	}


	/***
	reset() -- initialize a Coin
	precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
	postcond: Coin's attribs reset to starting vals
	***/
	public void reset( String s, double d ) {
                value = 0.0;
                upFace = s;
                name = null;
                flipCtr = 0;
                headsCtr = 0;
                tailsCtr = 0;
                bias = d;
	}


	/***
	* String flip() -- simulates a Coin flip
	* precond:  bias is a double on interval [0.0,1.0]
	* (1.0 indicates always heads, 0.0 always tails)
	* postcond: upFace updated to reflect result of flip.
	* flipCtr incremented by 1.
	* Either headsCtr or tailsCtr incremented by 1, as approp.
	* Returns "heads" or "tails"
	***/

	public String flip() {
		flipCtr = (flipCtr + 1);
		if (Math.random() > bias) {
			upFace = "tails";
			tailsCtr = (tailsCtr + 1);
		}
		else if (Math.random() < bias) {
			upFace = "heads";
                        headsCtr = (headsCtr + 1);
		}
		return upFace;
	}


	/***
	* boolean equals(Coin) -- checks to see if 2 coins have same face up
	* precond: other is not null
	* postcond: Returns true if both coins showing heads
	* or both showing tails. False otherwise.
	***/
	public boolean equals( Coin other ) {
		if (other != null) {
			if (upFace == other.upFace) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

	/***
	* String toString() -- overrides toString() provided by Java
	* precond: n/a
	* postcond: Return String comprised of name and current face
	***/
	public String toString() {
		String retStr = "";
		retStr = retStr + name;
		retStr = retStr + " -- " + upFace;
		return retStr;
	}

}//end class

