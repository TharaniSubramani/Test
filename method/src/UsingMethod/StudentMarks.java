package UsingMethod;

import java.util.Scanner;

public class StudentMarks {
	public static boolean isSuddentPassed(int []marks, int passMark) {
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] <passMark) 
				return false;
			}
			return true;
		}
			

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter no of students");
		int length=sc.nextInt();
		int marks[] = new int[length];
		for (int i = 0; i < marks.length; i++) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter marks");
		int value=sc.nextInt();
		marks[i]=value;}
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter passmark");
		int passMark=scanner.nextInt();
		boolean studentpassed=isSuddentPassed(marks,passMark);
	
if(studentpassed)
{ System.out.println("Student passed");
	}else
System.out.println("Student failed");
}
}