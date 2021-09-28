import java.util.Arrays;
import java.util.Random;
public class Array{

        public static double[] powArray(double[] a, int x) {
		for (int i = 0; i < a.length; i++) {
                        a[i] = Math.pow(a[i], x);
                }
		return a;
        }
        public static int[] Histogram(int n) {
		Random random = new Random();
		int[] a = new int[n];
		for (int i = 0; i<a.length; i++) {
			a[i] = random.nextInt(100);
		}
		return a;
	}
	public static int indexOfMax(int[] n) {
		int max = n[0];
		int counter = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] > max) {
				max = n[i];}}
		for (int i = 0; i < n.length; i++) {
			if (n[i] == max) {
				counter = i;}
		}
		 return counter;
	}
	public static boolean[] sieve(int n) {
		boolean[] function = new boolean[(n + 1)];
		int counter = 0;
		while (counter <= n) {
			function[counter] = prime(counter);
			counter = counter + 1;}
		return function;
	}
	public static boolean prime(int n) {
		int counter = 2;
		boolean keeptrack = true;
		if (n == 2) {
			return true;}
		if (n == 0 || n == 1) {
			return false;}
		while (counter < n) {
			if ((n % counter) == 0) {
				keeptrack = false;}
			counter = counter + 1;}
		if (keeptrack != false) {
			keeptrack = true;}
		return keeptrack;
	}

	public static void main(String[] args) {
		double[] ar = {1, 2, 3};
		int[] arr = {4, 2, 3, 10, 2, 0};
		System.out.println(Arrays.toString(powArray(ar, 2)));
		System.out.println(indexOfMax(arr));
		System.out.println(Arrays.toString(Histogram(5)));
		System.out.println(Arrays.toString(sieve(5)));
	}

}
