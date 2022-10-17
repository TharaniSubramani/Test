package UsingMethod;

public class PrintArrayNumber {
	public static void printArraynums(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 4 };
		printArraynums(array);
	}
}
