package Practice;

import UsingMethod.PalindromShort;
import UsingMethod.Palindrome;

/*Take all the prefixes of the string, and choose the longest palindrome between them.
If this chosen prefix contains at least two characters, 
cut this prefix from string and go back to the first step with the updated string. 
Otherwise, end the algorithm with the current string s as a result.
Your task is to implement the above algorithm and return its result when applied to string s.
Input:
s: "aaacodedoc"
Expected Output:
""*/

public class PrefixAndPalindrome {
		public static String cutPrefixFromPalindrome(String word) {
		CharSequence prefix="";
		
		int startIndex=0, endIndex=word.length()-1;String newWord="";
			while(word.length()>2) {
			startIndex = word.indexOf(word.charAt(endIndex));
			 newWord=word.substring(startIndex);
			 boolean isPallindrome=Palindrome.palindrome(newWord);
			 if(isPallindrome) {
				 prefix=word.subSequence(0, 2);
				 word=(String)prefix;
				 System.out.println(startIndex+newWord+prefix+word);
			 }}return word;}
			public static void main(String[] args) {
				System.out.println(cutPrefixFromPalindrome("aaacodedoc"));

}
		}				
