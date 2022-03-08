// TNPG: RKL (Ruby F, Kosta D, Lior P)
// APCS pd07
// HW71 -- Reading for intent, tracing for VICTORY
// 2022-03-07m
// time spent: 1.0 hrs

/***
 * class Mysterion
 * tests preliminary hypotheses re: utility of mystery algo
 * 
 * <h1>It's a Bird, It's a Plane! It's.... MYSTERION</h1>
 * The Mysterion method ...  takes in an input array, and it looks at the data chunk between the inputted start and end indices.
   * It then sorts that interval into two sections, left and right. Using the third input value, splitInd, it sets a special value.
   * This value is used as a comparison for all array values, if an array element is less than or equal then it goes into the left section of the array,
   * if however it is greater than the special value at the specifed index it will go in the right section.
 * <p>
 * <b>Note:</b> BLAH blah blah, yakkety schmakketty...
 * @author  Trey Parker, Matt Stone
 * @version 3.1415926535897932384626433
 * @since   2022-03-07m 
 * algo as pseudocode:
 * ------------------------------
 *     v = arr[c]
 *     swap arr[c], arr[b]  
 *     s = a
 *     for i in [a..b-1]
 *         if arr[i] < v
 *             swap arr[s], arr[i]
 *             s+=1
 *     swap arr[b], arr[s] 
 * 
 * DISCO
 * Tracing is very useful when trying to find patterns.
 * Try a variety of test cases changing 1 variable at a time to see what it affects.
 *
 * QCC
 * Why/when would a person use this algorithm?
 * What exactly is a javadoc?
 * What kind of pseudo code were we given in class? Is it a language or is it just not fully coded?
 * 
 * q0: What does it do?
 * a0: It takes in an input array, and it looks at the data chunk between the inputted start and end indices.
   * It then sorts that interval into two sections, left and right. Using the third input value, splitInd, it sets a special value.
   * This value is used as a comparison for all array values, if an array element is less than or equal then it goes into the left section of the array,
   * if however it is greater than the special value at the specifed index it will go in the right section. 
 * 
 * q1: O(?)
 * a1: The runtime is O(n) because the operation of comparing values at indices that is inside the for loop is constant time. 
 * Thus the function just loops through each element once, which is essentially O(n). * 
 ***/


public class Mysterion 
{    
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array 
  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d )
  {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }
    
  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal )
  {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------

  /**
   * int mysterion(int[],int,int,int)
   * DESCRIP
   * This method takes in an input array, and it looks at the data chunk between the inputted start and end indices.
   * It then sorts that interval into two sections, left and right. Using the third input value, splitInd, it sets a special value.
   * This value is used as a comparison for all array values, if an array element is less than or equal then it goes into the left section of the array,
   * if however it is greater than the special value at the specifed index it will go in the right section. 
   * 
   * @param arr : input array
   * @param start : start index
   * @param end : end index
   * @param splitInd : index of special comparative value
   * @return int[]
   *
   */
  public static int[] splitter( int arr[], int start, int end, int splitInd)
  {
	int splitVal = arr[splitInd];
	swap(splitInd, end, arr);
	int numSwaps = start;
	for (int i = start; i < end; i++) {
		if (arr[i] < splitVal) {
            swap(i, numSwaps , arr);
			numSwaps += 1;
		}
	}
	swap(end, numSwaps, arr);
	return arr;
  }//end splitter

  //main method for testing
  public static void main( String[] args )
  {

    //init test arrays of magic numbers
    int[] arr1 = {8,21,17,69,343};
    int[] arr3 = {1,28,33,4982,37};
    int[] arr4 = {5,4,17,9000,6};
    int[] arr5 = {3,0,16,599,1024};
    int[] arr6 = {7, 1, 5, 12, 3};

    // run mysterion on each array,
    // holding a & b fixed, varying c...
    for( int testC = 0; testC < 5; testC++ ) {
    System.out.println("arr1: ");
    printArr(arr1);
    splitter(arr1,0,4,testC);
    System.out.println("after mysterion w/ a=0,b=4,c=" 
    + testC +"...");
    printArr(arr1);
    System.out.println("-----------------------");
    
    System.out.println("arr3:");
    printArr(arr3);
    splitter(arr3,0,4,testC);
    System.out.println("after mysterion w/ a=0,b=4,c=" 
    + testC +"...");
    printArr(arr3);
    System.out.println("-----------------------");

    System.out.println("arr4:");
    printArr(arr4);
    splitter(arr4,0,4,testC);
    System.out.println("after mysterion w/ a=0,b=4,c=" 
    + testC +"...");
    printArr(arr4);
    System.out.println("-----------------------");

    System.out.println("arr5:");
    printArr(arr5);
    splitter(arr5,0,4,testC);
    System.out.println("after mysterion w/ a=0,b=4,c=" 
    + testC +"...");
    printArr(arr5);
    System.out.println("-----------------------");

    System.out.println("arr6:");
    printArr(arr6);
    splitter(arr6,0,4,testC);
    System.out.println("after mysterion w/ a=0,b=4,c=" 
    + testC +"...");
    printArr(arr6);
    System.out.println("-----------------------");
   }

  }//end main

}//end class Mysterion
