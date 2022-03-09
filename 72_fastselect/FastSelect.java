// TNPG: Rowing Lemurs and Leopords (Ruby F, Lindsay P, Lawrence J)
// APCS pd07
// HW72 --So So Fast
// 2022-03-08m
// time spent: 1.5 hrs
/*
BIG OH CLASSIFICATION:
Our algo has a O(n^2) exacution time, with 2 nested for loops.
we understand that this could have been faster, even using merge
sort would have yielded O(nlogn), however we wanted to use the mysterion 
method to this.

ALGO
1. Using a for loop in method ythSmallest, we loop through editing our array using the
former mysterion method, and change the c value up by one every time. 
2. We exit the for loop in ythSmallest with a sorted array, then take the y-1 index which is the
yth smallest value.

BEST CASE SCENARIO: (Describe best-case scenario and justify its Big-O classification.)
O(n^2) is the best case senerio because our algo loops through the size of the array 2 times in
"nested" for loops.

WORST CASE SCENARIO: ditto

DISCO
 * Tracing is very useful when trying to find patterns.

QCC
 * Is it possible to create this algo with a O(n) runtime, because that is the "mysterion" helper method runtime?

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
