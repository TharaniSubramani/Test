package UsingMethod;

public class alphavowels {

	public static boolean alphaVowels(String name) {
char[] ch1=name.toCharArray();
for(int i=0;i<ch1.length;i++) {
		if (ch1[i] == 'a' || ch1[i] == 'i' || ch1[i] == 'e' || ch1[i] == 'o' || ch1[i] == 'u') {
			return true;
		}}
		return false;

	}

	public static void main(String[] args) {
		if (alphaVowels("apple")) {
			System.out.println("vowels presented");
		} else {
			System.out.println("vowels not presented");
		}
	}
}
