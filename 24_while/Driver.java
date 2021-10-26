/**
Team Watson + Tiffany (Ruby Friedman & Anjini Katari)
APCS
HW24 -- Get It While You Can
2021-10-26
time spent:
DISCO:
 * this() in the 2nd constructor asks java to rerun the 2st constructor
   (which is assigned to this()), give the input value of s, and assigns
   upFace to nowFace
 * You can nest a conditional in a while loop
QCC:
 * Still a bit confused on how to use this()
 * Why does private/public matter/effect the outcomes? 
POST-v0 MODS:
 * Changed public vars to private 
 * Added this() and .equals() to make code more efficient
 * Initialized multiple vars in 1 line -> to save space/condense code
**/

public class Driver {
	public static void main(String[] args) {
	//x heads have come up
		Coin Watson = new Coin("penny", "tails");
		int x = 75;
		int y = 123;
		int counter0 = 0;
		int matchNum = 0;
		int counter2 = 0;		

		while (Watson.getHeadsCtr() < x) {
			Watson.flip();
			counter0 += 1;
		}
		
		System.out.println("It took " + counter0 + " flips to get " + x + " heads." );
	//y matches have occured
		Coin tiffany = new Coin("quarter", "heads");
		while (matchNum < y) {
			Watson.flip();
			tiffany.flip();
			if (tiffany.getUpFace() == Watson.getUpFace()) {
				matchNum += 1;
			}
			counter2 += 1;
		}
		System.out.println("It took " + counter2 + " flips to get " + y + " matches." );

	//at least 65536 matches have come up, and the number of matches is divisible by the year of your birth.
		
		int matchNumber = 0;
		int counter3 = 0;	

		Coin Wuby = new Coin("dime", "tails");
		Coin Diny = new Coin("dollar", "heads");
		while (matchNumber < (66165)) { 
			Wuby.flip();
			Diny.flip();
			if (Wuby.getUpFace() == Diny.getUpFace()) {
                                matchNumber += 1;
                        }
                        counter3 += 1;
		}
                System.out.println("It took " + counter3 + " flips to get at least 65536 matches have come up, and the number of matches is divisible by the year of your birth." );

	}//end main()

}//end class
