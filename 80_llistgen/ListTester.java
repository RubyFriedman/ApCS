// Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
// APCS pd7
// HW80 -- Generically Speaking
// 2022-03-25f
// time spent: 0.5 hr
/***
 * class ListTester
 * ...for putting your LList through its paces
 *
 * Assumes local List.java (interface),
 *  overriding List interface from standard Java library
 **/

public class ListTester
{
  public static void main( String[] args )
  {

    //instantiate... var type List, obj type LList
    List wu = new LList();

    wu.add(4);
    System.out.println(wu);
    wu.add("RZA");

    System.out.println(wu);
    wu.add("GZA");

    System.out.println(wu);
    wu.add("ODB");

    System.out.println(wu);
    wu.add("Inspectah Deck");
    wu.add('g');

    wu.add(9.45);

    System.out.println(wu);
    wu.add("Raekwon the Chef");

    System.out.println(wu);
    wu.add("U-God");

    System.out.println(wu);
    wu.add("Ghostface");

    System.out.println(wu);
    wu.add("Method Man");

    System.out.println(wu);
    wu.add(6275);

    System.out.println(wu);
    for( int i=0; i<7; i++ ) {
      int n = (int)( wu.size() * Math.random() );
      String imposter = "@";
      System.out.println("adding a poser at index " + n + "...");
      wu.add( n, imposter );
      System.out.println("Updated list: " + wu);
    }

    while( wu.size() > 0 ) {
      int n = (int)( wu.size() * Math.random() );
      System.out.println("deleting node "+ n + "...");
      wu.remove(n);
      System.out.println("Updated list: " + wu);
    }


    List tee = new LList();

    System.out.println(tee);
    tee.add(1);

    System.out.println(tee);
    tee.add(3);

    System.out.println(tee);
    tee.add(678);

    System.out.println(tee);
    tee.add(6);

    System.out.println(tee);
    tee.add(24);

    System.out.println(tee);


    for( int i=0; i<4; i++ ) {
      int n = (int)( tee.size() * Math.random() );
      int imposter = -5;
      System.out.println("adding a poser at index " + n + "...");
      tee.add( n, imposter );
      System.out.println("Updated list: " + tee);
    }

    List charr = new LList();

    System.out.println(charr);
    charr.add('a');

    System.out.println(charr);
    charr.add('x');

    System.out.println(charr);
    charr.add('s');

    System.out.println(charr);

    charr.remove(2);
    System.out.println("Updated list: " + charr);

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class
