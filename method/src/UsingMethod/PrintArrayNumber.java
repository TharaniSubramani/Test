package UsingMethod;

import java.util.Arrays;

public class PrintArrayNumber {
	public static void printArraynums(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2==0)
				
				Arrays.sort(array);
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		int array[] = {10, 1, 2, 6, 8, 3, 4, 5, 4 };
		printArraynums(array);
	}
}
