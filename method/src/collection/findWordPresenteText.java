package collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class findWordPresenteText {
	public static void main(String[] args) {
		Map<String, Integer> letter = findvowelletters("E:\\a.txt");
		for (Map.Entry<String, Integer> e : letter.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}

	public static Map<String, Integer> findvowelletters(String textfile) {
		Map<String, Integer> word = new HashMap<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(textfile));
			String eachLine;
			while ((eachLine = br.readLine()) != null) {
				String array[] = eachLine.split(" ");
				for (int i = 0; i < array.length; i++) {
					if (word.containsKey(array[i])) {
						int value = word.get(array[i]);
						word.put(array[i], value + 1);

					} else {
						word.put(array[i], 1);
					}
				}
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return word;
	}
}
