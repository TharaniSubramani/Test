package UsingMethod;

import java.util.Scanner;

public class VotingCondition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter name");
		String name=sc.nextLine();
		System.out.println("please enter Father name");
		String fatherName=sc.nextLine();
		System.out.println("please enter address");
		String address=sc.nextLine();
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter pincode");
		int pincode=scanner.nextInt();
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter age");
		int age=scan.nextInt();
		
	boolean Iseligible =votingRules(age, pincode);
	if(Iseligible) {
		System.out.println("you are eligible to vote");
	}
	else {
		System.out.println("you are not eligible to vote");
	}
	}
	public static boolean votingRules(int age, int pincode) {
		if(age>18 && pincode==635123) {
return true;		}
		
		return false;
	}
}


