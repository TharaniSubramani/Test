package UsingMethod;

import java.util.Scanner;

public class EvenNumber {
	public static boolean Iseven(int input) {
		if (input % 2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number ");
		int number = sc.nextInt();
		boolean iseven = Iseven(number);
		{
			if (iseven) {
				
				System.out.println("even number");
			}
		}

	}
}