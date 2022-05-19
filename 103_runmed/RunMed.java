/** Jerk Kafe :: Joseph, Ruby, Kosta
APCS pd7
HW103 -- Erica's Friends, Hugo, and The One in the Middle
2022-05-19r
time spent: 0.5 hrs
*/

import java.net.SocketPermission;

public class RunMed {
    /**
DISCO:
 * Maintaining a balanced heap is very important.
 * When creating a plan it is important to consider time complexity as well, to prevent running the algo inefficently (our algo has O(logn) runtime

QCC:
 * How could we have implemented this algo without first balancing the tree?
 * Is there any other algo more efficent than O(logn) running time to find the median?

Algo:
 1) create ALMinHeap and ALMaxHeap classes from existing class
 2) create new method in new class that gets the running median
 3) create an instance of ALMinHeap called bigVals (whose root will be the “right sided middle”) and an instance of ALMaxHeap called lilVals
 4) When a number is added to the stream, compare it to the root of bigVals, if bigger, put it in the bigVals heap,otherwise put it in the lilVals heaps
 5) balance the heaps (check size, remove a root from one heap and add it to the other heap when the size difference is >= 2)
 6) Get the median by checking the total number of elements, and acting accordingly, with left middle and right middle being the roots
     */
    private ALHeapMin bigVals;
    private ALHeapMax lilVals;

    public RunMed() {
        bigVals = new ALHeapMin();
        lilVals = new ALHeapMax();
    }

    public boolean add(Integer newVal) {
        
        if (bigVals.size() != 0 && newVal.compareTo(bigVals.peekMin()) > 0 ) {
            bigVals.add(newVal);
        } else if (lilVals.size() != 0 && newVal.compareTo(lilVals.peekMax()) < 0) {
            lilVals.add(newVal);
        }
        if(Math.abs(bigVals.size() - lilVals.size()) >= 2) {
            balance();
        }
        if(bigVals.size() == 0 && lilVals.size() == 0) {
            bigVals.add(newVal);
        }
        return true;
    }

    public boolean balance() {
        if (bigVals.size() > lilVals.size()) {
            lilVals.add(bigVals.removeMin());
        } else if (bigVals.size() < lilVals.size()) {
            bigVals.add(lilVals.removeMax());
        }
        return true;
    }

    public double getMedian() {
        if ((bigVals.size() + lilVals.size()) % 2 == 0) {
            return (double) (bigVals.peekMin() + lilVals.peekMax()) / 2;
        } else if (bigVals.size() > lilVals.size()) {
            return (double) bigVals.peekMin();
        } else {
            return (double) lilVals.peekMax();
        }
    }

    public String toString() { 
        String retStr = "lilVals:\n";
        retStr += lilVals.toString();
        retStr += "beegVals:\n";
        retStr += bigVals.toString();
        return retStr;
    }

    public static void main(String[] args) {
        RunMed rm = new RunMed();
        rm.add(1);
        rm.add(2);
        System.out.println(rm + "\n");
        System.out.println("Current median: " + rm.getMedian());
        rm.add(5);
        rm.add(10);
        System.out.println(rm + "\n");
        System.out.println("Current median: " + rm.getMedian());
    }
}
