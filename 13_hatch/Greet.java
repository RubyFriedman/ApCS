public class Greet {
    public static void main( String[] args ) {
            String greeting;

        BigSib richard = new BigSib();
        greeting = richard.greet("freshman");
        System.out.println(greeting);

            BigSib Anjini = new BigSib();
        greeting = Anjini.greet("Dr. Spaceman");
        System.out.println(greeting);

        BigSib Ruby = new BigSib();
        greeting = Ruby.greet("Kong Fooey");
        System.out.println(greeting);

        BigSib Watson = new BigSib();
        greeting = Watson.greet("mom");
        System.out.println(greeting);

    }
}
