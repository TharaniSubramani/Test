package Practice;

public class DoubleQuotesWithInDoubleQuotes {
	public static void main(String[] args) {

		String sentence = "Moon Sun \"Jupitor is the largest planet\" pluto saturn \"earth is the one and only\"";
		String array[] = new String[6];
		int doubleQoutesCounter = 0;
		int j = 0;
		String temp = "";

		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == '"') {
				doubleQoutesCounter++;
			} else if (doubleQoutesCounter % 2 == 0 && sentence.charAt(i) == ' ') {
				temp = temp + sentence.charAt(i);	
				array[j++] = temp;
				temp = "";
			} else {
				temp = temp + sentence.charAt(i);
			}
		}
		array[j]=temp;
		for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}
}
}