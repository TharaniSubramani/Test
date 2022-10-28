package UsingMethod;

public class SwapWithoutExtraVariable {

	public static void SwapTwoNumbers(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println(x + "," + y);
	}

	public static void main(String[] args) {
		SwapTwoNumbers(10, 20);
	}
}
