package collection;

import java.util.LinkedList;

public class usingLinkedList {
	public static void main(String []args) {
		LinkedList<Integer>array=new LinkedList<>();
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


