package UsingMethod;

public class PalindromShort {
	public static boolean palindrome(String name) {
		int startIndex=0,endIndex=name.length()-1;
	for(int i=0;i<name.length()/2;i++) {
		char ch1=name.charAt(i);
		char ch2=name.charAt(endIndex--);
		if(ch1!=ch2) 
			return false;
		
	}
	return true;}
   public static void main(String []args) {
	   boolean isPalindrome = palindrome("madame");
		if(isPalindrome) {
			System.out.println("given name is palindrome");
		}else {
			System.out.println("given name is not palindrome");

		}
		
		
	}

}