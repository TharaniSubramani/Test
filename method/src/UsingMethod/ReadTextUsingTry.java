package UsingMethod;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextUsingTry {
	public static String fountWordInTxt(String fileName, String findWord) throws IOException  {

		FileReader fr = null;
		BufferedReader br = null;
		int count = 0;

		fr = new FileReader(fileName);
		br = new BufferedReader(fr);
		String eachLine;
		while ((eachLine = br.readLine()) != null) {
			String array[] = eachLine.split(" ");
			for (int i = 0; i < array.length; i++) {
				if (array[i].equals(findWord)) {
					count++;
				}
			}
		}

		String ans = Integer.toString(count);
		return ans;
	}

	public static void main(String[] args) {
		try {
			String result = fountWordInTxt("E:\\a.txt", "is");
			
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}
