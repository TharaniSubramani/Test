package UsingMethod;

public class Palindrome {
	public static boolean palindrome(String name) {

		String reverseCountryName = ReveseString.reverseString(name);
		if (name.equals(reverseCountryName)) {
			return true;
		} 		
		return false;
	}

	public static void main(String[] args) 
	{
		boolean isPalindrome = palindrome("mad");
		if(isPalindrome) {
			System.out.println("given name is palindrome");
		}else {
			System.out.println("given name is not palindrome");

		}
	}
}
