package UsingMethod;

import java.util.Scanner;

public class FindMissingNumber {


	public static int FindMissingNumber(int n) {
		
		int sumOfn=0;
		int missingNum=0;
		sumOfn = (n * (n + 1)) / 2;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int[] array = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			System.out.println("enter numbers" + i);
			int values = sc.nextInt();
			array[i] = values;
			sum = sum + array[i];
		}
		if (sum != sumOfn) {
			missingNum = sumOfn - sum;
		}
		return missingNum;
	}

	public static void main(String[] args) {
		System.out.println(FindMissingNumber(10));

	}
}
