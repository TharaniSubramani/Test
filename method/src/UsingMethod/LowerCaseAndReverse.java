package UsingMethod;

public class LowerCaseAndReverse {
	public static String lowerCaseAndReverse(String sentence) {
		String result = "";
		String lowerCaseSentence = sentence.toLowerCase();
		String[] array = lowerCaseSentence.split(" ");
		int endindex = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			if (i == endindex) {

				String lastName = array[endindex];
				char arr[] = lastName.toCharArray();
				String reverseName = "";
				for (int j = arr.length - 1; j >= 0; j--) {
					reverseName = reverseName + arr[j];
					array[endindex] = reverseName;
				}
			}

			result = result + array[i].concat(" ");
		}
		return result;
	}

	public static void main(String[] args) {
		String name = lowerCaseAndReverse("The WorldCup Happening in Australia");
		System.out.println(name);
	}
}
