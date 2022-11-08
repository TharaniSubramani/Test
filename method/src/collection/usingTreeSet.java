package collection;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class usingTreeSet {
	
	public static void main(String []args) {
		TreeSet<Integer>array=new TreeSet<>();
		int number1=123; int div=0,rem=0;
		while (number1 > 0) {
			div = number1 / 10;
			
			rem = number1 % 10;
			number1 = div;
			array.add(rem);
		}
		for (Integer x : array) {
			System.out.println(x);
		}
	}
}

