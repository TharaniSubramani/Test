package UsingMethod;

public class IncrementByTwo {
	public static int incByTwo(int number) {
		int incByTwo=number+2;
		return incByTwo;
	}
	public static void main(String[] args) {
		int newNumber=incByTwo(10);
		System.out.println(newNumber);
	}

}
