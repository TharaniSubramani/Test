package Practice;

public class commonPrefix {
	public static String lengthOfLongestSubstring(String name1, String name2) {
		String string = "";
		int n = name1.length() > name2.length() ? name2.length() : name1.length();
		for (int i = 0; i < n; i++) {
			if (name1.charAt(i) == name2.charAt(i)) {
				string = string + name1.charAt(i);
			}
		}
		return string;
	}

	public static String lengthOfLongestSubstringInArray(String[] array) {
		String ans = "";
		for (int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++)
			ans = lengthOfLongestSubstring(array[i], array[j]);
			array[i++]=ans;
		}
		return ans;
	}

	public static void main(String[] args) {
		String array[] = { "Flower", "Flowse", "Flowight" };
		System.out.println(lengthOfLongestSubstringInArray(array));
	}
}
