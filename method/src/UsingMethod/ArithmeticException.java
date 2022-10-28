package UsingMethod;

public class ArithmeticException {
	int i;

	public void exceptionTutorial() {
		try {
			System.out.println("hi");
			i = 10 / 0;
			System.out.println("hello");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("happy");
		}
	}

	public static void main(String[] args) {
		ArithmeticException ans = new ArithmeticException();
		ans.exceptionTutorial();
		System.out.println("hey");

	}
}
