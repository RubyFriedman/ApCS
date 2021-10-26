public class Repeater {
	public static String fenceW(int numPosts) {
		String fence = "|";
		int counter = 1;
		while (counter < numPosts){
			fence += "--|";
			counter +=1;
		}
		return fence;
	}
	private static String finalFence = "";
	public static String fenceR(int numPosts) {
		if (numPosts == 1) {
			finalFence = "|";
		}
		else {
			finalFence = fenceR(numPosts - 1);
			finalFence += "--|";
		}
		return finalFence;
	}

	public static void main(String[] args) {
		System.out.println(fenceW(1));
                System.out.println(fenceW(2));
                System.out.println(fenceW(3));

                System.out.println(fenceR(1));
                System.out.println(fenceR(2));
                System.out.println(fenceR(3));
	}
} //end class
