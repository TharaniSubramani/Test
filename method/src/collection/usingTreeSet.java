package collection;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class usingTreeSet {
	
	public static void main(String []args) {
		TreeSet<Integer>array=new TreeSet<>();
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

