package Practice;

import java.util.TreeSet;

public class anagram {
	public static void main(String[] args) {
		
		boolean isAnagram=digitanagram(25,52);
		if(isAnagram) {
			System.out.println("given number is anagram");
		}else {
			System.out.println("given number is not anagram");
		}
	}
		public static boolean digitanagram(int number1, int number2) {
		int div = 0, rem = 0;
		TreeSet<Integer>array=new TreeSet<>();		
		while (number1 >= 0) {
			div = number1 / 10;
			number1 = div;
			rem = number1 % 10;
			array.add(rem);
		}
		TreeSet<Integer>array1=new TreeSet<>();
		while (number2 >= 0) {
			div = number2 / 10;
			number2 = div;
			rem = number2 % 10;
			array1.add(rem);
		}
			
			if (array == array1) {
             return true; 			
		}
		return false;
	}

}