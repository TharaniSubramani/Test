package UsingMethod;

public class ReveseString {
	
	public static String reverseString(String name) {

		char array[] = name.toCharArray();
		String reverseName = "";
		for (int i = array.length - 1; i >= 0; i--) {
			reverseName = reverseName + array[i];
		} 
		return reverseName;
	}

	public static void main(String[] args) {
		String i=reverseString("India");
		System.out.println(i);


	}
}