package UsingMethod;

public class PrintNumbers {
	public static int PrintNumbers(int numbers) {
		for (int i = 0; i < numbers; i++) {
			System.out.println(i);
		}

		return numbers;
	}

	public static void main(String[] args) {
	 PrintNumbers(5);


	}
}
