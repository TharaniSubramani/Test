package collection;

import java.util.HashSet;

import javax.net.ssl.HandshakeCompletedListener;

public class usingHashSet {
	public static void main(String []args) {
		HashSet<Integer>array=new HashSet<>();
		array.add(10);
		array.add(20);
		array.add(10);
		array.add(20);
		array.add(50);
		System.out.println(array);
		for (Integer x : array) {
			System.out.println(x);
		}
	}

}
