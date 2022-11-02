package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class usingArrayList {
	public static void main(String []args) {
		ArrayList<Integer>array=new ArrayList<>();
		array.add(10);
		array.add(20);
		array.add(10);
		
		for (Integer x : array) {
			System.out.println(x);

			if(x==10) {
				array.remove(0);
			}
			for (Integer integer : array) {
				System.out.println(integer);
			}
			}
		
	
}}