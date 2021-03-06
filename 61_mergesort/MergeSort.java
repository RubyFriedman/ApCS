/***
  class MergeSort
  Implements mergesort on array of ints.
  Summary of Algorithm:
  ***/

public class MergeSort
{
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
    int indA = 0;
    int indB = 0;
    int counter = 0;
    int[] both = new int[a.length + b.length];

    while(indA < a.length || indB < b.length) {
      if (indB == b.length) {
        while (indA != a.length) {
          both[counter] = a[indA];
          indA += 1;
          counter += 1;
        }
      } else if (indA == a.length) {
        while (indB != b.length) {
          both[counter] = b[indB];
          indB += 1;
          counter += 1;
        }
      } else {
        if (a[indA] < b[indB]) {
          both[counter] = a[indA];
          indA += 1;
        } else {
          both[counter] = b[indB];
          indB += 1;
        }
      }

      counter += 1;
    }
    return both;
  }//end merge()


  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort( int[] arr )
  {
    if(arr.length == 1) {
      return arr;
    } else {
      int midpoint = arr.length / 2;
      int[] firstHalf = new int[midpoint];
      int[] secondHalf = new int[arr.length - midpoint];
      for(int i = 0; i < arr.length; i++) { // copy the first half of our array over into a new array
        if (i >= midpoint) {
          secondHalf[i - midpoint] = arr[i];
        } else {
          firstHalf[i] = arr[i];
        }
      }
      return merge(sort(firstHalf), sort(secondHalf));
    }
  }//end sort()



  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
      a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for( int i : a )
      System.out.print( i + ",");
    System.out.println("]");
  }
  //---------------------------------------------------


  //main method for testing
  public static void main( String [] args )
  {

      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};
      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );
      System.out.println("\nMerging arr2 and arr3: ");
      printArray( merge(arr2,arr3) );
      System.out.println("\nMerging arr1 and arr3: ");
      printArray( merge(arr1,arr3) );
      System.out.println("\nMerging arr3 and arr4: ");
      printArray( merge(arr3,arr4) );
      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) ); // arr6 isn't sorted, so it makes sense that this result is wonky
          
      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
      /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
