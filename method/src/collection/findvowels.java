package collection;

import java.util.HashMap;
import java.util.Map;

public class findvowels {

	public static void main(String[] args) {
		Map<Character, Integer> letter = findvowelletters("seelenium");
		for (Map.Entry<Character, Integer> e : letter.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}

	public static Map<Character, Integer> findvowelletters(String name) {
		Map<Character, Integer> letter = new HashMap<>();
		char[] array = name.toCharArray();
		letter.put('a', 0);
		letter.put('e', 0);
		letter.put('i', 0);
		letter.put('o', 0);
		letter.put('u', 0);
		for (int i = 0; i < array.length; i++) {
			if (letter.containsKey(array[i])) {
				int value = letter.get(array[i]);
				letter.put(array[i], value + 1);
			}
		}
		return letter;
	}
}
