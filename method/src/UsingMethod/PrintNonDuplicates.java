package UsingMethod;

public class PrintNonDuplicates {
	public static char[] PrintNonDuplicates(String name) {
		char[] array = name.toCharArray();
		int count = 0, j = 0;
		for (int i = 0; i < array.length; i++) {
			for (j = i + 1; j < array.length; j++) {
				if (array[i] != array[j]) {
					array[count++] = array[i];
				}
			}
			//hello
		}
		return array;
	}
	public static void main(String[] args) {
		System.out.println(PrintNonDuplicates("arrayi"));
	}
}