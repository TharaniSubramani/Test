package UsingMethod;

public class frequencyOfString {
	public static void main(String[] args) {
		String word = "wonderland";
		int count[] = getFrequency(word);
		char[] array = word.toCharArray();
		for (int k = 0; k < array.length; k++) {
			if (array[k] != '0' && array[k] != 0)
				System.out.println(array[k] + "-" + count[k]);
		}
	}
	public static int[] getFrequency(String input)
	{
		char[] array = input.toCharArray();
		int count[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			count[i] = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count[i]++;
					array[j] = 0;
				}
			}
		}
		return count;
	}
}