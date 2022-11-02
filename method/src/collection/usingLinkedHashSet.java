package collection;

import java.util.LinkedHashSet;

public class usingLinkedHashSet {
	public static void main(String []args) {
		LinkedHashSet<Integer>array=new LinkedHashSet<>();
		array.add(10);
		array.add(20);
		array.add(10);
		array.add(20);
		array.add(50);
		for (Integer x : array) {
			System.out.println(x);
		}
	}
}



