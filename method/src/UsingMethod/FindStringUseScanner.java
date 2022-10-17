package UsingMethod;

import java.util.Scanner;

public class FindStringUseScanner {
	public static void FindString(String[] name, String findName) {
		for (int i = 0; i < name.length; i++) {
			if (name[i].equals(findName)) {
		}

		}
		System.out.println("name found");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of Students");
		int length = sc.nextInt();
		String name[] = new String[length];
		for (int i = 0; i < name.length; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter names");
			String value = scan.nextLine();
			name[i] = value;
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("findname");
		String findname = scanner.nextLine();
		FindString(name,findname);
	}
}
