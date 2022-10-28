package UsingMethod;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadTextAndTryResorse {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("E:\\a.txt"))) {
			String eachLine;
			int count = 0;
			while ((eachLine = br.readLine()) != null) {
				String array[] = eachLine.split(" ");
				for (int i = 0; i < array.length; i++) {
					if (array[i].equals("is")) {
						count++;
					}
				}
			}
			System.out.println(count);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
