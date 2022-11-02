package collection;

import java.util.ArrayList;

public interface ArrayListTutorial {
	public void addElementsInArray();
}
	class printArrayNumbers implements ArrayListTutorial{
		
	
	public void addElementsInArray() {

		ArrayList<Integer>array=new ArrayList<>();
		array.add(10);
		array.add(20);
		array.add(10);
		System.out.println(array);
		for (Integer x : array) {
			if(x==10) {
				array.remove(x);
			}
			System.out.println(x);
		}
		}
		public static void main(String []args) {
			printArrayNumbers numbers=new printArrayNumbers();
			numbers.addElementsInArray();

	}
}

