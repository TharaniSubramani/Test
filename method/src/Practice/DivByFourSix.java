package Practice;

import UsingMethod.LcmHcfNumbers;

public class DivByFourSix {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			int lcm = LcmHcfNumbers.lcm(4, 6);
			if (i % lcm == 0) {
				System.out.println(i);
			}
		}
	}
}