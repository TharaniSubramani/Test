package UsingMethod;

import java.util.Scanner;

public class SumOfArray {

	public static int addArray(int array[]) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6 };
		int addition = addArray(array);
		System.out.println(addition);

	}
}
