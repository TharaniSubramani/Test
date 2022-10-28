package UsingMethod;

import java.util.Scanner;

public class Students {
	String studentName;
	String rollno;
	String className;
	int NumberOfSubjects;
	int total;
	boolean isPass=true;

	public Students(int[] marks) {
		total=0;
	for(int i=0;i<marks.length;i++) {
		total=total+marks[i];}
	for(int i=0;i<marks.length;i++) {
		if(marks[i]<35) {
			isPass= false;
			break;
		}
	}}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of subjects");
		int NumberOfSubjects=sc.nextInt();
		int[] marks=new int[NumberOfSubjects];
	
		for(int i=0;i<marks.length;i++) {
			System.out.println("enter marks");
			int value=sc.nextInt();
		marks[i]=value;
		}
		Students s1= new Students(marks);
		System.out.println("Total marks"+s1.total);
		
		if(s1.isPass) {
			System.out.println("pass");
		}else {
		System.out.println("fail");}
	}
	}


