package Practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class checkTnpscResult {
	public static void main(String[] args) throws Throwable {
		FileReader fr = new FileReader("C:\\Users\\AMBIKA\\Downloads\\2022_03_GR_II_PRLMSSEL_PUBL.pdf");
		BufferedReader br = new BufferedReader(fr);
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Register Num");
		String findRegisterNum=scan.nextLine();
		String eachline;
		while ((eachline = br.readLine()) != null) {
			String[] array = eachline.split(" ");
			for (int i = 0; i < array.length; i++) {
				if(array[i].equals(findRegisterNum)) {
					System.out.println("Pass");
				}
				}
			}



	}

}
