// TNPG: Rowing Lemurs and Leopords (Ruby F, Lindsay P, Lawrence J)
// APCS pd07
// HW72 --So So Fast
// 2022-03-08m
// time spent:  hrs
/*
ALGO

BEST CASE SCENARIO: (Describe best-case scenario and justify its Big-O classification.)

WORST CASE SCENARIO: ditto

DISCO

QCC

*/
public class FastSelect {
	public static int ythSmallest(int[] arr, int y) {
		for (int testC = 0; testC < arr.length; testC++ ) {
			arr = partition(arr, 0, arr.length-1, testC);
		}
		return arr[y-1];
	}

  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }
  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  public static int[] partition( int arr[], int left, int right, int pvtPnt)
  {
    int v = arr[pvtPnt];

    swap( pvtPnt, right, arr);
    int s = left;

    for( int i = left; i < right; i++ ) {
      if ( arr[i] <= v) {
        swap( i, s, arr );
        s++;}
    }
    swap(s,right,arr);

    return arr;
  }//end partition

public static void main( String[] args )
  {

    //init test arrays of magic numbers
    int[] arr1 = {8,21,17,69,343};
    int[] arr2 = {7, 1, 5, 12, 3};
    int[] arr3 = {1,28,33,4982,37};
    int[] arr4 = {5,4,17,9000,6};
    int[] arr5 = {3,0,16,599,1024};
    int[] arr6 = {7, 2, 3, 9, 6};

      System.out.println("arr1: ");
      printArr(arr1);
      System.out.println("2nd smallest");
      System.out.println(ythSmallest(arr1,2));
      System.out.println("-----------------------");

      System.out.println("arr2: ");
      printArr(arr2);
      System.out.println("2nd smallest");
      System.out.println(ythSmallest(arr2,2));
      System.out.println("-----------------------");

      System.out.println("arr3: ");
      printArr(arr3);
      System.out.println("2nd smallest");
      System.out.println(ythSmallest(arr3,2));
      System.out.println("-----------------------");

      System.out.println("arr4: ");
      printArr(arr4);
      System.out.println("2nd smallest");
      System.out.println(ythSmallest(arr4,2));
      System.out.println("-----------------------");

      System.out.println("arr5: ");
      printArr(arr5);
      System.out.println("2nd smallest");
      System.out.println(ythSmallest(arr5,2));
      System.out.println("-----------------------");

      System.out.println("arr6: ");
      printArr(arr6);
      System.out.println("2nd smallest");
      System.out.println(ythSmallest(arr6,2));
      System.out.println("-----------------------");
  }//end main
}//end class
