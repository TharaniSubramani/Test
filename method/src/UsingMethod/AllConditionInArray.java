package UsingMethod;

import java.util.Scanner;

public class AllConditionInArray {
	public static int[] getArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		return array;
	}

	public static int[] sortArray(int[] array) {
int ans=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				} else {
			
				}
			}
			System.out.println(array[i]);
			 
	}
		System.out.println(ans);
return array;
		

	}

	public static int[] FindNumber(int array[], int findNumber) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == findNumber) {
				System.out.println("number found");
			}
		}
		return array;

	}
	

	public static int[] count(int array[]) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			count++;
		}
		System.out.println(count);
		return array;

	}

	public static int[] sumOfArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println(sum);
		return array;

	}

	public static int[] sumOfOddOrEven(int array[]) {
		int sum = 0, add = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				sum = sum + array[i];
			} else {
				add = add + array[i];
			}
		}
		System.out.println("Sum of even numbers" + sum);
		System.out.println("Sum of odd numbers" + add);
		return array;

	}

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Please enter array length");
		//int findNumber = scanner.nextInt();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array length");
		int length = sc.nextInt();
		int array[] = new int[length];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter array values");
			 array[i]  = sc.nextInt();
		}

		sortArray(array);

	}
}
