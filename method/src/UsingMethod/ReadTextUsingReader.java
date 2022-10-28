package UsingMethod;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadTextUsingReader {

	public static String fountWordInTxt(String fileName, String findWord)   {
	
		FileReader fr = null;
		BufferedReader br = null;
		int count = 0;

		try {
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

		} catch (Exception e) {
			e.printStackTrace();
		} try {
			fr.close();
			br.close();
		}catch(Exception e) {
			e.printStackTrace();}
		String ans = Integer.toString(count);
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(fountWordInTxt("E:\\a.txt", "is"));
	}
}