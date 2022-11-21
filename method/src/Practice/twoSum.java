package Practice;

import java.util.ArrayList;
import java.util.TreeSet;

public class twoSum {
	public static ArrayList<Integer> twoSum(int[] number, int target) {
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] + number[j] == target) {
					numbers.add(number[i]);
					numbers.add(number[j]);
					return numbers;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int array[] = { 5, 4, 7, 2, 8, 1 };
		System.out.println(twoSum(array, 9));
	}

}
