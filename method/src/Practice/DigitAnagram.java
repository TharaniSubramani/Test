package Practice;

/*Given an array of integers a, your task is to count the number of pairs i & j ( 0 ≤ i < j < a.length), 
such that a[i] and a[j] are digit anagrams.*/

class DigitAnagram {
	public static boolean digitanagram(int number1, int number2) {
		String firstNumber = Integer.toString(number1);
		String secondNumber = Integer.toString(number2);
		int count = 0;

		if (firstNumber.length() == secondNumber.length()) {
			for (int i = 0; i < firstNumber.length(); i++) {
				for (int j = 0; j < secondNumber.length(); j++) {
					if (firstNumber.charAt(i) == secondNumber.charAt(j)) {
						count++;
					}
				}
			}
		}
		if (count == firstNumber.length()) {
			return true;
		}
		return false;
	}

	public static int digitanagramarray(int[] array) {
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				boolean isMatchChar = digitanagram(array[i], array[j]);
				if (isMatchChar) {
					count++;
					break;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] a = { 25, 35, 872, 228, 53, 278, 872 };
		System.out.println(digitanagramarray(a));
		// System.out.println(digitanagram(25,52));
	}
}
