public class Loops{
	public static double power(double x, int n) {
		double answer = 1;
		while (n > 0) {
			answer = (answer * x);
			n = (n-1); }
		return answer;
	}
	public static int factorial(int n) {
		int answer = 1;
		while (n > 0) {
			answer = (answer * n);
			n = (n-1);}
		return answer;
	}

	public static void main(String[] args) {
                System.out.println(power(3, 3));
		System.out.println(factorial(5));
		System.out.println(myexp(1, 4));
		check(1);
	}
	public static double myexp(int x, int n) {
		double answer = 0;
		while (n > 0) {
			answer = answer + (Math.pow(x, n) / factorial(n));
			n = (n-1);}
		return (answer + 1);
	}
	public static void check(int x) {
		System.out.print(x);
		System.out.print("   ");
		System.out.print(myexp(x, 4));
		System.out.print("   ");
		System.out.println(Math.exp(x));
	}
}
