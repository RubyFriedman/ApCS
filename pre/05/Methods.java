public class Methods{
	/** Write a method named isDivisible that takes two integers, n and m,
 	and that returns true if n is divisible by m, and false otherwise.*/

	public static boolean isDivisible(int n, int m) {
		if ((n % m) == 0) {
			return true;
		} else {
			return false;
		}
	}

	/** Write a method named isTriangle that takes three integers as arguments
 	and returns either true or false, depending on whether you can or cannot
 	form a triangle from sticks with the given lengths. */

	public static boolean isTriangle(int a, int b, int c) {
		if ((a + b) < c || (a + c) < b || (b + c) < a) {
			return false;
		} else {
			return true;
		}
	}

	/** Write a method called ack that takes two ints as parameters and that
 	computes and returns the value of the Ackermann function. */

	public static int ack(int m, int n) {
		if (m == 0) {
			return n + 1;
		} else if ((m > 0) && (n == 0)) {
			return ack(m-1,1);
		} else {
			return ack(m-1, ack(m, n-1));
		}
	}

	public static void main(String[] args) {
		System.out.println(ack(1, 2));
	}
}
