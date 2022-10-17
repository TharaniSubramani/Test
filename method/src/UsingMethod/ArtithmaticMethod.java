package UsingMethod;

import java.util.Scanner;

public class ArtithmaticMethod {

	public static int additionOfTwoNums(int x, int y) {
		int add = x + y;
		return add;
	}

	public static int subtrationOfTwoNums(int x, int y) {
		int sub = x - y;
		return sub;
	}

	public static int multiplicationOfTwoNums(int x, int y) {
		int multi = x * y;
		return multi;
	}

	public static int divisionOfTwoNums(int x, int y) {
		int div = x / y;
		return div;
	}

	public static int mod(int x, int y) {
		int mod = x % y;
		return mod;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int addition = additionOfTwoNums(10, 20);
		int subtraction = subtrationOfTwoNums(30, 20);
		int multiplication = multiplicationOfTwoNums(10, 2);
		int division = divisionOfTwoNums(10, 2);

		System.out.println(addition);
		System.out.println(subtraction);
		System.out.println(multiplication);
		System.out.println(division);
		{
			int mod = mod(10, 2);
			if (mod % 2 == 0) {
				System.out.println("even number");

			}
		}
	}
}
