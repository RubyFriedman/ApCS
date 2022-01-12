/**
TNPG: Watson vs The Final Project (Anjini Katari, Ruby Friedman, Joshua Gao)
APCS pd07
HW54: One File to Bring Them All...
2022-01-12w
time spent: 0.4 hrs
*/

import java.util.ArrayList;

public class MySorts {

/** Bubble Sort starts from the rightmost value and compares
 it to the val directly to the left of it. If the val to the
 left is greater it swaps the 2 vals and continues moving down
 the array to the right while comparing the next 2 vals and
 swapping if necessary. After getting to the end rof the array,
 this constitutes 1 pass, it repeats passing until the array is
 fully sorted, which is when passes are achieved.*/
  public static void bubbleSort( ArrayList<Comparable> data )
  {
    for( int passCtr = 1; passCtr < data.size(); passCtr++ ) {
      for( int i = 0; i < data.size()-1; i++ ) {
        if ( data.get(i).compareTo(data.get(i+1) ) > 0 ){
          data.set( i, data.set(i+1,data.get(i)) );
         }
      }
    }
  }

/** Selection Sort finds the max val in arrayList and moves
 it to the rightmost position, this constitutes 1 pass. It
 then continues to repeat this for the second rightmost,
 third rightmost, and so on, until the array is in numerical
 ascending order.*/
public static void selectionSort( ArrayList<Comparable> data )
  {
    int maxPos;
    for( int pass = data.size()-1; pass > 0; pass-- ) {
      maxPos = 0;
      for( int i = 1; i <= pass; i++ ) {
        if ( data.get(i).compareTo( data.get(maxPos) ) < 0 ) {
          maxPos = i;
	   data.set( maxPos, ( data.set( pass, data.get(maxPos) ) ) );
	}

    }
}
  }//end selectionSort

/** Insertion Sort creates a partition starting at one, and sorts
 the elements before that partition, this constitutes 1 pass. After
 each pass the partition is moved over 1 and the values are re-sorted
 while swapping the new val into place. This repeats until the entire
 array is sorted and the partition is at the end.*/
 public static void insertionSort( ArrayList<Comparable> data )
  {
    for( int partition = 1; partition < data.size(); partition++ ) {
      for( int i = partition; i > 0; i-- ) {
        if ( data.get(i).compareTo( data.get(i-1) ) < 0 ) {
          data.set( i, data.set( i-1, data.get(i) ) );
        }
        else {
          break;
         }
      }
    }
  }//end insertionSortV

}
