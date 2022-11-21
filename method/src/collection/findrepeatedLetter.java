package collection;

import java.util.HashMap;
import java.util.Map;

public class findrepeatedLetter {

	public static Map<Character, Integer> findrepeatedletters(String name) {
		Map<Character, Integer> letter = new HashMap<>();
		char[] array = name.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (letter.containsKey(array[i])) {
				int value = letter.get(array[i]);
				letter.put(array[i], value++);
			} else {
				letter.put(array[i], 1);
			}
		}
		return letter;
	}
	

	public static void main(String[] args) {
		Map<Character, Integer> hu = findrepeatedletters("seleniiium");
		for (Map.Entry<Character, Integer> e : hu.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}
} 