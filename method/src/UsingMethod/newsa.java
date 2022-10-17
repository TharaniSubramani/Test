package UsingMethod;

public class newsa {
	public static int[] zeromoves(int[] array) {
		int count = 0;
		int firstLength = array.length;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				array[count++] = array[i];
			}
		}
		while (count < firstLength) {
			array[count++] = 0;

		}
		return array;
	}

	public static void main(String[] args) {
		int[] input = { 10, 0, 2, 10, 3, 0, 6 };
		int[] result = zeromoves(input);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
