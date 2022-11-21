package Practice;

import java.util.HashMap;
import java.util.Map;

//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.


public class RomanToInteger {
public static void main(String[] args) {
  Map<Character,Integer> romanToInt = new HashMap<Character, Integer>();
  String romanNumber="MDCCLX";
  romanToInt.put('I', 1);
  romanToInt.put('V', 5);
  romanToInt.put('X', 10);
  romanToInt.put('L', 50);
  romanToInt.put('C', 100);
  romanToInt.put('D', 500);
  romanToInt.put('M', 1000);
  int result =0;
  for (int i = 0; i < romanNumber.length(); i++) {
	  if(i>0 && romanToInt.get(romanNumber.charAt(i))<romanToInt.get(romanNumber.charAt(i-1))) {
		  result=result+romanToInt.get(romanNumber.charAt(i));
		  
	  }else if(i>0 && romanToInt.get(romanNumber.charAt(i))>romanToInt.get(romanNumber.charAt(i-1))) {
		  result=result+romanToInt.get(romanNumber.charAt(i))-romanToInt.get(romanNumber.charAt(i-1));
	  }else {
		  result=result+romanToInt.get(romanNumber.charAt(i));
	  }
	  
}
  System.out.println(result);
}
}
