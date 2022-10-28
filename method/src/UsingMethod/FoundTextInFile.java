package UsingMethod;

import java.io.BufferedReader;
import java.io.FileReader;

public class FoundTextInFile {
	public static void main(String[] args) throws Throwable {
		FileReader fr = new FileReader("E:\\a.txt");
		BufferedReader br = new BufferedReader(fr);
		String findName = "is";
		String eachline;
		int count = 0;
		while ((eachline = br.readLine()) != null) {
			String[] array = eachline.split(" ");
			for (int i = 0; i < array.length; i++) {
				if(array[i].equals(findName)) {
					count++;
				}
				}
			}
		System.out.println(count);

		}
	
}
