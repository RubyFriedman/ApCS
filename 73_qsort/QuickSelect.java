// TNPG: Rowing Lemurs and Leopords (Ruby F, Lindsay P, Lawrence J)
// APCS pd07
// HW73 -- Refactor FastSelect
// 2022-03-09
// time spent: 2 hrs

public class QuickSelect {
	public static int quickSelect(int[] arr, int y) {
		int left = 0;
		int right = arr.length-1;
		boolean count = true;
    int ans = -1;
		while (count) {

			if (Partition.partition(arr, left, right) == y - 1) {
				count = false;
				ans = arr[y-1];
			}
			else if (Partition.partition(arr, left, right) < y - 1) {
				left = Partition.partition(arr, left, right)+1;
			}
			else if (Partition.partition(arr, left, right) > y - 1) {
				right = Partition.partition(arr, left, right)-1;
			}

		}
		return ans;
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
      System.out.println("smallest");
      System.out.println(quickSelect(arr1,1));
      System.out.println("-----------------------");

      System.out.println("arr2: ");
      printArr(arr2);
      System.out.println("smallest");
      System.out.println(quickSelect(arr2,1));
      System.out.println("-----------------------");

      System.out.println("arr3: ");
      printArr(arr3);
      System.out.println("smallest");
      System.out.println(quickSelect(arr3,1));
      System.out.println("-----------------------");

      System.out.println("arr4: ");
      printArr(arr4);
      System.out.println("smallest");
      System.out.println(quickSelect(arr4,1));
      System.out.println("-----------------------");

      System.out.println("arr5: ");
      printArr(arr5);
      System.out.println("smallest");
      System.out.println(quickSelect(arr5,1));
      System.out.println("-----------------------");

      System.out.println("arr6: ");
      printArr(arr6);
      System.out.println("smallest");
      System.out.println(quickSelect(arr6,1));
      System.out.println("-----------------------");
  }//end main
}//end class
