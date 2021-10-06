public class Greet {
	public static void main( String[] args ) {
		String greeting;

		BigSib richard = new BigSib();
		richard.setHelloMsg("Word up");
                greeting = richard.greet("freshman");
                System.out.println(greeting);

		BigSib Anjini = new BigSib();
		Anjini.setHelloMsg("Salutations");
                greeting = Anjini.greet("Dr. Spaceman");
                System.out.println(greeting);

                BigSib Ruby = new BigSib();
                Ruby.setHelloMsg("Hey ya");
                greeting = Ruby.greet("Kong Fooey");
                System.out.println(greeting);

                BigSib Watson = new BigSib();
                Watson.setHelloMsg("Sup");
                greeting = Watson.greet("mom");
                System.out.println(greeting);

  } //end main()
} //end Greet
