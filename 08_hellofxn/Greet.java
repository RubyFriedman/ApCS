public class Greet {
	public static void main(String[] args) {
		System.out.println(greet("Foo"));
		System.out.println(greet("Moo"));
		System.out.println(greet("UWU"));
	}
	public static String greet(String x) {
		String beg = "Why, hello there, ";
		String end = ". How do you do?";
		return beg + x + end;
	}
}
