package UsingMethod;

public class ReverseEachWord {
	public static String reverseByEachWord(String sentence) {
		String result = "";
		String[] array = sentence.split(" ");
		for (int i = 0; i < array.length; i++) {
			String reverseWord = ReveseString.reverseString(array[i]);
			result = result + reverseWord.concat(" ");
			

		}
		return result;		
	}
	public static void main(String[] args) {
		String newSentence=reverseByEachWord("India is my country");
		System.out.println(newSentence);
	}
}
