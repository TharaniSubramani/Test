package UsingMethod;

public class SCPandHeepMemory {
	
	public static void main(String[] args) {
	String s1="India";
	String s2="India";
	String s3=new String("India");
	String s4=new String("India");
	System.out.println((s1==s2));
	System.out.println((s1.equals(s2)));
	System.out.println((s3==s4));
	System.out.println((s3.equals(s4)));
	}
}
