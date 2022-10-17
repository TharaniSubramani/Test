package UsingMethod;

public class pushZeros {
	public static int[] pushZero(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int inputArray[] = { 10, 0, 2, 10, 3, 0, 6 };
		int[] answer = pushZero(inputArray);
		for (int i = 0; i < inputArray.length; i++)
			System.out.println(answer[i]);
	}
}
