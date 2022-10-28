package UsingMethod;

public class FirstRepeatedChar {
	public static char firstRepeatedChar(String word) {
		char[] name = word.toCharArray();
		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (name[i] == name[j]) {
					return name[i];
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(firstRepeatedChar("geekforgeeks"));
	}
}