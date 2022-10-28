package UsingMethod;

public class RemoveDuplicates {
	String name;
	String ans;
	char[] array;

	public RemoveDuplicates(String name) {
		this.name = name;
		this.array = name.toCharArray();
		int count = 0, j = 0;
		for (int i = 0; i < array.length; i++) {
			for (j = i + 1; j < array.length; j++) {
				if (array[i] != array[j]) {
					array[count++] = array[i];
				}
			}
		}
	}
	public static void main(String[] args) {
		RemoveDuplicates remove = new RemoveDuplicates("arrayi");
		System.out.println(remove.array);
	}
}