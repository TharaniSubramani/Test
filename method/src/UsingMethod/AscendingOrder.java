package UsingMethod;

import java.util.Scanner;

public class AscendingOrder {
	public static void ascendingOrder(int []array) {
	for (int i = 0; i < array.length; i++) {
		for (int j = i + 1; j < array.length; j++) {
			if (array[i] > array[j]) {
				int temp = 0;
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			} else {
			}}
			
						System.out.println(array[i]);
}}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array length");
		int length = sc.nextInt();
		int array[] = new int[length];
		for (int i = 0; i < array.length; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("please enter array");
			int values = scan.nextInt();
			array[i] = values;
		}
		ascendingOrder(array);
		
	}
}